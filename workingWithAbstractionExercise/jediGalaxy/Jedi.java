package workingWithAbstractionExercise.jediGalaxy;

public class Jedi {

    private int startingRow;
    private int startingCol;

    public Jedi(int row, int col) {
        this.startingRow = row;
        this.startingCol = col;
    }

    public int getStartingRow() {
        return this.startingRow;
    }

    public int getStartingCol() {
        return this.startingCol;
    }

    public long jediMoves(Galaxy galaxy, int[][] newGalaxy) {
        int currentRow = getStartingRow();
        int currentCol = getStartingCol();

        long collectedStars = 0;

        while (currentRow >= 0 && currentCol < galaxy.getCols()) {
            if (galaxy.isInBounds(currentRow, currentCol)) {
                collectedStars += newGalaxy[currentRow][currentCol];
            }

            currentRow--;
            currentCol++;
        }

        return collectedStars;
    }
}
