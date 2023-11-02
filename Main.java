package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int []wholeNumberArray = {0,5,6,7,8,9,10,11,15,32,45,60,70,};
        Integer x = 15;
        int result = findMatchingPair(wholeNumberArray,15);
        System.out.printf("value==> "+ result);

    }

    public static int findMatchingPair(int []wholeNumberArray, int y)
    {
        int totalCountOfPair = 0;

        for (int i = 0; i < wholeNumberArray.length; i++)
        {

            for (int j = i+1; j < wholeNumberArray.length; j++)
            {
                if (wholeNumberArray[i] + wholeNumberArray[j] == y)
                {
                    totalCountOfPair = totalCountOfPair + 1;

                }
            }
        }
        return totalCountOfPair;
    }

}