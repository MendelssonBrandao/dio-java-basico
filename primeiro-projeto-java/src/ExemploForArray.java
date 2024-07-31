public class ExemploForArray {

    public static void main(String[] args) {
        String alunos [] = { "Felipe", "Jonas", "Julia", "Marcos"};

        for (int i=0; i<alunos.length; i++) {
            System.out.println("Aluno [" +i+ "]: " + alunos[i]);
        }

        System.out.println("\n");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
