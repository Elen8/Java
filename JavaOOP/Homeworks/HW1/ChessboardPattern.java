import java.util.Scanner;

public class ChessboardPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width (number of columns): ");
        int width = scanner.nextInt();

        System.out.print("Enter the height (number of rows): ");
        int height = scanner.nextInt();

        printChessboard(width, height);
    }

    static void printChessboard(int width, int height) {
        char black = '\u25A3'; 
        char white = '\u25A2'; 

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                char currentSquare = (row + col) % 2 == 0 ? black : white;
                System.out.print(currentSquare + " ");
            }
            System.out.println(); 
        }
    }
