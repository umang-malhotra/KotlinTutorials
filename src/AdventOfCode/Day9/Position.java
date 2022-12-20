package AdventOfCode.Day9;

import java.util.Objects;

public class Position{
    int x;
    int y;
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public void moveLeft(){
        this.x--;
    }

    public void moveRight(){
        this.x++;
    }

    public void moveDown(){
        this.y--;
    }

    public void moveUp(){
        this.y++;
    }

    public void setValues(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
