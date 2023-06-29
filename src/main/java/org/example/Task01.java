package org.example;

import java.util.Scanner;

//1.Напишите программу, которая запрашивает у пользователя размер массива и элементы этого массива.
// Затем программа запрашивает у пользователя число для поиска в массиве.
// В случае, если число найдено в массиве, выведите его индекс.
// Если число не найдено, обработайте исключение и выведите сообщение об ошибке.
public class Task01 {
    public static void main(String[] args) throws NumberNotFoundException{

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("Введите значения массива:");
            array[i] = scanner.nextInt();
        }
        System.out.print("Введите число, индекс которого вы хотите вернуть: ");
        int searchNumber = scanner.nextInt();
        for (int i = 0; i < size; i++) {

            if (array[i] == searchNumber) {
                System.out.println(i);
            }
            else {
                throw new NumberNotFoundException();
            }



        }
    }



    }
