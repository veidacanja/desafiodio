java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-Vindo!");

        // Anotando Dados
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Digite o nome do herói: ");
        String nome = scanner.nextLine(); // Lê o nome do herói

        System.out.print("Digite a quantidade de XP: ");
        int XP = scanner.nextInt(); // Lê o valor de XP

        // Declaração de variável para o nível
        String nivel;

        // Determinar o nível com base no XP
        if (XP <= 1000) {
            nivel = "Ferro";
        } else if (XP <= 2000) {
            nivel = "Bronze";
        } else if (XP <= 5000) {
            nivel = "Prata";
        } else if (XP <= 7000) {
            nivel = "Ouro";
        } else if (XP <= 8000) {
            nivel = "Platina";
        } else if (XP <= 9000) {
            nivel = "Ascendente";
        } else if (XP <= 10000) {
            nivel = "Imortal";
        } else {
            nivel = "Radiante";
        }

        // Mensagem final
        System.out.println("O herói " + nome + " está no nível " + nivel + " com " + XP + " XP.");
    }
}