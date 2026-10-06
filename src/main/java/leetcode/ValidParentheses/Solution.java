package leetcode.ValidParentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean isValid(String s) {
        Deque<Character> pilha = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pilha.push(c);
            } else {
                if (pilha.isEmpty()) {
                    return false;
                }
                char topo = pilha.pop();
                if (c == ')' && topo != '(') return false;
                if (c == ']' && topo != '[') return false;
                if (c == '}' && topo != '{') return false;
            }
        }

        return pilha.isEmpty();
    }
}