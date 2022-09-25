public class WinterreifenpflichDemo {
    public static void main(String[] args) {
        int temp=3;
        boolean eis=false;
        if (isWinterreifenPflicht(temp,eis)) {
            System.out.println("winterreifenpflich!");

        }else {
            System.out.println(("Wurscht!"));
        }
    }

    public static boolean isWinterreifenPflicht(int _temp, boolean _rutschigeFahrbahn) {
        if (_temp < 10 && _rutschigeFahrbahn || _temp < 4) {
            return true;
        } else {
            return false;
        }
    }
}
