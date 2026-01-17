class Solution {
    public int convertTime(String current, String correct) {
        int currentTime = timeToMinutes(current);
        int correctTime = timeToMinutes(correct);
        int timeDifference = Math.abs(currentTime - correctTime);
        int ans = 0;
        int[] timeReductions = {60, 15, 5, 1};
        for (int reduction : timeReductions) {
            while (timeDifference >= reduction) {
                ans += timeDifference / reduction;
                timeDifference %= reduction;
            }
        }
        return ans;
    }

    private int timeToMinutes(String time) {
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3));
        return hours * 60 + minutes;
    }
}