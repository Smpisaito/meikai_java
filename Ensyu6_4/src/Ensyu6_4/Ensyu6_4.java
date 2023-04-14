// パッケージの宣言
package Ensyu6_4;

//乱数を用いるときにクラスの宣言の前に置く。
import java.util.Random;
//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu6_4
 * 概要：演習6-4クラス
 * 作成者：S.Saito
 * 作成日：2023.04.14
 */
public class Ensyu6_4 {
	
	/*
	 * 関数名：main
	 * 概要：int型の配列の要素数を入力し、その配列の全要素に1～10でランダムな値をいれ、
	 *       全要素を縦向きの棒グラフにする。最下段にはインデックスの1の位を表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.14
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);

		// 乱数を入力する際に、main内で入力操作を行うコードより前に置く
		Random randomNumber = new Random();
		
		// 要素数を入力することを示す表示をする。
		System.out.print("要素数：");
		// 要素数を入力する
		int arrayElements = standardInput.nextInt();
		// 要素数をもとにint型の配列をつくる。
		int[] arrayNumber = new int[arrayElements];
		
		// 配列の全要素に1～10のランダムな値を入れるループ。
		for (int loopNumber = 0; loopNumber < arrayElements; loopNumber++) {
			arrayNumber[loopNumber] = randomNumber.nextInt(10) + 1;
		}
		// 配列の各要素の値を参照して「 (空白)」か「*(アステリスク)」を入れる縦軸分の10回のループをつくる。
		for (int loopNumber = 10; loopNumber > 0; loopNumber-- ) {
			//　縦軸ごとに配列の要素をすべて確認するループ。
			for (int searchNumber = 0; searchNumber < arrayElements; searchNumber++) {
				// 参照している配列の要素の棒グラフが縦軸まで届く場合
				if (arrayNumber[searchNumber] >= loopNumber) {
					// 棒グラフとしてアステリスクをいれる。
					System.out.print('*');
				// 参照している配列の棒グラフが縦軸まで届かない場合。
				} else {
					// 棒グラフではないとして空白を入れる。
					System.out.print(" ");
				}
				// グラフごとの間隔として空白をいれる。
				System.out.print(" ");
			}
		// 縦軸ごとに参照が終わったら次の縦軸に変えるために改行を入れる。
		System.out.println();
		}
		// 要素数と同じ数の2倍より1少ない数(棒グラフと棒グラフの間も含んでいる)だけ下の表示と分ける横線を入れるループ。
		for (int loopNumber = 0; loopNumber < arrayElements * 2 - 1; loopNumber++) {
			System.out.print("-");
		}
		// 改行する。
		System.out.println();
		// 各要素のインデックスの値の1の位を出力したグラフに合うように表示するループ。
		for (int loopNumber = 0; loopNumber < arrayElements; loopNumber++) {
			// loopNumberの10で割った剰余とグラフごとの間の空白を表示する。
			System.out.print(loopNumber % 10 + " ");
		}
		
	}



}
