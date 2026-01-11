class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] result = new int[friends.length];
        int x = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < friends.length; i++) set.add(friends[i]);
        for(int i = 0; i < order.length; i++) {
            if(set.contains(order[i])) result[x++] = order[i];
        }
        return result;
    }
}