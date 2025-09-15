public class Animal {
    private String nome;
    private double comprimento;
    private int numeroDePatas;
    private String cor;
    private String ambiente;
    private double velocidadeMedia;

    public Animal(String nome, double comprimento, int numeroDePatas, String cor, String ambiente, double velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroDePatas = numeroDePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumDePatas() {
        return numeroDePatas;
    }

    public void setNumDePatas(int numDePatas) {
        this.numeroDePatas = numDePatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    @Override
    public String toString() {
        return String.format(
                "\n%-17s: %s" +
                        "\n%-17s: %.1f" +
                        "\n%-17s: %d" +
                        "\n%-17s: %s" +
                        "\n%-17s: %s" +
                        "\n%-17s: %.1f",
                "Nome", nome,
                "Comprimento", comprimento,
                "Número de patas", numeroDePatas,
                "Cor", cor,
                "Ambiente", ambiente,
                "Velocidade Média", velocidadeMedia
        );
    }
}
