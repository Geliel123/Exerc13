import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double altura;
        double pesoideal;

        String sexo;
        System.out.println("Digite sua altura: ");
        double Altura = teclado.nextDouble();

        System.out.println(" Informe seu sexo (m - masculino: f - feminino:) ");
        sexo = teclado.next();
        teclado.close();

        if (sexo.equals("F")) {
            pesoideal = 62.1 * Altura - 44.7;

        } else {
            pesoideal = 72.7 * Altura - 58;
        }

        System.out.println("Seu peso ideal é:" + pesoideal);
    }

}