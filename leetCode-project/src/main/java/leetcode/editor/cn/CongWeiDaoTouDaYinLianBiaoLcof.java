package leetcode.editor.cn;

//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
// Related Topics 链表 
// 👍 60 👎 0

public class CongWeiDaoTouDaYinLianBiaoLcof {
    public static void main(String[] args) {
        Solution solution = new CongWeiDaoTouDaYinLianBiaoLcof().new Solution();
        solution.reversePrint(null);
        // 两种解题方法：
        // 1、使用栈（占用空间比方法二要大）
        // 2、先遍历出链表整体长度，新建同长度的数组，将值设置进去
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
        public int[] reversePrint(ListNode head) {
            if(head == null){
                return new int[]{};
            }
            int count = 0;
            ListNode value = head;
            while (head != null){
                count++;
                head = head.next;
            }
            int[] result = new int[count];
            while (value != null){
                result[--count] = value.val;
                value = value.next;
            }
            return result;
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
