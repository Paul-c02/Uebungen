public class ZinsDemo {
    public static void main(String[] args) {
        //double _kontostand = 1000;
        // double _zinsen = 2.25;
        //System.out.println(_kontostand*(_zinsen/100));
        System.out.println(zinsrechner(1000,2.25));
        System.out.println(zinsrechner(1000,2.2));
        System.out.println(zinsrechner(1000.5,2));
    }
    public static double zinsrechner(double _zinsen, double _kontostand) {
        double _result = _kontostand*(_zinsen/100);
        return _result;
    }
}
