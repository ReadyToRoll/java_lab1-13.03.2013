package hybrid_stack;
import java.util.Scanner;



class Mass_stack
{
	public int arr[];
	public Mass_stack array[];
	static int index=0;
	private final int maxsize=100;
	Mass_stack()
	{
		array=new Mass_stack[maxsize];
	}
	public void push(int val[])
	{
		if(index>maxsize){
			System.out.println("Stack overflow! ");
		}
		else
		{
			array[index].arr=val; //Почему мы не можем так написать?
			index++;
		}
	}
	public void pop()
	{
		if(index!=0)
		{
			index--;
			//int temp[]=array[index].arr;
		//	return temp[];
		}
		else
		{
			System.out.println("Stack is empty!");
			//return -111;
		}
	}
	public void show()
	{
		if(index!=0)
		{
			System.out.print("Элементы стека: ");
			for(int i=0;i<index;i++)
			{
				System.out.print("Массив №"+i+":");
				for(int j=0;j<arr.length;j++)
					System.out.print(array[i].arr[j]+" "); //Аналогично и это не работает..
				System.out.println();
			}
		}
		else
		{
			System.out.println("Стек пуст!");
		}
	}
	public static void main(String[] args)
	{
		Mass_stack me=new Mass_stack();
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
		me.push(val1);
		me.push(val2);
		me.push(val3);
		me.show();
		me.pop();
		me.show();
		me.pop();
		me.show();
	}
}