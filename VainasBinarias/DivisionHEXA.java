import java.util.Scanner;

class HexDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        System.out.print("Ingrese el primer número hexadecimal: ");
        String hex1 = scanner.nextLine();
        System.out.print("Ingrese el segundo número hexadecimal: ");
        String hex2 = scanner.nextLine();
        int num1 = Integer.parseInt(hex1, 16);
        int num2 = Integer.parseInt(hex2, 16);
        int result = num1 / num2;
        String hexResult = Integer.toHexString(result);
        System.out.println("El resultado de la división en hexadecimal es: " + hexResult);
    }
}

