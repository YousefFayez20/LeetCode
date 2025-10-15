class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        List<String> combinations = new ArrayList<>();
         backtrack(digits, 0, new StringBuilder(), combinations, digitToLetters);
        return combinations;
    }
    public void backtrack(String digits, int index, StringBuilder comb,List<String> combinations, Map<Character, String> digitToLetters ){
        if(index == digits.length()){
            combinations.add(comb.toString());
            return;
        }
        if(index >digits.length()){return ;}
        String letters = digitToLetters.get(digits.charAt(index));
        for (char letter : letters.toCharArray()){
            comb.append(letter);
            backtrack(digits,index+1, comb,combinations, digitToLetters);
            comb.deleteCharAt(comb.length() - 1);
        }




    }
}