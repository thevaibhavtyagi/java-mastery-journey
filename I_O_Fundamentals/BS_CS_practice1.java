package I_O_Fundamentals;

// PRACTICE 1 - BYTE STREAM COPY -----------
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BS_CS_practice1 {
    public static void main(String[] args) throws IOException {
        try (BufferedInputStream bis =  new BufferedInputStream (new FileInputStream("source.txt"));
        
             BufferedOutputStream bos =  new BufferedOutputStream (new FileOutputStream("copy.txt"))) {

                int data;
                while((data = bis.read()) != -1) {
                    bos.write(data);
                }

                System.out.println("File copied successfully.");
        }
    }
}
