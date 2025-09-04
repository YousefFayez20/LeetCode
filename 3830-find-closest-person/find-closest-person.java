class Solution {
    public int findClosest(int x, int y, int z) {
        int distancex = Math.abs(x-z);
        int distancey = Math.abs(y-z);
        if(distancex < distancey){
            return 1;
        } else if(distancey < distancex){
            return 2;
        }else{
            return 0;
        }

        
    }
}