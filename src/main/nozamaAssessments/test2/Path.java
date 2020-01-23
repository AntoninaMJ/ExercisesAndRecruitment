package main.nozamaAssessments.test2;

import java.util.LinkedList;
import java.util.List;

public class Path {

    private int columnCount;
    private int rowCount;
    private int[][] mat;
    private List<Integer> pathMins = new LinkedList<>();

    public int solution(int columnCount, int rowCount, int[][] mat) {
        this.columnCount = columnCount;
        this.rowCount = rowCount;
        this.mat = mat;
        path(0, 0, new LinkedList<>());
        int maxValue = pathMins.get(0);
        for (Integer value : pathMins) {
            maxValue = Math.max(maxValue, value);
        }
        return maxValue;
    }

    private void path(int currentRow, int currentColumn, List<Integer> path) {
        boolean stop = false;
        if (currentRow == rowCount - 1) {
            for (int i = currentColumn; i < columnCount; i++) {
                path.add(mat[currentRow][i]);
            }
            stop = true;
        }

        if (currentColumn == columnCount - 1) {
            for (int i = currentRow; i < rowCount; i++) {
                path.add(mat[i][currentColumn]);
            }
            stop = true;
        }

        if (stop) {
            int minValue = path.get(0);
            for (Integer value : path) {
                minValue = Math.min(minValue, value);
            }
            pathMins.add(minValue);
            return;
        }

        path.add(mat[currentRow][currentColumn]);
        path(currentRow + 1, currentColumn, new LinkedList<>(path));
        path(currentRow, currentColumn + 1, new LinkedList<>(path));
    }

}
