package acm_326;

public class mergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A={6,6,5,4,3,3,2,1,0,0};
		if(A.length>0){
			sort(A,0,A.length-1);
		}
		for(int i=0;i<A.length-1;i++){
			System.out.print (A[i]+" ");
		}
	}
	//归的过程：分割，一级一级分割
	public static int[] sort(int[]A,int lo,int hi){
		int mid=(lo+hi)/2;//此处位置！
		if(lo<hi){
			sort(A,lo,mid);
			sort(A,mid+1,hi);
			merge(A,lo,mid,hi);
		}
		return A;
	}
	//并的过程
	public static void merge(int[] A,int lo,int mid,int hi){
		int[]temp=new int[hi-lo+1];//一定要申请新的数组
		int i=lo;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=hi){
			if(A[i]<A[j]){
				temp[k++]=A[i++];
			}else{
				temp[k++]=A[j++];
			}
		}
		while(i<=mid){
			temp[k++]=A[i++];
		}
		while(j<=hi){
			A[k++]=A[j++];
		}
		for(int k2=0;k2<temp.length;k2++){
			A[k2+lo]=temp[k2];
		}
	}

}
