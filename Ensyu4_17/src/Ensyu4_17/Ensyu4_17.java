// パッケージの宣言
package Ensyu4_17;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu4_17
 * 概要：演習4-17クラス
 * 作成者：S.Saito
 * 作成日：2023.04.11
 */
public class Ensyu4_17 {
	
	/*
	 * 関数名：main
	 * 概要：入力した整数値の約数をすべて表示し、その後に約数の数を表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力に用いる変数をつくる。
		int integerNumber = 0;
		
		//正の整数値が入力されるまでループする。
		do {
			// 整数値を入力することを示すように表示する。
			System.out.print("正の整数値：");
			// 整数値を入力する。
			integerNumber = standardInput.nextInt();
		// 0以下の時ループする。
		} while ( integerNumber <= 0 );
		
		
		// 約数の数を数える変数countNumberをつくる。
		int countNumber = 0;
		// 1から入力した値まで調べるループをつくる。
		for ( int loopNumber = 1 ; loopNumber <= integerNumber ; loopNumber++ ) {
			// 約数が現れた時の分岐
			if ( integerNumber % loopNumber == 0 ) {
				// 約数を表示する。
				System.out.println(loopNumber);
				// 約数の数を示す変数countNumberを1増やす。
				countNumber++;
			}
		}
		// 入力した値が正であれば約数があることをもとに分岐をつくる。
		if ( countNumber > 0 ) {
			// 約数の数を変数countNumberを用いて表示する。
			System.out.println("約数の数：" + countNumber );
		}
		
	}

}
