// パッケージの宣言
package ensyu3_15;

// 入力を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：ensyu3_15
 * 概要：演習3-15クラス
 * 作成者：S.Saito
 * 作成日：2023.04.07
 */
public class ensyu3_15 {
	
	/*
	 * 関数名：main
	 * 概要：二つの整数値を読み込んで、降順(大きい順)に並び変える。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args){
		
		// 入力をキーボードで行うことを示す。main内で入力を行うコードより前に置く。
		Scanner StandardInput = new Scanner(System.in);
		
		// 整数値の入力を促す。
		System.out.println("整数を入力してください。");
		// 一つ目の整数値の入力をすることを示す。
		System.out.print("変数a：");
		// 一つ目の整数値の入力を行う。
		int FirstInteger = StandardInput.nextInt();
		// 二つ目の整数値の入力をすることを示す。
		System.out.print("変数b：");
		// 二つ目の整数値の入力を行う。
		int SecondInteger = StandardInput.nextInt();
		
		// 一つ目の整数値が二つ目の整数値より小さい場合の分岐。
		if ( FirstInteger < SecondInteger ) {
			// 網掛け部の変数ブロックに一つ目の整数値を入れる。
			int NumberSort = FirstInteger;
			// 二つ目の整数値を一つ目の整数値を入れていた変数aに代入する。
			FirstInteger = SecondInteger;
			// 網掛け部の変数ブロックから一つ目の整数値を二つ目の整数値を入れていた変数bに代入する。
			SecondInteger = NumberSort;
		}
		
		// 変数aとbを整数値が降順(大きい順)に並び替えたことを示す。
		System.out.println("a≧bになるようにソートしました。");
		// 変数a(大きいほうの値)を表示する。
		System.out.println("変数aは" + FirstInteger + "です。");
		// 変数b(小さいほうの値)を表示する。
		System.out.println("変数aは" + SecondInteger + "です。");
		
	}

}
