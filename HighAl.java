public class HighAl{
    public static int largestAltitude(int[] gain) {
        int maxAltitude = 0, currentAltitude = 0;
        for (int g : gain) {
            currentAltitude += g;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }
        return maxAltitude;
    }
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println("Highest Altitude: " + largestAltitude(gain));
    }
}