
public class SelectionSort {
	public static int[] swap(int arr[],int i,int ind)
	{
		int temp=arr[i];
		arr[i]=arr[ind];
		arr[ind]=temp;
		return arr;
	}
	public static void SelectionSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int min=arr[i],ind=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(min>arr[j])
				{
					min=arr[j];
					ind=j;
				}
			}
			if(arr[i]!=min)
				swap(arr,i,ind);
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,6,9,1,5};
		SelectionSort(arr);
	}

}
