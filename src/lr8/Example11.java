package lr8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Example11 {
    public Example11() {
    }

    public static void main(String[] args) throws IOException {
        String aString = "privet ya chhelovek\nasdasdasdasfasfsdf\n1.1\n2.\n-3.1\n4.1\n5.0";

        try {
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("newFile.txt"), StandardCharsets.UTF_8));

            try {
                out.write(aString);
            } catch (Throwable var13) {
                try {
                    out.close();
                } catch (Throwable var12) {
                    var13.addSuppressed(var12);
                }

                throw var13;
            }

            out.close();
        } catch (IOException var14) {
            throw new RuntimeException(var14);
        }

        BufferedReader br = null;
        PrintWriter out = null;

        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Елизавета\\IdeaProjects\\untitled\\newFile.txt"), StandardCharsets.UTF_8));
            out = new PrintWriter("C:\\Users\\Елизавета\\IdeaProjects\\untitled\\newFile2.txt", StandardCharsets.UTF_8);
            int lineCount = 0;

            String s;
            while((s = br.readLine()) != null) {
                ++lineCount;
                if (lineCount == 2) {
                    out.println(s);
                }

                if (lineCount > 2 && Double.parseDouble(s) >= 0.0) {
                    out.println(s);
                }
            }
        } catch (IOException var15) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }

    }
}