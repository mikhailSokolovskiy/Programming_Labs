package lr9;

import java.util.HashMap;

public class Example6 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "адин");
        map.put(2, "два");
        map.put(3, "тхри");
        map.put(4, "чотрые");
        map.put(5, "пядь");
        map.put(6, "сикс");
        map.put(7, "семъ");
        map.put(8, "восемъ");
        map.put(9, "девяд");
        map.put(10, "десят");

        StringBuilder keyZeroValues = new StringBuilder();
        int productOfKeys = 1;

        for (int key : map.keySet()) {
            String value = map.get(key);
            if (key > 5) {
                System.out.println("Ключ: " + key + ", Значение: " + value);
            } else if (key == 0) {
                keyZeroValues.append(value).append(", ");
            }

            if (value.length() > 5) {
                productOfKeys *= key;
            }
        }

        if (keyZeroValues.length() > 0) {
            keyZeroValues.delete(keyZeroValues.length() - 2, keyZeroValues.length());
            System.out.println("Значения с ключем 0: " + keyZeroValues);
        }

        System.out.println("Длина больше 5: " + productOfKeys);
    }
}
