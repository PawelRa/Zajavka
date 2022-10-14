package objectExercise.exercise3;

import java.util.Objects;

public class Square {
    private int sideLength = 5;

    public Square() {
    }

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int perimeter() {
        return sideLength * 4;
    }

    public int area() {
        return sideLength * sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return sideLength == square.sideLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideLength);
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                '}';
    }
}
