package lr8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Example9 {
    public Example9() {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\My\\MyFile1.txt"), "cp1251"));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\My\\MyFile2.txt"), "cp1251"));
            int lineCount = 0;

            String s;
            while((s = br.readLine()) != null) {
                ++lineCount;
                System.out.println("" + lineCount + ": " + s);
                bw.write("" + lineCount + ": " + s);
                bw.newLine();
            }
        } catch (IOException var8) {
            System.out.println("Ошибка!!!!!!!!");
        } finally {
            br.close();
            bw.flush();
            bw.close();
        }

    }
}