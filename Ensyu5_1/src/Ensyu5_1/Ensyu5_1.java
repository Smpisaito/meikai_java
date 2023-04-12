// パッケージの宣言
package Ensyu5_1;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu5_1
 * 概要：演習5-1クラス
 * 作成者：S.Saito
 * 作成日：2023.04.12
 */
public class Ensyu5_1 {
	
	/*
	 * 関数名：main
	 * 概要：10進数での入力を行い、その値を8進数、16進数で表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力した値の8進数、16進数を示すことを伝えるように表示する。
		System.out.println("入力した10進数の整数を8進数、16進数で表示します。");
		// 整数の入力を行うことを示すように表示する。
		System.out.print("10進数の整数：");
		// 10進数の入力を行う。
		int integerNumber = standardInput.nextInt();
		
		// 入力した整数値を8進数で表示する。
		System.out.printf("8進数：%o\n",integerNumber);
		// 入力した整数値を16進数で表示する。
		System.out.printf("16進数：%x\n",integerNumber);
		
	}

}
