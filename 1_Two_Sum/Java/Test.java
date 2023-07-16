public class Test{
    public static void main(String[] args) throws Exception {
        Solution test = new Solution();
        
        int[] nums = {-1,-2,-3,-4,-5};
        int target = -8;

        System.out.println(test.twoSum(nums, target)[0]
         + " " + test.twoSum(nums, target)[1]);
        
    }
}


