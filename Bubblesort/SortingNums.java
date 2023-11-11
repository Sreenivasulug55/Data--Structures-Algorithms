package Bubblesort;

public class SortingNums {
	public static void main(String[] args) {
		// Initialize a array
		int Numbers[] = {1,6,4,8,3,5,165,12};
		// calling static method with parameter Array
		Sorting(Numbers);
	}
	public static void Sorting(int Nums[]) {
		System.out.print("Before Sorted: ");
		for (int i : Nums) {
			System.out.print(i+" ");
		}
		int num = 0;
		for(int i=0;i<Nums.length;i++) {
			for(int j=0;j<Nums.length-i-1;j++) {
				num++;
				// if we use > it indicate ascending Order
				// if we use < Descending Order 
				if(Nums[j] < Nums[j+1]) {
					int temp = Nums[j];
					Nums[j] = Nums[j+1];
					Nums[j+1] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.print("After Sorted: ");
		for (int i : Nums) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("number of iteration: "+num);
		
	}

}
