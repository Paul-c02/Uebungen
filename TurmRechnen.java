public class TurmRechnen {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 2;
        System.out.println("2");
        while (b<10) {
            System.out.println(a = a * b++);

        }
        while (c<10){
            System.out.println(a=a/c++);
        }
    }
}
