# JAVA
Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let application developers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms.

**Sum of a & b**

import java.util.*;
public class JavaBasics {

    public static void main(String[] args) {
        System.out.println("Enter Two no");
        Scanner obj = new Scanner(System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+sum);
    }
}
_____________________________________________________________________________________________________________________________________________________________________________________________________________________
**Area of Circle**

import java.util.*;
public class JavaBasics {

    public static void main(String[] args) {
        System.out.println("Enter The Radius");
        Scanner obj = new Scanner(System.in);

        float rad = obj.nextFloat();
        
        float area = 3.14f * rad * rad;
        System.out.println("Area = "+area);
    }
}
_____________________________________________________________________________________________________________________________________________________________________________________________________________________
