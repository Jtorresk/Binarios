import java.util.Scanner;

class binarioAdecimal {
    


    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese un número binario
        System.out.print("Ingrese un número binario: ");
        String numBinario = scanner.nextLine();
          scanner.close();
        // Convertimos el número binario a decimal
        int numDecimal = Integer.parseInt(numBinario, 2);

        // Mostramos el resultado en pantalla
        System.out.println("El número " + numBinario + " en decimal es: " + numDecimal);
    }

}
