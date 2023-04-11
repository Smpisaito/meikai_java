// パッケージの宣言
package Ensyu4_15;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu4_15
 * 概要：演習4-15クラス
 * 作成者：S.Saito
 * 作成日：2023.04.11
 */
public class Ensyu4_15 {
	
	/*
	 * 関数名：main
	 * 概要：身長と標準体重の対応表を表示するプログラムをつくる。このときの開始値、終了値、増分は読み込む。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 開始値の変数をつくる。
		double startNumber;
		// 終了値の変数をつくる。
		double endNumber;
		// 増分の変数値をつくる。
		double countNumber;
		// 表を作れる値ではない場合はループをかける
		do {
			// 開始値の入力をするように表示する。
			System.out.print("何㎝から：");
			// 開始値の入力を行う。
			startNumber = standardInput.nextDouble();
			// 終了値の入力をするように表示する。
			System.out.print("何㎝まで：");
			// 終了値の入力を行う。
			endNumber = standardInput.nextDouble();
			// 増分の入力をするように表示する。
			System.out.print("何㎝ごと：");
			// 増分の入力を求める。
			countNumber = standardInput.nextDouble();
		// 終了値より開始値のほうが高い場合と増分が0以下の場合にループする
		} while (startNumber > endNumber || countNumber <= 0);
		
		
		// 標準体重を入れる変数をつくる。
		double heightNumber;
		// 身長と標準体重の表の横軸をつくる。
		System.out.println("身長  標準体重");
		// 身長の開始値から終了値までの増分ごとの標準体重を出して表示するループをつくる。
		for ( double checkNumber = startNumber; checkNumber <= endNumber ; checkNumber += countNumber) {
			// 標準体重を身長をもとに計算する。
			heightNumber = (checkNumber - 100) * 0.9;
			// 身長と標準体重の値を表示する。
			System.out.println( checkNumber + "  " + heightNumber );
		}
		
	}

}
