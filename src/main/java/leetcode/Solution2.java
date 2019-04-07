package leetcode;

import com.alibaba.fastjson.JSON;

/**
 * @param
 * @Author: dingxy3
 * @Description:
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

 *如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 *您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 *示例：
 *
 *输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 *输出：7 -> 0 -> 8
 *原因：342 + 465 = 807
 * @Date: Created in  2019/4/3
 **/
public class Solution2 {

    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    /**
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode resultNode = new ListNode(0) ;

        ListNode p = l1, q =l2 , cur = resultNode ;

        int carry = 0 ;
        while (p != null || q !=null)
        {
            int x = (p != null) ? p.val :0 ;

            int y = (q != null) ? q.val : 0 ;

            int sum = x + y + carry ;

            carry = sum/10 ;

            cur.next = new ListNode(sum%10);
            cur = cur.next ;

            if (p != null){ p =p.next ;}
            if (q != null){ q =q.next ;}

        }
        if (carry > 0) {
            cur.next = new ListNode(carry);
           // cur = cur.next ;
        }

        return resultNode.next ;
    }

    public static void main(String[] args) {
         ListNode p1 = new ListNode(1);
         p1.next = new ListNode(8);
         ListNode p2 =new ListNode(2);
        p2.next = new ListNode(8);

        ListNode p3 = addTwoNumbers(p1,p2);
       System.out.print(JSON.toJSON(p3));
    }
}
