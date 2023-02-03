public class binaryStringProb{
    public static void PrintBinaryStr(int n ,int lastPlace, String str){
        // conaecutive ones 

        //work 
       /* if(lastPlace == 0){
            // sit 0 on chair n
            PrintBinaryStr(n-1 , 0, str.append("0"));
            PrintBinaryStr(n-1 , 1, str.append("1"));
        }else{
            PrintBinaryStr(n-1 , 0, str.append("0"));
        }*/

        //base case

        if(n==0){
            System.out.println(str);
            return;
            
        }
       // PrintBinaryStr(n-1 , 0, str+"0");
        //if(lastPlace==0){
          //  PrintBinaryStr(n-1 , 1, str+"1");
       // }


        // consecutive zeros
        PrintBinaryStr(n-1 ,1,  str+"1");
        if(lastPlace==0){
            PrintBinaryStr(n-1 ,0,  str+"0");
        }
        
    }
public static void main(String args[]){
    PrintBinaryStr( 3 ,0, "");
}
}