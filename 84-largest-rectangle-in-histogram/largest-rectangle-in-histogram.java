class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int largest = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= n; i++) {
            int h;
            if(i == n) h = 0;
            else h = heights[i]; // Sentinel Bar for emptying the stack

            while(!stack.isEmpty() && h < heights[stack.peek()]) {
                int idx = stack.pop();
                int height = heights[idx];
                int width = 0;
                if(stack.isEmpty()) width = (i - 1 + 1); // Left becomes -1
                else width = (i - stack.peek() - 1);
                largest = Math.max(largest, height * width);
            }
            stack.push(i);
        }
        return largest;
    }
}
