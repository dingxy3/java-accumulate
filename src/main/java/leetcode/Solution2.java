package leetcode;

import com.alibaba.fastjson.JSON;

/**
 * @param
 * @Author: dingxy3
 * @Description:
 * @Date: Created in  2019/4/3
 **/
public class Solution2 {

    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

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
