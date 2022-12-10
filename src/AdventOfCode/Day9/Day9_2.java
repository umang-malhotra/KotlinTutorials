package AdventOfCode.Day9;

import java.io.File;
import java.util.*;

public class Day9_2 {
    public static void followTail(Position head, Position tail) {
        if(head.equals(tail)) return;
        if(head.x == tail.x ) {
            if(Math.abs(head.y - tail.y) > 1) {
                int d = (int) Math.signum(head.y - tail.y);
                tail.setValues(tail.x, tail.y + d);
            }
        } else if ( head.y == tail.y ) {
            if(Math.abs(head.x - tail.x) > 1) {
                int d = (int) Math.signum(head.x - tail.x);
                tail.setValues(tail.x + d, tail.y);
            }
        } else if (Math.abs(head.y - tail.y) == 1 && Math.abs(head.x- tail.x) == 2){
            int d = (int) Math.signum(head.x - tail.x);
            tail.setValues(tail.x+d, head.y);
        } else if (Math.abs(head.x-tail.x) == 1 && Math.abs(head.y-tail.y) == 2) {
            int d = (int) Math.signum(head.y - tail.y);
            tail.setValues(head.x, tail.y + d);
        } else if (Math.abs(head.x - tail.x) == 2 && Math.abs(head.y - tail.y) == 2) {
            int d = (int) Math.signum(head.x - tail.x);
            int p = (int) Math.signum(head.y - tail.y);
            tail.setValues(tail.x + d, tail.y + p);
        }
    }

    public static void follow(Position a, Position b) {
        if (a.x == b.x && Math.abs(a.y - b.y) > 1) {
            int dy = 0;
            if (a.y > b.y) dy = 1;
            else dy= -1;
            b.setValues(b.x, b.y + dy);
        } else if (a.y == b.y && Math.abs(a.x - b.x) > 1) {
            int dx = 0;
            if (a.x > b.x) dx = 1;
            else dx= -1;
            b.setValues(b.x + dx, b.y);
        } else if (Math.abs(a.y - b.y) + Math.abs(a.x - b.x) >= 3) {
            // offset 2 both ways
            int dx = 0;
            if (a.x > b.x) dx= 1;
            else dx= -1;
            int dy = 0;
            if (a.y > b.y) dy = 1;
            else dy= -1;
            b.setValues(b.x + dx, b.y + dy);
        }
    }
    public static void main(String[] args) {
        try {
            File file = new File("src/AdventOfCode/Day9.txt");
            Scanner sc = new Scanner(file);

            Set<Position> posSet = new HashSet<>();
            int knotLength = 10;
            List<Position> knots = new ArrayList<>();
            for(int i=0;i<knotLength;i++) {
                knots.add(new Position(0, 0));
            }
            posSet.add(new Position(0, 0));

            while (sc.hasNextLine()){
                String nextLine = sc.nextLine();
                char command = nextLine.charAt(0);
                String restIntegerString = nextLine.substring(2);
                int steps = Integer.parseInt(restIntegerString);

                for(int i=0; i<steps;i++) {
                    switch (command) {
                        case 'L': knots.get(0).moveLeft();
                            break;
                        case 'R': knots.get(0).moveRight();
                            break;
                        case 'U': knots.get(0).moveUp();
                            break;
                        case 'D': knots.get(0).moveDown();
                            break;
                    }
                    for(int j = 1;j<knots.size();j++){
                        follow(knots.get(j-1), knots.get(j));
                    }

                    posSet.add(new Position(knots.get(knots.size() - 1).x, knots.get(knots.size() - 1).y));
                }
            }
            System.out.println("Answer to the problem is " + posSet.size());
        } catch (Exception e){
            System.out.println("Exception " + e.getMessage());
        }
    }
}
