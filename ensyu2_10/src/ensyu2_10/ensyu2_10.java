// パッケージの宣言
package ensyu2_10;

// 入力の操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：ensyu2_10
 * 概要：演習2-10クラス
 * 作成者：S.Saito
 * 作成日：2023.04.06
 */
public class ensyu2_10 {
	
	/*
	 * 関数名：main
	 * 概要：名前と苗字を個別に読み込んで、読み込んだ名前に対応して挨拶を返す。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args) {
		
		// キーボードでの入力を指定する。mainの中で入力するコードより前に置く。
		Scanner StandardInport = new Scanner(System.in);
		
		// 姓の文字列の入力であることを示す。
		System.out.print("姓：");
		// 文字列LastNameに文字列を読み込む。
		String LastName = StandardInport.next();
		
		// 名の文字列の入力であることを示す。
		System.out.print("名：");
		// 文字列FirstNameに文字列を読み込む。
		String FirstName = StandardInport.next();
		
		// 姓と名を含めて挨拶を返す。
		System.out.println("こんにちは" + LastName + FirstName + "さん");
		
		
	}

}
