package maincode;

public class BubbleSort {
	public static void bsort(int a[],int len) {
		int i,end=len,temp;
		while(end!=1) {
			for(i=0;i<end-1;i++) {
				if(a[i] > a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
			end--;
		}
	}
}
