//给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可
//能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。 
//
// 
//
// 示例 1: 
//
// 输入: 12258
//输出: 5
//解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi" 
//
// 
//
// 提示： 
//
// 
// 0 <= num < 231 
// 
// 👍 105 👎 0

  
  package leetcode.editor.cn;
  public class BaShuZiFanYiChengZiFuChuanLcof{
      public static void main(String[] args) {
           Solution solution = new BaShuZiFanYiChengZiFuChuanLcof().new Solution();
           solution.translateNum(25);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int translateNum(int num) {
        if(num<=9) return 1;
        String input=String.valueOf(num);
        int[] dp=new int[input.length()+1];
        dp[1]=1; dp[0]=1;
        for(int i=2; i<=input.length(); ++i){
            String pr=input.substring(i-2,i);
            if(pr.compareTo("25")<=0&&pr.compareTo("10")>=0)
                dp[i]=dp[i-2];
            dp[i]+=dp[i-1];
        }
        return dp[input.length()];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }