package Day15_03_2023.homework_tommorow;

import Day15_03_2023.equals_hashcode.Order;

import java.util.Objects;

public class MyDate {
    public String day;
    public String month;
    public int year;
    public MyDate(String day,String month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && Objects.equals(day, myDate.day) && Objects.equals(month, myDate.month);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return
                " Day = " + day  +"/"+
                " Month = " + month  +"/"+
                " Year = " + year;
    }
}
