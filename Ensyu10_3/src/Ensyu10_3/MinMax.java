// パッケージの宣言
package Ensyu10_3;

/*
 * クラス名：MinMax
 * 概要：二値や三値、配列の最小値や最大値を求めるメソッドを集めたユーティリティクラスを作成する。
 * 作成者：S.Saito
 * 作成日：2023.05.02
 */
public class MinMax {
	
	/*
	 * 関数名：checkLower
	 * 概要：二つの整数値の小さいほうを返す。
	 * 引数：firstNumber … 比べる整数値の一つ目
	 *       secondNumber … 比べる整数値の二つ目
	 * 戻り値：lowerNumber … 整数値の低いほうの値
	 * 作成者：S.Saito
	 * 作成日：2023.04.24
	 */
	static int checkLower(int firstNumber, int secondNumber) {
		// 戻り値を設定する。
		int lowerNumber = 0;
		// firstNumberの値のほうが低いときの分岐。
		if (firstNumber < secondNumber) {
			// 戻り値にfirstNumberの値を入れる。
			lowerNumber = firstNumber;
		// secondNumberの値のほうが低いか同値のときの分岐。
		} else {
			// 戻り値にsecondNumberの値を入れる。
			lowerNumber = secondNumber;
		}
		// 戻り値を返す。
		return lowerNumber;
	}
	
	/*
	 * 関数名：checkLower
	 * 概要：三つの整数値の小さいほうを返す。
	 * 引数：firstNumber … 比べる整数値の一つ目
	 *       secondNumber … 比べる整数値の二つ目
	 *       thirdNumber … 比べる整数値の三つ目
	 * 戻り値：lowerNumber … 整数値の一番低い値
	 * 作成者：S.Saito
	 * 作成日：2023.05.02
	 */
	static int checkLower(int firstNumber, int secondNumber, int thirdNumber) {
		// 戻り値に二つの値の小さいほうを初期値にする。
		int lowerNumber = checkLower(firstNumber,secondNumber);
		// 戻り値に入っている値と残った値を比べて小さいほうを戻り値に代入する。
		lowerNumber = checkLower(lowerNumber,thirdNumber);
		// 戻り値を返す。
		return lowerNumber;
	}
	
	/*
	 * 関数名：checkLower
	 * 概要：三つの整数値の小さいほうを返す。
	 * 引数：checkArray[] … 最小値を求めたい配列
	 * 戻り値：lowerNumber … 配列内の整数値の一番低い値
	 * 作成者：S.Saito
	 * 作成日：2023.05.02
	 */
	static int checkLower(int[] checkArray) {
		// 戻り値の初期値を配列のインデックス0の要素で設定する。
		int lowerNumber = checkArray[0];
		// 配列内全てを比較するループ。
		for (int loopNumber = 1; loopNumber < checkArray.length; loopNumber++) {
			// 戻り値の調べた中での配列の最小値とインデックスがloopNumberの要素の値を比べて、小さいほうを戻り値に返す。
			lowerNumber = checkLower(lowerNumber,checkArray[loopNumber]);
		}
		// 戻り値を返す。
		return lowerNumber;
	}
	
	
	/*
	 * 関数名：checkHigher
	 * 概要：二つの整数値の高いほうを返す。
	 * 引数：firstNumber … 比べる整数値の一つ目
	 *       secondNumber … 比べる整数値の二つ目
	 * 戻り値：higherNumber … 整数値の高いほうの値
	 * 作成者：S.Saito
	 * 作成日：2023.04.24
	 */
	static int checkHigher(int firstNumber, int secondNumber) {
		// 戻り値を設定する。
		int higherNumber = 0;
		// firstNumberの値のほうが高いときの分岐。
		if (firstNumber > secondNumber) {
			// 戻り値にfirstNumberの値を入れる。
			higherNumber = firstNumber;
		// secondNumberの値のほうが高いか同値のときの分岐。
		} else {
			// 戻り値にsecondNumberの値を入れる。
			higherNumber = secondNumber;
		}
		// 戻り値を返す。
		return higherNumber;
	}
	
	/*
	 * 関数名：checkHigher
	 * 概要：三つの整数値の大きいほうを返す。
	 * 引数：firstNumber … 比べる整数値の一つ目
	 *       secondNumber … 比べる整数値の二つ目
	 *       thirdNumber … 比べる整数値の三つ目
	 * 戻り値：higherNumber … 整数値の一番高い値
	 * 作成者：S.Saito
	 * 作成日：2023.05.02
	 */
	static int checkHigher(int firstNumber, int secondNumber, int thirdNumber) {
		// 戻り値に二つの値の小大きいほうを初期値にする。
		int higherNumber = checkHigher(firstNumber,secondNumber);
		// 戻り値に入っている値と残った値を比べて大きいほうを戻り値に代入する。
		higherNumber = checkHigher(higherNumber,thirdNumber);
		// 戻り値を返す。
		return higherNumber;
	}
	
	/*
	 * 関数名：checkHigher
	 * 概要：三つの整数値の大きいほうを返す。
	 * 引数：checkArray[] … 最小値を求めたい配列
	 * 戻り値：higherNumber … 配列内の整数値の一番高い値
	 * 作成者：S.Saito
	 * 作成日：2023.05.02
	 */
	static int checkHigher(int[] checkArray) {
		// 戻り値の初期値を配列のインデックス0の要素で設定する。
		int higherNumber = checkArray[0];
		// 配列内全てを比較するループ。
		for (int loopNumber = 1; loopNumber < checkArray.length; loopNumber++) {
			// 戻り値の調べた中での配列の最大値とインデックスがloopNumberの要素の値を比べて、大きいほうを戻り値に返す。
			higherNumber = checkHigher(higherNumber,checkArray[loopNumber]);
		}
		// 戻り値を返す。
		return higherNumber;
	}

}
