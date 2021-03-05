package Chapter7.Lab2;

public class SortedIntList extends IntList {

    protected int[] sortedList;
    int numElements = 0;

    public SortedIntList(int size) {
        super(size);
        sortedList = new int[size];
    }

    public void add(int value) {

        // sortedList[numElements] = value + 1;
        // numElements++;

        if(numElements == 0) {
            sortedList[numElements] = value;
            numElements++;
        }

        
        for(int i = 0; i < numElements; i++) {
            System.out.println("Wo2rking");

            if(sortedList[i] >= value) {
                System.out.println("Working");
                for(int j = numElements; j >= i; j--) {
                    sortedList[j+1] = sortedList[j];
                    System.out.println("Wo3king: " + sortedList[j+1]);
                }
                sortedList[i] = value;
            }
            if(numElements < sortedList.length - 2) {
                numElements++;
            }

            /*
            if(sortedList[i] >= value) {
              int temp = sortedList[i];
              int temp2 = sortedList[i + 1];
              for(int j = i; j < numElements; j++) {
                  if(j == i) {
                      sortedList[j] = value;
                  } else if(j == (i + 1)) {
                      temp2 = sortedList[j];
                      sortedList[j] = temp;
                      sortedList[j + 1] = temp2;
                  } else {
                    temp = sortedList[j];
                    sortedList[j] = temp2;
                    sortedList[j + 1] = temp2;
                  }
              }  
            } else {
                sortedList[numElements] = value;
            }

            numElements++;
            */

        }
        

    }

    public String toString()
    {
	String returnString = "";
	for (int i=0; i<numElements; i++)
	    returnString += i + ": " + sortedList[i] + "\n";
	return returnString;
    }
}




