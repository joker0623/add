import java.util.Scanner;

public class ab111{
    public static void main(String[] args) {
        int a,b;
        System.out.println("請輸入兩個數字做加减乘除");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("加="+(a+b));
        System.out.println("减="+(a-b));
        System.out.println("乘="+(a*b));
        System.out.println("除="+(a/b));
    }
}