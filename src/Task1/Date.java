package Task1;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        // Можно здесь валидировать входные данные, чтобы они соответствовали реальным датам, но выбрасывание ошибок
        // еще не рассматривалось в данной лекции
    }

    // Можно сделать как метод класса
    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
