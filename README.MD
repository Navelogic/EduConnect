# EduConnect - Unicesumar
Projeto com código fonte de resolução de desafio EduConnect da faculdade Unicesumar para a máteria de Imersão Profissional: Aplicando Orientação a Objetos.
O desafio é desenvolver um Sistema de Gestão Educacional (SGE) orientado a objetos, que permita cadastrar alunos, professores, cursos, turmas, notas e relatórios.
O projeto é dividido em fases, simulando o ciclo real de desenvolvimento.

## Fase 1 - Modelagem Inicial (Classes e Objetos)

* Desafios:
  * Criar as classes: Aluno (nome, matrícula, curso). Professor (nome, especialidade, registro). Curso (nome, código, cargaHoraria).
  * Instanciar objetos e validar atributos básicos.

## Fase 2 – Estrutura Acadêmica (Associações e Relacionamentos)

* Desafios:
  * Criar a classe Turma com atributos codigo, professor, curso, listaAlunos.
  * Implementar métodos para adicionar/remover alunos.
  * Mostrar resumo da turma com professor, curso e quantidade de alunos matriculados.

## Fase 3 – Controle de Avaliações (Encapsulamento)

* Desafios:
  * Criar a classe Avaliacao com atributos privados nota, descricao.
  * Permitir atualização da nota apenas via método atribuirNota(valor), validando se está entre 0 e 10. 
  * Associar avaliações a alunos em turmas.

## Fase 4 – Diferentes Tipos de Cursos (Herança e Polimorfismo)

* Desafios:
  * Criar subclasses CursoPresencial e CursoEAD herdando de Curso.
  * CursoPresencial deve informar sala de aula. 
  * CursoEAD deve informar plataforma virtual. 
  * Sobrescrever um método detalharCurso() para exibir informações personalizadas.

## Fase 5 – Autenticação e Perfis (Interfaces e Abstração)

* Desafios:
  * Criar uma interface de Autenticação com o método autenticar(login, senha). 
  * Implementar em Aluno, Professor e Administrador. 
  * Criar uma classe abstrata Usuario para generalizar atributos comuns.

## Fase 6 – Relatórios e Estatísticas (Polimorfismo e Laços)

* Desafios:
  * Criar um método polimórfico gerarRelatorio() em Aluno, Professor e Curso. 
  * Exibir informações personalizadas em cada relatório. 
  * Implementar um menu para gerar relatórios múltiplos em sequência.

## Fase 7 – Arquitetura em Camadas (Boa Prática de Projeto)

* Desafios:
  * Organizar o projeto em pacotes: model (entidades). service (regras de negócio). repository (armazenamento temporário em listas). ui (menu interativo). 
  * Criar uma classe Main que faça a integração entre as camadas.

## Fase Final – Sistema Educacional Consolidado

* Desafios:
  * Consolidar todas as funcionalidades. 
  * Criar um menu interativo que permita: cadastrar alunos, professores e cursos. 
  * Criar turmas e associar alunos/professores. 
  * Registrar avaliações. 
  * Gerar relatórios gerais. 
  * Testar cenários de sucesso e falha.