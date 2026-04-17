class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //using maps
        Map<String, List<String>> res=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String b=new String(ch);
            res.putIfAbsent(b, new ArrayList<>());
            res.get(b).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
