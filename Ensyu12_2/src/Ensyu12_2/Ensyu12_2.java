// パッケージの宣言
package Ensyu12_2;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu12_2
* 概要：演習12-2クラス
* 作成者：S.Saito
* 作成日：2023.05.10
*/
public class Ensyu12_2 {
	
	/*
	 * 関数名：inputString
	 * 概要：文字列の入力を求め、その文字列を返却する。
	 * 引数：なし
	 * 戻り値：useString … 文字列として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */
	static String inputString() {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 文字列の入力を行う。
		String useString = standardInput.next();
		// 入力した文字列を返す。
		return useString;
	}
	
	/*
	 * 関数名：inputString
	 * 概要：「(引数の文字)：」と表示し、文字列の入力を求め、その文字列を返却する。
	 * 引数：なし
	 * 戻り値：useString … 文字列として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */
	static String inputString(String outputWord) {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 文字列の入力を行う。
		String useString = standardInput.next();
		// 入力した文字列を返す。
		return useString;
	}
	
	/*
	 * 関数名：inputInteger
	 * 概要：整数値の入力を求め、その値を返却する。
	 * 引数：なし
	 * 戻り値：integerNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static int inputInteger() {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 整数値の入力を行う。
		integerNumber = standardInput.nextInt();
		// 入力した値を返す。
		return integerNumber;
	}

	/*
	 * 関数名：inputInteger
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：integerNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static int inputInteger(String outputWord) {
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 整数値の入力を行う。
		integerNumber = inputInteger();
		// 入力した値を返す。
		return integerNumber;
	}
	
	/*
	 * 関数名：inputLong
	 * 概要：整数値の入力を求め、その値を返却する。
	 * 引数：なし
	 * 戻り値：longNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static long inputLong() {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力を行う変数をつくる。
		long longNumber = 0;
		// 整数値の入力を行う。
		longNumber = standardInput.nextLong();
		// 入力した値を返す。
		return longNumber;
	}

	/*
	 * 関数名：inputLong
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：longNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static long inputLong(String outputWord) {
		// 入力を行う変数をつくる。
		long longNumber = 0;
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 整数値の入力を行う。
		longNumber = inputLong();
		// 入力した値を返す。
		return longNumber;
	}
	
	/*
	 * 関数名：inputPlus
	 * 概要：「(引数の文字)：」と表示し、その後に正の整数値の入力を求める。正の整数値が入れられるまでループし、最終的な値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：integerNumber … 正の整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
	 */
	static int inputPlus(String outputWord) {
		
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 正の整数値が入力されるまで入力を続けるループ。
		do {
			// 整数値の入力を行う。
			integerNumber = inputInteger(outputWord);
			// 正の整数値ではないときに分岐する。
			if (integerNumber <= 0) {
				// 正の整数値を入力するように促す。
				System.out.println("正の整数値を入力してください。");
			}
		// 入力した値が0以下ならループする。
		} while( integerNumber <= 0 );
		// 最後に入力した値を返す。
		return integerNumber;
	}
	
	/*
	 * 関数名：inputRange
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求める。最小値となる引数の値以上の整数値が入れられるまでループし、最終的な値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 *       lowerNumber … 入力する値の最小値
	 *       higherNumber … 入力する値の最大値
	 * 戻り値：integerNumber … 最小値以上最大値以下の入力した整数値を返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static int inputRange(String outputWord, int lowerNumber, int higherNumber) {
		
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 最小値より大きい値が入力されるまで入力を続けるループ。
		do {
			// 整数値の入力を行う。
			integerNumber = inputInteger(outputWord);
			// 入力範囲の整数値ではないときに分岐する。
			if (integerNumber < lowerNumber || integerNumber > higherNumber) {
				// 正しい整数値を入力するように促す。
				System.out.println(lowerNumber + "以上" + higherNumber + "以下の値を入力してください。");
			}
		// 入力した値が適さないならループする。
		} while( integerNumber < lowerNumber || integerNumber > higherNumber);
		// 最後に入力した値を返す。
		return integerNumber;
	}
	
	/*
	 * 関数名：inputLongMore
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求め、特定の値以上の値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 *       lowerNumber … 入力できる最小値。
	 * 戻り値：longNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static long inputLongMore(String outputWord,long lowerNumber) {
		// 入力を行う変数をつくる。
		long longNumber = 0;
		// 最小値より大きい値が入力されるまで入力を続けるループ。
		do {
			// 整数値の入力を行う。
			longNumber = inputLong(outputWord);
			// 入力範囲の整数値ではないときに分岐する。
			if (longNumber < lowerNumber) {
				// 正しい整数値を入力するように促す。
				System.out.println(lowerNumber + "以上の値を入力してください。");
			}
		// 入力した値が適さないならループする。
		} while( longNumber < lowerNumber );
		// 入力した値を返す。
		return longNumber;
	}
	
	/*
	 * 関数名：selectTwo
	 * 概要：1か0を入力し、1ならtrue、0ならfalseを返す。
	 * 引数：outputWord … String型の選択肢の表示に使う文字列。
	 * 戻り値：booleanSelect … 選択によってtrueかfalseを返す。
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */
	static boolean selectTwo (String outputWord) {
		
		// 選択肢を表示して1か0の値で入力をする。
		int selectNumber = inputRange(outputWord,0,1);
		// 戻り値をつくる。入力が1のときにture、0のときにfalseになる。
		boolean booleanSelect = selectNumber == 1;
		// 戻り値を返す
		return booleanSelect;
	}
	
	/*
	 * 関数名：main
	 * 概要：定額預金付き銀行口座クラス型変数の2つに対し、普通預金と定期預金残高の合計額を比較した結果を出すメソッドの動作確認をする。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public static void main(String[] args){
		// 銀行口座クラスの変数をつくる。
		AccountClass firstAccount;
		// 銀行口座クラスの変数をつくる。
		AccountClass secondAccount;
		
		// 一人目の銀行口座の作成を行うことを示す。
		System.out.println("一人目の銀行口座の作成を行います。");
		// 口座名義を入力
		String firstName = inputString("口座名義");
		// 口座番号を入力
		String firstNumber = inputString("口座番号");
		// 預金残高を決める。
		long firstBalance = inputLongMore("預金額",0);
		// 定期預金をする場合の分岐
		if (selectTwo ("定期預金口座を作りますか？  Yes … 1 / No … 0 ")) {
			// 定期預金口座に入れる金額を決める。
			long firstTime = inputLongMore("定期預金の入金額",1);
			// 定期預金付き銀行口座クラスで口座を作成する。
			firstAccount = new TimeAccount(firstName,firstNumber,firstBalance,firstTime);
		// 定期預金をしない場合の分岐
		} else {
			// 銀行口座クラスで口座を作成する。
			firstAccount = new AccountClass(firstName,firstNumber,firstBalance);
		}
		
		// 二人目の銀行口座の作成を行うことを示す。
		System.out.println("二人目の銀行口座の作成を行います。");
		// 口座名義を入力
		String secondName = inputString("口座名義");
		// 口座番号を入力
		String secondNumber = inputString("口座番号");
		// 預金残高を決める。
		long secondBalance = inputLongMore("預金額",0);
		// 定期預金をする場合の分岐
		if (selectTwo ("定期預金口座を作りますか？  Yes … 1 / No … 0 ")) {
			// 定期預金口座に入れる金額を決める。
			long secondTime = inputLongMore("定期預金の入金額",1);
			// 定期預金付き銀行口座クラスで口座を作成する。
			secondAccount = new TimeAccount(secondName,secondNumber,secondBalance,secondTime);
		// 定期預金をしない場合の分岐
		} else {
			// 銀行口座クラスで口座を作成する。
			secondAccount = new AccountClass(secondName,secondNumber,secondBalance);
		}
		
		// 二つの口座の比較を行う。一人目のほうが高い場合。
		if (TimeAccount.compBalance (firstAccount,secondAccount) == 1) {
			// 一人目の講座のほうが預金額が高いことを示す。
			System.out.println(firstAccount.getName() + "さんの口座のほうが預金額が多いです。");
		// 二人目のほうが高い場合。
		} else if (TimeAccount.compBalance (firstAccount,secondAccount) == -1) {
			// 二人目の講座のほうが預金額が高いことを示す。
			System.out.println(secondAccount.getName() + "さんの口座のほうが預金額が多いです。");
		// それ以外の場合、同じ額だった場合
		} else {
			// 
			System.out.println("同じ額預金しています。");
		}
		
	}
	
}
