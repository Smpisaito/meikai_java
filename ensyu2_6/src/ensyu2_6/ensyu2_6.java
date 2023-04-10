// パッケージの宣言
package ensyu2_6;

// 入力を行うときにクラス宣言前に置く
import java.util.Scanner;

/*
 * クラス名：ensyu2_6
 * 概要：演習2-6クラス
 * 作成者：S.Saito
 * 作成日：2023.04.05
 */
public class ensyu2_6 {
	
	/*
	 * 関数名：main
	 * 概要：底辺と高さを入力し、三角形の面積を表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023/04.05
	 */
	public static void main(String[] args) {
		
		// キーボードによる入力を行うように指定する。mainの最初に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// この後に三角形の面積を求めることを示す。
		System.out.println("三角形の面積を求めます。");
		
		// 底辺の値を入力するように示す。
		System.out.print("底辺：");
		// 底辺の値を入力する。
		double BaseNumber = standardInput.nextDouble();
		
		// 高さの値を入力するように示す。
		System.out.print("高さ：");
		// 高さの値を入力する。
		double HeightNumber = standardInput.nextDouble();
		
		// 三角形の面積を入力した底辺と高さに対応して示す。
		System.out.println("面積は" + (BaseNumber * HeightNumber / 2) + "です。");
		
	}

}
