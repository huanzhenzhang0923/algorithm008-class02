import java.util.*;


class GroupAnagram{
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new LinkedList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] ca= str.toCharArray();
            Arrays.sort(ca);
            String key=String.valueOf(ca);
            if (!map.containsKey(key)) {
                map.put(key,new LinkedList<>());
            }
            map.get(key).add(str);
        }

        for (Map.Entry entry:map.entrySet()) {
            result.add((List<String>) entry.getValue());
        }
        return result;
    }
}