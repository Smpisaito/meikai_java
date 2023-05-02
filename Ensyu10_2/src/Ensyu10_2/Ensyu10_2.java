// パッケージの宣言
package Ensyu10_2;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu10_2
 * 概要：演習10-2クラス
 * 作成者：S.Saito
 * 作成日：2023.05.02
 */
public class Ensyu10_2 {
	
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
	 * 関数名：main
	 * 概要：クラスExIdのインスタンスを複数個つくり識別番号を確認し、最後の識別番号を確認する。
	 *       その後、識別番号の増加値を変更してから再度インスタンスを複数個つくり識別番号を確認する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.02
	 */
	public static void main(String[] args){
	
		// クラスExIdのインスタンスを4個つくる。
		ExId[] instanceCheck = new ExId[] {
			// 一つ目のインスタンス
			new ExId(),
			// 二つ目のインスタンス
			new ExId(),
			// 三つ目のインスタンス
			new ExId(),
			// 四つ目のインスタンス
			new ExId(),
		};
		
		// 作ったインスタンスの数だけループする。
		for (int loopNumber = 0; loopNumber < instanceCheck.length; loopNumber++) {
			// 作ったインスタンスそれそれの識別番号を表示する。
			System.out.println(loopNumber + 1 + "個めのインスタンスの識別番号" + instanceCheck[loopNumber].getId());
		}
		
		// 改行する。
		System.out.println();
		
		// 最後の識別番号を表示し、ループの表示と一致することを確認する
		System.out.println("最後の識別番号は" + ExId.getMaxId());
		
		// 改行する。
		System.out.println();
		// 増加値を正の値で入力する。
		int newUp = inputPlus("変更する識別番号の増加値");
		// 増加値を変更する。
		ExId.setUpNumber(newUp);
		
		
		// クラスExIdのインスタンスを4個つくる。
		ExId[] instanceSecond = new ExId[] {
			// 一つ目のインスタンス
			new ExId(),
			// 二つ目のインスタンス
			new ExId(),
			// 三つ目のインスタンス
			new ExId(),
			// 四つ目のインスタンス
			new ExId(),
		};
		
		// 作ったインスタンスの数だけループする。
		for (int loopNumber = 0; loopNumber < instanceSecond.length; loopNumber++) {
			// 作ったインスタンスそれそれの識別番号を表示する。
			System.out.println(instanceCheck.length + loopNumber + 1 + "個めのインスタンスの識別番号" + instanceSecond[loopNumber].getId());
		}
		
		// 改行する。
		System.out.println();
		
		// 最後の識別番号を表示し、ループの表示と一致することを確認する
		System.out.println("最後の識別番号は" + ExId.getMaxId());
	}

}
