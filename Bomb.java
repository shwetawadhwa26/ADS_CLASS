public class Bomb{
    public static String defuseTheBomb(String code, int k) {
        int n = code.length();
        if (k == 0) return code;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (k > 0) {
                result.append((char) (code.charAt(i) - k));
            } else {
                result.append((char) (code.charAt(i) + Math.abs(k)));
            }
        }
        return result.toString();
}
public static void main(String[] args) {
    String code = "abcdef";
        int k = 2;
        System.out.println("Defused Code: " + defuseTheBomb(code, k));
}
}