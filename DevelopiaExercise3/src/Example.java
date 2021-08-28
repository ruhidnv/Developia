/*Bu addımları et:

1. 1000 elementli massiv yaratmaq.

2. Massivin daxilini təsadüfi ədədlərlə doldurmaq.
(Təsadüfi ədədlərin seçim aralığı 1-dən 100-ə kimi olmalıdır).

3. Massivin daxilini təsadüfi ədədlərlə doldurduqdan sonra,
massivin daxilində hər ədəddən neçə ədəd olduğunu tapmaq.
Yəni, 1 ədədindən neçə dənə, 2 ədədindən neçə dənə, ... , 100 ədədindən
neçə dənə olmasını tapmaq.*/
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            int rand = (int) Math.floor(Math.random() * (max - min + 1) + min);
            array[i] = rand;
        }
        Arrays.sort(array);
        int nbOccurences = 1;
        for (int i = 0; i < 1000; i++) {
            if (i < 1000 - 1) {
                if (array[i] == array[i + 1]) {
                    nbOccurences++;
                }
            }
            else {
                System.out.println(array[i] + " ədədindən " + nbOccurences
                        + " dənə var!");
            }

            if (i < 1000 - 1 && array[i] != array[i + 1]) {
                System.out.println(array[i] + " ədədindən " + nbOccurences
                        + " dənə var!");
                nbOccurences = 1;
            }
        }
    }
}