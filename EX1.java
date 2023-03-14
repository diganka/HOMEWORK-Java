package HW15;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String string1 = input.next();
        String string2 = input.next();
        String string3 = input.next();
        String string4 = (input.next()+" "+input.next()+" "+input.next());
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);
    }
}