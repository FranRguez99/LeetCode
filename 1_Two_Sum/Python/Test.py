from Solution import Solution
from typing import List

def test_twoSum():
    sol = Solution()
    
    # Test Case 1
    nums1 = [2, 7, 11, 15]
    target1 = 9
    assert sol.twoSum(nums1, target1) == [0, 1], "Test Case 1 Failed"
    
    # Test Case 2
    nums2 = [3, 2, 4]
    target2 = 6
    assert sol.twoSum(nums2, target2) == [1, 2], "Test Case 2 Failed"
    
    # Test Case 3
    nums3 = [3, 3]
    target3 = 6
    assert sol.twoSum(nums3, target3) == [0, 1], "Test Case 3 Failed"
    
    print("All test cases passed!")


if __name__ == "__main__":
    test_twoSum()
