package Task1;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(2, 11, 2028);
        System.out.println(isLeapYear(date));
    }

    public static boolean isLeapYear(Date D) {
        int year = D.getYear();
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
