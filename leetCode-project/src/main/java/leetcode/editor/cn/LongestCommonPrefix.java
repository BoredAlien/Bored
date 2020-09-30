package leetcode.editor.cn;

//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串 
// 👍 1288 👎 0

public class LongestCommonPrefix{
	public static void main(String[] args) {
		Solution solution = new LongestCommonPrefix().new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"c","c","c"}));
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        StringBuffer result = new StringBuffer();
        for(int i = 0; i < strs[0].length(); i++){
            result.append(strs[0].substring(i,i+1));
            for(int j = 1; j < strs.length; j++){
                if(!strs[j].startsWith(result.toString())){
                    if(i == 0){
                        return "";
                    }else {
                        return result.substring(0, i);
                    }
                }
            }
        }
    	return result.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
