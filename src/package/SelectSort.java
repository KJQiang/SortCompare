package maincode;
import java.util.*;
import java.lang.*;
public class SelectSort {
	public static void ssort(int sel[],int len) {
		int i,j,temp;
		for(i=0;i<len;i++) {
			for(j=i+1;j<len;j++) {
				if(sel[i]>sel[j]) {
					temp=sel[i];
					sel[i]=sel[j];
					sel[j]=temp;
				}
			}
		}
	}
}
