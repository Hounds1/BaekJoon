import java.util.*;

class Solution
    {
        public final Set<Character> AVOID = new HashSet<>();

        public String solution(String s, String skip, int index) {
            AVOID.clear();
            for (int i = 0; i < skip.length(); i++) AVOID.add(skip.charAt(i));

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < s.length(); i++) sb.append(transit(s.charAt(i), index));

            return sb.toString();
        }

        public char transit(char ch, int idx) {
            int moved = 0;
            char cur = ch;

            while (moved < idx) {
                cur++;
                if (cur > 'z') cur = 'a';
                if (AVOID.contains(cur)) continue;

                moved++;
            }

            return cur;
        }
    }