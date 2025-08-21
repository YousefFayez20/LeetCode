class Solution {
    public int calPoints(String[] operations) {
        int score = 0;
        //stack -> LIFO
        Stack<Integer> Calculator = new Stack<>();
        for(int i = 0; i< operations.length;i++){
            //Calculator.push(operations[i]);
            if(operations[i].equals("C")){
                Calculator.pop();
            }
            else if(operations[i].equals("D")){
                Calculator.push(Calculator.peek() * 2);
            }
            else if(operations[i].equals("+")){
                int total_sum = 0;
                int last_element = Calculator.peek();
                Calculator.pop();
                int previous_last_element = Calculator.peek();
                 Calculator.push(last_element);
                 Calculator.push(last_element+previous_last_element);
            }else{
                Calculator.push(Integer.valueOf(operations[i]));
            }
            
        }
        while(!Calculator.empty()){
            score += Calculator.peek();
            Calculator.pop();
        }
        return score;
    }
}