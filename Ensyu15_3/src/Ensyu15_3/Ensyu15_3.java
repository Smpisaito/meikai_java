// パッケージの宣言
package Ensyu15_3;

//入力操作の呼び出し
import java.util.Scanner;

/**
 * クラス名：Ensyu15_3<Br>
 * 概要：演習15-3クラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.12
 * @author S.Saito
 *
 */
public class Ensyu15_3 {
	
	/**
	 * 関数名：inputStringLine<Br>
	 * 概要：文字列の入力を求め、その文字列を返却する。<Br>
	 * 引数：なし<Br>
	 * 戻り値：useString … 文字列として返却する。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.04.28
	 * @return useString … 文字列として返却する
	 */
	static String inputStringLine() {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 文字列の入力を行う。
		String useString = standardInput.nextLine();
		// 入力した文字列を返す。
		return useString;
	}
	
	/**
	 * 関数名：inputStringLine<Br>
	 * 概要：「(引数の文字)：」と表示し、文字列の入力を求め、その文字列を返却する。<Br>
	 * 引数：outputWord … 表示する文字列<Br>
	 * 戻り値：useString … 文字列として返却する。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.04.28
	 * @param outputWord … 表示する文字列
	 * @return useString … 文字列として返却する。
	 */
	static String inputStringLine(String outputWord) {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 文字列の入力を行う。
		String useString = standardInput.nextLine();
		// 入力した文字列を返す。
		return useString;
	}
	
	/**
	 * 関数名：main<Br>
	 * 概要：入力した文字列の全文字の文字コードを表示する。<Br>
	 * 引数：args … コマンドライン引数<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.12
	 * @param args … コマンドライン引数
	 */
	public static void main(String[] args){
		// 探索先の文字列の入力を求める。
		String searchString = inputStringLine("探索先の文字列");
		// 探索したい文字列の入力を求める。
		String keywordString = inputStringLine("探索したい文字列");
		
		// 文字列を探索し、-1であれば文字列がなかったことを、それ以外の値の場合は先頭がその値のインデックスの文字になる。
		int indexNumber = searchString.indexOf(keywordString);
		
		// 見つからなかったときの分岐
		if (indexNumber == -1) {
			// 見つからなかったことを表示する。
			System.out.println("検索した文字列は見つかりませんでした。");
		// 見つかった場合の分岐
		} else {
			// 検索先の文字列を表示する。
			System.out.println("検索先の文字列：" + searchString);
			// 検索した文字列の表示を示す。
			System.out.print("検索した文字列：" );
			// 返されたインデックスの値だけループする。
			for (int loopNumber = 0; loopNumber < indexNumber; loopNumber++) {
				//空白で検索で見つけた場所と一致させる。
				System.out.print(' ');
			}
			// 文字列を表示する。
			System.out.println(keywordString);
		}
		
	}

}
