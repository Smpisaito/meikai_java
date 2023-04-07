// パッケージ宣言
package ensyu3_11;

// 入力操作を用いるときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：ensyu3_11
 * 概要：演習3-11クラス
 * 作成者：S.Saito
 * 作成日：2023.04.07
 */
public class ensyu3_11 {
	
	/*
	 * 関数名：main
	 * 概要：二つの整数値を入力し、その二つの値の差が10以下か11以上かを示す。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		
		// 入力をキーボードで行うよう指定する。main内で入力を行うコードより前に置く。
		Scanner StandardInput = new Scanner(System.in);
		
		// 一つ目の整数値を入力することを示す。
		System.out.print("整数値a：");
		// 一つ目の整数値を入力する。
		int FirstInteger = StandardInput.nextInt();
		
		// 二つ目の整数値を入力することを示す。
		System.out.print("整数値b：");
		// 二つ目の整数値を入力する。
		int SecondInteger = StandardInput.nextInt();
		
		// 二つの整数値の差を求める。
		int IntegersDifference = FirstInteger > SecondInteger ? FirstInteger - SecondInteger : SecondInteger - FirstInteger ;
		// 二つの整数値の差が10以下か11以上かを判別して文字列を打ち込む。
		String DifferenceText = IntegersDifference > 10 ? "11以上" : "10以下" ;
		// 二つの整数値の差が10以下か11以上かを文字として示す。
		System.out.println("それらの差は" + DifferenceText +"です。");
		
	}

}
