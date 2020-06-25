package com.company;
import java.util.Scanner;

public class Main {
 private static Scanner input= new Scanner(System.in);

    public static void main(String[] args) {
        int [] myIntegers = getNumbers(5);
        for(int i=0;i<myIntegers.length;i++){

            System.out.println( " element " + i  +" contains" + myIntegers);
        }
        System.out.println("  the average is" + getAverage(myIntegers));

    }
    public static int [] getNumbers(int num){
        System.out.println(" enter " + num + " numbers");
        int [] numbers= new int[num];
        for( int i=0 ;i<numbers.length;i++){

            numbers[i]=input.nextInt();
        }
        return numbers;
    }
    public static double  getAverage(int [] array){
        double sum=0;
        for( int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return (double) sum /(double) array.length;
    }
}
