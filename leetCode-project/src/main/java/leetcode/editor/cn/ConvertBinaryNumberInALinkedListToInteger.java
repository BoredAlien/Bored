package leetcode.editor.cn;

//给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。 
//
// 请你返回该链表所表示数字的 十进制值 。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：head = [1,0,1]
//输出：5
//解释：二进制数 (101) 转化为十进制数 (5)
// 
//
// 示例 2： 
//
// 输入：head = [0]
//输出：0
// 
//
// 示例 3： 
//
// 输入：head = [1]
//输出：1
// 
//
// 示例 4： 
//
// 输入：head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
//输出：18880
// 
//
// 示例 5： 
//
// 输入：head = [0,0]
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 链表不为空。 
// 链表的结点总数不超过 30。 
// 每个结点的值不是 0 就是 1。 
// 
// Related Topics 位运算 链表 
// 👍 55 👎 0

public class ConvertBinaryNumberInALinkedListToInteger {
    public static void main(String[] args) {
        Solution solution = new ConvertBinaryNumberInALinkedListToInteger().new Solution();
        System.out.println(solution.getDecimalValue(null));
//        运用反向运算操作，我们在获得二进制的时候是除于2取余数，要计算被除数则是要商乘于2加余数。
//        例如： 将数字 5 转换为二进制，我们的计算步骤如下：
//        5 / 2 = 2 ...... 1
//        2 / 2 = 1 ...... 0
//        将上面第1步中的除于2移动到等号右边，得到： 5 = （2 * 2）+ 1
//        以上式子（2 * 2）中，乘号右边的2又可以拆解为： 2 = （2 * 1）+ 0
//        代入原式子中： 5 = ( 2 * ( ( 2 * 1 ) + 0) ) + 1
    }
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public int getDecimalValue(ListNode head) {
            int sum = 0;
            while (head != null){
                sum = sum * 2 + head.val;
                head = head.next;
            }
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
