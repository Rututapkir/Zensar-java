public class removeDuplicates {
    public static void removeDuplicates(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }

        //work 
        char curCharr= str.charAt(idx);
        if(map[curCharr-'a']==true){
            //duplicate 
            removeDuplicates(str,idx+1,newstr,map);
        }else{
            map[curCharr-'a']=true;
            removeDuplicates(str,idx+1,newstr.append(curCharr),map);
        }
    }
    public static void main(String args[]){
     String str = "rutujatapkir";
     removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
    }
}
