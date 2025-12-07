import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < len; i++) {
            int[] arguments = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            final int localLen =  arguments[0];
            final int targetIdx =  arguments[1];

            int[] papers = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            LinkedList<Paper> queue = new LinkedList<>();

            for (int j = 0; j <localLen; j++) {
                queue.add(new Paper(j, papers[j]));
            }

            int cnt = 0;
            while (true) {
                Paper paper = queue.removeFirst();

                boolean found = false;
                for (Paper p : queue) {
                    if (p.important > paper.important) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    cnt++;
                    if (paper.idx == targetIdx) {
                        System.out.println(cnt);
                        break;
                    }
                } else {
                    queue.addLast(paper);
                }
            }
        }
    }

    public static class Paper {
        public int idx;
        public int important;
        public Paper(int idx, int important) {
            this.idx = idx;
            this.important = important;
        }
    }
}