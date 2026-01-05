package HashTables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap();
        List<List<Integer>> result = new ArrayList();

        for(int i=0; i<groupSizes.length; i++){
            int person = i;
            int groupSize = groupSizes[i];

            List<Integer> group = map.getOrDefault(groupSize, new ArrayList());
            group.add(person);
            map.put(groupSize, group);

            if(group.size() == groupSize){ // We dont want to store 6 of three`s, so when we have 3 times "3",
                //we need to add them to result and remove from map
                result.add(group);
                map.remove(groupSize);
            }
        }

        return result;
    }
}
