package lr8;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example2 {
    public Example2() {
    }

    public static void readAllByByte(InputStream in) throws IOException {
        while(true) {
            int oneByte = in.read();
            if (oneByte == -1) {
                System.out.print("\nend");
                return;
            }

            System.out.print((char)oneByte);
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            InputStream inFile = new FileInputStream("C:\\My\\MyFile1.txt");
            readAllByByte(inFile);
            System.out.println("\n\n\n");
            inFile.close();
            InputStream inUri = (new URL("http://google.com")).openStream();
            readAllByByte(inUri);
            System.out.println("\n\n\n");
            inUri.close();
            InputStream inArray = new ByteArrayInputStream(new byte[]{7, 9, 3, 7, 4});
            readAllByByte(inArray);
            System.out.println("\n\n\n");
            inArray.close();
        } catch (IOException var4) {
            System.out.println("Ошибка:" + String.valueOf(var4));
        }

    }
}