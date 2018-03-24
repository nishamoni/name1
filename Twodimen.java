
public class Twodimen {

	public static void main(String[] args) {
		int number[][]={ {1,2,3},{4,5,6},{7,8,9}};
		int number2[][]={{5,6,7},{8,7,9},{1,5,6}};
		int sol[][]=new int[3][3];
		for( int j=0;j<3;j++){
			for( int i=0;i<3;i++){
				sol[i][j]= number[i][j]+number2[i][j];
				System.out.print(sol[i][j] + " ");
			}
			System.out.println("  ");
				
		}


	}

}
