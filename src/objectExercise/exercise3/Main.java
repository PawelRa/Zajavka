package objectExercise.exercise3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        squares();
    }

    public static void squares() {
        Square square1 = new Square();
        Square square2 = new Square(8);
        Square square3 = new Square(10);
        Square square4 = new Square(3);
        Square square5 = new Square(15);
        Square square6 = new Square(9);
        Square square7 = new Square(8);
        Square square8 = new Square(5);
        Square square9 = new Square(7);
        Square square10 = new Square(7);
        Square square11 = new Square(3);
        Square square12 = new Square(12);
        Square square13 = new Square(10);
        Square square14 = new Square(6);
        Square square15 = new Square(11);
        Square square16 = new Square(15);

        Square[] squares = new Square[16];
        squares[0] = square1;
        squares[1] = square2;
        squares[2] = square3;
        squares[3] = square4;
        squares[4] = square5;
        squares[5] = square6;
        squares[6] = square7;
        squares[7] = square8;
        squares[8] = square9;
        squares[9] = square10;
        squares[10] = square11;
        squares[11] = square12;
        squares[12] = square13;
        squares[13] = square14;
        squares[14] = square15;
        squares[15] = square16;

        System.out.println(Arrays.toString(isDuplicated(squares)));
    }

    private static void sort(Square[] squares) {
        Square temp;
        for (int i = 0; i < squares.length; i++) {
            for (int j = i + 1; j < squares.length; j++) {
                if (squares[j].perimeter() < squares[i].perimeter()) {
                    temp = squares[i];
                    squares[i] = squares[j];
                    squares[j] = temp;
                }
            }
        }
    }

    private static Square[] isDuplicated(Square[] squares) {
        sort(squares);
        int sortedUniqueQuantity = 0;
//        System.out.println("Lista posortowana = " + Arrays.toString(squares));
        for (int i = 1; i < squares.length; i++) {
//            System.out.println("Porównanie " + squares[i] + " z " + squares[sortedUniqueQuantity]);
            if (!squares[i].equals(squares[i - 1])) {
                sortedUniqueQuantity++;
            }
        }

        Square[] result = new Square[sortedUniqueQuantity + 1];
        result[0] = squares[0];
        int temp = 0;
        for (int i = 1; i < squares.length; i++) {
            if (!squares[i].equals(result[temp])) {
//                System.out.println("różni się");
                temp++;
                result[temp] = squares[i];
            }
        }
        return result;
    }
}
