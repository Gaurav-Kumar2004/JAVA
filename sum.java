import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("Enter Two no");
        Scanner obj = new Scanner(System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+sum);
    }

}
