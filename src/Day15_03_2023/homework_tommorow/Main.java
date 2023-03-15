package Day15_03_2023.homework_tommorow;

public class Main {
    public static void main(String[] args) {
        //Создать класс MyDate с полями day,month,year, конструктором,геттерами и сеттерами.
        //Создать несколько одинаковых обьектов этого класса и проверить их на равенство.
        //Затем переопределить методы equals и hashCode и вновь проверить обьекты на равенство.
        MyDate day = new MyDate("Montag","Januar",2023);
        MyDate day1 = new MyDate("Montag","Januar",2023);
        System.out.println(day==day1);
        System.out.println( day.equals(day1));
        System.out.println(day+"\n"+day1);
    }
}
