package clear;

import java.util.Scanner;

public class b10828 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack<Integer> stack = new MyStack<>(10001);

        StringBuilder sb = new StringBuilder();

        int range = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < range; i++) {
            String command = sc.nextLine();

            switch (command) {
                case "pop":
                    sb.append(stack.pop()).append('\n');
                    break;
                case "size":
                    sb.append(stack.size()).append('\n');
                    break;
                case "empty":
                    sb.append(stack.isEmpty()).append('\n');
                    break;
                case "top":
                    sb.append(stack.top()).append('\n');
                    break;
                default:
                    if (command.startsWith("push")) {
                        String[] split = command.split(" ");
                        int num = Integer.parseInt(split[1]);
                        stack.push(num);
                    }
                    break;
            }
        }
        sc.close();

        System.out.println(sb.toString());
    }

    public static class MyStack<T> {
        private static final int EMPTY_STACK_VALUE = -1;
        private static final int EMPTY_RESULT = 1;
        private static final int NON_EMPTY_RESULT = 0;

        private int maxSize;
        private Object[] array;
        private int top;

        public MyStack(int maxSize) {
            this.maxSize = maxSize;
            this.array = new Object[maxSize];
            this.top = -1;
        }

        public void push(T item) {
            if (top < maxSize - 1) {
                array[++top] = item;
            } else {
                System.out.println("full");
            }
        }

        public int pop() {
            if (top >= 0) {
                T item = (T) array[top];
                array[top--] = null;
                return (int) item;
            } else {
                return EMPTY_STACK_VALUE;
            }
        }

        public int top() {
            if (top >= 0) {
                return (int) array[top];
            } else {
                return EMPTY_STACK_VALUE;
            }
        }

        public int isEmpty() {
            return top >= 0 ? NON_EMPTY_RESULT : EMPTY_RESULT;
        }

        public int size() {
            return top + 1;
        }
    }
}
