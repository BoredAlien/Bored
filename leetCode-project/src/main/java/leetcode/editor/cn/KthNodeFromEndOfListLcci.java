package leetcode.editor.cn;

//实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。 
//
// 注意：本题相对原题稍作改动 
//
// 示例： 
//
// 输入： 1->2->3->4->5 和 k = 2
//输出： 4 
//
// 说明： 
//
// 给定的 k 保证是有效的。 
// Related Topics 链表 双指针 
// 👍 42 👎 0

public class KthNodeFromEndOfListLcci {
    public static void main(String[] args) {
        Solution solution = new KthNodeFromEndOfListLcci().new Solution();
        // 创建一个快引用，一个慢引用，先让快引用后移k步，然后两个引用在同时后移，当快引用遍历结束时，慢引用就是该题要的结果

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
        public int kthToLast(ListNode head, int k) {
            ListNode first = head, second = head;
            while (first != null){
                if(k == 0){
                    second = second.next;
                }else {
                    k--;
                }
                first = first.next;
            }
            return second.val;
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
