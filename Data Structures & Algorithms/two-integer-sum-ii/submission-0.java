class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> ansMap = new HashMap<>();
        int compliment = 0;
        for(int i = 0; i < numbers.length; i++){
            compliment = target - numbers[i];
            if(ansMap.containsKey(compliment)){
                return new int[]{ansMap.get(compliment)+1,i+1};
            }
            ansMap.put(numbers[i],i);
        }
        return new int[]{};
    }
}
