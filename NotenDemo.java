public class NotenDemo {
    public static void main(String[] args) {
        System.out.println(getNotenText(0));
    }

    public static String getNotenText(int _punkte) {
        String _note;
        if (_punkte >= 90) {
            _note = "Sehr Gut";
        } else if (_punkte >= 78) {
            _note = "Gut";
        } else if (_punkte >= 65) {
            _note = "Befriedigend";
        } else if (_punkte >= 51) {
            _note = "Genügend";
        } else {
            _note = "Ungenügend";
        }
        return _note;
    }
}
