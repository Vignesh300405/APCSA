public class SkyViewTester {
    public static void main(String[] args) {
        
        double[] scanned = { 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8 };

        SkyView sv = new SkyView(4, 2, scanned);
        sv.returnSkyView();
        System.out.println();
        System.out.println(sv.getAverage(1, 2, 0, 1));
    }
}
