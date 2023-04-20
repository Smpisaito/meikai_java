// パッケージの宣言
package Ensyu7_10;

//乱数を用いるときにクラスの宣言の前に置く。
import java.util.Random;
//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu7_10
 * 概要：演習7-10クラス
 * 作成者：S.Saito
 * 作成日：2023.04.20
 */
public class Ensyu7_10 {

	/*
	 * 関数名：confirmRetry
	 * 概要：再度行うか確認し、入力した値が1ならtrue、0ならfalseを返す。
	 * 引数：なし
	 * 戻り値： booleanRetry … trueかfalseとしてループの継続か否かを決める。
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static boolean confirmRetry() {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);

		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 1か0が入力されるまでループする。
		do {
			// もう一度行うかを確認する表示をする。
			System.out.print("もう一度行いますか？  Yes…1/No…0 ：");
			// 入力を行う。
			integerNumber = standardInput.nextInt();
		} while (integerNumber < 0 || integerNumber > 1);
		// 変数が1の時tureとなるboolean型の論理値booleanRetryをつくる。
		boolean booleanRetry = integerNumber == 1;

		//booleanRetryの結果trueかfalseを返す.
		return booleanRetry;
	}

	/*
	 * 関数名：randomInteger
	 * 概要：引数から下限値以上上限値未満の範囲内の乱数を返す。
	 * 引数：lowerLimit
	 *       upperLimit
	 * 戻り値：integerNumber
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static int randomInteger(int lowerLimit, int upperLimit) {
		// 乱数を入力する際に、関数内で入力操作を行うコードより前に置く
		Random randomNumber = new Random();

		// 乱数の範囲を求めた変数とつくる。
		int randomRange = upperLimit - lowerLimit;
		// 下限値以上上限値未満の範囲内の乱数を出す。
		int integerNumber = randomNumber.nextInt(randomRange) + lowerLimit;

		// 得た乱数を返す。
		return integerNumber;
	}
	
	/*
	 * 関数名：additionSubtraction
	 * 概要：配列の値を加減算する。
	 * 引数：integerNumber[]
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static void trainingMath(int[] integerNumber) {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 答えになる変数をつくる。初期値はintegerNumberのインデックス0の要素の値とする。
		int answerNumber = integerNumber[0];
		
		// 加算か減算かを示す配列をつくる
		int[] plusMinus = new int [integerNumber.length];
		// 加算か減算かをランダムに入れる。
		for (int loopNumber = 1;loopNumber < integerNumber.length; loopNumber++) {
			// +か－をランダムに決める。
			plusMinus[loopNumber] = randomInteger(0,2) * 2 - 1;
		}
		//  正解するまでループする
		while (true) {
			// 最初の要素を表示するループ。
			System.out.print(integerNumber[0]);
			// 要素全てを表示するループ。
			for (int loopNumber = 1;loopNumber < integerNumber.length; loopNumber++) {
				// 得た値によって分岐。
				switch (plusMinus[loopNumber]) {
				// 得た値が1の場合の分岐
				case 1:
					// 答えになる変数に値を加える。
					answerNumber += integerNumber[loopNumber];
					// 加算することを示す表示をする。
					System.out.print(" + "); break;
				// 得た値が-1の場合の分岐
				case -1:
					// 答えになる変数に値を減じる。
					answerNumber -= integerNumber[loopNumber];
					// 減産することを示す表示をする。
					System.out.print(" - "); break;
				// それ以外の値の場合の分岐
				default:
					// エラーであることを示す表示をする。
					System.out.println("error");
					// 想定外の挙動なので即座に返す。
					return;
				}
				// 値を表示する。
				System.out.print(integerNumber[loopNumber]);
			}
			// イコールの表示をする。
			System.out.print(" = ");
			// 答えの入力に用いる値を入れる
			int inputAnswer = 0;
			
			// 入力を行う
			inputAnswer = standardInput.nextInt();
			// 正解だった場合の分岐
			if(inputAnswer == answerNumber){
				// 正解だと告げる。
				System.out.println("正解です。");
				// ループを終える。
				break;
			}
			// 不正解であることを告げる。
			System.out.println("その値ではありません。");
			
			// 答えの値が変わらぬように初期値に戻す。
			answerNumber = integerNumber[0];
		}
	}

	/*
	 * 関数名：main
	 * 概要：三桁の値を三つ用いた加減の暗算を行いたい回数だけ行う。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	public static void main(String[] args) {
		// 行いたいだけループを行う。
		do {
			// 三つの整数値を用いることを示すfinal変数
			final int thirdFinal = 3;
			// 配列をつくる
			int[] integerNumber = new int[thirdFinal];
			// 乱数でほしい値の最大値より1多い値を示すfinal変数。
			final int upperLimit = 1000;
			// 乱数でほしい値の最小値を示すfinal変数。
			final int lowerLimit = 100;
			// 三つの3桁の乱数をつくる。
			for (int loopNumber = 0; loopNumber < thirdFinal; loopNumber++) {
				// それぞれの値に3桁の乱数を格納する。
				integerNumber[loopNumber] = randomInteger(lowerLimit, upperLimit);
			}
			// 配列の値の加減算をする。
			trainingMath(integerNumber);
		} while (confirmRetry());
	}
}
