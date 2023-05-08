// パッケージの宣言
package Ensyu9_4;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu9_4
* 概要：演習9-4クラス
* 作成者：S.Saito
* 作成日：2023.05.01
*/
public class Ensyu9_4 {

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
		String useString = inputString();
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
	 * 関数名：inputFloat
	 * 概要：実数値の入力を求め、その値を返却する。
	 * 引数：なし
	 * 戻り値：floatNumber … 実数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static float inputFloat() {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力を行う変数をつくる。
		float floatNumber = 0;
		// 整数値の入力を行う。
		floatNumber = standardInput.nextFloat();
		// 入力した値を返す。
		return floatNumber;
	}

	/*
	 * 関数名：inputFloat
	 * 概要：「(引数の文字)：」と表示し、その後に実数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：floatNumber … 実数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static float inputFloat(String outputWord) {
		// 入力を行う変数をつくる。
		float floatNumber = 0;
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 整数値の入力を行う。
		floatNumber = inputFloat();
		// 入力した値を返す。
		return floatNumber;
	}
	
	/*
	 * 関数名：inputPlus
	 * 概要：正の整数値の入力を求める。正の整数値が入れられるまでループし、最終的な値を返却する。
	 * 引数：なし
	 * 戻り値：integerNumber … 正の整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.25
	 */
	static int inputPlus() {
		
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 正の整数値が入力されるまで入力を続けるループ。
		do {
			// 整数値の入力を行う。
			integerNumber = inputInteger();
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
	 * 関数名：inputFloatRange
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求める。最小値となる引数の値以上の整数値が入れられるまでループし、最終的な値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 *       lowerNumber … 入力する値の最小値
	 *       higherNumber … 入力する値の最大値
	 * 戻り値：floatNumber … 最小値以上最大値以下の入力した整数値を返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static float inputFloatRange(String outputWord, int lowerNumber, int higherNumber) {
		
		// 入力を行う変数をつくる。
		float floatNumber = 0;
		// 最小値より大きい値が入力されるまで入力を続けるループ。
		do {
			// 整数値の入力を行う。
			floatNumber = inputFloat(outputWord);
			// 入力範囲の整数値ではないときに分岐する。
			if (floatNumber < lowerNumber || floatNumber > higherNumber) {
				// 正しい整数値を入力するように促す。
				System.out.println(lowerNumber + "以上" + higherNumber + "以下の値を入力してください。");
			}
		// 入力した値が適さないならループする。
		} while( floatNumber < lowerNumber || floatNumber > higherNumber);
		// 最後に入力した値を返す。
		return floatNumber;
	}
	
	/*
	 * 関数名：checkLastDate
	 * 概要：年と月の情報を入力すると、入力した月の最終日が何日であるかを返す
	 * 引数：checkYear … 年を示す引数
	 *       checkMonth … 月を示す引数
	 * 戻り値：lastDate … 引数の年の月における最終日の日付を示す。
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */
	static int checkLastDate(int checkYear,int checkMonth) {
		
		// 戻り値として月の最終日をいれる変数。初期値は0とする。
		int lastDate = 0;
		
		// 年が0未満であったときは0を返す。
		if (checkYear < 0) {
			// 戻り値を0のまま返す。
			return lastDate;
		}
		
		// 月の入力に合わせてその月の最終日を示す分岐をする。
		switch (checkMonth) {
		// 二月の場合。
		case 2:
			// 4の倍数でかつ100の倍数ではない年、もしくは400の倍数の年の場合の分岐
			if ((checkYear % 4 == 0 && checkYear % 100 != 0) || checkYear % 400 == 0) {
				// うるう年なので29日に設定する。
				lastDate = 29;
				// 戻り値を返す。
				return lastDate;
			// 4の倍数ではない、もしくは100の倍数の場合の分岐
			} else {
				// うるう年ではないため28日に設定する。
				lastDate = 28;
				// 戻り値を返す。
				return lastDate;
			}
			
		// 4月、6月、9月、11月の場合の分岐。
		case 4: case 6: case 9: case 11:
			// 30日に設定する。
			lastDate = 30;
			// 戻り値を返す。
			return lastDate;
			
		// 1月、3月、5月、7月、8月、10月、12月の場合。
		case 1: case 3: case 5: case 7:case 8: case 10: case 12:
			// 31日に設定する。
			lastDate = 31;
			// 戻り値を返す。
			return lastDate;
			
		// それ以外、月の値がおかしい場合の分岐
		default :
			// 戻り値を0のまま返す。
			return lastDate;
		}
	}
	
	/*
	 * 関数名：main
	 * 概要：誕生日フィールドとtoStringメソッドを加えた人間クラスの動作確認をする。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public static void main(String[] args){
		
		// 名前の入力を求める。
		String userName = inputString("名前");
		// 身長の入力の最小値100のfinal変数
		final int LOW_HEIGHT = 100;
		// 身長の入力の最大値300のfinal変数
		final int HIGH_HEIGHT = 300;
		// 身長の入力を求める。入力範囲は100から300とする。
		float userHeight = inputFloatRange("身長(cm)",LOW_HEIGHT,HIGH_HEIGHT);
		// 体重の入力の最小値30のfinal変数
		final int LOW_WEIGHT = 30;
		// 体重の入力の最大値200のfinal変数
		final int HIGH_WEIGHT = 200;
		// 体重の入力を求める。入力範囲は30から200とする。
		float userWeight = inputFloatRange("体重(kg)",LOW_WEIGHT,HIGH_WEIGHT);
		// 誕生日の年の入力を求める。
		int birthYear = inputPlus("年");
		// 誕生日の月の入力を求める。入力範囲は1から12とする
		int birthMonth = inputRange("月",1,12);
		// 誕生日の月の最終日となる日の値を求める。
		int lastDate = checkLastDate(birthYear,birthMonth);
		// 誕生日の日の入力を求める。
		int birthDay = inputRange("日",1,lastDate);
		
		// 入力内容をもとに人間クラスでインスタンス化する。
		HumanClass newAccount = new HumanClass(userName, userHeight, userWeight,new DayClass(birthYear,birthMonth,birthDay));
		
		// 表示を見やすくする改行。
		System.out.println();
		
		// newAccountの表示を行う(toStringを用いて。)
		System.out.println(newAccount.toString()); 
		
		// 表示を見やすくする改行。
		System.out.println();
		
		
		// 変更操作の確認(セッタ)
		// 名前の変更確認の入力
		String newName = inputString("名前の変更確認");
		// 名前の変更をする。
		newAccount.setName(newName);
		
		// 身長の変更確認の入力
		float newHeight = inputFloatRange("身長の変更確認",LOW_HEIGHT,HIGH_HEIGHT);
		// 身長の変更をする。
		newAccount.setHeight(newHeight);
		
		// 体重の変更確認の入力
		float newWeight = inputFloatRange("体重の変更確認",LOW_WEIGHT,HIGH_WEIGHT);
		// 体重の変更をする。
		newAccount.setHeight(newWeight);
		
		// 誕生日の情報の変更の入力を行うことを記載。
		System.out.println("誕生日情報の変更確認");
		// 誕生日の年の入力を求める。
		int newYear = inputPlus("年");
		// 誕生日の月の入力を求める。入力範囲は1から12とする
		int newMonth = inputRange("月",1,12);
		// 誕生日の月の最終日となる日の値を求める。
		lastDate = checkLastDate(birthYear,birthMonth);
		// 誕生日の日の入力を求める。
		int newDate = inputRange("日",1,lastDate);
		// 誕生日の変更を行う。
		newAccount.setBirth(new DayClass(newYear,newMonth,newDate));

		// 表示を見やすくする改行。
		System.out.println();
		
		
		//変更後の表示を行う。(ゲッタ)
		// 名前を表示する。
		System.out.println("年："+ newAccount.getName());
		// 身長を表示する。
		System.out.println("身長："+ newAccount.getHeight());
		// 体重を表示する。
		System.out.println("体重："+ newAccount.getWeight());
		// 誕生日を表示する。
		System.out.println("誕生日："+ newAccount.getBirth());
	}
	
}
