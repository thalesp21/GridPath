public class GridPath
{
    /** Initialized in the constructor with distinct values that never change */
    private int[][] grid;

    public GridPath(int[][] gridIn) {
        grid = gridIn;
    }

    /**
    * Returns the Location representing a neighbor of the grid element at row and col,
    * as described in part (a)
    * Preconditions: row is a valid row index and col is a valid column index in grid.
    * row and col do not specify the element in the last row and last column of grid.
    */
    public Location getNextLoc(int row, int col)
    {
        boolean below = false;
        boolean right = false;
        int belowVal = 999;
        int rightVal = 999;

        if (row<grid.length-1) {
            below = true;
            belowVal = (int) grid[row+1][col];
        }
        
        if (col<grid[0].length-1) {
            right = true;
            rightVal = (int) grid[row][col+1];
        }

        if (below) {
            if (right) {
                if (rightVal<belowVal) {
                    col++;
                }
                else row++;
            }
            else row++;
        }
        else if (right) col++;
        
        return new Location(row, col);
    }

    /**
    * Computes and returns the sum of all values on a path through grid, as described in
    * part (b)
    * Preconditions: row is a valid row index and col is a valid column index in grid.
    * row and col do not specify the element in the last row and last column of grid.
    */
    public int sumPath(int row, int col)
    {
        Location nextLoc = new Location(row,col);
        int sum = (int) grid[row][col];
        while ((row!=grid.length) && (col!=grid[0].length)) {
            nextLoc = getNextLoc(row,col);
            row = nextLoc.getRow();
            col = nextLoc.getCol();
            sum += (int) grid[row][col];
        }
        return sum;
    }

    // There may be instance variables, constructors, and methods that are not shown.
}