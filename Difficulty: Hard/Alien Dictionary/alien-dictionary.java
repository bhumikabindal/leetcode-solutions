import java.util.*;

class Solution {
    public String findOrder(String[] words) {

        // Step 1: Collect unique characters
        Set<Character> set = new HashSet<>();
        for (String w : words) {
            for (char c : w.toCharArray()) {
                set.add(c);
            }
        }

        int K = set.size();

        // Map characters to indices
        Map<Character, Integer> map = new HashMap<>();
        int idx = 0;
        for (char c : set) {
            map.put(c, idx++);
        }

        // Step 2: Graph & indegree
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < K; i++) adj.add(new ArrayList<>());

        int[] indegree = new int[K];

        // Step 3: Build graph from adjacent words
        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i];
            String w2 = words[i + 1];

            int len = Math.min(w1.length(), w2.length());
            boolean found = false;

            for (int j = 0; j < len; j++) {
                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);

                if (c1 != c2) {
                    int u = map.get(c1);
                    int v = map.get(c2);

                    adj.get(u).add(v);
                    indegree[v]++;
                    found = true;
                    break;
                }
            }

            // Invalid prefix case
            if (!found && w1.length() > w2.length()) {
                return "";
            }
        }

        // Step 4: Kahn's Algorithm
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < K; i++) {
            if (indegree[i] == 0) q.offer(i);
        }

        StringBuilder ans = new StringBuilder();

        while (!q.isEmpty()) {
            int node = q.poll();
            ans.append(getChar(node, map));

            for (int nei : adj.get(node)) {
                indegree[nei]--;
                if (indegree[nei] == 0) {
                    q.offer(nei);
                }
            }
        }

        // Step 5: Cycle check
        if (ans.length() != K) return "";

        return ans.toString();
    }

    // Helper to get character from index
    private char getChar(int val, Map<Character, Integer> map) {
        for (char c : map.keySet()) {
            if (map.get(c) == val) return c;
        }
        return ' ';
    }
}
