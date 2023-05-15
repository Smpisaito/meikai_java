// パッケージの宣言
package Ensyu15_7;

/**
 * クラス名：Ensyu15_7<Br>
 * 概要：演習15-7クラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.15
 * @author S.Saito
 *
 */
public class Ensyu15_7 {
	
	/**
	 * 関数名：main<Br>
	 * 概要：[明解Java List15-15]のfor文を拡張for文で実現したプログラム<Br>
	 * 引数：args … コマンドライン引数<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.15
	 * @param args … コマンドライン引数
	 */
	public static void main(String[] args){
		
		// 合計を示す変数を作る。
		double sumNumber = 0.0;
		// 拡張forでループをつくる。
		for (String loopString : args) {
			// 文字列の値をdouble型の数値に戻して合計に入れる。
			sumNumber += Double.parseDouble(loopString);
		}
		// 合計を示す表示をする。
		System.out.println("合計は" + sumNumber + "です。");
	}

}
