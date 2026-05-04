import lib.RobertBinaryTree;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        //Global variable to be used with random number generation loops, helps to display how many times the loop has run
        int currentRun = 0;
        long startTime, endTime;
        RandomNumArray rn = new RandomNumArray();
        //Generate random numbers and store them in an array from size 1000 to 100,000
        for(int i = 1000; i <= 100000; i += 1000){
            currentRun++;
            int[] randomNumArray = rn.generateRandomNumArray(i);
            System.out.println("Starting Array run: " + currentRun);

            //Searches for arbitrary number in the array on each run and displays the time taken to complete
            startTime = System.nanoTime();
            boolean found = rn.linearSearchArray(randomNumArray, 2563);
            endTime = System.nanoTime();
            if(found) System.out.println("Found!: Time taken to complete: " + (endTime - startTime) + "\n\n\n");
            else System.out.println("Not Found!: Time taken to search: " + (endTime - startTime) + "\n\n\n");
        }


        //Same as above, but for an ArrayList
        currentRun = 0;
        for(int i = 1000; i <= 100000; i += 1000){
            currentRun++;
            ArrayList rnArrayList = rn.generateRandomNumArrayList(i);
            System.out.println("Starting ArrayList run: " + currentRun);

            //Searches for arbitrary number in the array on each run and displays the time taken to complete
            startTime = System.nanoTime();
            boolean found = rn.linearSearchArrayList(rnArrayList, 2563);
            endTime = System.nanoTime();
            if(found) System.out.println("Found!, time taken to complete: " + (endTime - startTime) + "\n\n\n");
            else System.out.println("Not Found!, time taken to search: " + (endTime - startTime) + "\n\n\n");
        }


        //Test of binary search on an array of 10,000 to 100,000 random numbers, timing and size included
        currentRun = 0;
        for(int i = 1000; i <= 100000; i += 1000){
            currentRun++;
            System.out.println("Starting RobertBinaryTree Search run: " + currentRun);
            //Create and convert the array to a binary tree and search for the number
            RobertBinaryTree rnBinaryTree = rn.convertArrayToTree(rn.generateRandomNumArray(i));
            System.out.println("Binary Tree size: " + rnBinaryTree.size);
            startTime = System.nanoTime();
            rn.binaryTreeSearch(rnBinaryTree, 2563);
            endTime = System.nanoTime();
            System.out.println("Found!, time taken to complete: " + (endTime - startTime) + "\n\n\n");
        }


        //Search via Recursive Linear Search on an array of 10,000 to 100,000 random numbers, timing and size included
        currentRun = 0;
        for(int i = 1000; i <= 100000; i += 1000){
            currentRun++;
            int[] recursed = rn.generateRandomNumArray(i);
            System.out.println("\n\nRecursive Linear Array Search run: " + currentRun);
            System.out.println("Array size: " + recursed.length);
            startTime = System.nanoTime();
            boolean found = rn.recursiveLinearSearch(recursed, 5237, 0);
            endTime = System.nanoTime();
            if(found){System.out.println("Found!");
            }else{System.out.println("Not Found!");}
            System.out.println("Time taken to complete Recursive Linear 'Array' : " + (endTime - startTime));
        }


        //Same as above, but for an ArrayList
        currentRun = 0;
        for(int i = 1000; i <= 100000; i += 1000){
            currentRun++;
            ArrayList<Integer> recursedList = rn.generateRandomNumArrayList(i);
            System.out.println("\n\nRecursive Linear ArrayList Search run: " + currentRun);
            System.out.println("ArrayList size: " + recursedList.size());
            startTime = System.nanoTime();
            boolean found = rn.recursiveLinearSearch(recursedList, 5237, 0);
            endTime = System.nanoTime();
            if (found){System.out.println("Found!");
            }else{System.out.println("Not Found!");}
            System.out.println("Time taken to complete Recursive Linear 'ArrayList' : " + (endTime - startTime));
        }


        //Bubble sort testing on an array of 40,000 to 50,000 random numbers, timing and size included
        currentRun = 0;
        for(int i = 40000; i <= 50000; i += 1000){
            currentRun++;
            System.out.println("\n\nBubble Sort Array run: " + currentRun);
            int[] bubbled = rn.generateRandomNumArray(i);
            System.out.println("Array size: " + bubbled.length);
            startTime = (int) System.currentTimeMillis();
            rn.bubbleSort(bubbled);
            endTime = (int) System.currentTimeMillis();
            System.out.println("\nTime taken to complete bubble sort: " + (endTime - startTime));
            System.out.println("Swaps: " + rn.getSwapCount());
        }


        //Same as above, but for an ArrayList
        currentRun = 0;
        for(int i = 40000; i <= 50000; i += 1000){
            currentRun++;
            System.out.println("\n\nBubble Sort ArrayList run : " + currentRun);
            ArrayList<Integer> bubbledList = rn.generateRandomNumArrayList(i);
            System.out.println("ArrayList size: " + bubbledList.size());
            startTime = System.currentTimeMillis();
            rn.bubbleSort(bubbledList);
            endTime = System.currentTimeMillis();
            System.out.println("\nTime taken to complete bubble sort: " + (endTime - startTime));
            System.out.println("Swaps: " + rn.getSwapCount());
        }


        //Global variable for use with if statements to display if number was found in an array via the Linear Binary Search method
        currentRun = 0;
        boolean foundLinear;
        for(int i = 1000; i <= 100000; i += 1000){
            currentRun++;
            System.out.println("\n\nLinear Binary Search run: " + currentRun);
            int[] bubbledArray = rn.generateRandomNumArray(i);
            System.out.println("Array size: " + bubbledArray.length);
            rn.bubbleSort(bubbledArray);
            startTime = System.nanoTime();
            foundLinear =  rn.linearBinarySearch(bubbledArray, 2563);
            endTime = System.nanoTime();
            if(foundLinear){System.out.println("Value found! - Time taken to complete: " + (endTime - startTime));
            }else{System.out.println("Value not found! :( - Time wasted " + (endTime - startTime));}
        }


        //Same as above, but for an ArrayList
        currentRun = 0;
        for(int i = 1000; i <= 100000; i += 1000){
            currentRun++;
            System.out.println("\n\n\nLinear Binary Search ArrayList run: " + currentRun);
            ArrayList<Integer> bubbledList = rn.generateRandomNumArrayList(i);
            System.out.println("ArrayList size: " + bubbledList.size());
            rn.bubbleSort(bubbledList);
            startTime = System.nanoTime();
            foundLinear = rn.linearBinarySearch(bubbledList, 2563);
            endTime = System.nanoTime();
            if(foundLinear){System.out.println("Value found! - Time taken to complete: " + (endTime - startTime));
            }else{System.out.println("Value not found! :( - Time wasted " + (endTime - startTime));}
        }


        //Sorting via insertion and selection sort on an array of 40,000 to 50,000 random numbers, timing and size included
        currentRun = 0;
        for(int i = 40000; i <= 50000; i += 1000){
            currentRun++;
            System.out.println("\n\nInsertion Sort Array run : " + currentRun);
            int[] inserted = rn.generateRandomNumArray(i);
            System.out.println("Array size: " + inserted.length);
            startTime = System.currentTimeMillis();
            rn.insertionSortArray(inserted);
            endTime = System.currentTimeMillis();
            System.out.println("Insertion Sort time: " + (endTime - startTime));
        }


        //Same as above, but for an ArrayList
        currentRun = 0;
        for(int i = 40000; i <= 50000; i += 1000){
            currentRun++;
            System.out.println("\n\nInsertion Sort ArrayList run: " + currentRun);
            ArrayList<Integer> insertedList = rn.generateRandomNumArrayList(i);
            System.out.println("ArrayList size: " + insertedList.size());
            startTime = System.currentTimeMillis();
            rn.insertionSortArrayList(insertedList);
            endTime = System.currentTimeMillis();
            System.out.println("Insertion Sort time: " + (endTime - startTime));
        }

        //Sorting via selection sort on an array of 40,000 to 50,000 random numbers, timing and size included
        currentRun = 0;
        for(int i = 40000; i <= 50000; i += 1000){
            currentRun++;
            System.out.println("\n\nSelection Sort Array run: " + currentRun);
            int[] selected  = rn.generateRandomNumArray(i);
            System.out.println("Array size: " + selected.length);
            startTime = System.currentTimeMillis();
            rn.selectionSortArray(selected);
            endTime = System.currentTimeMillis();
            System.out.println("Selection Sort time: " + (endTime - startTime));
        }

        //Same as above, but for an ArrayList
        currentRun = 0;
        for(int i = 40000; i <= 50000; i += 1000){
            currentRun++;
            System.out.println("\n\nSelection Sort ArrayListRun: " + currentRun);
            ArrayList<Integer> selectedList = rn.generateRandomNumArrayList(i);
            System.out.println("ArrayList size: " + selectedList.size());
            startTime = System.currentTimeMillis();
            rn.selectionSortArrayList(selectedList);
            endTime = System.currentTimeMillis();
            System.out.println("Selection Sort time: " + (endTime - startTime));
        }


        //Sorting via Shell Sort on an array of 40,000 to 50,000 random numbers, timing and size included
        currentRun = 0;
        for(int i = 40000; i <= 50000; i += 1000){
            currentRun++;
            System.out.println("\n\nShell Sort Array run: " + currentRun);
            int[] shelled = rn.generateRandomNumArray(i);
            System.out.println("Array size: " + shelled.length);
            startTime = System.currentTimeMillis();
            rn.shellSortArray(shelled);
            endTime = System.currentTimeMillis();
            System.out.println("Time taken to complete Shell Sort 'Array' : " + (endTime - startTime));
        }


        //Same as above, but for an ArrayList
        currentRun = 0;
        for(int i = 40000; i <= 50000; i += 1000){
            currentRun++;
            System.out.println("\n\nShell Sort ArrayList run: " + currentRun);
            ArrayList<Integer> shelledList = rn.generateRandomNumArrayList(i);
            System.out.println("ArrayList size: " + shelledList.size());
            startTime = System.currentTimeMillis();
            rn.shellSortArrayList(shelledList);
            endTime = System.currentTimeMillis();
            System.out.println("Time taken to complete Shell Sort 'ArrayList' : " + (endTime - startTime));
        }


        //Merge Sort on an array of 40,000 to 50,000 random numbers, timing and size included
        currentRun = 0;
        for(int i = 40000; i <= 50000; i += 1000){
            currentRun++;
            System.out.println("\n\nMerge Sort Array run: " + currentRun);
            int[] mergedArray = rn.generateRandomNumArray(i);
            System.out.println("Array size: " + mergedArray.length);
            startTime = System.currentTimeMillis();
            rn.mergeSortArray(mergedArray);
            endTime = System.currentTimeMillis();
            System.out.println("Time taken to complete merge sort 'Array' : " + (endTime - startTime));
        }


        //Same as above, but for an ArrayList
        currentRun = 0;
        for(int i = 40000; i <= 50000; i += 1000){
            currentRun++;
            System.out.println("\n\nMerge Sort ArrayList run: " + currentRun);
            ArrayList<Integer> mergedArrayList = rn.generateRandomNumArrayList(i);
            System.out.println("ArrayList size: " + mergedArrayList.size());
            startTime = System.currentTimeMillis();
            rn.mergeSortArrayList(mergedArrayList);
            endTime = System.currentTimeMillis();
            System.out.println("Time taken to complete merge sort 'ArrayList' : " + (endTime - startTime));
        }


        //Quick Sort on an array of 40,000 to 50,000 random numbers, timing and size included
        currentRun = 0;
        for(int i = 40000; i <= 50000; i += 1000){
            currentRun++;
            System.out.println("\n\nQuick Sort Array run: " + currentRun);
            int[] quickSorted = rn.generateRandomNumArray(i);
            System.out.println("Array size: " + quickSorted.length);
            startTime = System.currentTimeMillis();
            rn.quickSortArray(quickSorted, 0, quickSorted.length - 1);
            endTime = System.currentTimeMillis();
            System.out.println("Time taken to complete quick sort 'Array': " + (endTime - startTime));
        }


        //Same as above, but for an ArrayList
        currentRun = 0;
        for(int i = 40000; i <= 50000; i += 1000){
            currentRun++;
            System.out.println("\n\nQuick Sort ArrayList run: " + currentRun);
            ArrayList<Integer> quickSortedList = rn.generateRandomNumArrayList(i);
            System.out.println("ArrayList size: " + quickSortedList.size());
            startTime = System.currentTimeMillis();
            rn.quickSortArrayList(quickSortedList, 0, quickSortedList.size() - 1);
            endTime = System.currentTimeMillis();
            System.out.println("Time taken to complete quick sort 'ArrayList': " + (endTime - startTime));
        }
    }
}