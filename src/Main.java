import java.io.*;
import java.nio.file.AccessDeniedException;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt"))
        {
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            out.write(buffer, 0, buffer.length);
        } catch(FileNotFoundException | WriteAbortedException ex){
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }
}