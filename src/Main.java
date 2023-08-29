import java.util.*;

// TODO: 2023-08-29 테스트 통과 못하는 원인 찾기. 
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int range = Integer.parseInt(sc.nextLine());
        char[][] mineField = new char[range][range];
        char[][] searchField = new char[range][range];

        for (int i = 0; i < range; i++) {
            char[] charArray = sc.nextLine().toCharArray();
            for (int j = 0; j < range; j++) {
                mineField[i][j] = charArray[j];
            }
        }

        for (int i = 0; i < range; i++) {
            for (int j = 0; j < range; j++) {
                if (mineField[i][j] != '.') {
                    searchField[i][j] = '*';
                } else {
                    int searchedMine = searchMine(mineField, i, j);
                    if (searchedMine > 10)
                        searchField[i][j] = 'M';
                    else
                        searchField[i][j] = (char) (searchedMine + '0');
                }
            }
        }

        for (int i = 0; i < range; i++) {
            for (int j = 0; j < range; j++) {
                sb.append(searchField[i][j]);
            }
            System.out.println(sb);
            sb.setLength(0);
        }
    }

    private static boolean isValid(int row, int col, int numRows, int numCols) {
        return row >= 0 && row < numRows && col >= 0 && col < numCols;
    }

    private static int searchMine(char[][] field, int row, int col) {
        int numRows = field.length;
        int numCols = field[0].length;
        int total = 0;

        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                int newRow = row + dr;
                int newCol = col + dc;
                if (isValid(newRow, newCol, numRows, numCols) && Character.isDigit(field[newRow][newCol])) {
                    total += Character.getNumericValue(field[newRow][newCol]);
                }
            }
        }

        return total;
    }
}