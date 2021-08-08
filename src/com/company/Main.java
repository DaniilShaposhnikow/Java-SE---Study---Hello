package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Мы говорим компьютеру что-то сделать. ");
        System.out.println("К примеру объявить переменную или попросить ее ввести: ");
        int x1 = in.nextInt();
        int x = 3;
        System.out.println(x);
        System.out.println(x1);
        String name = "Daniel";
        System.out.println("Также выполнять различные действия с нашей переменной: К примеру изменить значение: ");
        x = x * 5;
        System.out.println(x);
        System.out.println(name);
        System.out.println(" ");
        System.out.println("Мы просим компьютер сделать что-то снова и снова. ");
        int a = in.nextInt();
        while (a > 10)
        {
            System.out.println("Число A больше чем 10");
        }
        int a1 = 10;
        System.out.println("Если условие верное, то мы войдём в цикл While. Нет, выйдем.");
        while(a1 > 12)
        {
            a1 = a1 - 1;
            System.out.println("Result: " + a1);
        }
        System.out.println("Ну и циклы For. К примеру выведем все числа от нуля до десяти");
        for (int i = 1; i < 10; i++)
        {
            System.out.println("Мы вывели все числа от 1 до 10 включительно" + i);
        }
        System.out.println(" ");
        System.out.println("Условные операторы: ");
        System.out.println("Введем число b: ");
        int b = in.nextInt();
        if (b == 10)
        {
            System.out.println("X равно 10");
        }
        else
        {
            System.out.println("X не равен 10");
        }
        System.out.println("Также: ");
        int b1 = 15;
        if ((b > 10) & (name.equals("Daniel")))
        {
            System.out.println("Test");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        int xa = 4;
        while(xa > 3)
        {
            System.out.println("Код в цикле будет работать ))");
            System.out.println("Но главное, чтобы он работал не бесконечно");
            xa = xa - 1;
        }
        int z1 = 27;
        while (z1 == 17)
        {
            System.out.println("Увы, но этого сообщения мы не увидим");
        }
        System.out.println("Взглянем еще раз на цикл While: ");
        System.out.println(" ");
        System.out.println("Перед началом цикла: ");
        int y = 1;
        while (y < 4)
        {
            System.out.println("Мы внутри цикла");
            System.out.println("Значение X равно" + y);
            y = y + 1;
        }
        System.out.println("Цикл кончился");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        int y1 = 2;
        if (y1 > 3)
        {
            System.out.println("Y больше 3");
        }
        else
        {
            System.out.println("Y меньше 3");
        }
        System.out.println(" ");
        System.out.println("Решим базовый пример: ");
        System.out.println(" ");
        int d = 1;
        while(d < 3)
        {
            System.out.print("Doo");
            System.out.print("Bee");
            d = d + 1;
        }
        int i1 = 6;
        if (i1 > 5)
        {
            System.out.print("Do");
        }
    }
}


