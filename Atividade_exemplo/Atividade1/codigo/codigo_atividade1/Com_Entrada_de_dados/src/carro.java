public class carro {
    String marca,modelo;
    int ano;
    int velocidadeAtual = 0;

    public carro (String _marca, String _modelo, int _ano) {
        this.marca = _marca;
        this.modelo = _modelo;
        this.ano = _ano;
    }
    void exibirInformacoes() {
        System.out.printf("Marca: %s\nModelo: %s\nAno: %d\n", marca, modelo, ano);
        System.out.printf("Velocidade atual do carro: %dKm/h", velocidadeAtual);
    }
    public void acelerar() {
        velocidadeAtual += 10;
    }
    public void frear() {
        velocidadeAtual -= 10;
    }
}

