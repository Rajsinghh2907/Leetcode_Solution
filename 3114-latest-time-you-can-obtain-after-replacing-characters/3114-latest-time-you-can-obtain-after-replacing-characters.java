class Solution {
    public String findLatestTime(String s) {
        
        StringBuilder sb = new StringBuilder();

        char h1 = s.charAt(0);
        char h2 = s.charAt(1);

        char m1 = s.charAt(3);
        char m2 = s.charAt(4);

         if (h1 == '?') {
            if (h2 != '?' && h2 > '1') {
                sb.append('0');
            } else {
                sb.append('1');
            }
        } else {
            sb.append(h1);
        }

        // Determine the second digit of the hour
        if (h2 == '?') {
            if (sb.charAt(0) == '1') {
                sb.append('1');
            } else {
                sb.append('9');
            }
        } else {
            sb.append(h2);
        }

        sb.append(':');

        // Determine the first digit of the minute
        if (m1 == '?') {
            sb.append('5');
        } else {
            sb.append(m1);
        }

        // Determine the second digit of the minute
        if (m2 == '?') {
            sb.append('9');
        } else {
            sb.append(m2);
        }

        return sb.toString();

    }
}