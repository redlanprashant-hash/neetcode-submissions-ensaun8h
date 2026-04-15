class Solution {
    public boolean isAnagram(String s, String t) {
        char[] strA = s.toCharArray();
        char[] strB = t.toCharArray();
        Arrays.sort(strA);
        Arrays.sort(strB);
        return Arrays.equals(strA,strB);
    }
}
