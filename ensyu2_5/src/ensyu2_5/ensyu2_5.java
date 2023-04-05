// パッケージの宣言
package ensyu2_5;

// 入力を行う際にクラスの前に書く。
import java.util.Scanner;

/*
 * クラス名：ensyu2_5
 * 概要：演習2-5クラス
 * 作成者：S.Saito
 * 作成日：2023.04.05
 */
public class ensyu2_5 {
	
	/*
	 * 関数名：main
	 * 概要：二つの実数値の入力を行い、二つの値の合計と平均をそれぞれ示す。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.05
	 */
	public static void main(String[] args) {
		
		// 入力をキーボードを用いて行うことを示す。mainの最初に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// xの値として実数値の入力を行うように示す。
		System.out.print("xの値：");
		// xの値としてFirstNumber関数の初期値の入力を行う。
		double FirstNumber = standardInput.nextDouble();
		// yの値として実数値の入力を行うように示す。
		System.out.print("yの値：");
		// yの値としてSecondNumber関数の初期値の入力を行う。
		double SecondNumber = standardInput.nextDouble();
		
		// 入力した二つの値の合計を示す
		System.out.println("合計は" + (FirstNumber+SecondNumber) + "です。");
		// 入力した二つの値の平均を示す。
		System.out.println("平均は" + (FirstNumber+SecondNumber) / 2 + "です。");
		
	}

}
