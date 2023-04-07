// パッケージの宣言
package ensyu3_9;

// 入力を行うときにクラスの宣言より前に置く。
import java.util.Scanner;

/*
 * クラス名：ensyu3_9
 * 概要：演習3-9クラス
 * 作成者：S.Saito
 * 作成日：2023.04.07
 */
public class ensyu3_9 {
	
	/*
	 * 関数名：main
	 * 概要：二つの実数値を読み込んで、大きいほうの値を表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		
		// キーボードでの入力を行うことを指定する。main内で入力するコードより前に置く。
		Scanner StandardInput = new Scanner(System.in);
		
		// 一つ目の実数値を入力することを示す。
		System.out.print("値a：");
		// 一つ目の実数値の入力を行う。
		double FirstNumber = StandardInput.nextDouble();
		
		// 二つ目の実数値の入力することを示す。
		System.out.print("値b：");
		// 二つ目の実数値の入力を行う。
		double SecondNumber = StandardInput.nextDouble();
		
		// 入力した実数値のうち大きいほうの値を代入する。
		double MaxNumber = FirstNumber > SecondNumber ? FirstNumber : SecondNumber;
		// 入力した実数値の大きいほうの値を示す。
		System.out.println("大きいほうの値は" + MaxNumber + "です。");
				
	}

}
