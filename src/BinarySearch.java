public class BinarySearch {
    public static int func(int[] array, int theNumberOfSearch){
        int left=0;
        int right=array.length-1;
        while(left<=right) {
            int mid=(left+right)/2;
            if (theNumberOfSearch == array[mid]) {
                return mid;
            }
            if (theNumberOfSearch < array[mid]) {
                right=mid;
            }
            if(theNumberOfSearch>array[mid]){
                left=mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(func(arr,6));
    }
}

