// パッケージの宣言
package Ensyu6_15;

//乱数を用いるときにクラスの宣言の前に置く。
import java.util.Random;
//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu6_15
* 概要：演習6-15クラス
* 作成者：S.Saito
* 作成日：2023.04.18
*/
public class Ensyu6_15 {
	
	/*
	 * 関数名：main
	 * 概要：曜日を表示し、その曜日の英語表現を入力する学習プログラム。出題する曜日はランダムかつ連続して出題されない。
	 *       また、学習者が好きなだけ繰り返すことができる。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.18
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);

		// 乱数を入力する際に、main内で入力操作を行うコードより前に置く
		Random randomNumber = new Random();
		
		// 問で出す曜日を示す変数をつくる。
		int weekNumber = 0;
		// 前の問の曜日を示す変数をつくる。初期値は0未満か8以上の値であればいい。
		int backNumber = -1;
		// 曜日の値として7を代入した変数をつくる。
		final int randomInteger = 7;
		// 日本語の曜日名を入れる配列をつくる。
		String[] weekJapanese = new String[randomInteger];
		// 曜日の英語表現を入れる配列をつくる。
		String[] weekQuestion = new String[randomInteger];
		
		
		// 日曜日の日本語表現を代入する
		weekJapanese[0] = "日曜日";
		// 月曜日の日本語表現を代入する
		weekJapanese[1] = "月曜日";
		// 火曜日の日本語表現を代入する
		weekJapanese[2] = "火曜日";
		// 水曜日の日本語表現を代入する
		weekJapanese[3] = "水曜日";
		// 木曜日の日本語表現を代入する
		weekJapanese[4] = "木曜日";
		// 金曜日の日本語表現を代入する
		weekJapanese[5] = "金曜日";
		// 土曜日の日本語表現を代入する
		weekJapanese[6] = "土曜日";
		
		// 日曜日の英語表現を代入する。
		weekQuestion[0] = "sunday";
		// 月曜日の英語表現を代入する。
		weekQuestion[1] = "monday";
		// 火曜日の英語表現を代入する。
		weekQuestion[2] = "tuesday";
		// 水曜日の英語表現を代入する。
		weekQuestion[3] = "wednesday";
		// 木曜日の英語表現を代入する。
		weekQuestion[4] = "thursday";
		// 金曜日の英語表現を代入する。
		weekQuestion[5] = "friday";
		// 土曜日の英語表現を代入する。
		weekQuestion[6] = "saturday";
		
		// ループ用の変数をつくる。
		int integerNumber = 0;
		// 繰り返したいだけ繰り返せるようにするループ
		do {
			// 前の問と違う曜日になるまでループする。
			do {
				// 問で出す曜日を示す変数に0～6のランダムな値を代入する。
				weekNumber = randomNumber.nextInt(randomInteger);
			// 前の問と一致した場合はループする。
			} while (weekNumber == backNumber);
			
			// 答えが配列内の文字列と一致するまで繰り返すループ。
			while (true) {
				// 問の曜日を表示する
				System.out.print(weekJapanese[weekNumber] + "は：");
				// 文字列を入力する。
				String weekAnswer = standardInput.next();
				// 答えた文字列が正解と同じ文字列なら分岐する。
				if (weekQuestion[weekNumber].equals(weekAnswer)) {
					// 正解であることを表示する。
					System.out.println("正解です。");
					// ループから抜ける。
					break;
				}
				// 不正解の場合の表示。
				System.out.println("不正解です。");
			}
			
			// 前の問を示す変数に今回の問の値を入れる。
			backNumber = weekNumber;
			
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
