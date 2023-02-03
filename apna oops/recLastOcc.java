public class recLastOcc {
    public static int lastOcc(int arr[],int i , int key){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOcc(arr, i+1, key);
        if(isFound== -1 && arr[i]==key){
            return i;
        }
        return isFound;
    
        //check withself
        
    }
    public static void main(String args[]){
        int arr[]={5,5,5,5};
        System.out.println(lastOcc(arr, 0, 5));
    }
}
