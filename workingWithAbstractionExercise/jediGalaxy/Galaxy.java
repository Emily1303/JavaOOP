package workingWithAbstractionExercise.jediGalaxy;

public class Galaxy {

    private int rows;
    private int cols;
    private int[][] galaxy;

    public Galaxy(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        int value = 0;
        galaxy = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                galaxy[i][j] = value++;
            }
        }
    }

    public int getRows() {
        return this.rows;
    }

    public int getCols() {
        return this.cols;
    }

    public int[][] getGalaxy() {
        return this.galaxy;
    }

    public boolean isInBounds(int row, int col) {
        return row >= 0 && col >= 0 && row < getRows() && col < getCols();
    }

}
