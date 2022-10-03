import java.util.Scanner;
public class MergeSort {
	public static void MergeSort(int arr1[],int arr2[])
	{
		int n=arr1.length+arr2.length;
		int arr3[]=new int[n];
		int a=0,b=0;
		for(int i=0;i<n;i++)
		{
			if(a>=arr1.length)
			{
				while(b<arr2.length)
					arr3[i++]=arr2[b++];
			}
			else if(b>=arr2.length)
			{
				while(a<arr1.length)
					arr3[i++]=arr1[a++];
			}
			else if(arr1[a]<arr2[b])
				arr3[i]=arr1[a++];
			else if(arr1[a]>arr2[b])
				arr3[i]=arr2[b++];
			else if(arr1[a]==arr2[b])
			{
				arr3[i++]=arr1[a++];
				arr3[i]=arr2[b++];
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(arr3[i]+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			int arr1[]=new int[n];
			for(int i=0;i<n;i++)
				arr1[i]=s.nextInt();
			int m=s.nextInt();
			int arr2[]=new int[m];
			for(int i=0;i<m;i++)
				arr2[i]=s.nextInt();
			MergeSort(arr1, arr2);
		}
	}

}
