package HW14;

public class EX5 {
            public static void main(String[] args) {
                String string="Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";
                String [] array = string.toLowerCase().split("a");
                System.out.println(array.length-1);
    }
}
