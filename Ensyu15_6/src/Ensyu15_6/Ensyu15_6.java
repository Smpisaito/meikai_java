// パッケージの宣言
package Ensyu15_6;

// 円周率Math.PIを静的インポートする
import static java.lang.Math.*;

/**
 * クラス名：Ensyu15_6<Br>
 * 概要：演習15-6クラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.15
 * @author S.Saito
 *
 */
public class Ensyu15_6 {

	/**
	 * 関数名：main<Br>
	 * 概要：コマンドライン引数で与えられた半径を持つ円の円周の長さと面積を求めて表示する。<Br>
	 * 引数：args … コマンドライン引数<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.15
	 * @param args … コマンドライン引数
	 */
	public static void main(String[] args){
		
		// コマンドライン引数の配列の要素数の数だけループする
		for (int loopNumber = 0; loopNumber < args.length; loopNumber++) {
			// コマンドライン引数の数字の文字列からdouble型の値に変換する。
			double argsNumber = Double.parseDouble(args[loopNumber]);
			// 円周を求める
			double circumferenceNumber = 2 * argsNumber * PI;
			// 面積を求める
			double circleArea = argsNumber * argsNumber * PI;
			// 文字列を表示する
			System.out.printf("args[%d] = %.2f (円周：%4.2f, 面積：%4.2f\n", loopNumber, argsNumber, circumferenceNumber, circleArea);
		}
	}
}
