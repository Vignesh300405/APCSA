public class Mountain {
    public static void main(String[] args) {

        int[] array = {11, 44, 33, 22, 11};

        System.out.println(getPeakIndex(array));
        System.out.println(isIncreasing(array, getPeakIndex(array)));
        System.out.println(isDecreasing(array, getPeakIndex(array)));
        System.out.println(isMountain(array));
    }

    static int getPeakIndex(int[] array) {

        for(int i = 1; i < array.length - 1; i++) {
            if((array[i - 1] < array[i]) && (array[i] > array[i + 1])) {
                return i;
            }
        }
        return -1;
    }

    static boolean isMountain(int[] array) {

        int peak = getPeakIndex(array);

        if(peak != -1) {
            if(isIncreasing(array, peak) && isDecreasing(array, peak)) {
                return true;
            }
        }

        return false;
    }

    static boolean isIncreasing(int[] array, int stop) {
        for(int i = 0; i < stop - 1; i++) {
            if(array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static boolean isDecreasing(int[] array, int start) {
        for(int i = start; i < array.length - 1; i++) {
            if(array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
