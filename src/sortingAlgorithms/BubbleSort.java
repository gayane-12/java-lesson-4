package sortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] unsortedArray = {3, 50, 12, 1, 40, 2, 30};

        int counterForLength = 1;
        boolean unsortedCasesExists = true;

        while (unsortedCasesExists){
            unsortedCasesExists = false;
            for (int i = 0; i < unsortedArray.length - counterForLength - 1; i++) {
                if(unsortedArray[i] > unsortedArray[i+1]){
                    int temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i+1];
                    unsortedArray[i+1] = temp;
                    unsortedCasesExists = true;
                }
            }
            counterForLength++;
        }

    }
}
