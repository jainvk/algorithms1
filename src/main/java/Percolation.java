/******************************************************************************
 *  Compilation:  javac Percolation.java
 *  Execution:    java Percolation
 ******************************************************************************/
public class Percolation {
    private int[][] grid;

    // create n-by-n grid, with all sites blocked
    public Percolation(int n) {
        grid = new int[n][n];

    }

    public int[][] getGrid() {
        return grid;
    }

    // open site (row, col) if it is not open already
    public void open(int row, int col) {
        grid[row][col] = 1;
    }

    // is site (row, col) open?
    public boolean isOpen(int row, int col) {
        return grid[row][col] == 1;
    }

    // is site (row, col) full?
    public boolean isFull(int row, int col) {
        return grid[row][col] == 0;
    }

    // number of open sites
    public int numberOfOpenSites() {
        int count = 0;
        for (int[] aGrid : grid) {
            for (int value: aGrid) {
                if (value == 1) count++;
            }
        }
        return count;
    }

    // does the system percolate?
    public boolean percolates() {
        return false;
    }

    // test client (optional)
    public static void main(String[] args) {
    }
}
