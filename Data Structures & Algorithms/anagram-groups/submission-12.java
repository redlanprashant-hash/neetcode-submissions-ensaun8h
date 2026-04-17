class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        int[] arr = new int[26];
        for(String str : strs){
            Arrays.fill(arr,0);
            for(char ch : str.toCharArray()){
                arr[ch - 'a']++;
            }
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < 26;i++){
                sb.append(arr[i]);
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
