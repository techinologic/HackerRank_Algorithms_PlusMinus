package com.example.java;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int pos = 0;
        int zero = 0;
        int neg = 0;

        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        double[] nums = new double[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextDouble();
            if (nums[i] > 0) {
                pos++;
            } else if(nums[i] == 0) {
                zero++;
            } else if(nums[i] < 0) {
                neg++;
            }
        }
        System.out.printf("%.6f %n", (double) pos/size);
        System.out.printf("%.6f %n", (double) neg/size);
        System.out.printf("%.6f %n", (double) zero/size);

    }

}


/*

6 -4 3 -9 0 4 1

 */






