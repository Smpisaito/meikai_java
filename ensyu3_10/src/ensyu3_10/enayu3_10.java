// パッケージの宣言
package ensyu3_10;

// 入力操作を行うときにクラス宣言より前に置く。
import java.util.Scanner;

/*
 * クラス名：ensyu3_10
 * 概要：演習3-10クラス
 * 作成者：S.Saito
 * 作成日：2023.04.07
 */
public class enayu3_10 {
	
	/*
	 * 関数名：main
	 * 概要：二つの整数値を読み込み、その二つの値の差を求める。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		
		// キーボードでの入力を行うことを指定する。main内で入力するコードより前に置く。
				Scanner StandardInput = new Scanner(System.in);
				
				// 一つ目の整数値を入力することを示す。
				System.out.print("値a：");
				// 一つ目の整数値の入力を行う。
				int FirstNumber = StandardInput.nextInt();
				
				// 二つ目の整数値の入力することを示す。
				System.out.print("値b：");
				// 二つ目の整数値の入力を行う。
				int SecondNumber = StandardInput.nextInt();
				
				// 入力した整数値のうち大きいほうの整数値から小さいほうの整数値を引いた値を代入する。
				int DifferenceNumber = FirstNumber > SecondNumber ? FirstNumber - SecondNumber : SecondNumber - FirstNumber ;
				// 入力した実数値の大きいほうの値を示す。
				System.out.println("二つの値の差は" + DifferenceNumber + "です。");
		
	}
	

}
