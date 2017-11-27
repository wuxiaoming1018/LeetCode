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
    private int count = 0;

    private int remove(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int index = 0;
        for (int num : nums) {
            if (num != val) {
                index++;
            }
        }
        int[] results = new int[index];
        for (int num : nums) {
            if (num != val) {
                results[count] = num;
                count++;
            }
        }
        System.out.println("\n删除之后:");
        for (int result : results) {
            System.out.print(result + " ");
        }
        return index;
    }

    public static void main(String[] args) {
        ArrayRemove ar = new ArrayRemove();
        int[] ints = new int[]{3, 2, 2, 3, 3, 5, 8, 3};
//        ar.remove2(ints,3);
        System.out.println("删除之前:");
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
        int remove = ar.remove(ints, 3);
        if (remove == -1) {
            System.out.println("\n输入的数组为空或者需要删除的元素不存在");
        } else {
            System.out.println("\n删除后的length:" + remove + "");
        }
        ar.removeDuplicates(ints);
    }

    private int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }
        System.out.println("\nindex=" + index);
        return index + 1;
    }

   /* private int remove2(int[] nums,int val){
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }*/
}
