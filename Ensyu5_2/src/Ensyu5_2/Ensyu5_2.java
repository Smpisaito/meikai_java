// パッケージの宣言
package Ensyu5_2;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu5_2
 * 概要：演習5-2クラス
 * 作成者：S.Saito
 * 作成日：2023.04.13
 */
public class Ensyu5_2 {
	
	/*
	 * 関数名：main
	 * 概要：froat型とdouble型の変数の値を読み込んで表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.13
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 変数x(表記上)がfloat型、変数y(表記上)がdouble型であることを示す表示をする。
		System.out.println("変数xがfloat型、変数yがdouble型です。");
		// 変数x(表記上)となる変数floatNumberに入力するように表示する。
		System.out.print("x ：");
		// 変数x(表記上)となる変数flootNumberに入力する。
		float floatNumber = standardInput.nextFloat();
		// 変数y(表記上)となる変数doubleNumberに入力するように表示する。
		System.out.print("y ：");
		// 変数y(表記上)となる変数doubleNumberに入力する。
		double doubleNumber = standardInput.nextDouble();
		
		// 変数x(表記上)として変数floatNumberを表示する
		System.out.println("x = " + floatNumber );
		// 変数y(表記上)として変数doubleNumberを表示する
		System.out.println("y = " + doubleNumber );
		
	}

}
