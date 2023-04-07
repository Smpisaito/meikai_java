// パッケージの宣言
package ensyu3_12;

// 入力を行う際にクラスの宣言前に置く。
import java.util.Scanner;

/*
 * クラス名：enayu3_12
 * 概要：演習3-12クラス
 * 作成者：S.Saito
 * 作成日：2023.04.07
 */
public class ensyu3_12 {
	
	/*
	 * 関数名：main
	 * 概要：入力した三つの整数値の最小値を求めて表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		
		// 入力を行うときにキーボードを使うことを指定する。main内で入力操作を行うコードより前に置く。
		Scanner StandardInput = new Scanner(System.in);
		
		// 一つ目の整数値の入力を求めるように出す。
		System.out.print("整数値a：");
		// 一つ目の整数値の入力を行う。
		int FirstInteger = StandardInput.nextInt();
		// 二つ目の整数値の入力を求めるように示す。
		System.out.print("整数値b：");
		// 二つ目の整数値の入力を行う。
		int SecondInteger = StandardInput.nextInt();
		// 三つ目の整数値の入力を求めるように示す。
		System.out.print("整数値c：");
		// 三つ目の整数値の入力を行う。
		int ThirdInteger = StandardInput.nextInt();
		
		// 最小値を示す変数に一つ目の変数を入れる。
		int MinimumNumber = FirstInteger;
		// 最小値と二つ目の変数を比べ、二つ目の変数のほうが小さかったら分岐する。
		if (MinimumNumber > SecondInteger)
			// 最小値を示す変数に二つ目の変数を代入する。
			MinimumNumber =  SecondInteger ;
		// 最小値と三つ目の変数を比べ、三つ目の変数のほうが小さかったら分岐する。
		if (MinimumNumber > ThirdInteger)
			// 最小値を示す変数に三つ目の変数を代入する。
			MinimumNumber = ThirdInteger ;
		// 最小値が入力した三つのうちどれなのかを示す。
		System.out.println("最小値は" + MinimumNumber + "です。");
		
	}

}
