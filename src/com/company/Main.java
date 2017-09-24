package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(new File("A-small-practice.in"))) {
            int numOfCases = in.nextInt();
            int caseNumber = 1;
            for (int i = 0; i < numOfCases; i++) {
                int yesCounter = 0;
                int lengthOfList = in.nextInt();
                if (lengthOfList == 2) {
                    System.out.println("CASE #" + caseNumber + ": YES");
                    caseNumber++;
                    for (int j = 0; j < 2; j++) {
                        in.nextInt();
                    }
                } else {
                    ArrayList<Integer> listOfItems = new ArrayList<>();
                    for (int j = 0; j < lengthOfList; j++) {
                        listOfItems.add(in.nextInt());
                    }
                    while (listOfItems.size() > 0) {
                        int largerCounter = 0;
                        int lowerCounter = 0;
                        double pivotPlace = Math.floor((listOfItems.size() - 1) / 2);

                        int itemToCheck = listOfItems.get((int) pivotPlace);
                        listOfItems.remove((int) pivotPlace);
                        for (int j = 0; j < listOfItems.size(); j++) {
                            if (itemToCheck > listOfItems.get(j)) {
                                largerCounter++;
                            } else if (itemToCheck < listOfItems.get(j)) {
                                lowerCounter++;
                            }


                        }

                        if ((largerCounter == listOfItems.size() && lowerCounter == 0) || (lowerCounter == listOfItems.size() && largerCounter == 0)) {
                            yesCounter++;
                        }
                    }
                    if (yesCounter == lengthOfList) {
                        System.out.println("CASE #" + caseNumber + ": YES");
                        caseNumber++;
                    } else {
                        System.out.println("CASE #" + caseNumber + ": NO");
                        caseNumber++;
                    }
                }


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
