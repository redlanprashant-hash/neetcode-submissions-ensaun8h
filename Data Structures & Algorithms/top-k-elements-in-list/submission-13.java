class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        if(nums.length == 0){
            return new int[]{};
        }
        HashMap<Integer,Integer> freqMap = new HashMap<>();

        for(int num : nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a,b) -> freqMap.get(a) - freqMap.get(b)
        );

        for(int num : freqMap.keySet()){
            heap.add(num);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] arr = new int[k];
        for(int i = 0; i < k; i++){
            arr[i] = heap.poll();
        }

        return arr;


    }
}
