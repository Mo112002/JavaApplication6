/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author MASTER4COMPUTERS
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner in0 = new Scanner (System.in);
        System.out.println("On any days the month was born:");
        int d = in0.nextInt();
        System.out.println("In any month was born:");
        int m = in0.nextInt();
        System.out.println("In any year was born:");
        int y = in0.nextInt();
        System.out.println("What,s the present day:");
        int d1 = in0.nextInt();
        System.out.println("What,s the present month:");
        int m1 = in0.nextInt();
        System.out.println("What,s the present year:");
        int y1 = in0.nextInt();
        int totalD = d1 - d;
        int totalM = m1 - m;
        int totalY = y1 - y;
        if(d1 < d){
            totalD += 30;
            totalM -= 1;}
        if(m1 < m){
            totalM += 12;
            totalY -= 1;}
        long ageOfmonths = totalY * 12 + totalM;
        long ageOfweeks = totalY * 52 + totalM * 52;
        long ageOfdayes = totalY * 365 + totalM * 30 + totalD;
        long ageOfhours = totalY * 365 * 24 + totalM * 30 * 24 + totalD;
        long ageOfminutes = totalY * 365 * 24 * 60 + totalM * 30 * 24 * 60 + totalD * 24 * 60;
        long ageOfsecond = totalY * 365 * 24 * 60 * 60 + totalM * 30 * 24 * 60 * 60 + totalD * 24 * 60 * 60;
        System.out.print("You have "+ totalY + " years and "+ totalM + " months and " + totalD + " days." 
        + "\nYour age of months:" + ageOfmonths 
        + "\nYour age of weeks:" + ageOfweeks
        + "\nYour age of days:" + ageOfdayes 
        + "\nYour age of hours:" + ageOfhours 
        + "\nYour age of minutes:" + ageOfminutes 
        + "\nYour age of second:" + ageOfsecond 
        + "\nOur lord gives you health and longevity, god willing bro or sis.");
    }
    
}
