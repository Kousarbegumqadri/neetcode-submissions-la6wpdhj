class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }
        //sorting
        /*char[] sort1=s.toCharArray();
        char[] sort2=t.toCharArray();
        Arrays.sort(sort1);
        Arrays.sort(sort2);
        return Arrays.equals(sort1,sort2);*/
          //Tc O(n log n) and Sc O(n)
        
        //HashMap
        /*HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        return map1.equals(map2);*/ 
          //Tc O(n) and Sc O(n)

        //HashTable

        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i:count){
            if(i!=0){
                return false;
            }
        }
        return true;
        //Tc O(n) and Sc O(1)

    }
}
