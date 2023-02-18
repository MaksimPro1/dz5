import java.util.Scanner;
public class Main {

    // Ускорение свободного падения Земли
    public static double Earth = 9.8;

    // Ускорение свободного падения Марса
    private static double Mars = 3.7;

    // Количество топлива для вывода 1 кг на орбиту Марса
    private static final double Count = Mars * 100 / Earth;

    public static void main(String[] args) {
// Сколько топлива потребуется для введеного вами значения
        System.out.println("Введите массу груза в килограммах");
        Scanner w = new Scanner(System.in);
        int weight = w.nextInt();

        System.out.println("Потрбуется " + weight * Count + " кг. топлива");

    }
}