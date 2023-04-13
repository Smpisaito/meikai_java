// パッケージの宣言
package Ensyu5_3;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu5_3
 * 概要：演習5-3クラス
 * 作成者：S.Saito
 * 作成日：2023.04.13
 */
public class Ensyu5_3 {
	
	/*
	 * 関数名：main
	 * 概要：倫理型の変数(boolean型)の変数にtrue,falseを代入し、その値を表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.13
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);

		// 変数a(表記)と変数b(表記)での比較を行うことを表示する。
		System.out.println("整数aと整数bを比較します");
		// 変数a(表記)の入力を行うことを示す。
		System.out.print("整数a：");
		// 変数a(表記)として変数firstNumberに入力を行う
		int firstNumber = standardInput.nextInt();
		// 変数b(表記)の入力を行うことを示す。
		System.out.print("整数b：");
		// 変数b(表記)として変数secondNumberに入力を行う。
		int secondNumber = standardInput.nextInt();
		
		// a>b となる比較を論理型の変数firstBooleanに入れる。
		boolean firstBoolean = firstNumber > secondNumber;
		// a<=b　となる比較を論理型の変数secondBooleanに入れる。
		boolean secondBoolean = firstNumber <= secondNumber;
		
		// a>b となるかどうか結果を示す。
		System.out.println(firstNumber + " > " + secondNumber + " == " + firstBoolean);
		// a<b となるかどうか結果を示す。
		System.out.println(firstNumber + " ≦ " + secondNumber + " == " + secondBoolean);
		
		
	}

}
