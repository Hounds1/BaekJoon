import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int len = score.length;
        int[] answer = new int[len];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < len; i++) {
            minHeap.offer(score[i]);

            if (minHeap.size() > k) minHeap.poll();

            Integer peek = minHeap.peek();
            if (peek != null) answer[i] = peek;
        }

        return answer;
    }
}