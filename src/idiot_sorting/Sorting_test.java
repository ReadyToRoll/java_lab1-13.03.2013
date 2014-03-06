package idiot_sorting;

import java.util.Scanner;

public class Sorting_test 
{
	public static void input(int n, int arr[], Scanner inp) throws java.io.IOException 
	{
		System.out.print("Введите 5 значений: ");
		for(int i=0;i<n;i++)
			arr[i] = inp.nextInt();
	}
	public static void output(int n, int arr[]) throws java.io.IOException 
	{
		System.out.print("Массив: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	public static boolean check(int n, int arr[]) throws java.io.IOException
	{
		int ch=0;
		for(int i=0;i<n-1;i++)
			if(arr[i]<=arr[i+1])
				ch++;
		if(ch==n-1)
			return true;
		else
			return false;
	}
	public static void sorting(int n, int arr[]) throws java.io.IOException 
	{
		int temp;
		for(int i=0;;i++)
		{
			for(int j=0;j<n;j++)
			{
				if (check(n,arr)==true)
					return;
				if(i!=j)
				{
					if(i<j&&arr[i]>arr[j]||j<i&&arr[j]>arr[i])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		if(i==n-1)
			i=0;
		}
	}
	public static void main(String[] args) throws java.io.IOException
	{
		int n=5;
		int arr []=new int[n];
		Scanner inp = new Scanner(System.in);
		input(n,arr,inp);
		sorting(n,arr);
		output(n,arr);
	}
}
