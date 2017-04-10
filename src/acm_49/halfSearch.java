package acm_49;

public class halfSearch {

	public static int search(int[] A,int a){
		int lo=0;
		int hi=A.length-1;
		int mid;
		while(lo<=hi){
			mid=(lo+hi)/2;
			if(A[mid]>a){
				hi=mid-1;
			}
			if(A[mid]<a){
				lo=mid+1;
			}else{
				return mid;
			}
		}
		return -1;
	}
}
