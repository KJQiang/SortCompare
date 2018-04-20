package maincode;

public class InsertSort {
	public static void isort(int a[], int len) {
		int i,j,pre,now;
		for(i=1;i<len;i++) {
			pre = i-1;
			now = a[i];
			while(pre >= 0 && a[pre] > now) {
				a[pre+1] = a[pre];
				pre--;
			}
			a[pre+1] = now;
		}
	}
}
