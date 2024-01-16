package lr8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Example10 {
    public Example10() {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;

        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\My\\MyFile1.txt"), "cp1251"));
            out = new PrintWriter("C:\\My\\MyFile2.txt", "cp1251");
            int lineCount = 0;

            String s;
            while((s = br.readLine()) != null) {
                ++lineCount;
                out.println("" + lineCount + ": " + s);
            }
        } catch (IOException var8) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }

    }
}