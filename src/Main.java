import java.time.Instant;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        yearLeap(1961);


        defenitionOsVersion(1, 2024);


        deliveryTime(97);


    }


    public static void yearLeap(int year) {
        boolean yearLeap = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
        if (yearLeap) {
            System.out.println(+year + " год является висококосным");
        } else {
            System.out.println(+year + " год не является висококосным");
        }
    }

    public static void defenitionOsVersion(int osType, int deviceYear) {

        int currentYear = LocalDate.now().getYear();

        if (osType == 0) {
            if (deviceYear == currentYear) {
                System.out.println(" Установите обычную версию iOs ");
            } else {
                System.out.println(" Установите облегченную версию iOs");
            }

        } else {

            if (deviceYear == currentYear) {
                System.out.println(" Установите обычную версию Android ");
            } else {
                System.out.println(" Установите облегченную версию Android ");
            }
        }
    }

    public static int deliveryTime(int deliveryDistance) {

        int time = 1;
        if (deliveryDistance <= 20) {
            ++time;
            System.out.println(" Доставка займет 1 день ");
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            ++time;
            System.out.println(" Доставка займет " + time + " дня ");
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            ++time;

            System.out.println(" Доставка займет " + (time + 1) + " дня ");
        }
        if (deliveryDistance > 100){
            System.out.println(" Доставка не осущевстляется ");}
        return time;
        }


    }
























































