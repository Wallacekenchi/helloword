package capitulo4;

public class licao89 {
    public static void main(String[] args) {
        String mes = "Janeiro";

        switch (mes) {
            case "JANEIRO":
            case "MARÇO":
            case "MAIO":
            case "JULHO":
            case "AGOSTO":
            case "OUTUBRO":
            case "DEZEMBRO":
                System.out.println("o mes de " + mes + " tem 31 dias"); break;
            default:
                System.out.println("o mes de " + mes + " tem 28 dias");

            }
        }
    }

