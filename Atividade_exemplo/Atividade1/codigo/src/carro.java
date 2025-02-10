public class carro {
    String marca, modelo;
    int ano;
    double velocidadeAtual = 0;

    public carro (String _marca, String _modelo, int _ano) {
        this.marca = _marca;
        this.modelo = _modelo;
        this.ano = _ano;
    }
    void exibirInforamcoes() {
        System.out.printf("Marca: %s\nModelo: %s\nAno: %d\n",marca, modelo, ano);
        System.out.println(velocidadeAtual);

    }
    public void acelerar() {
        velocidadeAtual += 10;

    }
    public void frear() {
        velocidadeAtual -= 10;
    }
}
