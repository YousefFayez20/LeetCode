class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] FriendsOrder = new int[friends.length];
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0;i<friends.length;i++){
            set.add(friends[i]);
        }

        for(int i = 0;i<order.length;i++){
            if(set.contains(order[i])){
                FriendsOrder[count] = order[i];
                count++;
            }
        }
        return FriendsOrder;
        
    }
}