package demo.first.attempt;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "ABC";
		String s2="XYZ";
		String s3 = "POV";
		
		
		StringBuffer sb = new StringBuffer();
		sb.append(s1).append(s2).append(s3);
		System.out.println(sb.toString());
		
		System.out.println(s1.concat(s2).concat(s3));
	}

}
