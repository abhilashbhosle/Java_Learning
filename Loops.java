class Loop{
	public static void main(String args[]){

		// while
		int i=0;
		while(i<4){
			System.out.println("Hi "+i);
				int j=1;
				while(j<3){
					System.out.println("Hello "+j);
					j++;
				}
			i++;
		}

		// do-while - in while loop if you want to execute the code once even if the condition fails.
		int k=5;
		do
			{
				System.out.println("Hey"+k);
				i++;
			}
		while(k<5);

		// for loop
		for(int l=1; l<=5; l++){
			System.out.println(l);
		}
	}
}