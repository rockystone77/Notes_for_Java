package twenty_eight_of_sep;

public class GetMinMax {

	public static void main(String[] args) {
		int s[] = {20,12,3,19,6,18,8,12,4,1,19,8};
		int minimum, maximum;
		
		minimum = s[0];
		maximum = s[0];
		
		for(int i = 1; i <s.length;i++) {
			if(s[i] < minimum) {
				minimum = s[i];
			}else if(s[i] > maximum){
				maximum = s[i];
			}
			
		}
		System.out.println("max: " + maximum +"  min: " + minimum);
	}

}
