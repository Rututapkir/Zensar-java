public class tillingProblem {
        public static int tillingPro(int n){   //// 2xn floor size 
           //base 
           if(n==0||n==1){
            return 1;
           }
            //work 
            //verticaal choice 
          /*   int  fnm1 = tillingPro(n-1);

            //horizontal choice 
            int fnm2 = tillingPro(n-2);

            int totalways = fnm1+fnm2;
            return totalways; */
            return tillingPro(n-1) + tillingPro(n-2);
        } 
    public static void main(String args[]){
        System.out.println("Total ways are "+tillingPro(3));

    }
}
