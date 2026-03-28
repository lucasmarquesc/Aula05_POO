# Sistema Acadêmico em Java

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos (POO), ministrada pelo Prof. Lucas Marques.

O sistema simula um ambiente acadêmico simples, permitindo o cadastro de alunos, disciplinas e turmas, além da realização de matrículas e exibição de relatórios.

## Objetivos do Projeto

Aplicar na prática os principais conceitos de Programação Orientada a Objetos em Java, como:

- Classes e objetos
- Encapsulamento
- Construtores
- Associação entre classes
- Uso de arrays e `ArrayList`
- Métodos e atributos `static`
- Uso da palavra-chave `this`
- Sobrecarga de métodos
- Tipos `final`
- Estruturas condicionais e de repetição

## Estrutura do Projeto

### `Aluno.java`

Classe responsável por representar um aluno.

Funcionalidades:
- Armazenar nome e matrícula
- Realizar matrícula em disciplinas
- Calcular média
- Determinar situação do aluno:
  - Aprovado
  - Final
  - Reprovado
- Exibir histórico escolar

### `Disciplina.java`

Classe que representa uma disciplina.

Funcionalidades:
- Armazenar nome, código e professor
- Registrar notas
- Atualizar notas
- Manter lista de alunos matriculados
- Exibir dados da disciplina

### `Turma.java`

Classe responsável pelo gerenciamento de turmas.

Funcionalidades:
- Adicionar alunos à turma
- Controlar quantidade total de alunos
- Verificar se a turma está lotada
- Exibir relatório da turma

### `Main.java`

Classe principal utilizada para criar objetos e testar todos os métodos implementados no projeto.

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos
- IDE de desenvolvimento Java (Eclipse, IntelliJ ou VS Code)

## Autor

Projeto desenvolvido para fins acadêmicos na disciplina de POO – Prof. Lucas Marques.
