package maincode;
import java.util.*;
import java.lang.*;
public class QuickSort {
	public static void qsort(int a[],int k1,int k2) {
		if(k1>=k2)
			return;
		int i,j,k;
		i=k1;
		j=k2;
		k=a[i];
		while(i<j) {
			while(i<j && a[j]>=k) {
				j--;
			}
			a[i]=a[j];
			while(i<j && a[i]<=k) {
				i++;
			}
			a[j]=a[i];
		}
		a[i]=k;
		qsort(a,k1,i-1);
		qsort(a,i+1,k2);
	}
}
