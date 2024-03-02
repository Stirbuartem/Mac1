import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[3];

        int a = 0;
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();
        int sum = arr[0] + arr[1] + arr[2];
        int mult = arr[0] * arr[1] * arr[2];
        System.out.println("Введите число, чтобы найти сумму: ");
        int res1 = a += sum;
        System.out.println(res1);
        System.out.println("Введите число, чтобы найти произведения: ");
        int res2 = a *= mult;
        System.out.println(res2);
        }
    }