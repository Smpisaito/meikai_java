// パッケージの宣言
package Ensyu9_1;

/*
* クラス名：Ensyu9_1
* 概要：演習9-1クラス
* 作成者：S.Saito
* 作成日：2023.04.27
*/
public class Ensyu9_1 {
	
	/*
	 * 関数名：main
	 * 概要：人間クラスの配列を、初期化でつくる動作と代入で作る動作の二つを行い、それぞれの各配列の情報を確認する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：
	 */
	public static void main(String[] args){
	
		// 人間クラスの配列secondMakeをつくる。
		HumanClass[] secondHumans;
		
		// 三人の人間クラスの配列firstMakeと初期化で一人目の情報を入れる。
		HumanClass[] firstHumans ={	new HumanClass("酒井雄二",160f,68f,(short)2003,(short)6,(short)12),
									// 二人目の情報を入れる。
									new HumanClass("立花浩平",172f,81f,(short)1993,(short)2,(short)27),
									// 三人目の情報をいれる。
									new HumanClass("小河原隆太",188f,79f,(short)1999,(short)10,(short)23),
								};
		
		// 四人の人間クラスの配列secondMakeに代入を行う。
		secondHumans = new HumanClass[] {
						// 一人目の情報をいれる。
						new HumanClass("細川匠",  167f,62f,(short)2005,(short)7,(short)31),
						// 二人目の情報をいれる。
						new HumanClass("山田哲人",159f,56f,(short)2001,(short)5,(short)5 ),
						// 三人目の情報をいれる。
						new HumanClass("渡辺灯",  197f,81f,(short)1988,(short)9,(short)21),
						// 四人目の情報をいれる。
						new HumanClass("篠目裕三",171f,73f,(short)1990,(short)2,(short)28),
					};
		
		// 配列すべての表示を行うループ
		for (int loopNumber = 0; loopNumber < firstHumans.length; loopNumber++) {
			// 初期化でインスタンスした配列の情報を表示する。
			firstHumans[loopNumber].getUser();
		}
		// 改行を入れる。
		System.out.println();
		
		// 配列全ての表示を行うループ
		for (int loopNumber = 0; loopNumber < secondHumans.length; loopNumber++) {
			// 代入でインスタンスした配列の情報を表示する。
			secondHumans[loopNumber].getUser();
		}
	}
}
