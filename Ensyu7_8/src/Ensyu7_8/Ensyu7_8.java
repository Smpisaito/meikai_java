// パッケージの宣言
package Ensyu7_8;

//乱数を用いるときにクラスの宣言の前に置く。
import java.util.Random;
//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：
 * 概要：
 * 作成者：S.Saito
 * 作成日：
 */
public class Ensyu7_8 {
	
	/*
	 * 関数名：random
	 * 概要：a以上b未満の乱数を生成してその値を返す。b < a であった場合はaの値をそのまま返す。関数名・引数名は指定のものを使う。
	 * 引数：a … 生成する乱数の最小値。
	 *       b … 生成する乱数の最大値より1多い値。
	 * 戻り値：randamInteger … a以上b未満の乱数で生成した整数値。
	 *         a … aがbより大きい場合に分岐してそのままの値を返す。
	 * 作成者：S.Saito
	 * 作成日：2023.04.19
	 */
	static int random(int a,int b) {
		
		// 乱数を入力する際に、main内で入力操作を行うコードより前に置く
		Random randomNumber = new Random();
		
		// 引数の値がbよりaの値が大きい場合の分岐
		if (a >= b) {
			// aの値をそのまま返す。
			return a;
		}
		// a以上b未満の乱数を生成する。
		int randomInteger = randomNumber.nextInt(b-a) + a;
		// 生成した乱数を返す。
		return randomInteger;
	}
	
	/*
	 * 関数名：main
	 * 概要：メソッドrandomを用いて乱数を得られることを確認する。また、メソッドrandomで引数の値が a > b となった場合の
	 *       処理の確認も行う。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.19
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 乱数を生成することを表記上の変数aと変数bを用いて示すように表示する。
		System.out.println("a ≦ c < b となる乱数cを生成します。");
		
		// 乱数の最小値となる変数a(表記)の入力を示す表示をする。
		System.out.print("a：");
		// 乱数の最小値を入力する。
		int firstNumber = standardInput.nextInt();
		// 乱数の最大値より1多い値となる変数b(表記)の入力を示す表示をする。
		System.out.print("b：");
		// 乱数の最大値より1多い値を入力する。
		int secondNumber = standardInput.nextInt();
		// メソッドrandomを用いて入力した値から乱数を得る。
		int randomInteger = random(firstNumber, secondNumber);
		// 乱数の表示をする。また、メソッドrandomが(a > b)のときの動作確認も行う
		System.out.println("得られた乱数c：" + randomInteger);
	}

}
