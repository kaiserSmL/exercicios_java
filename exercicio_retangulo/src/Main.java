package retangulo;
import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Diga as dimensões do seu retângulo, primeiro a altura, depois a base.");

        Retangulo retangulo = new Retangulo(input.nextDouble(), input.nextDouble());

        System.out.println("Digite 1 para calcular a área, 2 para o perímetro e 3 para saber ambos.");

        int i = input.nextInt();

        switch (i) {
            case 1:
                System.out.println("A área é de " + retangulo.calcularArea() + "m².");
                break;

            case (2):
                System.out.println("O perímetro é de " + retangulo.calcularPerimetro() + "m.");
                break;

            case (3):
                System.out.println("A área é de " + retangulo.calcularArea() + "m², e o perímetro é de " + retangulo.calcularPerimetro() + "m.");
                break;
        }
    }

}
