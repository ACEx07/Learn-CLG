import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FileRead{
    public static void main(String args[]){
        try{
            File obj=new File("demo.txt");
            Scanner myreader=new Scanner(obj);
            while(myreader.hasNextLine()){
                String data = myreader.nextLine();
                System.out.println(data);

        }
        System.out.println(obj.getName());
        System.out.println(obj.getAbsolutePath());
        System.out.println(obj.length());
        System.out.println(obj.canRead());
        System.out.println(obj.canWrite());
        myreader.close();
    }
    catch(IOException e) {
        System.out.println("Error");
        e.printStackTrace();
    }
    }  
}