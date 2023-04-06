// パッケージの宣言
package ensyu3_2;

// 入力を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：ensyu3_2
 * 概要：演習3-2クラス
 * 作成者：S.Saito
 * 作成日：2023.04.06
 */
public class ensyu3_2 {
	
	/*
	 * 関数名：main
	 * 概要：二つの整数値を読み込み、二つ目の整数値が一つ目の整数値の約数かどうかを表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args){
		
		// キーボードでの入力の指定をする。mainの中で入力を行うコードより前に置く
		Scanner StandardInput = new Scanner(System.in);
		
		// 整数の入力をすることを示すように文字を表示する。
		System.out.print("整数a：");
		// int型の変数FirstNumberの初期値に一つ目の整数値を入力する。
		int FirstNumber = StandardInput.nextInt();
		// 整数の入力を再度行うことを示すように文字を表示する。
		System.out.print("整数b：");
		// int型の変数SecondNumberの初期値に二つ目の整数値を入力する。
		int SecondNumber = StandardInput.nextInt();
		
		
		// 一つ目の整数値に0が入力されていた場合の分岐。
		if (FirstNumber == 0)
			// 0が含まれているため約数の判別から外す旨を伝える。
			System.out.println("aに0が入力されています。約数は出せません。");
		// 二つ目の整数値に0が入力されている場合の分岐。
		else if (SecondNumber == 0)
			// 0が含まれているため約数の判別から外す旨を伝える。
			System.out.println("bに0が入力されています。約数は出せません。");
		// 一つ目の整数値を二つ目の整数値で割ったときの剰余が0である場合の分岐。
		else if (FirstNumber % SecondNumber == 0)
			// 二つ目の整数値が一つ目の整数値の約数であると回答する。
			System.out.println("bはaの約数です。");
		// それ以外出会った場合の分岐。
		else
			// 二つ目の整数値は一つ目の整数値の約数ではないと回答する。
			System.out.println("bはaの約数ではありません。");
		
	}

}
