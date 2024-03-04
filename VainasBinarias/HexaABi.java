import java.util.Scanner;

class HexToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        System.out.print("Ingrese el número hexadecimal: ");
        String hex = scanner.nextLine();
        int num = Integer.parseInt(hex, 16);
        String binary = Integer.toBinaryString(num);
        System.out.println("El número en binario es: " + binary);
    }
}
