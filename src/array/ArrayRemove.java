package array;


/**
 * @author wuxiaoming
 * @date 2017-11-23 10:27
 */

/**
 * 数组02 - 删除元素 - 简单 - 27
 * 给定一个数组和一个值，原地移除数组中所有给定的值，并返回新数组的长度。
 * 不允许申请额外空间，确保空间复杂度为O(1)。
 * 数组中的元素可以被改变，不用考虑超出新长度之后的空间遗留。
 * <p>
 * 比如：
 * 给定nums = [3, 2, ,2 3]， val = 3，
 * 你的函数应该返回length = 2， nums = [2, 2]。
 * <p>
 * Given an array and a value, remove all instances of that value in-place and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * Example:
 * Given nums = [3,2,2,3], val = 3,
 * Your function should return length = 2, with the first two elements of nums being 2.
 */
public class ArrayRemove {

    private int remove(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                index++;
                if (i != nums.length - 1) {
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
        }
        int count = nums.length - index;
        index=0;
        int[] result = new int[count];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                result[i] = nums[i];
            }
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
        return count;

    }

    public static void main(String[] args) {
        ArrayRemove ar = new ArrayRemove();
        int remove = ar.remove(new int[]{5, 8, 1, 4, 9, 3, 19, 29,3, 3, 3}, 3);
        if (remove == -1) {
            System.out.println("\n输入的数组为空或者需要删除的元素不存在");
        } else {
            System.out.println("\n" + remove + "");
        }
    }
}
