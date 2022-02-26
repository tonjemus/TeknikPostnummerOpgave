package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RepositoryPostInfo extends PostInfo {

    public void allePostInfo() throws FileNotFoundException {
        ArrayList<PostInfo> postInfoArray = new ArrayList<>();

        File postData = new File("ressource/danskePostnumre.csv");
        Scanner filScan = new Scanner(postData);
        filScan.nextLine(); //springer linjen med overskrift over i dokumentet

        while(filScan.hasNextLine()){

        }

    }

}
