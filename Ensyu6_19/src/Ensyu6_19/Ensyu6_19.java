// パッケージの宣言
package Ensyu6_19;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu6_19
 * 概要：演習6-19クラス
 * 作成者：S.Saito
 * 作成日：2023.04.18
 */
public class Ensyu6_19 {
	
	/*
	 * 関数名：main
	 * 概要：クラス数、各クラスの人数、全員の点数を入力し、合計点と平均点をクラスごとと全体のもので分けて求める。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.18
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// クラス数の入力に使う変数をつくる。
		int arrayElements = 0;
		// クラス数として正の整数値が入力されるまで入力を続けるループ。
		do {
			// クラス数を入力することを示す表示をする。
			System.out.print("クラス数：");
			// クラス数を入力する。
			arrayElements = standardInput.nextInt();
			// 正の整数値ではない値が入力された場合の分岐
			if ( arrayElements <= 0) {
				//正しいクラス数を入力するように促す。
				System.out.println("正しいクラス数を入力してください。");
			}
		// クラス数が0以下のときループする。
		}while (arrayElements <= 0);
		// 入力したクラスに合った行列をつくる。
		int[][] arrayNumber = new int[arrayElements][];
		
		// 人数の入力に使う配列をつくる。
		int[] arraySecond = new int[arrayElements];
		// 全体の人数を示す変数をつくる。
		int sumMenber = 0;
		// 各クラスの人数の入力をするループ。
		for (int firstLoop = 0; firstLoop < arrayElements; firstLoop++) {
			// 人数として正の整数値が入力されるまで入力を続けるループ。
			do {
				// 人数を入力することを示す表示をする。
				System.out.print("クラス" + (firstLoop + 1) + "の人数：");
				// 人数を入力する。
				arraySecond[firstLoop] = standardInput.nextInt();
				// 正の整数値ではない値が入力された場合の分岐
				if ( arraySecond[firstLoop] <= 0) {
					// 正しい人数を入力するように促す。
					System.out.println("正しい人数を入力してください。");
				}
			// 人数が0以下のときループする。
			}while (arraySecond[firstLoop] <= 0);
			// クラスごとの人数を行列に反映する。
			arrayNumber[firstLoop] = new int[arraySecond[firstLoop]];
			// クラスごとの人数を全体の人数を示す変数に加える。
			sumMenber += arraySecond[firstLoop];
		}
		
		// 各点数の値を入れるループ。
		for (int firstLoop = 0; firstLoop < arrayElements; firstLoop++) {
			// クラスごとに点数の入力を行うループ。
			for (int secondLoop = 0; secondLoop < arraySecond[firstLoop]; secondLoop++) {
				// 点数の入力を0～100のみ受け付けるループ。
				do {
					// どのクラスの何人目に入れているのかがわかるように表示する。
					System.out.print("クラス" + (firstLoop + 1) + " " + (secondLoop + 1) + "人目 :");
					// 点数の入力を行う
					arrayNumber[firstLoop][secondLoop] = standardInput.nextInt();
					// 0未満、もしくは100より大きい値が入力されていた場合のループ。
					if (arrayNumber[firstLoop][secondLoop] < 0 || arrayNumber[firstLoop][secondLoop] > 100) {
						// 正しい点数を入力するように示す表示をする。
						System.out.println("正しい点数を入力してください。");
					}
				// 入力された点数が0未満、もしくは100より大きいときループする。
				} while (arrayNumber[firstLoop][secondLoop] < 0 || arrayNumber[firstLoop][secondLoop] > 100);
			}
			// クラスのごとに入力し終えたら改行で分ける。
			System.out.println();
		}
		
		// 行列の合計行を示す変数に初期値0を入れる。
		int sumNumber = 0;
		// 行列の平均行を表す変数に初期値1をいれる。
		int averageNumber = 1;
		// 合計と平均となる行列をつくる。クラス数に全体の分の行として1加えた値と2(合計と平均の2通り)でつくる。
		double[][] pointArray = new double[arrayElements + 1][2];
		// 各クラスの合計と平均を求めるループ。
		for (int firstLoop = 0; firstLoop < arrayElements ;firstLoop++) {
			// クラスごとに合計を求めるループ。
			for (int secondLoop = 0; secondLoop < arraySecond[firstLoop]; secondLoop++) {
				// クラスごとの合計に値を加える。
				pointArray[firstLoop][sumNumber] += arrayNumber[firstLoop][secondLoop];
				// 全体の合計にも値を加える。
				pointArray[arrayElements][sumNumber] += arrayNumber[firstLoop][secondLoop];
			}
			// クラスごとの合計をもとにクラスごとの平均をいれる。
			pointArray[firstLoop][averageNumber] = pointArray[firstLoop][sumNumber] / arraySecond[firstLoop];
		}
		//全体の合計を全体の人数を示す変数sumMenberで割って、全体の平均をつくる。
		pointArray[arrayElements][averageNumber] = pointArray[arrayElements][sumNumber] / sumMenber;
		
		// 項目名を表示する。
		System.out.println("  組 |    合計   平均");
		// 項目と分ける線をつくる。
		System.out.println("-----+----------------");
		// 各クラスの組と合計と平均の値を表示するループ
		for (int firstLoop = 0; firstLoop < arrayElements; firstLoop++) {
			// クラス、合計、平均を表示する。合計は整数値のみ、平均の値は小数点以下第一位までを表示する。
			System.out.printf("%2d組 |%5.0f  %5.1f\n", firstLoop + 1, pointArray[firstLoop][sumNumber], pointArray[firstLoop][averageNumber]);
		}
		// 全体の値と分ける線をつくる。
		System.out.println("-----+----------------");
		// 全体のであることと全体の合計と平均の値を表示する。合計は整数値のみ、小数点以下第一位までを表示する。
		System.out.printf("  計 |%5.0f  %5.1f", pointArray[arrayElements][sumNumber], pointArray[arrayElements][averageNumber]);
	}

}
