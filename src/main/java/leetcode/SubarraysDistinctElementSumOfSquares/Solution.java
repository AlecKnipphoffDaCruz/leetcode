package leetcode.SubarraysDistinctElementSumOfSquares;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
        public int sumCounts(List<Integer> nums) {
            int total = 0;

            for (int i = 0; i < nums.size(); i++) {
                Set<Integer> vistos = new HashSet<>();

                for (int j = i; j < nums.size(); j++) {
                    vistos.add(nums.get(j));
                    int distinct = vistos.size();
                    total += distinct * distinct;
                }
            }

            return total;
        }
}

