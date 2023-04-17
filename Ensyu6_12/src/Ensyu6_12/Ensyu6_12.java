// パッケージの宣言
package Ensyu6_12;

//乱数を用いるときにクラスの宣言の前に置く。
import java.util.Random;
//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu6_12
* 概要：演習6_12クラス
* 作成者：S.Saito
* 作成日：2023.04.17
*/
public class Ensyu6_12 {
	
	/*
	 * 関数名：main
	 * 概要：配列の要素の並びをランダムに入れ替える。
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
		
		// 要素数の入力に使う変数をつくる。
		int arrayElements = 0;
		// 要素数として正の整数値が入力されるまで入力を続けるループ。
		do {
			// 要素数を入力することを示す表示をする。
			System.out.print("要素数：");
			// 要素数を入力する。
			arrayElements = standardInput.nextInt();
			// 正の整数値ではない値が入力された場合の分岐
			if ( arrayElements <= 0) {
				// 正の整数値を入力するように促す。
				System.out.println("正の整数値を入力してください。");
			}
		// 要素数が0以下のときループする。
		}while (arrayElements <= 0);

		// 入力した要素数の配列をつくる。
		int[] arrayNumber = new int[arrayElements];
		// 入れ替え操作用の配列をつくる。
		int[] arrayShuffle = new int[arrayElements];
		// 入れ替えの補助で使う配列をつくる。
		int[] subArray = new int[arrayElements];
		
		// 配列arrayNumberと配列subArrayへの代入を行うループ。
		for (int loopNumber = 0; loopNumber < arrayElements; loopNumber++) {
			// 配列へ入力することを示すように表示する。。
			System.out.print("arrayNumber["+ loopNumber +"] = ");
			// 配列arrayNumberの各要素に入力を行う。
			arrayNumber[loopNumber] = standardInput.nextInt();
			// 配列subArrayの各要素に、その要素のインデックスの値をいれる。
			subArray[loopNumber] = loopNumber;
		}
		
		// 確認用の変数をつくる。初期値は-1とする。(インデックスに入ることのない0未満の統一した値)
		int checkNumber = -1;
		// 配列arrayShuffleに0以上要素数未満のランダムな値を全要素の値が異なるようにいれるループ。
		for (int loopNumber = 0; loopNumber < arrayElements; loopNumber++) {
			// ほかの乱数と同じ値なら代入しなおすループ。
			do {
				// 各要素に乱数で代入する。
				arrayShuffle[loopNumber] = randomNumber.nextInt(arrayElements) ;
			// すでに出た値の場合はループする。
			} while (subArray[arrayShuffle[loopNumber]] == checkNumber);
			// 代入された値に対応した配列subArrayの要素の値を-1にする。
			subArray[arrayShuffle[loopNumber]] = checkNumber;
		}
		
		// 配列arrayNumberの各要素を配列arrayShuffleの値をもとに移すループ。
		for (int loopNumber = 0; loopNumber < arrayElements; loopNumber++) {
			// 配列arrayShuffleの各要素の値から参照して、配列arrayNumberの値を配列arrayShuffle移す。
			arrayShuffle[loopNumber] = arrayNumber[arrayShuffle[loopNumber]];
		}
		// 配列arrayNumberにarrayShuffleの値を再度移すループ
		for (int loopNumber = 0; loopNumber < arrayElements; loopNumber++) {
			// 配列arrayNumberの各要素のインデックスと同じインデックスの配列arrayShuffleの要素の値を移す。
			arrayNumber[loopNumber] = arrayShuffle[loopNumber];
		}
		
		// シャッフル後のarrayNumberの要素の表示の前半部分
		System.out.print("arrayNumber[" + arrayElements + "] = {");
		// シャッフル後のarrayNumberの要素を最後を除いて順番に表示する。
		for (int loopNumber = 0; loopNumber < arrayElements - 1; loopNumber++) {
			// 配列arrayNumberの各要素の値と区切るためのコンマを表示する。
			System.out.print(arrayNumber[loopNumber] + ",");
		}
		// 配列arrayNumberの最後の要素の値と「 } 」を表示する
		System.out.println(arrayNumber[arrayElements - 1] + "}");
		
	}

}
