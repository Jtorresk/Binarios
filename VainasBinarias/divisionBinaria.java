import java.util.Scanner;

 class DivisionBinaria {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
         
        // Pedimos al usuario que ingrese dos números binarios
        System.out.print("Ingrese el primer número binario: ");
        String numBinario1 = scanner.nextLine();
        System.out.print("Ingrese el segundo número binario: ");
        String numBinario2 = scanner.nextLine();
          scanner.close();
        // Convertimos los números binarios a decimal
        int numDecimal1 = Integer.parseInt(numBinario1, 2);
        int numDecimal2 = Integer.parseInt(numBinario2, 2);

        // Dividimos los números decimales
        int resultadoDecimal = numDecimal1 / numDecimal2;

        // Convertimos el resultado a binario
        String resultadoBinario = Integer.toBinaryString(resultadoDecimal);

        // Mostramos el resultado en pantalla
        System.out.println("El resultado de dividir " + numBinario1 + " entre " + numBinario2 + " es: " + resultadoBinario);
    }
}
