package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Sample input data with duplicate array elements
        int []wholeNumberArray = {1,1,1,5, 10, 32, 41,41};

        int X = 42;

        int result = findMatchingPair(wholeNumberArray,X);

        System.out.printf("value==> "+ result);

    }

    public static int findMatchingPair(int []wholeNumberArray, int y)
    {
        //Total count of pairs
        int totalCountOfPair = 0;

        //Removing the duplicate array element to ensure each array element can only be used in one pair

        int [] refinedArray = Arrays.stream(wholeNumberArray).distinct().toArray();

        for (int i = 0; i < refinedArray.length; i++)
        {
            for (int j = i+1; j < refinedArray.length; j++)
            {
                if (refinedArray[i] + refinedArray[j] == y)
                {
                    totalCountOfPair = totalCountOfPair + 1;

                }
            }
        }
        return totalCountOfPair;
    }

}