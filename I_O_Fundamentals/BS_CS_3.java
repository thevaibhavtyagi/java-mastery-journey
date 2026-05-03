package I_O_Fundamentals;

// USING BUFFERED INPUT STREAM ---------------
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BS_CS_3 {
    public static void main(String[] args) throws IOException {
        // default buffer size is 8kb.
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("hello.txt"))) {
            int bytedata;

            while((bytedata = bis.read()) != -1) {
                System.out.print((char) bytedata);
            }
        }
    }
}

// new BufferedInputStream(fis, 16384) for a 16 KB buffer.