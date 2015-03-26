package com.tic_tac_toe;

import java.util.Scanner;

/**
 * Created by suparnad on 3/26/2015.
 */
public class Position {

    public String askPosition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Positions : ");
        System.out.println("Enter X value : ");
        String x = scanner.nextLine();
        System.out.println("Enter Y value : ");
        String y = scanner.nextLine();
        return x + " " + y;
    }
}
