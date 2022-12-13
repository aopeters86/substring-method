
public class sliceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String testSlice = "MonkeyBusiness";
		
		//System.out.println(testSlice.substring(5, 11));
		
		slicer(testSlice);
	}
	
	public static void slicer(String x) {
		 
		System.out.print(x.substring(2, 6));
	}

}
