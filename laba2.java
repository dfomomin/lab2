package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Imput a number");
        double x = in.nextDouble();
       System.out.println ("Input a second number");
        double y = in.nextDouble();
        double argone = Math.pow (Math.cos(x),4) ;
        double argtwo = Math.pow (Math.sin(y),2) ;
        double argthree = 0.25*Math.pow(2,Math.sin(2*x))-1;
        double z = argone + argtwo +  argthree;
        System.out.print(z);
        in.close();
    }
}
