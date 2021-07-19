class Solution {
    List<String> res;
    Map<Character, String> map;
    StringBuilder tmp;
    int n;
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<String>();
        res = new ArrayList<>();
        map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        tmp = new StringBuilder();
        n = digits.length();
        dfs(digits, 0);
        return res;
    }
    private void dfs(String digits, int idx) {
        if (idx == n) {
            res.add(tmp.toString());
            return;
        }
        char cur_c = digits.charAt(idx);
        String cur_s = map.get(cur_c);
        for (char c: cur_s.toCharArray()) {
            tmp.append(c);
            dfs(digits, idx + 1);
            tmp.deleteCharAt(tmp.length() - 1);
        }
    }
}
// The solution uses backtracking aapproach 
