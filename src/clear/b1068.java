package clear;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class b1068 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());

        Node[] nodes = new Node[len];
        for (int i = 0; i < len; i++) {
            nodes[i] = new Node(i);
        }

        int[] entry = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Node rootNode = null;
        for (int i = 0; i < len; i++) {
            int element = entry[i];

            if (element == -1) rootNode = nodes[i];
            else nodes[element].children.add(nodes[i]);
        }

        int target = Integer.parseInt(bufferedReader.readLine());

        if (nodes[target] == rootNode) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < len; i++) {
            Node node = nodes[i];
            node.children.removeIf(c -> c.id == target);
        }

        System.out.println(dfs(rootNode));
    }

    public static int dfs(Node root) {
        if (root.children.isEmpty()) return 1;

        int sum = 0;
        for (Node node : root.children) {
            sum += dfs(node);
        }

        return sum;
    }

    public static class Node {
        public final int id;
        public final List<Node> children = new ArrayList<>();

        public Node(int id) {
            this.id = id;
        }
    }
}
