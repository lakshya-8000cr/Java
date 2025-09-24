package Java.JAVAFULL;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30 , 40 , 50};
        int target = 30;
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int mid = st + (end - st)/2;
        while(st<end){
            if(arr[mid]==target){
                System.out.println(arr[mid]);
                break; 
            }
            else if(arr[mid]>target){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
    }
}

// here we write static because if we are writing under the main function it is needed;


