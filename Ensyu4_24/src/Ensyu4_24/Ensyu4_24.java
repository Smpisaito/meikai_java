// パッケージの宣言
package Ensyu4_24;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu4_24
 * 概要：演習-24クラス
 * 作成者：S.Saito
 * 作成日：2023.04.12
 */
public class Ensyu4_24 {
	
	/*
	 * 関数名：main
	 * 概要：入力した正の整数値が素数であるかを判定する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.12
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 正の整数値を入れる変数をつくる
		int integerNumber = 0;
		// 入力した値に0以下が入った場合入力しなおすためのループ。
		do {
			// 正の整数値の入力を求めるように表示する。
			System.out.print("正の整数値：");
			// 整数値を入力する。
			integerNumber = standardInput.nextInt();
			// 整数値が0以下だった場合分岐する。
			if (integerNumber <= 0) {
				// 再度入力を行うように促す。
				System.out.println("もう一度入力してください。");
			}
		// 入力した値が0以下の時にループする。
		} while ( integerNumber <= 0 );
		
		// 素数かどうかを確認する変数checkNumberを初期値0でつくる。
		int checkNumber = 0;
		
		// 1は素数ではないので変数checkNumberを1に変える。
		if( integerNumber == 1 ) {
			// 素数ではないときに変数checkNumberの値を1にする
			checkNumber = 1;
		}
		
		// 1と入力した値以外の約数があるかどうかを調べるループをつくる。
		for (int divisorNumber = 2; divisorNumber < integerNumber; divisorNumber++) {
			// 約数があった場合の分岐。
			if (integerNumber % divisorNumber == 0) {
				// 素数ではないときに変数checkNumberの値を1にする。
				checkNumber = 1;
				// 素数ではないと判別出来たらループから抜ける。
				break;
			}
		}
		
		// 変数checkNumberが0か1かで判別する
		switch (checkNumber) {
		// 変数checkNumberが0の場合は、入力した値が素数であることを表示する。
		case 0: System.out.println("入力した値は素数です。"); break;
		// 変数checkNumberが1の場合は、入力した値が素数ではないことを表示する。
		case 1: System.out.println("入力した値は素数ではありません。"); break;
		}
	}

}
