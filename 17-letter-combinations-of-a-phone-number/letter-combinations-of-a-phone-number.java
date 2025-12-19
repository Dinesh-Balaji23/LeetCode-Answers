class Solution {
    HashMap<Character, String> hp = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            ArrayList<String> r = new ArrayList<>();
            return r;
        }

        hp.put('2', "abc");
        hp.put('3', "def");
        hp.put('4', "ghi");
        hp.put('5', "jkl");
        hp.put('6', "mno");
        hp.put('7', "pqrs");
        hp.put('8', "tuv");
        hp.put('9', "wxyz");

        return get(digits);
    }

    ArrayList<String> get(String s) {
        if (s.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char dig = s.charAt(0);
        String rem = s.substring(1);
        ArrayList<String> res = get(rem);
        ArrayList<String> finals = new ArrayList<>();

        String comb = hp.get(dig);
        for (int i = 0; i < comb.length(); i++) {
            char c = comb.charAt(i);
            for (String str : res) finals.add(c + str);
        }
        return finals;
    }
}