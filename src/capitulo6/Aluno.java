package capitulo6;

public class Aluno {
    public static void main(String[] args) {

        Aluno joao = new Aluno("João");
        joao.imprimir();
        Aluno maria = new Aluno("Maria");
        maria.imprimir();
        Aluno marcos = new Aluno("Marcos");
        System.out.println("total de aluanos: " + Aluno.contadorDeAlunos);

        System.out.println("-----------------------------");

    }
    public static int contadorDeAlunos;
    private String nome;

    public Aluno(){

    }
    public Aluno(String nome) {
        this.nome = nome;
        contadorDeAlunos++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println("Aluno: " + nome);
        System.out.println(contadorDeAlunos);
    }
}