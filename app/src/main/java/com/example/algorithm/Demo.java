package com.example.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * description ：
 * author : 赵青春
 * email : 1458174550@qq.com
 * date : 2020/6/29 17:15
 */
public class Demo {

    /**
     * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
     * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
     */
    public int[] shuffle(int[] nums, int n) {
        int[] num03 = new int[nums.length];
        int[] num01 = Arrays.copyOf(nums, n);
        int[] num02 = Arrays.copyOfRange(nums, n, 2 * n);

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                num03[i] = num01[i / 2];
            } else {
                num03[i] = num02[(i - 1) / 2];
            }
        }
        return num03;
    }

    /**
     * 给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
     * 对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有 最多 的糖果。
     * 注意，允许有多个孩子同时拥有 最多 的糖果数目。
     **/

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < candies.length; i++) {
            if (temp <= candies[i]) {
                temp = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (temp > candies[i] + extraCandies) {
                result.add(false);
            } else {
                result.add(true);
            }
        }
        return result;
    }

    /**
     * 给你两个整数，n 和 start 。
     * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
     * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
     **/
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
            if (i == 0) {
                result = nums[i];
            } else {
                result = result ^ nums[i];
            }
        }
        return result;

    }

    /**
     * 给你一个数组 nums 。
     * 数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
     * 请返回 nums 的动态和。
     */
    public int[] runningSum(int[] nums) {
        int temp = 0;
        int result[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp = temp + nums[i];
            result[i] = temp;
        }
        return result;
    }

    /**
     * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
     * 请定义一个函数实现字符串左旋转操作的功能。
     * 比如，输入字符串"abcdefg"和数字2，
     * 该函数将返回左旋转两位得到的结果"cdefgab"。
     *
     * @param s
     * @param n
     * @return
     */

    public String reverseLeftWords(String s, int n) {
        //  StringBuffer result=new StringBuffer();
        int length = s.length();
        char[] result = new char[length];
        for (int i = n; i < length; i++) {
            //   result.append(s.charAt(i));
            result[i - n] = s.charAt(i);
        }
        for (int i = 0; i < n; i++) {
            //    result.append(s.charAt(i));
            result[length - n + i] = s.charAt(i);
        }

        return String.valueOf(result);

        // return s.substring(n).concat(s.substring(0,n)) ;

    }

    //    public int[] divingBoard(int shorter, int longer, int k) {
    ////        int [] result=new int[k];
    ////
    ////        int num;
    ////        for (int i = 0; i < k; i++) {
    ////            num=shorter*i+longer*(k-i);
    ////            result[i]=num;
    ////        }
    ////        int temp=result[0];
    ////        for (int i = 0; i < k; i++) {
    ////            if (temp>result[i]){
    ////
    ////            }
    ////        }
    ////    }

    public int numIdenticalPairs(int[] nums) {
        //  int temp=0;
        //        for (int i = 0; i < nums.length-1; i++) {
        //            for (int j = i+1; j < nums.length; j++) {
        //                if (nums[i]==nums[j]){
        //                    temp++;
        //                }
        //            }
        //        }
        //     return temp;

        int ans = 0;
        int[] temp = new int[100];

        for (int i = 0; i < nums.length; i++) {
            ans = ans + temp[nums[i] - 1];
            temp[nums[i] - 1]++;
        }

        for (int num : nums) {
            ans = ans + temp[num - 1];
            temp[num - 1]++;
        }

        //        String address="415434";
        //        StringBuffer buffer=new StringBuffer();
        //        for (char cha:address.toCharArray()){
        //            if ('.' == cha){
        //                buffer.append("[.]");
        //            }else buffer.append(cha);
        //
        //
        //        }
        //        return buffer.toString();

        return ans;

    }


    class ListNode{
        ListNode left;
        ListNode right;
    }


    public void node(ListNode node){
      if (node==null){
          return;
      }
      node(node.left);
      node(node.right);
    }

    int a = 0;
    int b = 1;

    public int subtractProductAndSum(int n) {
        if (n < 10){
            a += n;
            b = b * n;
            return b-a;
        }
        a += n % 10;
        b = b *(n % 10) ;
        return subtractProductAndSum(n / 10);

    }

    public int minCount(int[] coins) {
        int count=0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i]%2==0)
                count+=coins[i]/2;
            else
                count+=coins[i]/2+1;
        }
        return count;
    }


    int sum=0;
    public int sum01(int n){
        if (n==1){

            return 0;
        }

        sum++;
        return sum01(n/2);
    }


    int res = 0;
    LinkedList<Integer> list;
    public int sumNums(int n) {
        list.removeFirst();
        //逻辑运算 短路操作 当前一个条件不成立时后面条件不在执行 适用于递归操作条件判断
        boolean x = n > 1 && sumNums(n - 1) > 0;
        res += n;
        return res;
    }

    public int game(int[] guess, int[] answer) {
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                res++;
            }
        }
        return res;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
