import java.util.*;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Dog dog1 = new Dog(array[0], array[1], false);
        Dog dog2 = new Dog(array[2], array[3], false);

        int timer = 0;

        int[] array1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        
    }


    static class Dog {
        private int attacking;
        private int resting;
        private boolean isAttacking;

        public Dog(int attacking, int resting, boolean isAttacking) {
            this.attacking = attacking;
            this.resting = resting;
            this.isAttacking = isAttacking;
        }

        public int getAttacking() {
            return attacking;
        }

        public void setAttacking(int attacking) {
            this.attacking = attacking;
        }

        public int getResting() {
            return resting;
        }

        public void setResting(int resting) {
            this.resting = resting;
        }

        public boolean isAttacking() {
            return isAttacking;
        }

        public void setAttacking(boolean attacking) {
            isAttacking = attacking;
        }
    }
}