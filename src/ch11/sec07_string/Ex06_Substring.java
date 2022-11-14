package ch11.sec07_string;

public class Ex06_Substring {
	
	public static void main(String[] args) {
		String ssn = "080823-1134567";
		String firstPart = ssn.substring(0,6);
		System.out.println(firstPart); //0에서 6전까지 
		
		String secondPart = ssn.substring(7); //7부터 끝까지
		System.out.println(secondPart);
		
		
		//ssn에서 생년월일을 YYYY-MM-DD 형태로 표시 
		
		String year = ssn.substring(0,2);
		String month = ssn.substring(2,4);
		String day = ssn.substring(4,6);
		char gender = ssn.charAt(7);
		if(gender == '1' || gender == '2')
			year = "19" + year;
		else
			year = "20" + year;
		
		System.out.println("생년월일 : " + year + "-" + month + "-" + day);
		
	}

}
