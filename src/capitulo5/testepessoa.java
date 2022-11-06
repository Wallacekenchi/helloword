package capitulo5;

public class testepessoa {

    public static void main(String[] args) {

        int valor = 12;
        long valor2= 12L;
        double double1=12.5;
        long valor3;
        valor3 = 23;

        funcionario.pessoa criarpessoa = new funcionario.pessoa();

        criarpessoa.nome = "Wallace";
        criarpessoa.idade = 32;
        criarpessoa.cpf = "3551212512";
        criarpessoa.email = "wallace.santos@atos.net";

        criarpessoa.falar();

        System.out.println("Meu nome é "+criarpessoa.nome +" !");
        System.out.println("Minha idade é "+criarpessoa.idade +" !");
        System.out.println("Meu CPF "+criarpessoa.cpf +" !");
        System.out.println("Meu email "+criarpessoa.email +" !");

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        funcionario.pessoa batata = new funcionario.pessoa();
        System.out.println("Meu nome é "+batata.nome +" !");
        System.out.println("Minha idade é "+batata.idade +" !");
        System.out.println("Meu CPF "+batata.cpf +" !");
        System.out.println("Meu email "+batata.email +" !");

            }

}
