public class BinOps {

    public static String sum(String a, String b) {
        return parseIntToBin(parseBinToInt(a) + parseBinToInt(b));
    }

    public static String mult(String a, String b) {
        return parseIntToBin(parseBinToInt(a) * parseBinToInt(b));

    }

    private static int parseBinToInt(String binStr) {
        return Integer.parseInt(binStr, 2);
    }

    private static String parseIntToBin(int num) {
        return Integer.toBinaryString(num);
    }
}