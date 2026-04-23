import java.util.Random;
import java.util.ArrayList;

public class RandomNumArray {
    long swapCount = 0;

    public int[] RandomNumArray(int length) {
        Random rand = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(999999999);
        }
        return arr;
    }

    public ArrayList RandomNumArrayList(int size){
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < size; i++){
            arr.add(rand.nextInt(999999999));
        }
        return arr;
    }

    public Boolean findValue(int[] arr, int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return true;
            }
        }
        return false;
    }

    public Boolean findValue(ArrayList<Integer> arr, int value){
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == value){
                return true;
            }
        }
        return false;
    }

    public int[] bubbleSort(int[] arr){
        this.swapCount = 0;
        int[] bubbled = arr;
        for(int i = 0; i < arr.length; i++){
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

    long getSwapCount(){
        return swapCount;
    }

    //insertionSort
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
    //selectionSort
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

    //LineearBinarySearch
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

    //

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


}
