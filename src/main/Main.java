package main;

public class Main {

    public static void main(String[] args) {

        // Criando disciplinas
        Disciplina poo = new Disciplina(
                "Programação Orientada a Objetos",
                "POO101",
                8.5,
                7.0,
                "Carlos Silva"
        );

        Disciplina bd = new Disciplina(
                "Banco de Dados",
                "BD202",
                6.0,
                5.5,
                "Mariana Souza"
        );

        Disciplina redes = new Disciplina(
                "Redes de Computadores",
                "RED303",
                4.0,
                3.5,
                "João Lima"
        );

        // Criando alunos
        Aluno aluno1 = new Aluno("Ana Paula", "2024001");
        Aluno aluno2 = new Aluno("Bruno Costa", "2024002");

        // Exibindo dados iniciais dos alunos
        aluno1.exibirDados();
        System.out.println();

        aluno2.exibirDados();
        System.out.println();

        // Realizando matrículas
        aluno1.realizarMatricula(poo);
        aluno1.realizarMatricula(bd);

        aluno2.realizarMatricula(poo);
        aluno2.realizarMatricula(redes);

        // Exibindo dados após matrícula
        aluno1.exibirDados();
        System.out.println();

        aluno2.exibirDados();
        System.out.println();

        // Exibindo dados das disciplinas
        poo.exibirDados();
        System.out.println();

        bd.exibirDados();
        System.out.println();

        redes.exibirDados();
        System.out.println();

        // Exibindo histórico dos alunos
        aluno1.exibirHistorico();
        System.out.println();

        aluno2.exibirHistorico();
        System.out.println();

        // Atualizando notas de uma disciplina
        bd.atualizarNotas(9.0, 8.0);

        System.out.println("Após atualizar as notas da disciplina Banco de Dados:");
        aluno1.exibirHistorico();
        System.out.println();

        // Criando turma
        Turma turmaManha = new Turma("Manhã", 1);

        turmaManha.adicionarAluno(aluno1);
        turmaManha.adicionarAluno(aluno2);

        // Exibindo relatório da turma
        turmaManha.exibirRelatorio();
        System.out.println("Total de alunos na turma: " + turmaManha.getTotalAlunos());

        // Listando alunos matriculados em uma disciplina
        System.out.println("\nAlunos matriculados em POO:");
        poo.listarAlunos();
    }
}