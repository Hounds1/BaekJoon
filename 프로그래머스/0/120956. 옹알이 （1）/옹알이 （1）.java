import java.util.*;

class Solution {

    private static final String[] TABLE = {"aya", "ye", "woo", "ma"};

    public int solution(String[] babbling) {
        Set<String> possible = new HashSet<>();
        boolean[] used = new boolean[TABLE.length];

        buildAll(possible, used, new StringBuilder());

        int count = 0;
        for (String word : babbling) 
            if (possible.contains(word)) count++;

        return count;
    }

    private void buildAll(Set<String> possible, boolean[] used, StringBuilder sb) {
        if (sb.length() > 0) {
            possible.add(sb.toString());
        }

        for (int i = 0; i < TABLE.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            int beforeLen = sb.length();

            sb.append(TABLE[i]);
            buildAll(possible, used, sb);

            sb.setLength(beforeLen);
            used[i] = false;
        }
    }
}