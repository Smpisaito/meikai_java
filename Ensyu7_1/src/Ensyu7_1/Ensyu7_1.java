// パッケージの宣言
package Ensyu7_1;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu7_1
 * 概要：演習7-1クラス
 * 作成者：S.Saito
 * 作成日：2023.04.19
 */
public class Ensyu7_1 {
	
	/*
	 * 関数名：sign0f
	 * 概要：引数の値nが負であれば-1、0であれば0、正であれば1を返却する。関数名・引数名は指定のものを使う。
	 * 引数：n … 整数値。
	 * 戻り値：checkInteger … 引数nの値が正か負か0かに合わせて1か-1か0であらわされる。
	 * 作成者：S.Saito
	 * 作成日：2023.04.19
	 */
	static int sign0f (int n) {
		// 結果を示す変数をつくる。初期値を0とする。
		int checkInteger = 0;
		// 変数nが正の時の分岐
		if (n > 0) {
			// 変数checkIntegerを1にする。
			checkInteger = 1;
		// 変数nが負の場合の分岐。
		} else if (n < 0) {
			// 変数checkIntegerを-1にする。
			checkInteger = -1;
		} 
		// 変数checkIntegerの値を返す。
		return checkInteger;
	}
	
	/*
	 * 関数名：main
	 * 概要：受け取ったint型の値が負であれば-1、0であれば0、正であれば1を返却するメソッドのテストを行う。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.19
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値の入力を促す。
		System.out.print("整数値：");
		// int型の変数の入力を行う。
		int firstMethod = standardInput.nextInt();
		// 入力した値を実引数としてメソッドsign0fを呼び出す。
		int secondMethod = sign0f(firstMethod);
		
		// メソッドの結果で1が返された場合の分岐
		if (secondMethod == 1) {
			// メソッドの結果、正の値であると判別したことを確認する。
			System.out.println("正の値だと処理されました。");
		} else if (secondMethod == 0) {
			// メソッドの結果、0であると判別したことを確認する。
			System.out.println("0だと処理されました。");
		} else if (secondMethod == -1) {
			// メソッドの結果、負の値であると判別したことを確認する。
			System.out.println("負の値だと処理されました。");
		} else {
			// メソッドでは起こりえない値が検知できたことを示す。
			System.out.println("メソッドの処理に問題があります。");
		}
	}
}
