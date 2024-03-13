package clear;

public class b1076 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3 ; i++) {
            String nextLine = sc.nextLine();

            if (i == 2) {
                if (sb.length() == 0) {
                    sb.append("0");
                    break;
                }

                int range = findValue(nextLine);

                sb.append("0".repeat(Math.max(0, range)));

                break;
            }

            if (nextLine.equals("black")) {
                if (sb.length() != 0) {
                    sb.append(findValue(nextLine));
                }
            } else {
                sb.append(findValue(nextLine));
            }
        }

        String result = sb.toString();

        if (result.isEmpty())
            System.out.println("0");
        else
            System.out.println(result);
    }

    public static int findValue(String key) {
        MultipleValues[] values = MultipleValues.values();

        for (MultipleValues value : values) {
            if (value.name().equals(key.toUpperCase()))
                return value.getValue();
        }

        return 0;
    }

    public static enum MultipleValues {
        BLACK(0),
        BROWN(1),
        RED(2),
        ORANGE(3),
        YELLOW(4),
        GREEN(5),
        BLUE(6),
        VIOLET(7),
        GREY(8),
        WHITE(9);

        private final int value;

        MultipleValues(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
