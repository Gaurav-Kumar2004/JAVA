
import java.util.Scanner;

public class AreofCircle {

    public static void main(String[] args) {
        System.out.println("Enter the radius");
        Scanner obj = new Scanner(System.in);
         float rad = obj.nextFloat();
         float area = 3.14f *rad *rad;
         System.out.println("Area = "+area);
    }
}