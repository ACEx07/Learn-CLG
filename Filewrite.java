import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {
    public static void main(String args[]) {
        // File obj = new File("demo.txt");
        // try {
        // obj.createNewFile();
        // System.out.println("File Created");
        // System.out.println("Path:" + obj.getAbsolutePath());
        // } catch (IOException e) {
        // System.out.println("Error occured");
        try {
            FileWriter mywriter = new FileWriter("demo.txt");
            String ip[] = { "hello" };
            for (String element : ip) {
                mywriter.write(element);
                mywriter.write("/n");
            }
            mywriter.write("/n");
            mywriter.append("welcome to  world");
            System.out.println("file written");
            mywriter.close();
        } catch (IOException e) {
            System.out.println("Error occured");
        }
    }
}