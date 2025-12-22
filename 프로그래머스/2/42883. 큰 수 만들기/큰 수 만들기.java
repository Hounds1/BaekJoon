import java.util.*;

class Solution {
        public static String solution(String number, int k) {
            Deque<Character> deque = new ArrayDeque<>();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < number.length(); i++) {
                char ch = number.charAt(i);

                while (!deque.isEmpty() && k > 0 && deque.peekLast() < ch) {
                    deque.pollLast();
                    k--;
                }

                deque.addLast(ch);
            }

            if (k > 0) for (int i = 0; i < k; i++) deque.pollLast();
            for (Character c : deque) sb.append(c);

            return sb.toString();
        }
    }