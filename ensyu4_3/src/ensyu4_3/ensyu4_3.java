// パッケージの宣言
package ensyu4_3;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：ensyu4_3
* 概要：演習4-3クラス
* 作成者：S.Saito
* 作成日：2023.04.10
*/
public class ensyu4_3 {
	
	/*
	 * 関数名：main
	 * 概要：二つの整数値を入力し、小さいほうの値以上で大きいほうの値以下の全整数を昇順に表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：
	 */
	public static void main(String[] args){
	
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner StandardInput = new Scanner(System.in);
		
		
		
		// 一つ目の整数値の入力を行うことを示す
		System.out.print("整数A：");
		// 一つ目の整数値の入力を行う。
		int FirstNumber = StandardInput.nextInt();
		
		// 二つ目の整数値の入力を行うことを示す。
		System.out.print("整数B：");
		// 二つ目の整数値の入力を行う。
		int SecondNumber = StandardInput.nextInt();
		
		
		
		// 一つ目の整数値の方が大きい場合の分岐。
		if ( FirstNumber > SecondNumber ) {
			
			//　二つ目の整数値の値から1ずつ表示する値を大きくし、表示した値が一つ目の整数値と一致したときに終わるループをつくる。
			do {
				
				// 数字を表示する。数字の間がわかるように空白も入れる。
				System.out.print( SecondNumber + " ");
				// 表示した値に1を加える。
				SecondNumber++;
				
			// 二つ目の数字の変数はループ内ですでに1加えているので、一つ目の値を超えた時にループは解除する。
			} while ( SecondNumber <= FirstNumber );
			
		// 二つ目の整数値の方が大きい場合の分岐(二つの整数値が同じ場合も含む)。
		} else {
			
			// 一つ目の整数値の値から1ずつ表示する値を大きくし、表示した値が二つ目の整数値と一致したときに終わるループをつくる。
			do {
			
				// 数字を表示する。数字の間にはわかるように空白も入れる
				System.out.print( FirstNumber + " ");
				// 表示した値に1を加える。
				FirstNumber++;
			
				// 一つ目の数字の変数はループ内ですでに1加えているので、二つ目の値を超えた時にループは解除する。
			} while ( SecondNumber >= FirstNumber );
			
		}
	}
}
	
