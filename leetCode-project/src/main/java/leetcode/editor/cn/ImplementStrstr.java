package leetcode.editor.cn;

//实现 strStr() 函数。 
//
// 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如
//果不存在，则返回 -1。 
//
// 示例 1: 
//
// 输入: haystack = "hello", needle = "ll"
//输出: 2
// 
//
// 示例 2: 
//
// 输入: haystack = "aaaaa", needle = "bba"
//输出: -1
// 
//
// 说明: 
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。 
// Related Topics 双指针 字符串 
// 👍 582 👎 0

public class ImplementStrstr{
	public static void main(String[] args) {
		Solution solution = new ImplementStrstr().new Solution();
        System.out.println(solution.strStr("hello","ll"));
        // 可参考String.indexOf()源代码
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle == null || needle.equals("")){
            return 0;
        }

        if(needle.length() > haystack.length()){
            return -1;
        }

        char[] target = needle.toCharArray();
        char[] source = haystack.toCharArray();

        int max = haystack.length() - needle.length();
        char firstCharTarget = target[0];

        for(int i = 0; i <= max; i++){

            if(source[i] != firstCharTarget){
                while (++i <= max && source[i] != firstCharTarget);
            }

            if(i <= max){
                int j = i + 1, end = i + needle.length();
                for(int k = 1; j < end && source[j] == target[k]; j++,k++);

                if(j == end){
                    return i;
                }
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
