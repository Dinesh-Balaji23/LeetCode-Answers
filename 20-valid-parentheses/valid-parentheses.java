class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
		char[] arr = s.toCharArray();
		for (char x : arr) {
			if (x == '(') stack.push(')');
			else if (x == '[') stack.push(']');
			else if (x == '{') stack.push('}');
			else if (stack.isEmpty() || stack.pop() != x) return false;
		}
		return stack.isEmpty();
    }
}