public class recSumofN {

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int Sm1 = sum(n-1);
        int Sn = n+sum(n-1);
        return Sn;
    }
    public static void main(String args[]){
        System.out.println(sum(5));

    }
    
}
