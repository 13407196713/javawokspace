package ch05code;

public class MultiArrayTest {

	public static void main(String[] args) {
		int multiArray[][][] = new int[3][4][5];
		for(int i = 0 ;i <3;i++){				
			for(int j = 0 ;j<4;j++){
				for(int k=0;k<5;k++){
					multiArray[i][j][k] = i*j*k;
					System.out.print(multiArray[i][j][k]+" ");
				}
				System.out.println();		   
			}
			System.out.println();			 

	     }
	 }
}
