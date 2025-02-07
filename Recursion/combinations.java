import java.util.*;

public class combinations {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 4; // Example value for n
        int k = 2; // Example value for k
        List<List<Integer>> result = solution.combine(n, k);
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        recursion(list, 1, n, k, new ArrayList<Integer>());
        return list;
    }

    static void recursion(List<List<Integer>> list, int idx, int n, int k, List<Integer> al) {
        if (al.size() == k) {
            list.add(new ArrayList<>(al));
            return;
        }

        for (int i = idx; i <= n; i++) {
            al.add(i);
            recursion(list, i + 1, n, k, al);
            al.remove(al.size() - 1);
        }
    }
}