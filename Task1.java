// 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {        
        float num = getFloatNumber();
        System.out.println(num);

    }

    
    public static float getFloatNumber() {
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        float result = 0;
        while (!flag) {
            System.out.println("введите дробное число:");
            try {
                result = Float.parseFloat(in.next());
                flag = true;
            } catch (Exception e) {
                System.out.println("Попробуйте еще раз!");
            }
        }
        in.close();
        return result;
    }
}






    

