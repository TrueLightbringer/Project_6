package Homework.Task_1;

import java.util.Scanner;
import java.util.logging.*;

import static Homework.Task_1.Calculation.squareRectangle;

public class Main {

    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        try{
            result = squareRectangle(x,y);
        }catch(IllegalArgumentException e){
            System.err.println(e.getMessage() + "\n" + "In the area calculation method," +
                    " an argument with a negative value was inputed!" + "\n");
            e.printStackTrace();

            throw e;
        }
        System.out.println("Result is : " + result);
    }
}

