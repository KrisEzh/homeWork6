package com.company;


import java.util.Arrays;

import static java.lang.Character.toUpperCase;

public class Main {

    public static void main(String[] args) {
        // homeTask1

        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich";
        String fullName = firstName + middleName + lastName;
        System.out.println(" ФИО сотрудинка - " + fullName);

        //homeTask2

        String name = "Ivanov Ivan Ivanovich";
        String name1 = name.toUpperCase();
        System.out.println(name1);

        //homeTask3

        String fullName1 = "Ivanov Ivan Ivanovich";
        String fullName2 = fullName1.replace(' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullName2);

        //homeTask4

        String fullName3 = "Иванов Семён Семёнович";
        String s1 = fullName3.replace('ё', 'е');
        System.out.println(s1);

        //homeTask5

        String fullName4 = "Ivanov Ivan Ivanovich";
        String[] words = fullName4.split(" ");
        String firstName2 = words[0];
        System.out.println("Фамилия сотрудника- " + firstName2);
        String middleName2 = words[1];
        System.out.println("Имя сотрудника- " + middleName2);
        String lastName2 = words[2];
        System.out.println("Отчество сотрудника- " + lastName2);

        //homeTask6

        String fullName5 = "ivanov ivan ivanovich";
        char[] c = fullName5.toCharArray();
        String newWord = fullName4.substring(0, 1).toUpperCase() + fullName5.substring(1);
        System.out.println(newWord);


        //homeTask7

        StringBuilder num1 = new StringBuilder("135");
        num1.append("246");
        num1.setCharAt(1, '2');
        num1.setCharAt(2, '3');
        num1.setCharAt(3, '4');
        num1.setCharAt(4, '5');
        System.out.println(" Данные строки- " + num1);

        //homeTask8

        String abc = "aabccddefgghiijjkk";
        char[] lettres = abc.toCharArray();
        System.out.println(Arrays.toString(lettres));
        for (int i = 0; i < abc.length(); i++) {
            for (int j = i + 1; j < abc.length(); j++) {
                if (lettres[i] == lettres[j]) {
                    System.out.print(lettres[j] + " ");
                    break;
                }
            }
        }
    } }