package com.fdmgroup.model;

public class SortedArray {

	public static void main(String[] args) {
		int[] a = {2,3,56,7,4,9,1,23};
		int[] b = {37,665,333,374,11};
		int c =a.length + b.length;
		int d[] = new int[c];
		int count=0;
		for(int i = 0 ; i < a.length ; i++ ){
			d[i]=a[i];
			count++;
		}
		for(int j=0;j<b.length;j++){
			d[count++]=b[j];
		}
		for(int k = 0 ; k < c ; k++ ){
			for(int m=k+1; m < c; m++){
				int temp=0;
				if(d[k]>d[m]){
					temp=d[k];
					d[k]=d[m];
					d[m]=temp;
				}
			}
		}
		for(int n=0;n<c;n++){
			System.out.println(d[n]);
		}
	}

}
