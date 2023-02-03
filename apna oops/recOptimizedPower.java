public class recOptimizedPower {
    public static int optimixedPower(int a,int n){ //O(logn)
        if(n==0){
            return 1;
        }
        int halfpower = optimixedPower(a,n/2) ;
       int  halfPowsq= halfpower * halfpower;
        // n is odd
        if(n%2 !=0){
            halfPowsq= a*halfPowsq;
        }
        return halfPowsq;

    }
    public static void main(String args[]){
   System.out.println(optimixedPower(2,10));
    }
}
