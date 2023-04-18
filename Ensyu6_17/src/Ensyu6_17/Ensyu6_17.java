// パッケージの宣言
package Ensyu6_17;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu6_17
 * 概要：演習6-17クラス
 * 作成者：S.Saito
 * 作成日：2023.04.18
 */
public class Ensyu6_17 {
	
	/*
	 * 関数名：main
	 * 概要：6人の2科目の点数を入力し、科目ごとの平均点と学生ごとの平均点を求めるプログラム。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.17
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 人数を示す変数に6の初期値を入れる。
		int testMenber = 6;
		// テストの科目数を示す変数に6の初期値を入れる。
		int testSubject = 2;
		// テストの科目数を行に、人数を列にした行列をつくる。
		int[][] testPoint = new int[testSubject][testMenber];
		// 科目の名前を示す配列をつくる。
		String[] subjectName = new String[testSubject];
		
		// 科目名「国語」を代入する
		subjectName[0] = "国語";
		// 科目名「数学」を代入する
		subjectName[1] = "数学";
		
		// テストごとに点数を入力するループ。
		for (int firstLoop = 0; firstLoop < testSubject; firstLoop++) {
			// 科目名を示す表示をする。
			System.out.println(subjectName[firstLoop] + "の点数を入力してください。");
			// 一人ずつのテストの点数を入力するループ。
			for (int secondLoop = 0; secondLoop < testMenber; secondLoop++) {
				// 0～100の値が入力されるまでループする。
				do {
					// 何人目のテストの点数を入力しているかを示す表示をする。
					System.out.print(secondLoop + 1 + "人目の点数：");
					// 点数の入力を行う。
					testPoint[firstLoop][secondLoop] = standardInput.nextInt();
					// 点数が0未満、もしくは101以上の時の分岐
					if ( testPoint[firstLoop][secondLoop] < 0 || testPoint[firstLoop][secondLoop] > 100 ) {
						// 正しい値の再入力を求める表示をする。
						System.out.println("正しい値を入力してください。");
					}
				// 0未満、もしくは101以上の時にループする。
				} while ( testPoint[firstLoop][secondLoop] < 0 || testPoint[firstLoop][secondLoop] > 100 );
			}
			
		}
		// 結果の表示を分けるための改行
		System.out.println();
		
		// 科目の平均を示す配列をつくる。
		double[] subjectAverage = new double[testSubject];
		// 科目ごとの平均を求めるループ
		for (int firstLoop = 0; firstLoop < testSubject; firstLoop++) {
			// 同一科目の行の各列の要素の値を加えるループ
			for (int secondLoop = 0; secondLoop < testMenber; secondLoop++) {
				// 列の各要素に表示された値を平均を示す配列subjectAverageの対応する要素に加える。
				subjectAverage[firstLoop] += testPoint[firstLoop][secondLoop];
			}
			// 科目ごとの点数の合計が入っている値を人数で割る。
			subjectAverage[firstLoop] /= testMenber;
			// 科目名の表示を行う。
			System.out.print(subjectName[firstLoop] + "の平均：");
			// 科目ごとの点数の平均を表示する。
			System.out.printf("%3.2f\n",subjectAverage[firstLoop]);
		}
		// 結果の表示を分けるための改行
				System.out.println();
		
		// 科目の平均を示す配列をつくる。
		double[] menberAverage = new double[testMenber];
		// 科目ごとの平均を求めるループ
		for (int firstLoop = 0; firstLoop < testMenber; firstLoop++) {
			// 同一科目の行の各列の要素の値を加えるループ
			for (int secondLoop = 0; secondLoop < testSubject; secondLoop++) {
				// 列の各要素に表示された値を平均を示す配列subjectAverageの対応する要素に加える。
				menberAverage[firstLoop] += testPoint[secondLoop][firstLoop];
			}
			// 個人ごとの点数の合計の入る値を人数で割る。
			menberAverage[firstLoop] /= testSubject;
			// 何人目かを示す表示をする。
			System.out.print(firstLoop + 1 + "人目の点数の平均：");
			// 個人ごとの点数の平均を表示する。
			System.out.printf("%3.2f\n",menberAverage[firstLoop]);
		}
		
	}


}
