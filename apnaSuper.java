public class apnaSuper {
    public static void main(String args[]){
        student s1 = new student();
        System.out.println(s1.work);

    }
}
class People{
    String work;
    People(){
        System.out.println("Constructor of People ");
    }
}
class student extends People{
    student(){
        super();
        super.work="Study";
        System.out.println("Constructor of Student ");
    }
}

