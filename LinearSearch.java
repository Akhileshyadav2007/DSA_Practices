public class LinearSearch {
    public static int linearSearch(int arr[],int target){
        for (int i= 0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return-1;
    }

    public static void main(String[] args) {
        int arr[]={4,5,2,7,9,6};
        int target=9;
        int result = linearSearch(arr,target);
        System.out.println("target index :  "+  result);
    }

}
