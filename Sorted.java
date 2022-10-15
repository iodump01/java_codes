public class Sorted {
    public static void isSorted(int arr[], int idx){
        //base condition
        if(idx==arr.length-1){
            return true;
        }

        if(arr[idx]<arr[idx+1]){
            return isSorted(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,0,5};
        System.out.println(isSorted(arr, 0));
    }
}
