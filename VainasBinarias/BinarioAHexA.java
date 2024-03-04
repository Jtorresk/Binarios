import java.util.Scanner;

class BinaryToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número binario: ");
        String binary = scanner.nextLine();
        int num = Integer.parseInt(binary, 2);
        String hex = Integer.toHexString(num);
        System.out.println("El número en hexadecimal es: " + hex);
    }
}
