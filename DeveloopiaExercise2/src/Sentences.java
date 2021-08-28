/*Verilmiş istənilən cümlənin daxilində olan sözlərin sayını tapan proqram yazmaq.
        Cümlənin daxilində sözlərin arasında istifadə olunan ayırıcılar bunlar ola bilər.
        -Boşluq
        -Vergül
        -Nöqtə*/

import java.util.Scanner;

public class Sentences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cümləni yazın:");
        String sentence = scanner.nextLine();
        int word = 0;
        if(sentence.length() != 0){
            word++;
            for (int i = 0; i < sentence.length(); i++) {
                if(sentence.charAt(i) == ' '){
                    word++;
                }
                else if(sentence.charAt(i) == ',') {
                    word++;
                }
                else if (sentence.charAt(i) == '.') {
                    word++;
                }
            }
        }
        System.out.println("Cümlədə "+word+" söz var!");
    }
}