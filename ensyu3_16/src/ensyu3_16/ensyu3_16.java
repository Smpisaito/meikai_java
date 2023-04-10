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
		
		// 並び替え用の変数NumberSortを用意する。
		int NumberSort;
		
		// 変数FirstIntegerが変数ThirdIntegerより大きい場合の分岐( FirstInteger ⇔ SecondInteger )。
		if ( FirstInteger > ThirdInteger ) {
			// 並び替え用の変数NumberSortに変数FirstIntegerの値を移しておく。
			NumberSort = FirstInteger;
			// 変数ThirdIntegerの値を変数FirstIntegerに代入する。
			FirstInteger = ThirdInteger;
			// 並び替え用の変数NumberSortに移しておいたFirstIntegerの値を変数ThirdIntegerに代入する。
			ThirdInteger = NumberSort;
		}
			
		// 変数FirstIntegerが変数SecondIntegerより大きい場合の分岐( FirstInteger ⇔ ThirdInteger )。
		if ( FirstInteger > SecondInteger ) {
			// 並び替え用の変数NumberSortに変数FirstIntegerの値を移す。
			NumberSort = FirstInteger;
			// 変数SecondIntegerの値を変数FirstIntegerに代入する。
			FirstInteger = SecondInteger;
			// 並び替え用の変数NumberSortに移しておいたFirstIntegerの値を変数SecondIntegerに代入する。
			SecondInteger = NumberSort;
		}
		
		// 変数SecondIntegerが変数ThirdIntegerより大きい場合の分岐( SecondInteger ⇔ ThirdInteger )。
		if ( SecondInteger > ThirdInteger ) {
			// 並び替え用の変数NumberSortに変数SecondIntegerの値を移す
			NumberSort = SecondInteger;
			// 変数ThirdIntegerの値を変数SecondIntegerに代入する。
			SecondInteger = ThirdInteger;
			// 並び替え用の変数NumberSortに移しておいたSecondIntegerの値を変数ThirdIntegerに代入する。
			ThirdInteger = NumberSort;
		}
		
		// 入力した三つの整数値を昇順(小さい順)に並び替えたことを示す。
		System.out.println(" a ≦ b ≦ c　になるようにソートしました。");
		// 変数FirstInteger(一番小さい値)を表示する。
		System.out.println("変数aは" + FirstInteger + "です。");
		// 変数SecondInteger(中央値)を表示する。
		System.out.println("変数bは" + SecondInteger + "です。");
		// 変数ThirdInteger(一番大きい値)を表示する。
		System.out.println("変数cは" + ThirdInteger + "です。");
		
	}

}

