package com.raman.leetcodedesign;

import java.util.HashMap;
import java.util.Map;

class NeighborSum {

    private static final int[][] ADJ_DIRS = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };
    private static final int[][] DIAG_DIRS = {
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1}
    };
    private final int[][] grid;
    private final int n;
    private final Map<Integer, int[]> positions;

    public NeighborSum(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.positions = new HashMap<>();
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                positions.put(grid[r][c], new int[]{r, c});
            }
        }
    }

    public int adjacentSum(int value) {
        return sumByDirection(value, ADJ_DIRS);
    }

    public int diagonalSum(int value) {
        return sumByDirection(value, DIAG_DIRS);
    }

    private int sumByDirection(int value, int[][] dirs) {
        int[] pos = positions.get(value);
        int r = pos[0];
        int c = pos[1];
        int sum = 0;

        for (int[] d : dirs) {
            int nr = r + d[0];
            int nc = c + d[1];
            if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                sum += grid[nr][nc];
            }
        }
        return sum;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */