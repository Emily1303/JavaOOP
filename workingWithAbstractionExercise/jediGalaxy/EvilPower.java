package workingWithAbstractionExercise.jediGalaxy;

public class EvilPower {

    private int startingRow;
    private int startingCol;

    public EvilPower(int row, int col) {
        this.startingRow = row;
        this.startingCol = col;
    }

    public int getStartingRow() {
        return this.startingRow;
    }

    public int getStartingCol() {
        return this.startingCol;
    }

    public void evilPowerMoves(Galaxy galaxy, int[][] newGalaxy) {
        int currentRow = getStartingRow();
        int currentCol = getStartingCol();

        while (currentRow >= 0 && currentCol >= 0) {
            if (galaxy.isInBounds(currentRow, currentCol)) {
                newGalaxy[currentRow][currentCol] = 0;
            }


            currentRow--;
            currentCol--;
        }
    }
}
