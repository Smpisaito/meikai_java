// パッケージの宣言
package Ensyu8_1;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu8_1
 * 概要：演習8-1クラス
 * 作成者：S.Saito
 * 作成日：2023.04.26
 */
public class Ensyu8_1 {
	
	/*
	 * 関数名：main
	 * 概要：入力によって人間クラスのインスタンス化を行い、情報の確認、身長の更新、体重の更新、動作の終了を選んで行う動作をする。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);

		// インスタンスの初期化に必要な名前の情報の入力を求める。
		System.out.print("登録名：");
		// 名前の入力を行う。
		String inputName = standardInput.next();
		// 身長を入れる変数をつくる。
		float inputHeight = 0;
		// final変数で身長の入力下限値100をとる。
		final short LOW_HEIGHT = 100;
		// final変数で身長の入力上限値350をとる。
		final short HIGH_HEIGHT = 350;
		// 身長が適切な値ではないときループする。
		do {
			// インスタンスの初期化に必要な身長の情報の入力を求める。
			System.out.print("現在の身長(㎝)：");
			// 身長の入力を行う。
			inputHeight = standardInput.nextFloat();
		// 身長が100未満、もしくは350より大きいときは再入力させる。
		} while (inputHeight < LOW_HEIGHT || inputHeight > HIGH_HEIGHT );
		// 体重を入れる初期値をつくる。
		float inputWeight = 0;
		// final変数で体重の入力下限値30をとる。
		final short LOW_WEIGHT = 30;
		// final変数で体重の入力上限値250をとる。
		final short HIGH_WEIGHT = 250;
		// 体重が適切な値ではないときループする。
		do {
			// インスタンスの初期化に必要な体重の情報の入力を求める。
			System.out.print("現在の体重(㎏)：");
			// 体重の入力を行う。
			inputWeight = standardInput.nextFloat();
		// 体重が30未満、もしくは250より大きいときは再入力させる。
		} while (inputWeight < LOW_WEIGHT || inputWeight > HIGH_WEIGHT );
		// インスタンスの初期化に必要な生年月日の情報の入力を求める。
		System.out.print("生年月日・年：");
		// final変数で今年の値をとる。
		final short NOW_YEAR = 2023;
		// fnal変数で生年月日の範囲として150を取る。
		final short BIRTH_RANGE = 150;
		// 生年月日の年の情報の入力を行う。
		short inputYear = standardInput.nextShort();
		// 年の情報の入力がおかしいときループに入る。
		while (inputYear < NOW_YEAR - BIRTH_RANGE || inputYear > NOW_YEAR ){
			// 年の情報の入力を再度求める。
			System.out.print("          年：");
			// 年の情報の入力を行う。
			inputYear = standardInput.nextShort();
		}
		// 月の値を入れる変数をつくる。
		short inputMonth = 0;
		// final変数で月の下限値をとる。
		final short LOW_MONTH = 1;
		// final変数で月の上限値をとる。
		final short HIGH_MONTH = 12;
		// 月の値がおかしいときループする。
		do {
			// 生年月日の月の入力を求める。
			System.out.print("          月：");
			// 生年月日の月の情報の入力を行う。
			inputMonth = standardInput.nextShort();
		// 月の値が1未満、もしくは12より大きい場合ループする。
		} while (inputMonth < LOW_MONTH || inputMonth > HIGH_MONTH);
		// 日の上限値の変数をつくる。
		int dayLimit = 0;
		// 二月のときの分岐。
		if (inputMonth == 2) {
			// 4の値のfinal変数
			final int FOURTH_NUMBER = 4;
			// 年が4の倍数の時の分岐。
			if (inputYear % FOURTH_NUMBER == 0) {
				// 100の値のfinal変数
				final int ONE_HUNDRED = 100;
				// 年が100の倍数の時の分岐。
				if (inputYear % ONE_HUNDRED == 0) {
					// 400の値のfinal変数
					final int FOUR_HUNDRED = 400;
					// 年が400の倍数の分岐。
					if (inputYear % FOUR_HUNDRED == 0) {
						// 上限を29にする。
						dayLimit = 29;
					// それ以外の時の分岐
					} else {
						// 上限を28にする。
						dayLimit = 28;
					}
				// それ以外の時の分岐
				} else {
					// 上限を29にする。
					dayLimit = 29;
				}
			// それ以外の時の分岐
			} else {
				// 上限を28にする。
				dayLimit = 28;
			}
		} else if (inputMonth == 1 || inputMonth == 3 || inputMonth == 5 || 
				inputMonth == 7 || inputMonth == 8 || inputMonth == 10 || inputMonth == 12) {
			// 上限を31にする。
			dayLimit = 31;
		} else {
			// 上限を30にする。
			dayLimit = 30;
		}
		// 日の値を入れる変数をつくる。
		short inputDay = 0;
		// 日の値がおかしいときループする。
		do {
			// 生年月日の日の入力を求める。
			System.out.print("          日：");
			// 生年月日の日の情報の入力を行う。
			inputDay = standardInput.nextShort();
		// 日の値がおかしいときループする。
		} while (inputDay < 1 || inputDay > dayLimit);
		
		
		// 入力情報からインスタンス化する
		HumanClass myDate = new HumanClass(inputName,inputHeight,inputWeight,inputYear,inputMonth,inputDay);
		
		// 終了が押されるまで繰り返す。
		while(true) {
			// 動作選択に用いる変数をつくる。
			int choiceNumber = 0;
			// 入力が指定の範囲外のときループする。
			do {
				// 目的似合う番号を選ぶことを表示する。
				System.out.println("目的に合った番号を選んでください。");
				// 選択肢の表示をする
				System.out.print("登録情報の確認 … 1 / 身長データの更新 … 2 / 体重データの更新 … 3 / 終了 … 4  ：");
				// 選択する番号の入力を行う。
				choiceNumber = standardInput.nextInt();
			// 入力された値が選択肢にない場合ループする。
			} while (choiceNumber < 1 || choiceNumber > 4);
			// 改行を入れる。
			System.out.println();
			
			// 登録情報の確認が選択された場合の分岐。
			if (choiceNumber == 1) {
				
				// 登録情報を表示する。
				myDate.getUser();
				
			// 身長データの更新が選択された場合の分岐。
			} else if (choiceNumber == 2) {
				
				// 身長のデータを入力する変数をつくる。
				float nowHeight = 0;
				// 身長が適切な値ではないときループする。
				do {
					// 身長のデータの入力を求める。
					System.out.print("新しい身長のデータ(㎝)を入力してください。：");
					// 値を入力する。
					nowHeight = standardInput.nextFloat();
				// 身長が100未満、もしくは350より大きいときは再入力させる。
				} while (inputHeight < LOW_HEIGHT || inputHeight > HIGH_HEIGHT );
				// 入力した値で身長のデータを代入する。
				myDate.updateHeight(nowHeight);
				
			// 体重データの更新が選択された場合の分岐。
			} else if (choiceNumber == 3) {
				
				// 体重のデータを入力する変数をつくる。
				float nowWeight = 0;
				// 体重が適切な値ではないときループする。
				do {
					// 体重のデータの入力を求める。
					System.out.print("新しい体重のデータ(㎏)を入力してください。：");
					// 値を入力する。
					nowWeight = standardInput.nextFloat();
				// 体重が30未満、もしくは250より大きいときは再入力させる。
				} while (inputWeight < LOW_WEIGHT || inputWeight > HIGH_WEIGHT );
				// 入力した値で体重のデータを代入する。
				myDate.updateWeight(nowWeight);
				
			// 終了が選択された場合の分岐。
			} else {
				
				// ループを終える。
				break;
			}
			// 改行を入れる。
			System.out.println();
		}
		// 終了することを伝える。
		System.out.print("動作を終了します。");
	}

}
