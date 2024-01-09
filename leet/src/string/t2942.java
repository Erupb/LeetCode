package string;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            if(words[i].contains(String.valueOf(x))){
                res.add(i);
            }
        }
        return res;
    }
}
