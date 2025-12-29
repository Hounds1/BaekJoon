class Solution {
        public static String solution(String new_id) {
            StringBuilder sb = new StringBuilder();
            new_id = new_id.toLowerCase();
            String[] sp = new_id.split("");
            for(String s : sp) {
                if(s.matches("[a-z0-9]")) {
                    sb.append(s);
                } else if (s.equals("-") || s.equals("_") || s.equals(".")) {
                    sb.append(s);
                }
            }

            new_id = sb.toString();
            new_id = new_id.replaceAll("\\.+", ".");

            if (new_id.charAt(0) == '.') new_id = new_id.substring(1);
            if (new_id.isEmpty()) new_id = "a";
            if (new_id.charAt(new_id.length() - 1) == '.') new_id = new_id.substring(0, new_id.length() - 1);

            if (new_id.isEmpty()) new_id = "a";

            if (new_id.length() > 15) new_id = new_id.substring(0, 15);

            if (new_id.charAt(new_id.length() - 1) == '.') new_id = new_id.substring(0, new_id.length() - 1);

            if (new_id.length() <= 2) {
                StringBuilder sb1 = new StringBuilder(new_id);

                final char c = new_id.charAt(new_id.length() - 1);
                while (sb1.length() != 3) {
                    sb1.append(c);
                }

                return sb1.toString();
            }
            return new_id;
        }
    }