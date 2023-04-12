// パッケージの宣言
package Ensyu4_26;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu4_26
 * 概要：演習4-26クラス
 * 作成者：S.Saito
 * 作成日：2023.04.12
 */
public class Ensyu4_26 {
	
	/*
	 * 関数名：main
	 * 概要：整数の個数を入力し、その後に入力した正の整数の合計と平均を求める。
	 *       入力した値が負の場合は合計にも平均にも含めない処理を行う。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.12
	 */
	public static void main(String[] args){

		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力した整数値の合計と平均を表示することを伝えるように表示する。
		System.out.println("整数値の合計と平均を表示します。");
		
		// 正の整数値を入れる変数をつくる
		int integerNumber = 0;
		// 入力した値に0以下が入った場合入力しなおすためのループ。
		do {
			// 入力する整数の数を入れることを示すように表示する。
			System.out.print("入力を行う整数値の数：");
			// 入力する整数の数を入力する
			integerNumber = standardInput.nextInt();
			// 整数値が0以下だった場合は分岐する。
			if (integerNumber <= 0) {
				// 再度入力を行うように促す。
				System.out.println("もう一度入力してください。");
			}
		// 入力した値が0以下の時にループする。
		} while ( integerNumber <= 0 );
		
		// 合計を入れる変数をつくる。
		int sumNumber = 0;
		// 実際に入力した値の数を入れる変数をつくる。
		int checkNumber = 0;
		
		// 整数値の入力を入力した整数値の個数の分までループして行う。
		for (int loopNumber = 1; loopNumber <= integerNumber; loopNumber++) {
			// 整数値を入力することと、0を入力したら即座に入力を終えることを示すように表示する。
			System.out.print("正の整数値：");
			// 整数値を入力する。
			int inputNumber = standardInput.nextInt();
			// 入力した値が0未満であったならば分岐する
			if ( inputNumber < 0) {
				// 負の整数値は受け入れないことを示すように表示する。
				System.out.println("負の整数は合計と平均に含みません。");
				// このループを終えて次のループに入る。
				continue;
			}
			// 合計の変数に入力した整数値を加算する。
			sumNumber += inputNumber;
			// 入力した整数値の数を示す変数checkNumberを1増やす。
			checkNumber++;
			
		}
		
		// 入力の時の表示と分けるために改行を入れる。
		System.out.println("");
		// 合計を表示する。
		System.out.println("合計：" + sumNumber );
		// 平均を表示する。
		System.out.println("平均：" + sumNumber/checkNumber );
	}

}
