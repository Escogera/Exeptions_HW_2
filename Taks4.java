// 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;



public class Taks4 {    
    
        public static void main(String[] args) {
            System.out.println("Заполните строку!");
            Scanner in = new Scanner(System.in);
            String string = in.nextLine();
            in.close();
            string = string.trim();
            if (string.isBlank()) {
                throw new IllegalArgumentException("Строка пуста!");
            }
            else {
                System.out.println(string);
            }
        }
    } 

