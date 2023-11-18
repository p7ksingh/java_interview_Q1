package Interview_Qestion;

public class Demo {
    public static void main(String[] args) {
        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 500; // -127 to 126
        Integer num4 = 500; // -127 to 126

        if (num1 == num2) {
            System.out.println("num1==num2");// num1==num2
            
        } else {
            System.out.println("num1!=num2");
        }
        if (num3 == num4) {
            System.out.println("num3==num4");
        } else {
            System.out.println("num3!=num4");// num3!=num4
        }
    }
}