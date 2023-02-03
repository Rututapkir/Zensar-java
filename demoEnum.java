public class demoEnum {
    public enum Names{RAM,JAM,SHAM,TAM}
    public static void main(String args[]){
        for(Names name: Names.values()){
            System.out.println(name);
        }
        System.out.println("value of JAM is: "+ Names.valueOf("JAM"));
        System.out.println("Index of JAM is: "+ Names.valueOf("JAM").ordinal());
        System.out.println("Index of TAM is: "+ Names.valueOf("TAM").ordinal());
    }
}
