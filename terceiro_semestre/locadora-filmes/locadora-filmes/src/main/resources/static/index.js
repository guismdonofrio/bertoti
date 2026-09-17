const API_URL = "http://localhost:8080/filmes";

const prateleira = document.getElementById("filme-list");
const mensagemVazia = document.getElementById("mensagemVazia");
const campoBusca = document.getElementById("campoBusca");

const modalOverlay = document.getElementById("modalOverlay");
const btnAbrirModal = document.getElementById("btnAbrirModal");
const btnFecharModal = document.getElementById("btnFecharModal");
const btnAdd = document.getElementById("submitBtn");

// ---------- ABRIR / FECHAR MODAL ----------
btnAbrirModal.addEventListener("click", () => modalOverlay.classList.remove("d-none"));
btnFecharModal.addEventListener("click", () => modalOverlay.classList.add("d-none"));
modalOverlay.addEventListener("click", (evento) => {
    if (evento.target === modalOverlay) modalOverlay.classList.add("d-none");
});

// ---------- LISTAR (GET) ----------
function carregarFilmes(filtroNome) {
    const url = filtroNome
        ? `${API_URL}/buscar?nome=${encodeURIComponent(filtroNome)}`
        : API_URL;

    axios.get(url)
        .then(response => renderizarFilmes(response.data))
        .catch(erro => console.error("Erro ao carregar filmes:", erro));
}

function renderizarFilmes(filmes) {
    prateleira.innerHTML = "";
    mensagemVazia.classList.toggle("d-none", filmes.length > 0);

    filmes.forEach(filme => {
        const card = document.createElement("article");
        card.className = "card-filme";

        const selo = filme.disponivel
            ? '<span class="selo selo-disponivel">Disponivel</span>'
            : '<span class="selo selo-alugado">Alugado</span>';

        card.innerHTML = `
            <h3 class="card-titulo">${filme.nome}</h3>
            <input type="text" class="card-titulo-input d-none" value="${filme.nome}">
            <div class="card-info">
                <span>${filme.genero ?? "Genero nao informado"}</span>
                <span>${filme.anoLancamento ?? ""}</span>
            </div>
            ${selo}
            <div class="card-acoes">
                <button class="btn-card btn-editar">Editar</button>
                <button class="btn-card btn-excluir">Excluir</button>
            </div>
        `;

        const titulo = card.querySelector(".card-titulo");
        const inputEdicao = card.querySelector(".card-titulo-input");
        const btnEditar = card.querySelector(".btn-editar");
        const btnExcluir = card.querySelector(".btn-excluir");

        // ---------- EDITAR (PUT) ----------
        btnEditar.addEventListener("click", () => {
            const emEdicao = !inputEdicao.classList.contains("d-none");

            if (!emEdicao) {
                titulo.classList.add("d-none");
                inputEdicao.classList.remove("d-none");
                btnEditar.textContent = "Salvar";
                return;
            }

            const novoNome = inputEdicao.value.trim();
            if (!novoNome) return;

            axios.put(`${API_URL}/${filme.id}`, {
                nome: novoNome,
                genero: filme.genero,
                anoLancamento: filme.anoLancamento,
                disponivel: filme.disponivel
            }).then(response => {
                filme.nome = response.data.nome;
                titulo.textContent = filme.nome;
                titulo.classList.remove("d-none");
                inputEdicao.classList.add("d-none");
                btnEditar.textContent = "Editar";
            }).catch(erro => console.error("Erro ao atualizar filme:", erro));
        });

        // ---------- EXCLUIR (DELETE) ----------
        btnExcluir.addEventListener("click", () => {
            axios.delete(`${API_URL}/${filme.id}`)
                .then(() => {
                    card.remove();
                    if (prateleira.children.length === 0) {
                        mensagemVazia.classList.remove("d-none");
                    }
                })
                .catch(erro => console.error("Erro ao excluir filme:", erro));
        });

        prateleira.appendChild(card);
    });
}

// ---------- ADICIONAR (POST) ----------
function adicionarFilme() {
    const nome = document.getElementById("nomeFilme").value.trim();
    const genero = document.getElementById("generoFilme").value.trim();
    const anoLancamento = parseInt(document.getElementById("anoFilme").value, 10) || null;
    const disponivel = document.getElementById("disponivelFilme").checked;

    if (!nome) return;

    axios.post(API_URL, { nome, genero, anoLancamento, disponivel })
        .then(() => {
            modalOverlay.classList.add("d-none");
            document.getElementById("nomeFilme").value = "";
            document.getElementById("generoFilme").value = "";
            document.getElementById("anoFilme").value = "";
            document.getElementById("disponivelFilme").checked = true;
            carregarFilmes(campoBusca.value.trim());
        })
        .catch(erro => console.error("Erro ao adicionar filme:", erro));
}

btnAdd.addEventListener("click", adicionarFilme);

// ---------- BUSCA ----------
let timeoutBusca;
campoBusca.addEventListener("input", () => {
    clearTimeout(timeoutBusca);
    timeoutBusca = setTimeout(() => carregarFilmes(campoBusca.value.trim()), 300);
});

// ---------- CARGA INICIAL ----------
document.addEventListener("DOMContentLoaded", () => carregarFilmes());
