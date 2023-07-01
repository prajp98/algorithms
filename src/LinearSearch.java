public class LinearSearch {
//    Linear search Algorithm in Java
//    Best case : O(1)
//    Worst case : O(N)
//    Average Case : O(N)
//    Space : O(1)
    public static int linearSearch(int[] arr, int x){
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    public static int recursiveLinearSearch(int[] arr, int size, int x){
        if(size==0){
            return -1;
        }
        else if(arr[size-1]==x){
            return size-1;
        }
        else
            return recursiveLinearSearch(arr,size-1,x);
    }
    public static void main(String[] args){
        int[] numbers = {10,0,5,1,17};
        int x = 1;
        System.out.println("Number "+x+" found in position "
                +linearSearch(numbers,x));
        System.out.println("Number "+x+" found in position "
                +recursiveLinearSearch(numbers,numbers.length,x));
    }
}