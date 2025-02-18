import java.util.Scanner;

public class concessionaria {
    public static void main(String[]args) {

        carro Meucarro = new carro("", "", "", 0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a marca do seu carro:");
        Meucarro.marca = scanner.nextLine();
        System.out.println("Digite a placa do seu carro:");
        Meucarro.placa = scanner.nextLine();
        System.out.println("Digite o modelo do seu carro:");
        Meucarro.modelo = scanner.nextLine();
        System.out.println("Digite o ano do seu carro:");
        Meucarro.ano = scanner.nextInt();

        System.out.println("Informações:");
        Meucarro.acelerar();
        Meucarro.acelerar();
        Meucarro.frear();

        Meucarro.exibirInformacoes();
    }
}
