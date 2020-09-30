package leetcode.editor.cn;

//输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，
//它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。 
//
// 
//
// 示例： 
//
// 给定一个链表: 1->2->3->4->5, 和 k = 2.
//
//返回链表 4->5. 
// Related Topics 链表 双指针 
// 👍 86 👎 0

public class LianBiaoZhongDaoShuDiKgeJieDianLcof{
	public static void main(String[] args) {
		Solution solution = new LianBiaoZhongDaoShuDiKgeJieDianLcof().new Solution();
        // 创建一个快引用，一个慢引用，先让快引用后移k步，然后两个引用在同时后移，当快引用遍历结束时，慢引用就是该题要的结果
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode first = head, second = head;
        while (first != null){
            if(k == 0){
                second = second.next;
            }else {
                k--;
            }
            first = first.next;
        }
        return second;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

}
