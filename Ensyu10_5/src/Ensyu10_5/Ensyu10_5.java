// パッケージの宣言
package Ensyu10_5;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu10_5
* 概要：演習10-5クラス
* 作成者：S.Saito
* 作成日：2023.04.28
*/
public class Ensyu10_5 {
	
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
	 * 関数名：inputLongRange
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求め、特定範囲内でその値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 *       lowerNumber … 入力できる最小値。
	 *       higherNumber … 入力できる最大値。
	 * 戻り値：longNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static long inputLongRange(String outputWord,long lowerNumber,long higherNumber) {
		// 入力を行う変数をつくる。
		long longNumber = 0;
		// 最小値より大きい値が入力されるまで入力を続けるループ。
		do {
			// 整数値の入力を行う。
			longNumber = inputLong(outputWord);
			// 入力範囲の整数値ではないときに分岐する。
			if (longNumber < lowerNumber || longNumber > higherNumber) {
				// 正しい整数値を入力するように促す。
				System.out.println(lowerNumber + "以上"+ higherNumber +"の値を入力してください。");
			}
		// 入力した値が適さないならループする。
		} while( longNumber < lowerNumber || longNumber > higherNumber);
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
	 * 引数：outputWord … String型の表示に使う文字列
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
				break;
			// 4の倍数ではない、もしくは100の倍数の場合の分岐
			} else {
				// うるう年ではないため28日に設定する。
				lastDate = 28;
				// 戻り値を返す。
				break;
			}
			
		// 4月、6月、9月、11月の場合の分岐。
		case 4: case 6: case 9: case 11:
			// 30日に設定する。
			lastDate = 30;
			// 戻り値を返す。
			break;
			
		// 1月、3月、5月、7月、8月、10月、12月の場合。
		case 1: case 3: case 5: case 7: case 8:case 10: case 12:
			// 31日に設定する。
			lastDate = 31;
			// 戻り値を返す。
			break;
			
		// それ以外、月の値がおかしい場合の分岐
		default :
			// 戻り値を0のまま返す。
			break;
		}
		// 戻り値を返す。
		return lastDate;
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
	 * 関数名：selectMulti
	 * 概要：文字列で複数選択を求め、選択肢の中で入力された値を返す。最小の選択肢の値は0とする。
	 * 引数：outputWord … String型の選択肢の表示に使う文字列。
	 *       selectRange … 選べる値の最大値
	 * 戻り値：electNumber … 選択範囲内の選んだ値。
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */
	static int selectMulti (String outputWord,int selectRange) {
		// 選択肢を表示して選択肢内の値で入力をする。
		int selectNumber = inputRange(outputWord,0,selectRange);
		// 戻り値を返す
		return selectNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：銀行口座クラスのフィールドに入れる内容を入力し、インスタンス化したものの変更等を行う。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public static void main(String[] args){
		
		// 口座名義の入力
		String accountName = inputString("口座名義");
		// 口座番号の入力
		String accountNumber = inputString("口座番号");
		// 年の入力。1以上の入力に制限する。
		int accountYear = inputPlus("年");
		// 月の入力。入力は1月から12月までに制限する
		int accountMonth = inputRange("月", 1, 12);
		// 入力した年月の最終日の日付を求める。
		int lastDate = checkLastDate(accountYear,accountMonth);
		// 日の入力
		int accountDate = inputRange("日", 1, lastDate);
		// 口座の生成
		Account myAccount;
		// 口座に今すぐお金を入れるかの確認
		// 入れる場合の分岐。
		if (selectTwo ("開設する口座に預金をしますか？ する … 1 / しない … 0")) {
			// 預金する金額を入れる。
			long firstMoney = inputLongMore("預金額を入れてください。",0);
			// 0円であった場合の分岐
			if (firstMoney == 0) {
				// 預金せずに口座を開設することを示す。
				System.out.println("新設口座への預金は中止されました。預金が必要な場合は選択してください。");
			}
			// インスタンスを代入する形でつくる。
			myAccount = new Account(accountName,accountNumber,firstMoney,new DayClass(accountYear,accountMonth,accountDate));
		// 入れない場合の分岐。
		} else {
			// インスタンスを代入する形でつくる。口座残高は0になる。
			myAccount = new Account(accountName,accountNumber,new DayClass(accountYear,accountMonth,accountDate));
		}
		// 改行を入れる。
		System.out.println();
		
		// 作った口座の情報であることを示す。
		System.out.println("開設した口座の情報を表示します。");
		// toStringを用いて口座情報を表示する。
		System.out.println(myAccount.toString());
		// 改行を入れる。
		System.out.println();
		
		// ループ用のboolean型変数をtrueでつくる。
		boolean keepLoop = true;
		// 終了が選ばれるまで繰り返すループ
		while (keepLoop) {
			// 行う動作を決める
			int accountChoice = selectMulti ("現金を預ける … 1 / 現金を引き出す … 2 / 口座情報を修正する … 3 / 終了する … 0",3);
			// 選択肢に併せた挙動をする。
			switch (accountChoice) {
			// 現金を預ける選択をした場合の分岐。
			case 1:
				// 預金を行う。
				long inputMoney = inputLongMore("預金額を入れてください",0);
				// 預金額が0円だった場合の分岐。
				if (inputMoney == 0) {
					// 中止したことを示す。
					System.out.println("預金を中止しました。");
				} else {
					// 入金した分の預金額を増やす。
					myAccount.depositMoney (inputMoney);
					// 預金残高を表示する。
					System.out.println("預金残高：" + myAccount.getBalance ());
				}
				// 選択した動作の終了をする。
				break;
				
			// 現金を引き出す選択をした場合の分岐。
			case 2:
				// 預金残高を表示する。
				System.out.println("預金残高：" + myAccount.getBalance ());
				// 預金残高がないとき
				if ( myAccount.getBalance () == 0) {
					// 引き出せないことを示す。
					System.out.println("預金残高が0円です。引き出せません。");
					// 動作を終了する。
					break;
				}
				// 現金を引き出す
				long outputMoney = inputLongRange("引き出す金額",0,myAccount.getBalance ());
				// 引き出した分の預金額をお金を減らす
				myAccount.withdrawMoney (outputMoney);
				// 現金を引き出さなかった場合
				if (outputMoney == 0) {
					// 中止したことを示す。
					System.out.println("中止しました。");
					// 選択した動作の終了をする。
					break;
				}
				// 預金残高を表示する。
				System.out.println("預金残高：" + myAccount.getBalance ());
				// 選択した動作の終了をする。
				break;
				
			// 口座情報を修正する場合の分岐(ゲッターの確認を含む)
			case 3:
				// ループ用の変数をつくる。
				boolean changeLoop = true;
				// 終了をするまでループする
				while (changeLoop) {
					// 口座名義を表示する。
					System.out.println("口座名義：" + myAccount.getName ());
					// 口座番号を表示する。
					System.out.println("口座番号：" + myAccount.getNumber ());
					// 預金残高を表示する。
					System.out.println("預金残高：" + myAccount.getBalance ());
					// 口座開設日を表示する。
					System.out.println("口座開設日：" + myAccount.getDay ());
					// 改行を入れる。
					System.out.println();
					// 口座名義か口座番号のどちらを変更するか選択する。変更しない(0)も入れる。
					int choiceChange = selectMulti ("口座名義の変更 … 1 / 口座番号の変更 … 2 / 変更を終了する … 0",2);
					// 口座名義の変更を選んだ場合の分岐。
					if (choiceChange == 1) {
						// 変更する口座名義をつくる。
						String newName = inputString("新しい口座名義");
						// 口座名義を変える。
						myAccount.setName (newName);
					// 口座番号の変更を選んだ場合の分岐。
					} else if (choiceChange == 2) {
						// 変更する口座番号をつくる。
						String newNumber = inputString("新しい口座番号");
					// 変更をやめた場合
					} else {
						// ループ用の変数をfalseをいれる。
						changeLoop = false;
						// 変更をやめたことを表示する。
						System.out.println("変更を終了します。");
					}
				}
				// 選択した動作の終了をする。
				break;
			// 終了する場合の分岐。
			case 0:
				// ループを終える。
				keepLoop = false;
				// 選択した動作を終了する。
				break;
			}
			// 改行を入れる。
			System.out.println();
		}
		// 終了することを表示する。
		System.out.println("終了します。");
	}
	
}