class DecimalABinario {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Pedimos al usuario que ingrese un número decimal
        System.out.print("Ingrese un número decimal: ");
        int numDecimal = scanner.nextInt();
          scanner.close();
        // Convertimos el número decimal a binario
        String numBinario = "";
        int copiaNumDecimal = numDecimal;
        while (copiaNumDecimal > 0) {
            int residuo = copiaNumDecimal % 2;
            numBinario = residuo + numBinario;
            copiaNumDecimal = copiaNumDecimal / 2;
        }

        // Mostramos el resultado en pantalla
        System.out.println("El número " + numDecimal + " en binario es: " + numBinario);
    }
}
