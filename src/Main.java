public class Main {
    public static void main(String[] args) {
        //satır(row) i, sütün(colm) j
        String[][] letter1 = new String[6][4];
        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 3 && j == 3) {
                    letter[i][j] = "";
                } else if (i == 0 || i == 3) {
                    letter[i][j] = " B ";
                } else if (i == 6) {
                    letter[i][j] = " B ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " B ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }
        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

//        letterA(letter); for latter1 A
    }

    private static void letterA(String[][] letter) {
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 2) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }
        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}