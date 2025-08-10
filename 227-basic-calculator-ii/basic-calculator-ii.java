class Solution {
    public int calculate(String s) {
        char op = '+';

        int num = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {

                num = (num * 10) + s.charAt(i) - '0';
            }

            if ((!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ') || (i == s.length() - 1)) {

                if (op == '+') {
                    stack.push(num);
                } else if (op == '-') {
                    stack.push(num * -1);
                } else if (op == '*') {
                    stack.push(num * stack.pop());
                } else if (op == '/') {

                    stack.push(stack.pop() / num);

                }

                op = s.charAt(i);
                num = 0;
            }

        }

        int sum = 0;
        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }

        return sum;
    }
}