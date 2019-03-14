package day;

/**
 * ============================
 *
 * @version [版本号, 2019/3/11]
 * @Auther: dingxy
 * @Description:
 * @since [产品/模块版本]
 * =============================
 */
public class Test0311 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] a = {12,20,5,16,15,1,30,45,23,9};
        int start = 0;
        int end = a.length-1;
        sort(a,start,end);
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static void sort(int[] a,int low, int high){
        int start = low;
        int end = high;
        int key = a[low];

        while (end >start)
        {
            while (end>start && a[end]>key)
            {
                end -- ;
            }
            if (a[end] <= key)
            {
               int temp = a[end] ;
               a[end] = a[start];
               a[start] = temp ;
            }
            while (end > start && a[start] <= key)
                start ++ ;
            if (a[start]>= key)
            {
                int temp = a[start] ;
                a[start] = a[end];
                a[end] = temp ;
            }
            if (start>low)
            {
              sort(a,low,start-1);
            }
            if(end<high)
            {
                sort(a,end+1,high);
            }

        }
    }
}
