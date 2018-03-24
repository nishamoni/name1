
public class JavaArr {

	public static void main(String[] args) {
		int number[]={10,6,7,1,3};
		int largest=number[0];
		int smallest=number[0];
		int seclargest =number[0];
		int secsmallest=number[0];
		for(int i=1;i<number.length;i++){
			if( number[i]>largest){
				
				seclargest=largest;
				largest=number[i];
			}
			else if( number[i]<smallest){
				secsmallest=smallest;
				smallest=number[i];
			}
			}
		System.out.println(largest);
		System.out.println(seclargest);
		System.out.println(smallest);
		System.out.println(secsmallest);
		

	}

}
