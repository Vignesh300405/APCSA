public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {

        view = new double[numRows][numCols];
        int count = 0;

        for(int i = 0; i < numRows; i++) {
            double[] inserted = new double[numCols]; 
            for(int j = 0; j < numCols; j++){
               inserted[j] = scanned[count]; 
               count++;
               if(j == numCols - 1)
                   view[i] = inserted;
            }
        }
    }

    public void returnSkyView() {
        for(int i = 0; i < view.length; i++) {
            System.out.println();
            for(int j = 0; j < view[i].length; j++) {
                System.out.print(view[i][j] + " ");
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {

        double total = 0;
        int num = 0;

        for(int i = startRow; i <= endRow; i++) {
            for(int j = startCol; j <= endCol; j++) {
                if((i == view.length) || (j == view[i].length))
                    break;
                total += view[i][j];
                num++;
            }
        }

        return total / num;
    }
}
