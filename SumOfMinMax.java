class SumOfMinMax
{
	public static void main(String args[])
	{
		int[] arr={4,6,2,5,4,11,5,0,3,8};
		int min=arr[0];
		int max=arr[0];
		for(int n:arr)
		{
			if(n>max)
				max=n;
			else if(n<min)
				min=n;
		}
		System.out.println("sum is "+(max+min));
	}
}
