package practice;

public class WarmUp1 {

	// sleepIn
	// The parameter weekday is true if it is a weekday,
	// and the parameter vacation is true if we are on vacation.
	// We sleep in if it is not a weekday or we're on vacation.
	// Return true if we sleep in.
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation) {
			return true;
		}
		return false;
	}

	// monkeyTrouble
	// We have two monkeys, a and b, and the parameters aSmile and bSmile
	// indicate if each is smiling. We are in trouble if they are both smiling
	// or if neither of them is smiling. Return true if we are in trouble.
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile && bSmile) {
			return true;
		}
		if (!aSmile && !bSmile) {
			return true;
		}
		return false;
	}

	// sumDouble
	// Given two int values, return their sum. Unless the two values are
	// the same, then return double their sum.
	public int sumDouble(int a, int b) {
		if (a != b) {
			return a + b;
		}
		return (a + b) * 2;

	}

	// Warmup-1
	// diff21
	// Given an int n, return the absolute difference between n and 21,
	// except return double the absolute difference if n is over 21.
	public int diff21(int n) {
		// 返却用変数
		int diff = 0;

		// nが21より大きい場合
		if (n < 21) {
			diff = 21 - n;
		}

		// nが21だった場合
		else if (n == 21) {
			diff = 0;
		}

		// nが21より大きい場合
		else if (n > 21) {
			diff = (n - 21) * 2;
		}
		return diff;
	}

	// Warmup-1
	// parrotTrouble
	// We have a loud talking parrot. The "hour" parameter is the current hour
	// time in the range 0..23. We are in trouble if the parrot is talking and
	// the hour is before 7 or after 20. Return true if we are in trouble.
	public boolean parrotTrouble(boolean talking, int hour) {
		return (talking && (hour < 7 || hour > 20));
		// Need extra parenthesis around the || clause
		// since && binds more tightly than ||
		// && is like arithmetic *, || is like arithmetic +
	}

	// Warmup-1
	// makes10
	// Given 2 ints, a and b, return true if one if them is 10 or if their sum
	// is 10.
	public boolean makes10(int a, int b) {
		if (a == 10 || b == 10) {
			return true;
		} else if (a + b == 10) {
			return true;
		}
		return false;
	}

	// Warmup-1
	// nearHundred
	// Given an int n, return true if it is within 10 of 100 or 200. Note:
	// Math.abs(num) computes the absolute value of a number.
	public boolean nearHundred(int n) {
		return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
	}

	// Warmup-1
	// posNeg
	// Given 2 int values, return true if one is negative and one is positive.
	// Except if the parameter "negative" is true, then return true only if both
	// are negative.
	public boolean posNeg(int a, int b, boolean negative) {
		return (a < 0 && b <0 && negative);
	}

	// Warmup-1
	// notString
	// Given a string, return a new string where "not " has been added to the front.
	// However, if the string already begins with "not", return the string unchanged.
	// Note: use .equals() to compare 2 strings.
	public String notString(String str) {
		if(str.length() >= 3 && str.substring(0, 3).equals("not")){
			return str;
		}
		else{
			return "not " + str;
		}
	}
	// Warmup-1
	// missingChar
	// Given a non-empty string and an int n, return a new string where the char at
	// index n has been removed. The value of n will be a valid index of a char in
	// the original string(i.e. n will be in the range 0..str.length()-1 inclusive).
	public String missingChar(String str, int n) {
		// str: test / n: 2
		// front: te
		String front = str.substring(0, n);

		// Start this substring at n+1 to omit the char.
		// Can also be shortened to just str.substring(n+1)
		// which goes through the end of the string.
		// back: t
		String back = str.substring(n+1, str.length());
		// front + back = "tet"
		return front + back;
	}

	// Warmup-1
	// Given a string, return a new string where the first and last chars have been exchanged.
	public String frontBack(String str) {
		if(str.length() <= 1 ) {
			return str;
		}
		String front = str.substring(0,1);
		String back = str.substring(str.length()-1, str.length());
		String frontBack = "";

		frontBack = back;
		frontBack = frontBack + str.substring(1,str.length()-1);
		frontBack = frontBack + front;

		return frontBack;

		// 別回答
		//		if (str.length() <= 1) return str;
		//
		//		String mid = str.substring(1, str.length()-1);
		//
		//	    // last + mid + first
		//	    return str.charAt(str.length()-1) + mid + str.charAt(0);
	}
	// Warmup-1
	// Given a string, we'll say that the front is the first 3 chars of the string.
	// If the string length is less than 3, the front is whatever is there.
	// Return a new string which is 3 copies of the front.
	public String front3(String str) {
		// 文字列の連結
		StringBuilder sb = new StringBuilder();
		// strが3文字以下でない場合
		if (str.length() >= 3){
			String str1 = str.substring(0, 3);

			for(int i = 0; i < 3; i++ ){
				sb.append(str1);
			}
			// 完成した連結済み文字列を取り出す
			str = sb.toString();
		}
		else {
			for(int i = 0; i < 3; i++ ){
				sb.append(str);
			}
			str = sb.toString();
		}
		return str;
	}
	// Warmup-1
	// backAround
	// Given a string, take the last char and return a new string with the last char added
	// at the front and back, so "cat" yields "tcatt". The original string will be length 1
	// or more.
	public String backAround(String str) {
		// substring(index): index文字目を抜き出す
		String str1 = str.substring(str.length()-1);
		StringBuilder sb = new StringBuilder();
		sb.append(str1);
		sb.append(str);
		sb.append(str1);

		return sb.toString();

	}
	// Warmup-1
	// or35
	// Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
	// Use the % "mod" operator -- see
//	public boolean or35(int n) {
//
//	}

	// Warmup-1
	// front22
	// Given a string, take the first 2 chars and return the string with the 2 chars added at both
	// he front and back, so "kitten" yields"kikittenki".If the string length is less than 2,
	// use whatever chars are there.
	public String front22(String str) {
		StringBuilder sb = new StringBuilder();
		if(str.length() >= 3){
		String str1 = str.substring(0,2);
		// front first 2 chars added
		sb.append(str1);
		sb.append(str);
		// front first 2 chars added
		sb.append(str1);
		}
		else{
			for(int i = 0; i < 3; i++){
			sb.append(str);
			}
		}
		return sb.toString();
	}
	// Warmup-1
	// startHi
	// Given a string, return true if the string starts with "hi" and false otherwise.
	public boolean startHi(String str) {
		if(str.length() >=2){
			return (str.substring(0,2).equals("hi"));
		}
		return false;
	}

	// Warmup-1 > icyHot
	// Given two temperatures, return true if one is less than 0 and the other is greater than 100.

	//	icyHot(120, -1) → true
	//	icyHot(-1, 120) → true
	//	icyHot(2, 120) → false

	public boolean icyHot(int temp1, int temp2) {
		if(temp1 > 100 && temp2 < 0 ){
			return true;
		}
		else if (temp1 < 0 && temp2 > 100){
			return true;
		}
		return false;
	}

	// Warmup-1 > in1020
	// Given 2 int values, return true if either of them is in the range 10..20 inclusive.
	// どっちか: a or b が10~20の間だった場合
	//	in1020(12, 99) → true
	//	in1020(21, 12) → true
	//	in1020(8, 99) → false
	public boolean in1020(int a, int b) {
		 return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
	}

	// Warmup-1 hasTeen
	// We'll say that a number is "teen" if it is in the range 13..19 inclusive.
	// Given 3 int values, return true if 1 or more of them are teen.

	//	hasTeen(13, 20, 10) → true
	//	hasTeen(20, 19, 10) → true
	//	hasTeen(20, 10, 13) → true

	public boolean hasTeen(int a, int b, int c) {
		return (a >=13 && a < 20 || b >=13 && b < 20 || c >=13 && c < 20);
	}

	// Warmup-1 > loneTeen
	// We'll say that a number is "teen" if it is in the range 13..19 inclusive.
	// Given 2 int values, return true if one or the other is teen, but not both.

	//	loneTeen(13, 99) → true
	//	loneTeen(21, 19) → true
	//	loneTeen(13, 13) → false
	public boolean loneTeen(int a, int b) {
		// Store teen-ness in boolean local vars first. Boolean local
		// vars like this are a little rare, but here they work great.
		boolean aTeen = (a >= 13 && a <= 19);
		boolean bTeen = (b >= 13 && b <= 19);

		return (aTeen && !bTeen) || (!aTeen && bTeen);
		// Translation: one or the other, but not both.
		// Alternately could use the Java xor operator, but it's obscure.
	}

	// Warmup-1 > delDel
	// Given a string, if the string "del" appears starting at index 1,
	// return a string where that "del" has been deleted. Otherwise, return the string unchanged.

	//	delDel("adelbc") → "abc"
	//	delDel("adelHello") → "aHello"
	//	delDel("adedbc") → "adedbc"

	public String delDel(String str) {
		if(str.length() >=4) {
			String del = str.substring(1,4);
			if(del.equals("del")){
				return str.substring(0,1) + str.substring(4);
			}
		}
		return str;
	}

	// Warmup-1 > mixStart
	// Return true if the given string begins with "mix", except the 'm' can be anything,
	// so "pix", "9ix" .. all count.

	//	mixStart("mix snacks") → true
	//	mixStart("pix snacks") → true
	//	mixStart("piz snacks") → false

	public boolean mixStart(String str) {
		if(str.length() >= 3){
			String two = str.substring(1,3);
			if(two.equals("ix")){
				return true;
			}
		}
		return false;
	}

	// Warmup-1 > startOz

	// Given a string, return a string made of the first 2 chars (if present),
	// however include first char only if it is 'o' and include the second only if it is 'z',
	// so "ozymandias" yields "oz".

	//	startOz("ozymandias") → "oz"
	//	startOz("bzoo") → "z"
	//	startOz("oxx") → "o"

	public String startOz(String str) {
		String strO = "";
		String strz = "";
		String str1 = "";

		if(str.length() > 0){
			strO = str.substring(0,1);
		}
		if(str.length() >= 2){
			strz = str.substring(1,2);
		}
		if(strO.equals("o") && strz.equals("z")){
			str1 = strO + strz;
		}else if(strO.equals("o")){
			str1 = strO;
		}else if(strz.equals("z")){
			str1 = strz;
		}
		return str1;
	}
	// 別回答
//	public String startOz(String str) {
//		String result = "";
//
//		if (str.length() >= 1 && str.charAt(0)=='o') {
//			result = result + str.charAt(0);
//		}
//
//		if (str.length() >= 2 && str.charAt(1)=='z') {
//			result = result + str.charAt(1);
//		}
//
//		return result;
//	}

	// Warmup-1 > intMax

	//	Given three int values, a b c, return the largest.
	//			intMax(1, 2, 3) → 3
	//			intMax(1, 3, 2) → 3
	//			intMax(3, 2, 1) → 3
//	public int intMax(int a, int b, int c) {
//
//	}

}
