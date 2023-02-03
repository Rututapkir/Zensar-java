import java.io.FileInputStream;
import java.io.FileOutputStream;


public class MyFiles {
    public static void main(String args[]){
        myFileReadWrite obj = new myFileReadWrite();
        obj.readFile();
        obj.writeFile();
        //obj.copyFile();
    }
}
class myFileReadWrite{
public void copyFile(){
    try {
        FileInputStream file = new FileInputStream("C:/Users/user/OneDrive/Desktop/Zensar java/StudentProperties.txt");  // opening in read mode 
        FileOutputStream File1 = new FileOutputStream("C:/Users/user/OneDrive/Desktop/Zensar java/StudentProperties.txt");  // opening in write mode 
        while(true){
            int i= file.read();
            if(i==-1){
                break;
            }
            File1.write(i);
        }
        file.close();
        File1.close();
    } catch (Exception e) {
        System.out.println("File not Found "+e);
    }
}
public void readFile(){
    try {
     FileInputStream file = new FileInputStream("C:/Users/user/OneDrive/Desktop/Zensar java/StudentProperties.txt");  // opening in read mode 
     while(true){
         int i= file.read();
         if(i==-1){
             break;
         }
         System.out.print((char)i);
     }
     file.close();
    } catch (Exception e) {
     System.out.println("File not Found "+e);
    } 
 }
 public void writeFile(){
    try {
       // FileOutputStream File1 = new FileOutputStream("D://student.Properties");  // opening in write mode 
        FileOutputStream File1 = new FileOutputStream("C:/Users/user/OneDrive/Desktop/Zensar java/StudentProperties.txt",true);  // opening in Append mode 
        String message = "Hello Everyone";
       // int ch = 65;
       // File1.write(ch);
       File1.write(message.getBytes());
        File1.close();
    } catch (Exception e) {
        System.out.println("File not Found "+e);
    }
 }
}
// A= 65 B = 66 ......Z= 90
//a = 97 , b=98.......z=122
//whitespace -32
// 0 -48 1-49 2-50........