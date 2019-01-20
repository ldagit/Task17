package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        // write your code here

        //Чтение строк из файла
        String str;
        int Str_count = 0;
        try (BufferedReader BR = new BufferedReader(new FileReader("test.txt"))) {
            while ((str = BR.readLine()) != null) {
                System.out.println(str);
                Str_count++;
            }
        } catch (IOException io_exc) {
            System.out.println("Ошибка ввода-вывода: " + io_exc);
        }
        //Перезапись введенных строк в файл
        BufferedReader CR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строки для записи в файл. Количество строк: " + Str_count);
        try (FileWriter FW = new FileWriter("test.txt")) {
            while (Str_count > 0) {
                  System.out.print(": ");
                  str = CR.readLine();
                  str = str + "\r\n";
                  FW.write(str);
                  Str_count--;
            }
        } catch (IOException io_exc) {
                System.out.println("Ошибка ввода-вывода: " + io_exc);
        }
    }
}