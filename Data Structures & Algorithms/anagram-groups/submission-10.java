class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> hm = new HashMap<>();
        int count[] = new int[26];
        for(String str : strs){
            Arrays.fill(count, 0);
            for(char ch : str.toCharArray()){
                count[ch - 'a']++;
            }
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < 26; i++){
                sb.append(count[i]);
                sb.append("#");
            }
            String key = sb.toString();
            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList());
            }
            hm.get(key).add(str);
        }

        return new ArrayList(hm.values());

    }
}
