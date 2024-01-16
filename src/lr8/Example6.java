package lr8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Example6 {
    public Example6() {
    }

    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;

        try {
            in = new FileReader("C:\\My\\MyFile1.txt");
            out = new FileWriter("C:\\My\\MyFile2.txt", true);

            int oneByte;
            while((oneByte = in.read()) != -1) {
                out.append((char)oneByte);
                System.out.print((char)oneByte);
            }
        } catch (IOException var7) {
            System.out.println("Ошибка!!!! ");
        } finally {
            in.close();
            out.close();
        }

    }
}