public class Schaltjahr {
    public static void main(String[] args) {
        int year = 2000;
        if (checkSchaltjahr(year)) {
            System.out.println(year + "ist ein Schaltjahr");

        }
    }

    public static boolean checkSchaltjahr(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

