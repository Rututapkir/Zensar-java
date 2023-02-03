public class string {
    public static void main(String args[]){
        String name= "rutuja";
        String trainer = "rutuja";
        System.out.println(name==trainer);

        String s2 = new String("rutuja");
        String s3 = new String("rutuja");
        System.out.println(s2==s3);

        System.out.println(name.equals(s3));

        name= "ruts";
        System.out.println(name==trainer);
        
        s3 = "ruts";
        System.out.println(s3==name);
    }
}
