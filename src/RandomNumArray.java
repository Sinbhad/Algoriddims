import lib.RobertBinaryTree;

import java.util.Random;
import java.util.ArrayList;

public class RandomNumArray {

    /**
     * Generate a random numbers array
     * @param length
     * @return
     */
    public int[] generateRandomNumArray(int length) {
        Random rand = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(9999);
        }
        return arr;
    }

    /**
     * Generate random numbers ArrayList
     * @param size
     * @return
     */
    public ArrayList generateRandomNumArrayList(int size){
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < size; i++){
            arr.add(rand.nextInt(9999));
        }
        return arr;
    }

    /**
     * Convert an array to a binary tree
     * @param arr
     * @return
     */
    //to be used with binary tree sort method
    public RobertBinaryTree convertArrayToTree(int[] arr){
        RobertBinaryTree tree = new RobertBinaryTree();
        for(int i = 1; i < arr.length; i++){
            tree.add(arr[i]);
        }
        return tree;
    }


    /**
     * Binary Tree search method
     * @param tree
     * @param value
     * @return
     */
    public boolean binaryTreeSearch(RobertBinaryTree tree, int value){
        return tree.contains(value);
    }


    /**
     * Linear search method for an array
     * @param arr
     * @param value
     * @return
     */
    public Boolean linearSearchArray(int[] arr, int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return true;
            }
        }
        return false;
    }

    /**
     * Linear search method for an ArrayList
     * @param arr
     * @param value
     * @return
     */
    public Boolean linearSearchArrayList(ArrayList<Integer> arr, int value){
        for (Integer integer : arr) {
            if (integer == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Linear search method for an array using binary search
     * @param arr
     * @param value
     * @return
     */
    public boolean linearBinarySearch(int[] arr, int value){
        int start = 0;
        int end = arr.length - 1;
        boolean found = false;
        while(!found && start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == value){
                found = true;
            }else if(arr[mid] > value){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return found;
    }

    /**
     * Linear search method for an ArrayList using binary search
     * @param arr
     * @param value
     * @return
     */
    public boolean linearBinarySearch(ArrayList<Integer> arr, int value){
        int start = 0;
        int end = arr.size() - 1;
        boolean found = false;
        while(!found && start <= end){
            int mid = (start + end) / 2;
            if(arr.get(mid) == value){
                found = true;
            }else if(arr.get(mid) > value){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return found;
    }

    /**
     * Recursive linear search method for an array
     * @param arr
     * @param value
     * @param start
     * @return
     */
    public boolean recursiveLinearSearch(int[] arr, int value, int start){
        if(start == arr.length - 1){
            return false;
        }
        if(arr[start] == value){
            return true;
        }
        return recursiveLinearSearch(arr, value, start + 1);
    }

    /**
     * Recursive linear search method for an ArrayList
     * @param arr
     * @param value
     * @param start
     * @return
     */
    public boolean recursiveLinearSearch(ArrayList<Integer> arr, int value, int start){
        if(start == arr.size() - 1){
            return false;
        }
        if(arr.get(start) == value){
            return true;
        }
        return recursiveLinearSearch(arr, value, start + 1);
    }

   //Global swap count variable to track swaps within sort methods
    long swapCount = 0;

    /**
     * Bubble sort for an array
     * @param arr
     * @return
     */
    public int[] bubbleSort(int[] arr){
        this.swapCount = 0;
        int[] bubbled = arr;
        for(int i = 0; i < arr.length; i++){               //Mentioned by Andrew Davitt vv
            for(int j = 0; j < arr.length - (i + 1); j++){ // The last element is always the largest, thus this saves time
                if(bubbled[j] > bubbled[j + 1]){
                    int temp = bubbled[j];
                    bubbled[j] = bubbled[j + 1];
                    bubbled[j + 1] = temp;
                    this.swapCount++;
                }
            }
        }
        return bubbled;
    }

    /**
     * Bubble sort for an ArrayList
     * @param arr
     * @return
     */
    public ArrayList bubbleSort(ArrayList<Integer> arr){
        this.swapCount = 0;
        ArrayList<Integer> bubbled = arr;
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size() - (i + 1); j++){
                if(bubbled.get(j) > bubbled.get(j + 1)){
                    int temp = bubbled.get(j);
                    bubbled.set(j, bubbled.get(j + 1));
                    bubbled.set(j + 1, temp);
                    this.swapCount++;
                }
            }
        }
        return bubbled;
    }

    /**
     * Get the number of swaps made within the sort methods
     * @return
     */
    long getSwapCount(){
        return swapCount;
    }

    /**
     * Insertion sort for an array
     * @param arr
     * @return
     */
    public int[] insertionSortArray(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int j = i - 1;
            int temp = arr[i];
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    /**
     * Insertion sort for an ArrayList
     * @param arr
     * @return
     */
    public ArrayList insertionSortArrayList(ArrayList<Integer> arr){
        for(int i = 1; i < arr.size(); i++){
            int j = i - 1;
            int temp = arr.get(i);
            while(j >= 0 && arr.get(j) > temp){
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, temp);
        }
        return arr;
    }


    /**
     * Selection sort method for an array
     * @param arr
     * @return
     */
    public int[] selectionSortArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    /**
     * Selection sort method for an ArrayList
     * @param arr
     * @return
     */
    public ArrayList selectionSortArrayList(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            int min = i;
            for(int j = i + 1; j < arr.size(); j++){
                if(arr.get(j) < arr.get(min)){
                    min = j;
                }
            }
            int temp = arr.get(i);
            arr.set(i, arr.get(min));
            arr.set(min, temp);
        }
        return arr;
    }


    public int[] shellSortArray(int[] arr){
        int length = arr.length;
        for (int gap = length / 4; gap >= 1; gap /= 4) {
            for(int i = gap; i < length; i++){
                int gappedArr = arr[i];
                int j;
                for(j = i; j >= gap && arr[j - gap] > gappedArr; j -= gap){
                    arr[j] = arr[j - gap];
                }
                arr[j] = gappedArr;
            }
        }
        return arr;
    }

    public ArrayList shellSortArrayList(ArrayList<Integer> arr){
        int length = arr.size();
        for (int gap = length / 4; gap >= 1; gap /= 4) {
            for(int i = gap; i < length; i++){
                int temp = arr.get(i);
                int j;
                for(j = i; j >= gap && arr.get(j - gap) > temp; j -= gap){
                    arr.set(j, arr.get(j - gap));
                }
                arr.set(j, temp);
            }
        }
        return arr;
    }

    /**
     * Merge sort for an array
     * @param arr
     * @return
     */
    public int[] mergeSortArray(int[] arr) {
        //base case to prevent infinite recursion, stops if the array is of length 1 or 0
        if (arr.length < 2) {
            return arr;
        }

        //split the array in half
        int midIndex = arr.length / 2;
        int[] left = new int[midIndex];
        int[] right = new int[arr.length - midIndex];

        for (int i = 0; i < midIndex; i++) {
            left[i] = arr[i];
        }

        for (int i = midIndex; i < arr.length; i++) {
            right[i - midIndex] = arr[i];
        }

        //sort each half
        mergeSortArray(left);
        mergeSortArray(right);

        //Variables defined out of loop as to not lose track for remaining values
        int i = 0, j = 0, k = 0;

        //add the sorted halves together, sorting as we go
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        //add the remaining elements of the smaller half
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }

        return arr;
    }

    /**
     * Merge sort for an ArrayList
     * @param arr
     * @return
     */
    public ArrayList<Integer> mergeSortArrayList(ArrayList<Integer> arr){
        //read notes on merge sort array
        if(arr.size() < 2){
            return arr;
        }

        int midIndex = arr.size() / 2;
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for(int i = 0; i < midIndex; i++){
            left.add(arr.get(i));
        }

        for(int i = midIndex; i < arr.size(); i++){
            right.add(arr.get(i));
        }

        mergeSortArrayList(left);
        mergeSortArrayList(right);

        int i = 0, j = 0, k = 0;

        while(i < left.size() && j < right.size()){
            if(left.get(i) <= right.get(j)){
                arr.set(k, left.get(i));
                i++;
            }else{
                arr.set(k, right.get(j));
                j++;
            }
        }

        while(i < left.size()){
            arr.set(k, left.get(i));
            i++;
            k++;
        }

        while(j < right.size()){
            arr.set(k, right.get(j));
            j++;
            k++;
        }
        return arr;
    }

    public int[] quickSortArray(int[] arr, int start, int end) {
        if (start >= end) {
            return arr;
        }

        int pivotIndex = partitionArray(arr, start, end);

        quickSortArray(arr, start, pivotIndex - 1);
        quickSortArray(arr, pivotIndex + 1, end);

        return arr;
    }

    public int partitionArray(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }

    public ArrayList<Integer> quickSortArrayList(ArrayList<Integer> arr, int start, int end) {
        if (start >= end) {
            return arr;
        }

        int pivotIndex = partitionArrayList(arr, start, end);

        quickSortArrayList(arr, start, pivotIndex - 1);
        quickSortArrayList(arr, pivotIndex + 1, end);

        return arr;
    }

    public int partitionArrayList(ArrayList<Integer> arr, int start, int end) {
        int pivot = arr.get(end);
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++) {
            if (arr.get(j) <= pivot) {
                i++;
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        int temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(end));
        arr.set(end, temp);

        return i + 1;
    }
}






