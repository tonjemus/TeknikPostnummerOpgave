package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Indtast det postnummer du gerne vil kende byen på:");
            int postnummerInput = scan.nextInt();

        PostInfo postnummerTilBy = new PostInfo(postnummerInput);
    }
}
