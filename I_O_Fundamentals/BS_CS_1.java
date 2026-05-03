package I_O_Fundamentals;

// FILE INPUT STREAM ----------------
import java.io.FileInputStream;
import java.io.IOException;

public class BS_CS_1 {
    public static void main(String[] args) throws IOException {

        try(FileInputStream fis = new FileInputStream("hello.txt")) {
            int bytedata;
            while((bytedata = fis.read()) != -1) {
                System.out.print((char) bytedata);
            }
        }
    }
}
