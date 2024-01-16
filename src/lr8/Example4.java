package lr8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Example4 {
    public Example4() {
    }

    public static void main(String[] args) {
        try {
            File f1 = new File("C:\\My\\numIsh.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in, "cp1251");
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();
            System.out.println("Введите числа:");

            for(int i = 0; i < count; ++i) {
                wr.writeFloat(sc.nextFloat());
            }

            wr.flush();
            wr.close();
            File f2 = new File("C:\\My\\numRez.txt");
            f2.createNewFile();
            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));

            try {
                while(true) {
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println(" Число " + number);
                }
            } catch (EOFException var8) {
                wr.flush();
                wr.close();
                rd.close();
            }
        } catch (IOException var9) {
            System.out.println("End of file");
        }

    }
}