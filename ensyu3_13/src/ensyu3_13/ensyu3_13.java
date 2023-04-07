// パッケージの宣言
package ensyu3_13;

// 入力の操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：ensyu3_13
 * 概要：演習3-13クラス
 * 作成者：S.Saito
 * 作成日：2023.04.07
 */
public class ensyu3_13 {
	
	/*
	 * 関数名：main
	 * 概要：キーボードから読み込んだ三つの整数値の中央値を表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		
		// 入力をキーボードで行うように指定する。main内で入力するコードより前に置く。
		Scanner StandardInput = new Scanner(System.in);
		
		// 一つ目の整数値を入力することを示す。
		System.out.print("整数値a：");
		// 一つ目の整数値を入力する
		int FirstInteger = StandardInput.nextInt();
		// 二つ目の整数値を入力することを示す。
		System.out.print("整数値b：");
		// 二つ目の整数値を入力する
		int SecondInteger = StandardInput.nextInt();
		// 三つ目の整数値を入力することを示す。
		System.out.print("整数値c：");
		// 三つ目の整数値を入力する
		int ThirdInteger = StandardInput.nextInt();
		
		// 三つの整数値の中央値を示す変数をつくる。初期値として0を置く。
		int MedianNumber = 0;
		
		// 一つ目の整数値と二つ目の整数値を比べた時一つ目の方が大きい場合の分岐。
		if (FirstInteger > SecondInteger)
			// 三つ目の整数値が一つ目の整数値より大きい場合の分岐。
			if (ThirdInteger > FirstInteger)
				// 一つ目の整数値を中央値を示す変数に代入する。
				MedianNumber = FirstInteger;
			// 三つ目の整数値が二つ目の整数値より小さい場合の分岐。
			else if (ThirdInteger < SecondInteger)
				// 二つ目の整数値を中央値を示す変数に代入する。
				MedianNumber = SecondInteger;
			// 三つ目の整数値が一つ目の整数値以下二つ目の整数値以上の場合の分岐
			else
				//三つ目の整数値を中央値を示す変数に代入する。
				MedianNumber = ThirdInteger;
		// 
		else if (FirstInteger <= SecondInteger)
			// 三つ目の整数値が一つ目の整数値より小さい場合の分岐
			if (ThirdInteger < FirstInteger)
				// 一つ目の整数値を中央値を示す変数に代入する。
				MedianNumber = FirstInteger;
			// 三つ目の整数値が二つ目の整数値より大きい場合の分岐。
			else if (ThirdInteger > SecondInteger)
				// 二つ目の整数値を中央値を示す変数に代入する。
				MedianNumber = SecondInteger;
			// 三つ目の整数値が一つ目の整数値以上二つ目の整数値以下の場合の分岐
			else
				//三つ目の整数値を中央値を示す変数に代入する。
				MedianNumber = ThirdInteger;
		
		// 中央値がどれであるか表示する。
		System.out.println("中央値は" + MedianNumber + "です。");
		
		
	}

}
