import java.io.File;
import java.io.IOException;

public class Filecreate {
    public static void main(String args[]) {
        File obj = new File("demo.txt");
        try {
            obj.createNewFile();
            System.out.println("File Created");
            System.out.println("Path:" + obj.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error occured");

        }
    }
}