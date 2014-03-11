package hybrid_stack;
import java.util.Scanner;



class Mass_stack
{
	public int arr[][];
	static int index=0;
	private final int maxsize=100;
	Mass_stack()
	{
		arr=new int[maxsize][maxsize];
	}
	public void push(int val[])
	{
		if(index>maxsize)
			System.out.println("Stack overflow! ");
		else
		{
			arr[index][0]=val.length+1;
			for(int i=1;i<=val.length;i++)
			arr[index][i]=val[i-1];
			index++;
		}
	}
	public void pop()
	{
		if(index!=0)
		{
			for(int i=0;i<maxsize;i++)
				arr[index][i]=0;
			index--;
		}
		else
			System.out.println("Stack is empty!");
	}
	public void show()
	{
		if(index!=0)
		{
			System.out.println("Элементы стека: ");
			for(int i=0;i<index;i++)
			{
				System.out.print("Массив №"+(i+1)+":");
				for(int j=0;j<arr[i][0];j++)
					System.out.print(arr[i][j]+" "); //Аналогично и это не работает..
				System.out.println();
			}
		}
		else
			System.out.println("Стек пуст!");
	}
	public static void main(String[] args)
	{
		Mass_stack test=new Mass_stack();
		int n=3;
		int val1[];
		val1=new int[n];
		int val2[];
		val2=new int[n];
		int val3[];
		val3=new int[n];
		Scanner inp = new Scanner(System.in);
		System.out.print("Введите "+n+" значений для ввода в стек: ");
		for(int i=0;i<n;i++)
			val1[i] = inp.nextInt();
		System.out.print("Введите "+n+" значений для ввода в стек: ");
		for(int i=0;i<n;i++)
			val2[i] = inp.nextInt();
		System.out.print("Введите "+n+" значений для ввода в стек: ");
			for(int i=0;i<n;i++)
		val3[i] = inp.nextInt();
		test.push(val1);
		test.push(val2);
		test.push(val3);
		test.show();
		test.pop();
		test.show();
		test.pop();
		test.show();
	}
}