package cadastrocliente;

public class cadrasto {
    public String getNome() {
        return nome;
    }

    public cadrasto(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    private String nome;
    private String sobrenome;

    public cadrasto(){


    }
}
