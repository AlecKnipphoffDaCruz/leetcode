package leetcode.LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        for(int i = 0; i < strs[0].length() ; i++){ // letras
            char a = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++){ // palavras
                if (strs[j].length() <= i ){
                    return s;
                }
                if (strs[j].charAt(i) != a){
                    return s;
                }
            }
            s = s.concat(String.valueOf(a));
        }

        return s;
    }
}
