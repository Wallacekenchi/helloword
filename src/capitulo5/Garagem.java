package capitulo5;

public class Garagem {
    public static void main(String[] args) {

        Garagem g = new Garagem();

        Carro carroPasseio = new Carro("Ford", 110, "vermelho");
        g.setCarroPasseio(carroPasseio);
        g.setCarroUtilitario(new Carro("Rand Rover",111,"azul"));

        g.getCarroPasseio().imprimir();

        System.out.println("-----------------------------");

        g.getCarroUtilitario().imprimir();
    }


    private Carro carroPasseio;
    private Carro carroUtilitario;

    public Garagem(){

    }
    public Garagem(Carro carroPasseio, Carro carroUtilitario) {
        this.carroPasseio = carroPasseio;
        this.carroUtilitario = carroUtilitario;
    }

    public Carro getCarroPasseio() {
        return carroPasseio;
    }

    public void setCarroPasseio(Carro carroPasseio) {
        this.carroPasseio = carroPasseio;
    }

    public Carro getCarroUtilitario() {
        return carroUtilitario;
    }

    public void setCarroUtilitario(Carro carroUtilitario) {
        this.carroUtilitario = carroUtilitario;
    }
}