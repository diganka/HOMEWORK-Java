package HW15;

import java.util.Date;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите Ваш год рождения:");
    int year = input.nextInt();
    System.out.println(year);
    Date date= new Date();
    String y= String.format("%tY", date);
    int thisyear = Integer.parseInt(y);
    int age = thisyear-year;
    System.out.println("Ваш возраст: " + age + " лет");

   }
}
