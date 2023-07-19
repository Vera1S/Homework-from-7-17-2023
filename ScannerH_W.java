package Homework;

import java.util.Scanner;

public class ScannerH_W {
    public static void main(String[] args) {
       
// Задание 2
// Напишите программу, которая спрашивает имя пользователя, а потом выводит строку  “Привет {имя пользователя}!” на  экран.
// На месте {имя пользователя} должно быть введённое пользователем имя.
        Scanner scanner = new Scanner(System.in);
        System.out.print("How are you! What is your name? ");
        String name = scanner.nextLine();

        System.out.println();
        System.out.println();
        System.out.println("Yout name is: " + name);
    }
    
}

