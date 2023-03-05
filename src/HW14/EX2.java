package HW14;

public class EX2 {
    public static void main(String[] args) {
        double chislitel = 7.0;
        double znamenatel = 5.0;
        double d=(chislitel/znamenatel);
        int x=(int) d;
        int y=(int) (chislitel%znamenatel);
        int z=(int) (znamenatel);
        System.out.println("Целая часть равна - "+x+"\nОстаток от деления равен - "+y+"\nЗнаменатель равен - "+ z);

    }
}
