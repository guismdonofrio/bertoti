package com.sessaonoturna.locadora;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class LocadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocadoraApplication.class, args);
	}

	@org.springframework.context.annotation.Bean
	CommandLineRunner carregarDadosIniciais(FilmeRepository repository) {
		return args -> {
			if (repository.count() == 0) {
				repository.save(new Filme("De Volta para o Futuro", "Ficcao Cientifica", 1985, true));
				repository.save(new Filme("O Poderoso Chefao", "Drama", 1972, true));
				repository.save(new Filme("Cidade de Deus", "Drama", 2002, false));
				repository.save(new Filme("Interestelar", "Ficcao Cientifica", 2014, true));
			}
		};
	}

}

@CrossOrigin(origins = {"http://localhost:8080", "http://127.0.0.1:5500"})
@RestController
@RequestMapping("/filmes")
class FilmeController {

	private final FilmeRepository filmeRepository;

	public FilmeController(FilmeRepository filmeRepository) {
		this.filmeRepository = filmeRepository;
	}

	@GetMapping
	List<Filme> getFilmes() {
		return filmeRepository.findAll();
	}

	@GetMapping("/{id}")
	ResponseEntity<Filme> getFilmeById(@PathVariable Long id) {
		Optional<Filme> filme = filmeRepository.findById(id);
		return filme.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/disponiveis")
	List<Filme> getFilmesDisponiveis() {
		return filmeRepository.findByDisponivelTrue();
	}

	@GetMapping("/buscar")
	List<Filme> buscarPorNome(@RequestParam String nome) {
		return filmeRepository.findByNomeContainingIgnoreCase(nome);
	}

	@PostMapping
	ResponseEntity<Filme> postFilme(@RequestBody Filme filme) {
		Filme salvo = filmeRepository.save(filme);
		return new ResponseEntity<>(salvo, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	ResponseEntity<Filme> putFilme(@PathVariable Long id, @RequestBody Filme filme) {
		boolean existia = filmeRepository.existsById(id);

		filme.setId(id);
		Filme salvo = filmeRepository.save(filme);

		return existia
				? new ResponseEntity<>(salvo, HttpStatus.OK)
				: new ResponseEntity<>(salvo, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	ResponseEntity<Void> deleteFilme(@PathVariable Long id) {
		if (!filmeRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		filmeRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
