import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int currentRun = 0;
        RandomNumArray rn = new RandomNumArray();
        for(int i = 1000; i < 100000; i += 1000){
            currentRun++;
            int[] rnArray = rn.RandomNumArray(i);
            int startTime = (int) System.currentTimeMillis();
            System.out.println("Starting Array run: " + currentRun);
            rn.findValue(rnArray, 275376455);
            int endTime = (int) System.currentTimeMillis();
            System.out.println("Found!, time taken to complete: " + (endTime - startTime) + "\n\n\n");
        }

        currentRun = 0;
        for(int i = 1000; i < 100000; i += 1000){
            currentRun++;
            ArrayList rnArrayList = rn.RandomNumArrayList(i);
            System.out.println("Starting ArrayList run: " + currentRun);
            int startTime = (int) System.currentTimeMillis();
            rn.findValue(rnArrayList, 275376455);
            int endTime = (int) System.currentTimeMillis();
            System.out.println("Found!, time taken to complete: " + (endTime - startTime) + "\n\n\n");
        }

        System.out.println("Bubble Sort");
        int startTime = (int) System.currentTimeMillis();
        int[] bubbled = rn.bubbleSort(rn.RandomNumArray(50000));
        int endTime = (int) System.currentTimeMillis();
        System.out.println("\nTime taken to complete bubble sort: " + (endTime - startTime));
        System.out.println("Swaps: " + rn.getSwapCount());


        System.out.println("\n\nBubble Sort ArrayList");
        startTime = (int) System.currentTimeMillis();
        ArrayList<Integer> bubbledList = rn.bubbleSort(rn.RandomNumArrayList(50000));
        endTime = (int) System.currentTimeMillis();
        System.out.println("\nTime taken to complete bubble sort: " + (endTime - startTime));
        System.out.println("Swaps: " + rn.getSwapCount());


        boolean foundLinear =  rn.linearBinarySearch(bubbled, 756622942);
        System.out.println("\n\nLinear Binary Search");
        startTime = (int) System.currentTimeMillis();
        if(foundLinear){
            endTime = (int) System.currentTimeMillis();
            System.out.println("Value found! - Time taken to complete: " + (endTime - startTime));
        }else{
            endTime = (int) System.currentTimeMillis();
            System.out.println("Value not found! :( - Time wasted " + (endTime - startTime));
        }

        foundLinear = rn.linearBinarySearch(bubbledList, 756622942);
        System.out.println("\n\n\nLinear Binary Search ArrayList");
        startTime = (int) System.currentTimeMillis();
        if(foundLinear){
            endTime = (int) System.currentTimeMillis();
            System.out.println("Value found! - Time taken to complete: " + (endTime - startTime));
        }else{
            endTime = (int) System.currentTimeMillis();
            System.out.println("Value not found! :( - Time wasted " + (endTime - startTime));
        }




        int[] inserted = rn.RandomNumArray(50000);
        System.out.println("\n\nInsertion Sort");
        startTime = (int) System.currentTimeMillis();
        rn.insertionSortArray(inserted);
        endTime = (int) System.currentTimeMillis();
        System.out.println("Insertion Sort time : " + (endTime - startTime));

        ArrayList<Integer> insertedList = rn.RandomNumArrayList(50000);
        System.out.println("\n\nInsertion Sort ArrayList");
        startTime = (int) System.currentTimeMillis();
        rn.insertionSortArrayList(insertedList);
        endTime = (int) System.currentTimeMillis();
        System.out.println("Insertion Sort time : " + (endTime - startTime));



        int[] selected  = rn.RandomNumArray(50000);
        System.out.println("\n\nSelection Sort");
        startTime = (int) System.currentTimeMillis();
        rn.selectionSortArray(selected);
        endTime = (int) System.currentTimeMillis();
        System.out.println("Selection Sort time : " + (endTime - startTime));

        ArrayList<Integer> selectedList = rn.RandomNumArrayList(50000);
        System.out.println("\n\nSelection Sort ArrayList");
        startTime = (int) System.currentTimeMillis();
        rn.selectionSortArrayList(selectedList);
        endTime = (int) System.currentTimeMillis();
        System.out.println("Selection Sort time : " + (endTime - startTime));

    }
}