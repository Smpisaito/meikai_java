// パッケージの宣言
package Ensyu15_2;

//入力操作の呼び出し
import java.util.Scanner;

/**
 * クラス名：Ensyu15_2
 * 概要：演習15-2クラス
 * 作成者：S.Saito
 * 作成日：2023.05.12
 * @author S.Saito
 *
 */
public class Ensyu15_2 {
	
	/**
	 * 関数名：inputStringLine<Br>
	 * 概要：文字列の入力を求め、その文字列を返却する。<Br>
	 * 引数：なし<Br>
	 * 戻り値：useString … 文字列として返却する。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.04.28
	 * @return useString … 文字列として返却する
	 */
	static String inputStringLine() {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 文字列の入力を行う。
		String useString = standardInput.nextLine();
		// 入力した文字列を返す。
		return useString;
	}
	
	/**
	 * 関数名：inputStringLine<Br>
	 * 概要：「(引数の文字)：」と表示し、文字列の入力を求め、その文字列を返却する。<Br>
	 * 引数：outputWord … 表示する文字列<Br>
	 * 戻り値：useString … 文字列として返却する。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.04.28
	 * @param outputWord … 表示する文字列
	 * @return useString … 文字列として返却する。
	 */
	static String inputStringLine(String outputWord) {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 文字列の入力を行う。
		String useString = standardInput.nextLine();
		// 入力した文字列を返す。
		return useString;
	}
	
	/**
	 * 関数名：main<Br>
	 * 概要：入力した文字列の全文字の文字コードを表示する。<Br>
	 * 引数：args … コマンドライン引数<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.12
	 * @param args … コマンドライン引数
	 */
	public static void main(String[] args){
		// 文字列を逆順に表示する旨を伝えて入力を求める。
		String reverseString = inputStringLine("入力した文字列の全文字の文字コードを表示します。");
		
		// 文字列の全ての文字で行うためのループ
		for (int loopNumber = 0; loopNumber < reverseString.length() ; loopNumber++) {
			// その文字のコードポイントを表示する。
			System.out.println("「" + reverseString.charAt(loopNumber) + "」の文字コード：" + reverseString.codePointAt(loopNumber));
		}
	}

}
