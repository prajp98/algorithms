public class BinarySearch {
//    Binary search Algorithm in Java
//    Best case : O(1)
//    Worst case : O(log(N))
//    Average Case : O(log(N))
//    Space : O(1)
    public static int binarySearch(int[] arr, int x){
        int l=0,r=arr.length-1;
        while(l<=r){
            int m=l+(r-1)/2;
            if(arr[m]==x){
                return m;
            }
            else if(arr[m]<x){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return -1;
    }
    public static int recursiveBinarySearch(int[] arr, int x, int l, int r){
        if (r >= l) {
            int mid = l+(r-l)/2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return recursiveBinarySearch(arr,x, l, mid - 1);
            return recursiveBinarySearch(arr,x, mid + 1, r);
        }
        return -1;
    }



    public static void main(String[] args){
        int[] numbers = {1,10,19,27,51};
        int x = 27;
        int n = numbers.length;
        System.out.println("Number "+x+" is found in position "+binarySearch(numbers,x));
        System.out.println("Number "+x+" is found in position "+recursiveBinarySearch(numbers,x,0,n-1));
    }
}
