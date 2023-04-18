
// パッケージの宣言
package Ensyu6_14;

//乱数を用いるときにクラスの宣言の前に置く。
import java.util.Random;
//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu6_14
* 概要：演習6-14クラス
* 作成者：S.Saito
* 作成日：2023.04.18
*/
public class Ensyu6_14 {

	/*
	 * 関数名：main
	 * 概要：月を1～12の値で表示して、その月の英語表現を入力する。出題する月は乱数で決め、連続で同じ月は出ない。
	 *       また、学習者が望み限り何度でも繰り返せる。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 乱数を入力する際に、main内で入力操作を行うコードより前に置く
		Random randomNumber = new Random();
		
		// 表示された月を英語の名前で答えることを示すように表示する。
		System.out.println("英語での月名を入力してください。");
		// 文字の入力の仕方の表示をする。
		System.out.println("月名は先頭が大文字、二文字目以降は小文字で入力してください。");
		// 問で出す月を示す変数をつくる。
		int monthNumber = 0;
		// 前の問題の月を示す変数をつくる。
		int backNumber = -1;
		// 月名のString型の配列をつくる.
		String[] monthQuestion = new String[12];
		// 月名の配列の各要素に文字列をいれる。1月
		monthQuestion[0] = "January";
		// 月名の配列の各要素に文字列をいれる。2月
		monthQuestion[1] = "February";
		// 月名の配列の各要素に文字列をいれる。3月
		monthQuestion[2] = "March";
		// 月名の配列の各要素に文字列をいれる。4月
		monthQuestion[3] = "April";
		// 月名の配列の各要素に文字列をいれる。5月
		monthQuestion[4] = "May";
		// 月名の配列の各要素に文字列をいれる。6月
		monthQuestion[5] = "June";
		// 月名の配列の各要素に文字列をいれる。7月
		monthQuestion[6] = "July";
		// 月名の配列の各要素に文字列をいれる。8月
		monthQuestion[7] = "August";
		// 月名の配列の各要素に文字列をいれる。9月
		monthQuestion[8] = "September";
		// 月名の配列の各要素に文字列をいれる。10月
		monthQuestion[9] = "October";
		// 月名の配列の各要素に文字列をいれる。11月
		monthQuestion[10] = "November";
		// 月名の配列の各要素に文字列をいれる。12月
		monthQuestion[11] = "December";
		
		// ループ用の変数をつくる。
		int integerNumber = 0;
		// 繰り返したいだけ繰り返せるようにするループ
		do {
			// 前の問と違う月になるまでループする。
			do {
				// 問で出す月を示す変数に0～11のランダムな値を代入する。
				monthNumber = randomNumber.nextInt(12);
			// 前の問と一致した場合はループする。
			} while (monthNumber == backNumber);
			
			// 答えが配列内の文字列と一致するまで繰り返すループ。
			while (true) {
				// 問の月を表示する
				System.out.print(monthNumber + 1 + "月は：");
				// 文字列を入力する。
				String monthAnswer = standardInput.next();
				// 答えた文字列が正解と同じ文字列なら分岐する。
				if (monthQuestion[monthNumber].equals(monthAnswer)) {
					// 正解であることを表示する。
					System.out.println("正解です。");
					// ループから抜ける。
					break;
				}
				// 不正解の場合の表示。
				System.out.println("不正解です。");
			}
			
			// 前の問を示す変数に今回の問の値を入れる。
			backNumber = monthNumber;
			
			// 0か1を入力するまで繰り返すループ。
			do {
				// 繰り返すかどうか確認するように表示する。
				System.out.print("もう一度行いますか？　Yes…1 / No…0 ：");
				// 確認の入力をする。
				integerNumber = standardInput.nextInt();
			// 1か0以外が入力されたときにループする。
			} while (integerNumber > 1 || integerNumber < 0);
		// 繰り返すことを選んだ場合繰り返す。
		} while (integerNumber == 1);
	}

}