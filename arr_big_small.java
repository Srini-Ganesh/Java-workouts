class find
{
	public static int biggest(int[] arr)
	{
		int big=arr[0];
		for(int i : arr)
		{
			if(i>big)
				big=i;
		}
		return big;
	}
	public static int smallest(int[] arr)
	{
		int small=arr[0];
		for(int i : arr)
		{
			if(i<small)
				small=i;
		}
		return small;
	}
}
class arr_big_small
{
	public static void main(String[] args)
	{
		int[] arr={64,646,24,89,24,868,1342,99,1424};
		int big=find.biggest(arr);
		int small=find.smallest(arr);
		System.out.println("Biggest: "+big);
		System.out.println("Smallest : "+small);
	}
}