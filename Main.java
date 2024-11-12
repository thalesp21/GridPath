public class Main {
    public static void main(String[] args) {
        int[][] gridIn = {
            {12,  3,  4, 13,  5},
            {11, 21,  2, 14, 26},
            { 7,  8,  9, 15,  0},
            {10, 17, 20, 19,  1},
            {18, 22, 30, 25,  6}
        };

        GridPath grid = new GridPath(gridIn);            

        Location test1 = grid.getNextLoc(0, 0);
        Location test2 = grid.getNextLoc(1, 3);
        Location test3 = grid.getNextLoc(2, 4);
        Location test4 = grid.getNextLoc(4, 3);

        System.out.println("Row, Column");
        System.out.println("(0, 0) goes to ("+test1.getRow()+", "+test1.getCol()+") (should be 0, 1)");
        System.out.println("(1, 3) goes to ("+test2.getRow()+", "+test2.getCol()+") (should be 2, 3)");
        System.out.println("(2, 4) goes to ("+test3.getRow()+", "+test3.getCol()+") (should be 3, 4)");
        System.out.println("(4, 3) goes to ("+test4.getRow()+", "+test4.getCol()+") (should be 4, 4)");
    }
}