// パッケージの宣言
package ensyu3_16;

//入力を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：ensyu3_16
* 概要：演習3-16クラス
* 作成者：S.Saito
* 作成日：2023.04.07
*/
public class ensyu3_16 {
	
	/*
	 * 関数名：main
	 * 概要：三つの整数値を読み込んで、昇順(小さい順)に並び変える。
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
		// 三つ目の整数値の入力をすることを示す。
		System.out.print("変数c：");
		// 三つ目の整数値の入力を行う。
		int ThirdInteger = StandardInput.nextInt();
		
		// 変数aが変数cより大きい場合の分岐
		if ( FirstInteger > ThirdInteger ) {
			// 網掛け部の変数ブロックに変数aの値を入れる。
			int NumberSort = FirstInteger;
			// 変数cの値を変数aに代入する。
			FirstInteger = ThirdInteger;
			// 網掛け部の変数ブロックに入れた値を変数cに代入する。
			ThirdInteger = NumberSort;
		}
			
		// 変数aが変数bより大きい場合の分岐。
		if ( FirstInteger > SecondInteger ) {
			// 網掛け部の変数ブロックに変数aの値を入れる。
			int NumberSort = FirstInteger;
			// 二つ目の整数値を一つ目の整数値を入れていた変数aに代入する。
			FirstInteger = SecondInteger;
			// 網掛け部の変数ブロックに入れた値を変数bに代入する。
			SecondInteger = NumberSort;
		}
		
		// 変数bが変数cより大きい場合の分岐
		if ( SecondInteger > ThirdInteger ) {
			// 網掛け部の変数ブロックに変数aの値を入れる。
			int NumberSort = SecondInteger;
			// 変数cの値を変数aに代入する。
			SecondInteger = ThirdInteger;
			// 網掛け部の変数ブロックに入れた値を変数cに代入する。
			ThirdInteger = NumberSort;
		}
		
		// 変数aとbとcを整数値が昇順(小さい順)に並び替えたことを示す。
		System.out.println("a≧bになるようにソートしました。");
		// 変数a(一番小さい値)を表示する。
		System.out.println("変数aは" + FirstInteger + "です。");
		// 変数b(中央値)を表示する。
		System.out.println("変数bは" + SecondInteger + "です。");
		// 変数c(一番大きい値)を表示する。
		System.out.println("変数cは" + ThirdInteger + "です。");
		
	}

}

