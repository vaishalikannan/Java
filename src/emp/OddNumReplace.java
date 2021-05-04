package emp;



public class OddNumReplace {
	private void oddNumReplace() {
		int a[]={7,21,33,42,50};
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2!=0)
			{
				a[i]=a[i]/2;
				
			}
			else
			{
				a[i]=a[i];
			}
			System.out.println(a[i]);
		}
		
		

	}
	public static void main(String[] args) {
		OddNumReplace o = new OddNumReplace();
		o.oddNumReplace();
	}

}
