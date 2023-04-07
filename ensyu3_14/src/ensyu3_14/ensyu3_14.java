// パッケージの宣言
package ensyu3_14;

//　入力の操作をするときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：ensyu3_14
 * 概要：演習3-14クラス
 * 作成者：S.Saito
 * 作成日：2023.04.07
 */
public class ensyu3_14 {
	
	/*
	 * 関数名：main
	 * 概要：二つの整数値を読み込んで、小さいほうの値と大きい方の値の両方を表示する。
	 *       二つの整数値が等しい場合はそのことも表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		
		// 入力をキーボードで行うことを指定する。main内で入力操作するコードより前に置く。
		Scanner StandardInput = new Scanner(System.in);
		
		// 一つ目の整数を入力することを示す
		System.out.print("整数a：");
		// 一つ目の整数値を入力する。
		int FirstInteger = StandardInput.nextInt();
		// 二つ目の整数値を入力することを示す。
		System.out.print("整数b：");
		// 二つ目の整数値を入力する。
		int SecondInteger = StandardInput.nextInt();
		
		// 最小値と最大値を示す変数をつくる。
		int MinimumNumber, MaximumNumber;
		
		// 一つ目の整数値が二つ目の整数値より大きい場合の分岐。
		if (FirstInteger > SecondInteger) {
			// 最小値を示す変数に二つ目の整数値を入れる。
			MinimumNumber = SecondInteger ;
			// 最大値を示す変数に一つ目の整数値を入れる。
			MaximumNumber = FirstInteger ;
			// 最小値の値を示す。
			System.out.println("小さいほうの値は" + MinimumNumber + "です。");
			// 最大値の値を示す。
			System.out.println("大きいほうの値は" + MaximumNumber + "です。");
		// 一つ目の整数値が二つ目の整数値より小さい場合の分岐。
		} else if (FirstInteger < SecondInteger) {
			// 最小値を示す変数に一つ目の整数値を入れる。
			MinimumNumber = FirstInteger ;
			// 最大値を示す変数に二つ目の整数値を入れる。
			MaximumNumber = SecondInteger ;
			// 最小値の値を示す。
			System.out.println("小さいほうの値は" + MinimumNumber + "です。");
			// 最大値の値を示す。
			System.out.println("大きいほうの値は" + MaximumNumber + "です。");
		// それ以外、二つの整数値が等しかった場合の分岐
		} else {
			// 二つの値が等しいことを示す。
			System.out.println("二つの値は同じです。");
		}
		
	}

}
