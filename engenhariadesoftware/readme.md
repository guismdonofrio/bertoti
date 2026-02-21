# Engenharia de Software - BD/2


## Atividade 1 - 13/02/2026
### Primeiro Post
What precisely do we mean by software engineering? What distinguishes “software engineering” from “programming” or “computer science”? And why would Google have a unique perspective to add to the corpus of previous software engineering literature written over the past 50 years? The terms “programming” and “software engineering” have been used interchangeably for quite some time in our industry, although each term has a different emphasis and different implications. University students tend to study computer science and get jobs writing code as “programmers.” “Software engineering,” however, sounds more serious, as if it implies the application of some theoretical knowledge to build something real and precise. Mechanical engineers, civil engineers, aeronautical engineers, and those in other engineering disciplines all practice engineering. They all work in the real world and use the application of their theoretical knowledge to create something real. Software engineers also create “something real,” though it is less tangible than the things other engineers create. Unlike those more established engineering professions, current software engineering theory or practice is not nearly as rigorous. Aeronautical engineers must follow rigid guidelines and practices, because errors in their calculations can cause real damage; programming, on the whole, has traditionally not followed such rigorous practices. But, as software becomes more integrated into our lives, we must adopt and rely on more rigorous engineering methods. We hope this book helps others see a path toward more reliable software practices.

### Segundo Post
Programming Over Time We propose that “software engineering” encompasses not just the act of writing code, but all of the tools and processes an organization uses to build and maintain that code over time. What practices can a software organization introduce that will best keep its code valuable over the long term? How can engineers make a codebase more sustainable and the software engineering discipline itself more rigorous? We don’t have fundamental answers to these questions, but we hope that Google’s collective experience over the past two decades illuminates possible paths toward finding those answers. One key insight we share in this book is that software engineering can be thought of as “programming integrated over time.” What practices can we introduce to our code to make it sustainable—able to react to necessary change—over its life cycle, from conception to introduction to maintenance to deprecation? The book emphasizes three fundamental principles that we feel software organizations should keep in mind when designing, architecting, and writing their code:
Time and Change: How code will need to adapt over the length of its life

Scale and Growth: How an organization will need to adapt as it evolves

Trade-offs and Costs: How an organization makes decisions, based on the lessons of Time and Change and Scale and Growth


1. Comentar com suas palavras o primeiro trecho do livro Software Engineering at Google, Oreilly. (primeiro post)
2. Comentar com suas palavras o segundo trecho do livro Software Engineering at Google, Oreilly.(segundo post)
3. Listar e explicar 3 exemplos de tradeoffs


>- #### Primeiro Post – Comentário sobre o primeiro trecho do livro *Software Engineering at Google*
>O primeiro trecho do livro explica que engenharia de software não é apenas escrever código. Envolve também todos os processos, ferramentas e práticas que ajudam a manter esse código funcionando ao longo do tempo.
> 
>Eu compreendi que o principal ponto é que o código precisa continuar sendo útil mesmo depois de pronto. Ou seja, não basta funcionar hoje, ele precisa se adaptar às mudanças, correções e melhorias que surgem com o tempo.
>
>O livro também destaca que programar é pensar no futuro. As decisões que tomamos agora podem facilitar ou dificultar o trabalho depois. Por isso, organização, clareza e planejamento são muito importantes.
>
> 
>- **Segundo Post – Comentário sobre o segundo trecho do livro** *Software Engineering at Google*
> 
>O segundo trecho fala sobre três princípios importantes: Tempo e Mudança, Escala e Crescimento, e Trade-offs e Custos.
> 
>Tempo e Mudança mostram que todo software vai precisar mudar. Nada fica igual para sempre, então o código precisa ser feito de forma que permita alterações.
> 
>Escala e Crescimento falam que empresas crescem, usuários aumentam e sistemas precisam acompanhar esse crescimento. O que funciona para poucas pessoas pode não funcionar para muitas.
> 
>Trade-offs e Custos mostram que toda decisão tem vantagens e desvantagens. Não existe solução perfeita. Sempre será preciso escolher o que faz mais sentido naquele momento.
> 
>Eu entendo que o livro quer mostrar que engenharia de software é muito mais sobre decisões conscientes do que apenas sobre programação.
>
> 
>- **Três exemplos de Trade-offs**
> 
>*1. Velocidade vs Qualidade:* 
>Fazer algo rápido pode resolver o problema no momento, mas pode gerar erros no futuro. Já fazer com mais cuidado demora mais, mas pode evitar retrabalho depois.
>
>*2. Simplicidade vs Funcionalidades:* 
>Um sistema simples é mais fácil de manter. Porém, adicionar muitas funcionalidades pode torná-lo mais completo, mas também mais difícil de entender e manter.
> 
>*3. Custo vs Desempenho:* 
>Um sistema muito rápido pode exigir mais investimento em tecnologia e infraestrutura. Já uma solução mais barata pode não ter o melhor desempenho.


---

##  Atividade 2 - 20/02/2026
#### 1 - Software é intangível (trecho do livro Software Engineering at Google, ver slide 4)
Comentar com suas palavras
#### 2 - Engenharia de Software = Programação + tempo, escalabilidade e trade-offs (trecho do livro Software Engineering at Google, ver slide 7)
Comentar com suas palavras

**(feitas na aula anterior)**

#### 3 - Requisitos não funcionais
>Listar 5 requisitos não funcionais e descrevê-los com suas palavras (ver slides 8, 9 e 10)
>
>1. Desempenho:
>
>Define a velocidade de resposta do sistema.
>
>Exemplo: o sistema deve responder a uma requisição em até 2 segundos.
>
>3. Segurança:
>
>Garante proteção contra acessos não autorizados e vazamento de dados.
> 
>Exemplo: uso de autenticação, criptografia e controle de permissões.
>
>5. Usabilidade:
>
>Refere-se à facilidade de uso do sistema.
>
>Exemplo: interface intuitiva, fácil navegação e clareza nas informações.
>
>7. Escalabilidad:
>
>Capacidade do sistema suportar crescimento de usuários ou dados sem perder desempenho.
>
>9. Confiabilidade:
>
>Capacidade do sistema funcionar corretamente por longos períodos sem falhas.
>

#### 4 - Trade-offs (negociação entre requisitos não funcionais)
Citar e descrever 3 cenários de trade-offs (ver slide 12, mas usar outros exemplos)

**(feitas na aula anterior)**


---


