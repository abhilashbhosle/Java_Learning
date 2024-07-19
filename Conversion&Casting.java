class Types{
	public static void main (String args[]){
		// type conversion
		int a=3;
		float b=5.6f;
		a=(int)b;
		System.out.println(a);

		// type casting
		int i=256;
		byte by= 127;
		// by=i; // cannot be converted as byte holds the values upto 127
		i=by; 
		System.out.println(i);
	}
}