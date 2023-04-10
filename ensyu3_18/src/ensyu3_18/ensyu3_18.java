// パッケージの宣言
package ensyu3_18;

// 入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：ensyu3_18
 * 概要：演習3-18クラス
 * 作成者：S.Saito
 * 作成日：2023.04.10
 */
public class ensyu3_18 {
	
	/*
	 * 関数名：main
	 * 概要：月を整数値として読み込んで、その月に対応する季節を表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.10
	 */
	public static void main(String[] args) {
		
		// キーボードで入力を行うことを指定する。main内で入力を行うコードより前に置く。
		Scanner StandardInput = new Scanner(System.in);
		
		// 季節を求めることを示す。
		System.out.println("入力した月の季節を求めます。");
		// 何月であるかの入力を行うことを示す。
		System.out.print("月：");
		// 月の入力を行う。
		int MonthSeason = StandardInput.nextInt();
		
		// 月として入力した値による条件分岐。
		switch ( MonthSeason ) {
		
			// 月が3月の時の分岐。
			case 3:
			// 月が4月の時の分岐。
			case 4:
			// 月が5月の時の分岐。
			case 5:
				// 季節が春であることを示す。
				System.out.println( MonthSeason + "月の季節は春です。"); break;
				
			// 月が6月の時の分岐。
			case 6:
			// 月が7月の時の分岐。
			case 7:
			// 月が8月の時の分岐。
			case 8:
				// 季節が夏であることを示す。
				System.out.println( MonthSeason + "月の季節は夏です。"); break;
			
			// 月が9月の時の分岐。
			case 9:
			// 月が10月の時の分岐。
			case 10:
			// 月が11月の時の分岐。
			case 11:
				// 季節が秋であることを示す。
				System.out.println( MonthSeason + "月の季節は秋です。"); break;
			
			// 月が12月の時の分岐。
			case 12:
			// 月が1月の時の分岐。
			case 1:
			// 月が2月の時の分岐。
			case 2:
				// 季節が冬であることを示す。
				System.out.println( MonthSeason + "月の季節は冬です。"); break;
				
		}
		
	}

}
