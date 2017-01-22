package practice;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 処理判定フラグ
		boolean result;

		// メソッド引数用文字列
		String str = "";

		// メソッド戻り値用変数
		int count = 0;

		// Warmup-1
		// monkeyTrouble
		WarmUp1 warmUp1 = new WarmUp1();
		result = warmUp1.monkeyTrouble(true, true);
		System.out.println(result);

		// Warmup-1
		// sumDouble
		count = warmUp1.sumDouble(1, 2);
		System.out.println(count);

		// doubleChar実行
		str = "Hi-There";
		String doubleChar = new Main().doubleChar(str);
		System.out.println("doubleChar = " + doubleChar);

		// catdog実行
		str = "catdog";
		result = catDog(str);
		System.out.println("catdog = " + result);

		// dogcat実行
		str = "dogcat";
		result = new Main().catDog(str);
		System.out.println("dogcat = " + result);

		// codeCount実行
		str = "cozexxcope";
		count = new Main().countCode(str);
		System.out.println("codeCount = " + count);

		// endOther実行
		result = new Main().endOther("Abc", "HiaBc");
		System.out.println(result);

		// xyzThere実行
		result = new Main().xyzThere("abc.xyz");
		System.out.println(result);

		// bobThere実行
		result = new Main().bobThere("b9b");
		System.out.println(result);
		
		

	}

	// Warmup-1
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation) {
			return true;
		}
		return false;
	}

	// Warmup-1
	// diff21
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

	// doubleChar
	public String doubleChar(String str) {
		// 結合用変数を定義
		String str1 = "";
		String str2 = "";
		// 文字列の長さの分、文字列を結合
		for (int i = 0; i < str.length(); i++) {
			str1 = str.substring(i, i + 1);
			str2 = str2 + str1 + str1;
		}
		return str2;
	}

	// countHi
	public int countHi(String str) {
		// 比較用文字列を定義
		String str1 = "";

		// カウント用変数
		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			str1 = str.substring(i, i + 2);
			if (str1.equals("hi")) {
				count++;
			}
		}
		return count;
	}

	// catDog
	public static boolean catDog(String str) {
		// 比較用文字列を定義
		String str1 = "";
		// catの個数格納用変数
		int catCount = 0;
		// dogの個数格納用変数
		int dogCount = 0;

		// catの個数を数える
		for (int i = 0; i < str.length() - 2; i++) {
			str1 = str.substring(i, i + 3);
			if (str1.equals("cat")) {
				catCount++;
			}
		}

		// dogの個数を数える
		for (int i = 0; i < str.length() - 2; i++) {
			str1 = str.substring(i, i + 3);
			if (str1.equals("dog")) {
				dogCount++;
			}
		}
		// catとdogの個数を比較する
		if (catCount == dogCount) {
			return true;
		}
		return false;
	}

	// countCode
	// 正規表現
	public int countCode(String str) {

		// codeの個数格納用変数
		int codeCount = 0;

		// codeの個数を数える
		for (int i = 0; i < str.length() - 3; i++) {
			// charAtメソッドで1文字目、3文字目、４文字目がそれぞれ一致していたらカウントを追加する。
			if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
				codeCount++;
			}
		}
		return codeCount;
	}

	// endOther
	public boolean endOther(String a, String b) {

		a = a.toLowerCase();
		b = b.toLowerCase();
		return a.endsWith(b) || b.endsWith(a);
	}

	// xyzThere

	/*
	 * Return true if the given string contains an appearance of "xyz" where the
	 * xyz is not directly preceeded by a period (.). So "xxyz" counts but
	 * "x.xyz" does not.
	 */
	public boolean xyzThere(String str) {

		for (int count = 0; count < str.length() - 2; count++) {
			if (str.substring(count, count + 3).equals("xyz")) {
				if (count > 0 && str.substring(count - 1, count).equals("."))
					continue;
				return true;
			}
		}
		return false;
	}


	// bobThere

	/*
	 * Return true if the given string contains a "bob" string, but where the
	 * middle 'o' char can be any char.
	 *
	 * bobThere("abcbob") → true
	 * bobThere("b9b") → true
	 * bobThere("bac") → false
	 */
	public boolean bobThere(String str) {

		// 文字列の長さを取得
		int length = str.length();

		// 取得した文字列の1文字目と3文字目を確認し、それぞれ"b"だったら"true"を返す
		for (int count = 0; count < length - 2; count++) {
			if (str.charAt(count) == 'b' && str.charAt(count + 2) == 'b') {
				return true;
			}
		}
		return false;
	}

	// xyBalance

	/*
	 * We'll say that a String is xy-balanced if for all the 'x' chars in the
	 * string, there exists a 'y' char somewhere later in the string. So "xxy"
	 * is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return
	 * true if the given string is xy-balanced.
	 *
	 * xyBalance("aaxbby") → true xyBalance("aaxbb") → false xyBalance("yaaxbb")
	 * → false
	 */

//	public boolean xyBalance(String str) {
//
//	}

	// mixString
	/*
	 * Given two strings, a and b, create a bigger string made of the first char
	 * of a, the first char of b, the second char of a, the second char of b,
	 * and so on. Any leftover chars go at the end of the result.
	 *
	 * mixString("abc", "xyz") → "axbycz" mixString("Hi", "There") → "HTihere"
	 * mixString("xxxx", "There") → "xTxhxexre"
	 */
	public String mixString(String a, String b) {

		String str = a + b;
		String str1 = "";
		String str2 = "";
		String str3 = "";

		for(int i = 0; i < str.length(); i++){

			for(int j = 0; j < a.length(); j++){
				str1 = a.substring(j, j+1);
			}

			for(int k = 0; k < b.length(); k++){
				str2= b.substring(k, k+1);
			}

			str3 = "" + str1 + str2;
		}

		return str3;
	}



}
