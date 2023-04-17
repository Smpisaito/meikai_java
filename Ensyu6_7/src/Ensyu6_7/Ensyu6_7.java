// パッケージの宣言
package Ensyu6_7;

//乱数を用いるときにクラスの宣言の前に置く。
import java.util.Random;
//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu6_7
* 概要：演習6-7クラス
* 作成者：S.Saito
* 作成日：2023.04.17
*/
public class Ensyu6_7 {
	
	/*
	 * 関数名：main
	 * 概要：要素数12の配列にランダムで0～9を代入し、探索したい値を入力するとその値が配列のどこにあるか、
	 *       もしくはどこにもないかを答える。ただし、同じ値の要素が複数個あるときは末尾側の要素を見つける。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.17
	 */
	public static void main(String[] args){

		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);

		// 乱数を入力する際に、main内で入力操作を行うコードより前に置く
		Random randomNumber = new Random();
		
		// 配列の要素数を12とする。
		final int arrayElements = 12;
		// 要素数から配列をつくる。
		int[] arrayNumber = new int[arrayElements];
		// 配列a(表記)の各要素の値であることを示す表示をする。
		System.out.println("配列aの全要素の値");
		// 配列a(表記)の要素の表示の「 { 」を表示する。
		System.out.print("{");
		// 配列のすべての要素にランダムに値を入れるループ。
		for (int loopNumber= 0; loopNumber< arrayElements; loopNumber++) {
			// searchNumberがインデックスになる値にランダムに1～9の値を入れる。
			arrayNumber[loopNumber] = randomNumber.nextInt(10);
				// 変数aの代入された要素の値を表示する。
			System.out.print(arrayNumber[loopNumber] + " ");
		}
		// 配列a(表記)の要素の表示を終えたら「 } 」を置いて改行する。
		System.out.println("}");
		// 探索したい値の入力に使う変数をつくる。
		int searchNumber = 0;
		// 0～9が入力されるまで入力を続けるループ。
		do {
			// 0～9から探索したい値を入力するように表示する。
			System.out.print("探す値：");
			// 0～9を入力する。
			searchNumber = standardInput.nextInt();
			// 0～9ではない値が入力された場合の分岐
			if ( searchNumber < 0 || searchNumber > 9) {
			// 0～9の値を入力するように表示する。
				System.out.println("0～9の値で入力してください。");
			}
		// 0～9ではないならループする。
		} while( searchNumber < 0 || searchNumber > 9);
		
		// インデックスを示す変数をつくる。
		int indexNumber= 0;
		// 末尾から探索を行うループ。
		for (indexNumber = 11; indexNumber >= 0; indexNumber--) {
			// searchNumberをインデックスとする配列の値が入力した値と一致したときの分岐。
			if (arrayNumber[indexNumber] == searchNumber) {
				// ループの強制終了を行う。
				break;
			}
		}
		// 探索で値を見つけた時の分岐。
		if (indexNumber >= 0) {
			// 入力した探索したい値と同じ値の一番末尾の要素を示す表示をする。
			System.out.println(searchNumber + "はa[" + indexNumber + "]にあります。");
		// 探索で値が見つからなかったときの分岐
		} else {
			// 探索で見つからなかったことを示すように表示する。
			System.out.println(searchNumber + "は見つかりませんでした。");
		}
	}
}
