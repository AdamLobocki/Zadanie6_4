public class Quarter {


    String quarterNumber(int x, int y) {
        if (x > 0 && y > 0) {
            return "I";
        } else if (x < 0 && y > 0) {
            return "II";
        } else if (x < 0 && y < 0) {
            return "III";
        } else
            return "IV";
    }

}
