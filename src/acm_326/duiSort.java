package acm_326;

public class duiSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] A={6,5,5,4,3,2,2,1,0,0,7};
		sort(A);
		 for(int i=0;i<A.length;i++){
			 System.out.print(A[i]+" ");
		 }
	}
	public static int[] sort(int[]A){
		A=buildMaxHeap(A);
		for(int i=A.length-1;i>1;i--){
		int temp=A[0];
			A[0]=A[i];
			A[i]=temp;
			adjustDownToUp(A,i,0);
		}
		return A;
	}
	public static int[] buildMaxHeap(int[]A){
		//从最后一个节点A.length-1的父节点（A.length-1-1）/2开始，直到根节点0，反复调整堆
		for(int i=(A.length-1-1)/2;i>=0;i--){
			adjustDownToUp(A,A.length,i);
		}
		return A;
	}
	public static void adjustDownToUp(int[] A,int length,int k){
		int temp=A[k];//根节点
		for(int i=2*k+1;i<length-1;i=2*i+1){
			if(A[i]<A[i+1]){
				i++;
			}
			if(temp>=A[i]){
				break;
			}else{
				A[k]=A[i];
				k=i;
			}
		}
		A[k]=temp;
	}

}
