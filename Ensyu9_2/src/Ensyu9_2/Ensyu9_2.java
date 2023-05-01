// パッケージの宣言
package Ensyu9_2;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu9_2
* 概要：演習9-2クラス
* 作成者：S.Saito
* 作成日：2023.04.28
*/
public class Ensyu9_2 {
	
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
		case 1: case 3: case 5: case 7: case 10: case 12:
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
	 * 概要：年月日を入力すると、それぞれのコンストラクタの条件それぞれでわけてインスタンス化する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */
	public static void main(String[] args){
		
		// 動作確認用の年月日の入力を求める。
		System.out.println("年月日を入力してください");
		
		// 年の入力
		int myYear = inputPlus("年");
		// 月の入力。入力は1月から12月までに制限する
		int myMonth = inputRange("月", 1, 12);
		// 入力した年月の最終日の日付を求める。
		int lastDate = checkLastDate(myYear,myMonth);
		// 日の入力
		int myDate = inputRange("日", 1, lastDate);

		// 各コンストラクタを用いてインスタンス化をする。
		// 入力なしのコンストラクタでインスタンスを定義。
		Day firstDay = new Day();
		// 年まで入力するコンストラクタでインスタンスを定義。
		Day secondDay = new Day(myYear);
		// 月まで入力するコンストラクタでインスタンスを定義。
		Day thirdDay = new Day(myYear,myMonth);
		// 日まで入力するコンストラクタでインスタンスを定義。
		Day fourthDay = new Day(myYear,myMonth,myDate);
		// コピーをつくるコンストラクタで日まで入力したものと同じインスタンスを定義。
		Day fourthCopy = new Day(fourthDay);
		
		// 改行をいれる。
		System.out.println();
		
		// firstDayの表示をする。年月日の初期値が全て0であることを示す。
		System.out.println("年月日全て受け取らないコンストラクタでインスタンス化したときの年月日の確認：" + firstDay.getYear() + "年" + firstDay.getMonth() + "月" + firstDay.getDate() + "日");
		// 改行をいれる。
		System.out.println();
		// secondDayの表示をする。月日の初期値が0であることを示す。
		System.out.println("月日は受け取らないコンストラクタでインスタンス化したときの年月日の確認：" + secondDay.getYear() + "年" + secondDay.getMonth() + "月" + secondDay.getDate() + "日");
		// 改行をいれる。
		System.out.println();
		// thirdDayの表示をする。日の初期値が0であることを示す。
		System.out.println("日のみうけとらないコンストラクタでインスタンス化したときの年月日の確認：" + thirdDay.getYear() + "年" + thirdDay.getMonth() + "月" + thirdDay.getDate() + "日");
		// 改行をいれる。
		System.out.println();
		// fourthDayの表示をする。年月日全てに入力した値が入っていることを確認する。
		System.out.println("年月日全て受け取るコンストラクタでインスタンス化したときの年月日の確認：" + fourthDay.getYear() + "年" + fourthDay.getMonth() + "月" + fourthDay.getDate() + "日");
		// 改行をいれる。
		System.out.println();
		// fourthCopyの表示をする。年月日全てに入力した値が入っていることを確認する。
		System.out.println("年月日全て受け取ったインスタンスを用いてコピーを取った年月日の確認：" + fourthCopy.getYear() + "年" + fourthCopy.getMonth() + "月" + fourthCopy.getDate() + "日");
		
		// 改行をいれる。
		System.out.println();
		
		// 値を入れられていない場合、後から代入を行う。
		// 入力なしでインスタンス化したfirstDayに年月日をまとめていれる。
		firstDay.set(myYear,myMonth,myDate);
		// 年のみでインスタンス化したsecondDayに月の代入をする
		secondDay.setMonth(myMonth);
		// 年のみでインスタンス化したsecondDayに日の代入をする。
		secondDay.setDate(myDate);
		// 年月でインスタンス化したsecondDayに日の代入をする。
		thirdDay.setDate(myDate);
		
		// 代入した後の値が正しいか確認することを示す表示。
		System.out.println("初期化で値を入れていない年月日に代入を行いました");
		// firstDayの表示をする。年月日の初期値が全て0であることを示す。
		System.out.println("年月日全て代入した年月日の確認：" + firstDay.getYear() + "年" + firstDay.getMonth() + "月" + firstDay.getDate() + "日");
		// 改行をいれる。
		System.out.println();
		// secondDayの表示をする。月日の初期値が0であることを示す。
		System.out.println("月日を代入した年月日の確認：" + secondDay.getYear() + "年" + secondDay.getMonth() + "月" + secondDay.getDate() + "日");
		// 改行をいれる。
		System.out.println();
		// thirdDayの表示をする。日の初期値が0であることを示す。
		System.out.println("日のみ代入した年月日の確認：" + thirdDay.getYear() + "年" + thirdDay.getMonth() + "月" + thirdDay.getDate() + "日");
		
		// 改行をいれる。
		System.out.println();
	}

}
