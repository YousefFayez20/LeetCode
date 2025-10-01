class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinked = numBottles;
        //division -> full water
        //modulus -> remainder
        int remainder = drinked;
        do{
            drinked += remainder/numExchange;
            remainder = remainder/numExchange +remainder%numExchange;
        }while(remainder/numExchange >=1 );
        return drinked;


        
    }
}