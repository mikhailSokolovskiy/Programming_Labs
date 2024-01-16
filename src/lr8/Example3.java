package lr8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Example3 {
    public Example3() {
    }

    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];

        while(true) {
            int count = in.read(buff);
            if (count == -1) {
                return;
            }

            System.out.println("количество = " + count + ", buff = " + Arrays.toString(buff) + ", str = " + new String(buff, 0, count, "cp1251"));
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Елизавета\\IdeaProjects\\untitled\\MyFile1.txt";
        InputStream inFile = null;

        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException var12) {
            System.out.println("Ошибка открытия-закрытия файла " + fileName + String.valueOf(var12));
        } finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException var11) {
                }
            }

        }

    }
}