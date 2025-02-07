import java.util.ArrayList;
import java.util.List;

public class Matrix_paths {
    public static void main(String[] args) {
        int m = 3, n = 3; // Dimensions of the matrix
        List<String> paths = new ArrayList<>();
        findPaths(0, 0, m, n, "", paths);
        System.out.println(paths); // Print all possible paths
    }

    static void findPaths(int i, int j, int m, int n, String path, List<String> paths) {
        // Base case: reached bottom-right corner
        if (i == m - 1 && j == n - 1) {
            paths.add(path);
            return;
        }
        // Move down if within bounds
        if (i + 1 < m) {
            findPaths(i + 1, j, m, n, path + "D", paths);
        }

        // Move right if within bounds
        if (j + 1 < n) {
            findPaths(i, j + 1, m, n, path + "R", paths);
        }

    }
}
