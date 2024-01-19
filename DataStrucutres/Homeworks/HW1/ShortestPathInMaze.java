public class ShortestPathInMaze {
    public static void main(String[] args) {
        int[][] maze = {
            {1, 1, 0, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 0, 1},
            {1, 0, 1, 0, 1, 1, 1},
            {1, 1, 1, 0, 1, 0, 1},
            {1, 0, 1, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 1, 1, 1, 1}
        };

        int[][] shortestPath = findShortestPath(maze, 0, 0, 6, 6);

        // Display the shortest path (1 for path, 0 for walls)
        for (int[] row : shortestPath) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        printShortestPathCoordinates(shortestPath);
    }

    static int[][] findShortestPath(int[][] maze, int startX, int startY, int endX, int endY) {
        int[][] path = new int[maze.length][maze[0].length];
        findShortestPathRecursive(maze, startX, startY, endX, endY, path);
        return path;
    }

    static boolean findShortestPathRecursive(int[][] maze, int x, int y, int endX, int endY, int[][] path) {
        if (x == endX && y == endY) {
            path[x][y] = 1;
            return true;
        }

        if (isValid(x, y, maze.length, maze[0].length) && maze[x][y] == 1 && path[x][y] == 0) {
            path[x][y] = 1;

            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // Up, Down, Left, Right

            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                if (findShortestPathRecursive(maze, newX, newY, endX, endY, path)) {
                    return true;
                }
            }

            // Backtrack
            path[x][y] = 0;
        }

        return false;
    }

    static boolean isValid(int x, int y, int rows, int cols) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }

    static void printShortestPathCoordinates(int[][] path) {
        System.out.println("Shortest Path Coordinates:");

        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path[0].length; j++) {
                if (path[i][j] == 1) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
    }
}
