class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 0){
            return new int[]{};
        }
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int num : nums){
            if(freqMap.containsKey(num)){
                freqMap.put(num, freqMap.getOrDefault(num,0)+1);
            }else{
                freqMap.put(num,1);
            }
        }

        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> freqMap.get(a) - freqMap.get(b)
        );

        int[] ans = new int[k];
        for(int num : freqMap.keySet()){
            heap.add(num);
            if(heap.size() > k){
                heap.poll();
            }
        }

        for(int i = 0; i < k; i++){
            ans[i] = heap.poll();
        }
        return ans;

    }
}
