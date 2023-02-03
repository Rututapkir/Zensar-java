//BY using character Stream 

import java.io.FileReader;
import java.io.FileWriter;

public class MyfileStream {
    public static void main(String args[]){
        MyStreamFile obj = new MyStreamFile();
        obj.readFile();
        obj.writeOperation();
    }
}
class MyStreamFile{
    public void readFile(){
        try {
            FileReader fileReader = new FileReader("");
            while(true){
                int i = fileReader.read();
                if(i==-1){
                    break;
                }
                System.out.println((char)i);
            }
            fileReader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void writeOperation(){
        try {
            FileWriter filewriter = new FileWriter("");
            String message= "Its just Testing ";
            filewriter.write(message);
            filewriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}