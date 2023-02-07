import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        System.out.println("Ввидите число");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input%2==0){
            System.out.println("Число не является простым");
        } else {
            System.out.println("Число простое");
        }
    }
}
