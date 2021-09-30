package twenty_eight_of_sep;

public class RectangleValueAssigment {

	public static void main(String[] args) {
		int[][]array1 = new int[2][3];
		array1[0][0] =1;
		array1[0][1] =2;
		array1[0][2] =3;
		array1[1][0] =4;
		array1[1][1] =5;
		array1[1][2] =6;
		
		System.out.println(array1[0][0] +" " + array1[0][1] + " " + array1[0][2]);
		System.out.println(array1[1][0] +" " + array1[1][1] + " " + array1[1][2]);
		System.out.println();
		
		int[][]array2 = new int[][] {{1,2,3},{4,5,6}};
		
		System.out.println(array2[0][0] +" " + array2[0][1] + " " + array2[0][2]);
		System.out.println(array2[1][0] +" " + array2[1][1] + " " + array2[1][2]);
		System.out.println();
		
		

	}

}
