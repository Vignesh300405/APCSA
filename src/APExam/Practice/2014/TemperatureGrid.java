public class TemperatureGrid {

    static double[][] temps = {{95.5, 100.0, 100.0, 100.0, 100.0, 110.3}, 
                                {0.0, 50.0, 50.0, 50.0, 50.0, 0.0},
                                {0.0, 40.0, 40.0, 40.0, 40.0, 0.0}};

    public static void main(String[] args) {
        System.out.println(computeTemp(2,2));
        System.out.println(updateAllTemps(20));
    }

    static double computeTemp(int row, int col) {

        if(((row >= (temps.length - 1)) || (row == 0)) || ((col >= temps[0].length - 1) || (col == 0))) {
            return temps[row][col];
        } else {
            return (temps[row - 1][col] + temps[row + 1][col] + temps[row][col - 1] + temps[row][col + 1]) / 4; 
        }

    }

    static boolean updateAllTemps(double tolerance) {

        double[][] updatedTemps = new double[temps.length][temps[0].length];

        for(int i = 0; i < temps.length; i++) {
            for(int j = 0; j < temps[i].length; j++) {
                updatedTemps[i][j] = computeTemp(i, j);
                if(Math.abs(updatedTemps[i][j] - temps[i][j]) > tolerance) {
                    return false;
                }
            }
        }

        return true;
    }
}
