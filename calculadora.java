import java.util.Scanner;

public class Calculadora {

    public static boolean esValido(int n) {
        return n >= -99999 && n <= 99999;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer número (-99999 a 99999): ");
        int a = sc.nextInt();

        System.out.print("Segundo número (-99999 a 99999): ");
        int b = sc.nextInt();

        if (!esValido(a) || !esValido(b)) {
            System.out.println("Error: los números deben estar entre -99999 y 99999.");
            sc.close();
            return;
        }

        System.out.print("Operación (+, -, *, ^): ");
        String op = sc.next();

        if (op.equals("+")) {
            System.out.println("Resultado: " + ((long) a + b));
        } else if (op.equals("-")) {
            System.out.println("Resultado: " + ((long) a - b));
        } else if (op.equals("*")) {
            System.out.println("Resultado: " + ((long) a * b));
        } else if (op.equals("^")) {
            System.out.println("Resultado: " + Math.pow(a, b));
        } else {
            System.out.println("Operación no válida.");
        }

        sc.close();
    }
}