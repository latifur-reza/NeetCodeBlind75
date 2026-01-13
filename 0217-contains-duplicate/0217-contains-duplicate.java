class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> myNums = new HashSet<>();
        for(int num: nums) {
            if(myNums.contains(num)) {
                return true;
            }
            myNums.add(num);
        }
        return false;
    }
}