/* 1-dən 100-ə kimi natural ədədlərin arasından
yalnız 7-yə qalıqsız bölünənləri konsolda çap et.

Qeyd:
Bunun üçün mütləq olaraq, şərt və dövr operatorlarını istifadə et. */

public class SomeClass {
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++) {
            if (i%7 == 0) {
                System.out.println(i);
            }
        }
    }
}
