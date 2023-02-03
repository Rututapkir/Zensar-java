public class paringFrnds{
    public static int FrndsPair(int n){
      // base case  
      if(n==1||n==2){
        return n;
      }

        //choice 
        //single 
        /* int fnm1= FrndsPair(n-1);

        //pair
        int fnm2= FrndsPair(n-2);
        int pairWays = (n-1)*fnm2;

        //total ways 
        int totalways = fnm1 + pairWays;
        return totalways; */
        
        return FrndsPair(n-1)+ (n-1)*FrndsPair(n-2);
    }
    public static void main(String args[]){
        System.out.println(FrndsPair(3));
    }
}
