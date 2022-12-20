package AdventOfCode.Day9;

import java.io.File;
import java.util.*;

public class Day9 {

    public static int SeparationDistance(Position pos1, Position pos2){
        if(pos1.equals(pos2)){
            return 0;
        }
        if(pos1.x==pos2.x){
            return Math.abs(pos1.y-pos2.y);
        }
        if(pos1.y == pos2.y){
            return Math.abs(pos1.x-pos2.x);
        }
        if(Math.abs(pos1.x - pos2.x) == 1 && Math.abs(pos1.y-pos2.y) == 1){
            return 1;
        }
        return 2;
    }

    public static void main(String[] args) {
        try{
            File file = new File("src/AdventOfCode/Day9.txt");
            Scanner sc = new Scanner(file);
            Integer count = 0;
            Set<Position> posSet = new HashSet<>();
            posSet.add(new Position(0, 0));
            Position currTPosition = new Position(0, 0);
            Position currHPosition = new Position(0, 0);

            while (sc.hasNextLine()){
                String nextLine = sc.nextLine();
                char command = nextLine.charAt(0);
                String restIntegerString = nextLine.substring(2);
                int steps = Integer.parseInt(restIntegerString);

                switch (command) {
                    case 'L' : {
                        for(int i=0;i<steps;i++){
                            currHPosition.moveLeft();
                            if(SeparationDistance(currTPosition, currHPosition) > 1){
                                currTPosition = new Position(currHPosition.x+1, currHPosition.y);
                            }
                            posSet.add(currTPosition);
                        }
                        break;
                    }
                    case 'R': {
                        for(int i=0;i<steps;i++){
                            currHPosition.moveRight();
                            if(SeparationDistance(currTPosition, currHPosition) > 1){
                                currTPosition = new Position(currHPosition.x-1, currHPosition.y);
                            }
                            posSet.add(currTPosition);
                        }
                        break;
                    }
                    case 'D': {
                        for(int i=0;i<steps;i++){
                            currHPosition.moveDown();
                            if(SeparationDistance(currTPosition, currHPosition) > 1){
                                currTPosition = new Position(currHPosition.x, currHPosition.y+1);
                            }
                            posSet.add(currTPosition);
                        }
                        break;
                    }
                    case 'U': {
                        for(int i=0;i<steps;i++){
                            currHPosition.moveUp();
                            if(SeparationDistance(currTPosition, currHPosition) > 1){
                                currTPosition = new Position(currHPosition.x, currHPosition.y-1);
                            }
                            posSet.add(currTPosition);
                        }
                        break;
                    }
                }
            }
            System.out.println("Answer to Day 9 First Part is " + posSet.size());
        } catch (Exception e){
            System.out.println("Exception in file reading - " + e.getMessage());
        }
    }
}
