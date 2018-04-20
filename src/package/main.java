package maincode;
import java.util.*;
import java.lang.*;
public class main {
	public static void main (String[] args) {
		System.out.println("输入排序规模");
		Scanner n = new Scanner(System.in);
		int i,n1=n.nextInt();
		int[] a = new int[n1];//获取数组长度并创建数组
		int[] b = new int[n1];
		int[] c = new int[n1];
		int[] d = new int[n1];
		System.out.println("生成的数组为");
		for(i=0;i<n1;i++) {  //随机数组赋值
			int temp = (int)(Math.random()*n1);
			a[i] = temp;
			b[i] = a[i];
			c[i] = b[i];
			d[i] = c[i];
			System.out.print(a[i]+" ");//输出原数组
		}
		System.out.println();
		
		System.out.println("快速排序运行时间");
		double starttime1 = System.currentTimeMillis();
		QuickSort.qsort(a, 0, n1-1);;//排序
		double endtime1 = System.currentTimeMillis();
		/*for(i=0;i<n1;i++) {
			System.out.print(a[i]+" ");//输出排序后数组
		}*/
		//System.out.println();
		System.out.println(endtime1-starttime1);
		
		System.out.println("选择排序运行时间");
		double starttime2 = System.currentTimeMillis();
		SelectSort.ssort(b, n1);//排序
		double endtime2 = System.currentTimeMillis();
		/*for(i=0;i<n1;i++) {
			System.out.print(b[i]+" ");//输出排序后数组
		}*/
		//System.out.println();
		System.out.println(endtime2-starttime2);
		
		System.out.println("冒泡排序运行时间");
		double starttime3 = System.currentTimeMillis();
		BubbleSort.bsort(c, n1);//排序
		double endtime3 = System.currentTimeMillis();
		/*for(i=0;i<n1;i++) {
			System.out.print(c[i]+" ");//输出排序后数组
		}
		System.out.println();*/
		System.out.println(endtime3-starttime3);
		
		System.out.println("插入排序运行时间");
		double starttime4 = System.currentTimeMillis();
		InsertSort.isort(d, n1);//排序
		double endtime4 = System.currentTimeMillis();
		/*for(i=0;i<n1;i++) {
			System.out.print(d[i]+" ");//输出排序后数组
		}
		System.out.println();*/
		System.out.println(endtime4-starttime4);
	}
}
