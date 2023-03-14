package HW15;

public class EX4 {
    public static void main(String[] args) {
        System.out.printf(" Чтобы написать код нам нужны:%n 1) %1$s%n 2) %2$s%n 3) %3$s%n%n", "Язык программирования",
                "Среда разработки", "Воодушевление");

        {
            String string = "Число {X} больше {Y}, и это {True/False}";
            int x = 5;
            int y = 6;
            boolean z = x > y;
            System.out.printf("Число %1$d больше %2$d, и это %3$b.", x, y, z);

        }
    }
}
