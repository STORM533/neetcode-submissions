class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String str = new String(charArr);
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
                map.get(str).add(strs[i]);
            }else {
                map.get(str).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}
