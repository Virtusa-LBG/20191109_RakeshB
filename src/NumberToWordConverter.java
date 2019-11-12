
public class NumberToWordConverter {

	public static final String[] tens = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninty" };

	public static final String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

	public static void main(String[] args) {
//		numberReturn(Long.valueOf(args[0]));
		System.out.println(numberReturn(0l));
		System.out.println(numberReturn(21l));
		System.out.println(numberReturn(81l));
		System.out.println(numberReturn(99l));
	}

	public static String numberReturn(long num) {
		String resultNumber = "";
		if (num == 0) {
			return "zero";
		}
		String numberToConvert = String.valueOf(num);
		if(numberToConvert.length()>2) {
		String number ="";
		numberToConvert = "00000000"+numberToConvert; 
		int billons =Integer.parseInt(numberToConvert.substring(0,3));
		int milliond=Integer.parseInt(numberToConvert.substring(3,6));
		int hundredOfThousond=Integer.parseInt(numberToConvert.substring(6,9));
		int thousong =Integer.parseInt(numberToConvert.substring(9,12));
		switch (billons) {
		case 0:
			resultNumber = "";
			break;
		case 1:
			resultNumber = covertZero(billons)+" billons";
			break;
		case 2:
			resultNumber = covertZero(milliond)+" millions";
			break;
		case 3:
			resultNumber = covertZero(hundredOfThousond)+" lac";
			break;
		case 4:
			resultNumber = covertZero(thousong)+" Thousond";
			break;
		case 5:
			resultNumber = covertZero(milliond)+"hundred";
			break;
		case 6:
			resultNumber = covertZero(milliond)+" ten";
			break;
		case 7:
			resultNumber = covertZero(milliond)+" millions";
			break;
		case 8:
			resultNumber = covertZero(milliond)+" millions";
			break;
		case 9:
			resultNumber = covertZero(milliond)+" millions";
			break;
			// bean till nine
			default:
				resultNumber = resultNumber;
		}	
		}else {
			resultNumber = covertZero(Integer.parseInt(numberToConvert));
		}
		return resultNumber;
	}
	
	private static String covertZero(int number) {
		int d = number/10;
		int unit =number%10;
		String result ="";
		switch(d){
		case 1:
			result =tens[d] +" "+ones[unit];
		case 2:
			result =tens[d]+" "+ones[unit];
		case 3:
			result =tens[d]+" "+ones[unit];
		case 4:
			result =tens[d]+" "+ones[unit];
		case 5:
			result =tens[d]+" "+ones[unit];
		case 6:
			result =tens[d]+" "+ones[unit];
		case 7:
			result =tens[d]+" "+ones[unit];
		case 8:
			result =tens[d]+" "+ones[unit];
		case 9:
			result =tens[d]+" "+ones[unit];
		unit= unit+10;
		}
		return result;
	}
}
