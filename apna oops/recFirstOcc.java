public class recFirstOcc{
     public static int firstOcc(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }    
        return firstOcc(arr, i+1, key);

        
     }
    public static void main(String args[]){
     int arr[]={8,3,6,9,8,10,2,7,5};
     System.out.println(firstOcc(arr, 0, 5));
    
     
    }
}