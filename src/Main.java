public class Main {
    public static void main(String[] args) {

        Mamifero camelo = new Mamifero(
                "Camelo",
                150.0,
                4,
                "Amarelo",
                "Terra",
                2.0,
                "Leite"
        );

        Peixe tubarao = new Peixe(
                "Tilápia",
                20.0,
                0,
                "Cinzento",
                "Mar",
                1.5,
                "Cauda"
        );

        Mamifero ursocanada = new Mamifero(
                "Urso-do-canadá",
                180.0,
                4,
                "Vermelho",
                "Terra",
                0.5,
                "Mel"
        );

        System.out.println(camelo.toString());
        System.out.println(tubarao.toString());
        System.out.println(ursocanada.toString());
    }
}