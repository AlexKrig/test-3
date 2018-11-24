package k_test3;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        System.out.println("введите число персон");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Map<Person,Integer> buch=new HashMap<>();
        for (int i=0;i<k;i++){
                try {
                    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("введите логин");
                    String log = buf.readLine();
                    System.out.println("введите пароль");
                    String pass = buf.readLine();
                    System.out.println("введите возраст");
                    int age = Integer.valueOf(buf.readLine());
                    System.out.println("введите телефон(без +7)");
                    int tel = Integer.valueOf(buf.readLine());
                    buch.put(new Person(log, pass, age), tel);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (java.lang.NumberFormatException e) {
                    System.out.println("введены некорректные данные, повторите ввод");
                    i--;
                }




        }
        buch.forEach((person, v) -> System.out.println(person + ", телефон = " + v));






    }

}


