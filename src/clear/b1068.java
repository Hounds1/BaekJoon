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

        Main.Node[] nodes = new Main.Node[len];
        for (int i = 0; i < len; i++) {
            nodes[i] = new Main.Node(i);
        }

        int[] entry = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Main.Node rootNode = null;
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
            Main.Node node = nodes[i];
            node.children.removeIf(c -> c.id == target);
        }

        System.out.println(dfs(rootNode));
    }

    public static int dfs(Main.Node root) {
        if (root.children.isEmpty()) return 1;

        int sum = 0;
        for (Main.Node node : root.children) {
            sum += dfs(node);
        }

        return sum;
    }

    public static class Node {
        public final int id;
        public final List<Main.Node> children = new ArrayList<>();

        public Node(int id) {
            this.id = id;
        }
    }
}
