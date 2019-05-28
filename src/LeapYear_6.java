public class LeapYear_6 {
    public static void main(String[] args) {
        int year = 2020;
        if (year % 400 == 0){
            System.out.println("It is leap year");
        }else if (year % 100 == 0){
            System.out.println("It is not leap year");
        } else if (year % 4 == 0){
            System.out.println("It is leap year");
        } else {
            System.out.println("It is not leap year");
        }
    }
}
