package AdventOfCode.Day1;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        try{
            File file = new File("/Users/ummalhotra/Desktop/self/tutorials/Kotlin Course/src/AdventOfCode/Day1.txt");
            Scanner sc = new Scanner(file);
            Long currSum = 0L;

            Long highest = 0L;
            Long secondHighest = 0L;
            Long thirdHighest = 0L;
            while(sc.hasNextLine()){
                String nextLine = sc.nextLine();
                if(nextLine.isEmpty()){
                    if(currSum > highest){
                        thirdHighest = secondHighest;
                        secondHighest = highest;
                        highest = currSum;
                    } else if(highest > currSum && currSum > secondHighest){
                        thirdHighest = secondHighest;
                        secondHighest = currSum;
                    } else if (currSum > thirdHighest){
                        thirdHighest = currSum;
                    }
                    currSum = 0L;
                    continue;
                }
                Integer currInt = Integer.parseInt(nextLine);
                currSum = currSum+currInt;
            }
            System.out.println();
            if(currSum > highest){
                System.out.println("currSum>highest");
                thirdHighest = secondHighest;
                secondHighest = highest;
                highest = currSum;
            } else if(highest > currSum && currSum > secondHighest){
                thirdHighest = secondHighest;
                secondHighest = currSum;
            } else if (currSum > thirdHighest){
                thirdHighest = currSum;
            }
            currSum = 0L;
            System.out.println(highest + secondHighest + thirdHighest);
        } catch (Exception e){
            System.out.println("Exception in file reading" + e.getMessage());
        }

    }
}
