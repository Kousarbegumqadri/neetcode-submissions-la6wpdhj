class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    //using maps
    /*  Map<String, List<String>> res=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String b=new String(ch);
            res.putIfAbsent(b, new ArrayList<>());
            res.get(b).add(s);
        }
        return new ArrayList<>(res.values());
    }*/
    //TC & Sc O(n*K log k), O(N+K) n=numbers of strings, k=length of string

    //optimal version

    Map<String, List<String>> res=new HashMap<>();
    for(String s: strs){
        char[] count=new char[26];
        for(char c: s.toCharArray()){
            count[c - 'a']++;
        }
        String b=Arrays.toString(count);
        res.putIfAbsent(b, new ArrayList<>());
        res.get(b).add(s);
    }
    return new ArrayList<>(res.values());
    // Tc& Sc O(n*k) O(n*k)
}
}
