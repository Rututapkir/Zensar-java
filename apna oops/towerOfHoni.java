public class towerOfHoni {
      public static void toweroH(int n ,char src,char dest, char help){
        if(n==1){
            System.out.println("Move disk"+n +" from "+src +" to "+dest);
            return;
            
        }
        
        toweroH(n-1, src, help, dest);
        System.out.println("Move disk"+n +" from "+ src +" to "+dest);
        toweroH(n-1, help, dest, src);
        
      }
    public static void main(String args[]){
        toweroH(2, 'A', 'C', 'B');
         

    }
    
}
