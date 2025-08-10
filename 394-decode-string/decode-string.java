class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                String newStr = "";
                while (st.peek() != '[') {
                    newStr = st.pop() + newStr;
                }

                st.pop();
                System.out.println(st + " " + 12);

                String number = "";

                while (!st.isEmpty() && st.peek() >= 48 && st.peek() <= 57) {
                    number = st.pop() + number;
                }

                System.out.println(number);

                String finalStr = "";

                for(int j = 0;j<Integer.parseInt(number);j++){
                    finalStr += newStr;
                    System.out.println(finalStr);
                }

                // st.pop();

                for(int j = 0;j<finalStr.length();j++){
                    st.push(finalStr.charAt(j));
                }
            } else {
                st.push(s.charAt(i));
            }
        }

        String finalLastString = "";

        while (!st.isEmpty()) {
            finalLastString = st.pop() + finalLastString;
        }

        return finalLastString;
    }
}