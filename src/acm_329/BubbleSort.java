package acm_329;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a={6,5,4,3,2,1,51};

		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		 System.out.println("排序之后：");
		  for (int i = 0; i < a.length; i++) {
		       System.out.print(a[i]+" ");
		   }
	}

}
