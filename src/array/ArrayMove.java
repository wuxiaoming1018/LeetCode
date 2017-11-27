package array;

/**
 * @author wuxiaoming
 * @date 2017-11-23 9:32
 */


import java.util.TreeMap;

/**
 * 数组01 - 0的移动 - 简单 - 283
 * <p>
 * 给定一个数组nums，写一个函数，将数组内的0移动到数组末尾，并保持其他非零元素在原数组中的相对位置不变。
 * 比如:给定nums = [0, 1, 0, 3, 12]，调用你的函数之后，nums应该变成[1, 3, 12, 0, 0]。
 * <p>
 * 注意：
 * 1. 请直接在传入的数组对象上修改，而不是另外创建一份拷贝（术语叫做 in-place，也有中译为“原地”）。
 * 2. 尽量减少操作指令代码的行数。
 * <p>
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class ArrayMove {

    private int[] moveZeroes(int[] datas) {
        if (datas == null || datas.length == 0) {
            return null;
        }
        for (int i = 0; i < datas.length; i++) {
            if (datas[i] == 0) {
                int temp = datas[i];
                for (int j = i + 1; j < datas.length; ) {
                    if (datas[j] != 0) {
                        datas[i] = datas[j];
                        datas[j] = temp;
                        break;
                    } else {
                        j++;
                    }
                }
            }
        }
        return datas;
    }

    public static void main(String[] args) {
        ArrayMove arrayMove = new ArrayMove();
        int[] zeroes = arrayMove.moveZeroes(new int[]{0, 5, 8, 6, 0, 4, 9});
        for (int zero : zeroes) {
            System.out.print(zero + " ");
        }
    }
}
