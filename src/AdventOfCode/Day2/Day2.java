package AdventOfCode.Day2;

import java.io.File;
import java.util.Scanner;

public class Day2 {
    static enum Choice{
        A(1), B(2), C(3);
        private int value;
        public int getValue(){
            return this.value;
        }

        Choice(int code){this.value = code;}
    }

    public static Choice getChoice(String str) throws Exception {
        switch (str){
            case "A":
            case "X":
                return Choice.A;
            case "B":
            case "Y":
                return Choice.B;
            case "C":
            case "Z":
                return Choice.C;
            default: throw new Exception("Invalid Default Choice");
        }
    }

    // Rock Paper Scissor
    public static int getMatchValue(Choice opponentChoice, Choice myChoice) throws Exception {
        switch (opponentChoice){
            case A: {
                switch (myChoice){
                    case A: return 3;
                    case B: return 6;
                    case C : return 0;
                }
            }
            case B: {
                switch (myChoice){
                    case A: return 0;
                    case B: return 3;
                    case C: return 6;
                }
            }
            case C: {
                switch (myChoice){
                    case A: return 6;
                    case B: return 0;
                    case C: return 3;
                }
            }
            default: throw new Exception("Invalid Choice");
        }
    }
    // X - lose, y - draw, z - win
    public static Choice getChoiceForMatchSituation(Choice opponentChoice, Character matchSituation) throws Exception {
        switch (opponentChoice){
            case A: {
                switch (matchSituation) {
                    case 'X': return Choice.C;
                    case 'Y': return Choice.A;
                    case 'Z': return Choice.B;
                }
            }
            case B: {
                switch (matchSituation) {
                    case 'X': return Choice.A;
                    case 'Y': return Choice.B;
                    case 'Z': return Choice.C;
                }
            }
            case C: {
                switch (matchSituation) {
                    case 'X': return Choice.B;
                    case 'Y': return Choice.C;
                    case 'Z': return Choice.A;
                }
            }
            default: throw new Exception("Invalid Choice");
        }
    }
    public static void main(String[] args) {
        try {
            File file = new File("src/AdventOfCode/Day2.txt");
            Scanner sc = new Scanner(file);
            Integer score = 0;
            while (sc.hasNextLine()){
                String nextLine = sc.nextLine();
                Choice opponentChoice = getChoice(String.valueOf(nextLine.charAt(0)));
                Choice myChoice = getChoice(String.valueOf(nextLine.charAt(2)));

                score+= getMatchValue(opponentChoice, myChoice);
                score+= myChoice.getValue();
            }
            System.out.println("First Part Answer:" + score);

            Scanner sc2  = new Scanner(file);

            score = 0;
            while(sc2.hasNextLine()){
                String nextLine = sc2.nextLine();
                Choice opponentChoice = getChoice(String.valueOf(nextLine.charAt(0)));
                Character matchSituation = nextLine.charAt(2);

                Choice myChoice = getChoiceForMatchSituation(opponentChoice, matchSituation);
                score += myChoice.getValue();
                if(matchSituation == 'X') {
                    score+=0;
                } else if(matchSituation == 'Y') {
                    score+=3;
                } else if(matchSituation == 'Z'){
                    score+=6;
                }
            }
            System.out.println("Second Part Answer: " + score);
        } catch (Exception e){
            System.out.println("Exception in file reading" + e.getMessage());
        }
    }
}
