import java.util.*;
public class averagepercentagemarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Maths=sc.nextInt();
        int Physics=sc.nextInt();
        int Chemistry=sc.nextInt();
        System.out.println(" Sam’s average mark in PCM is"+((Maths+Physics+Chemistry)/3));
        sc.close();
    }
    
}