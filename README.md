## 演習の環境設定手順

1. 「[java.2014](https://github.com/KimiyukiYamauchi/java.2014)」を「git clone」
<br />$ git clone https://github.com/KimiyukiYamauchi/java.2014 (任意のディレクトリ名)<br /><br />
1. リモートリポジトリ「origin」を別の名前に変える
<br />$ git remote rename origin  (任意の別名)<br /><br />
1. 各自のGithubに演習をアップするためのリポジトリを作成<br /><br />
1. 上で作成したリモートリポジトリに「origin」と名前をつける
<br />$ git remote add origin  (各自のリモートリポジトリのURL)<br /><br />
1. ローカルリポジトリをリモートにpushする
<br />$ git push -u origin master<br /><br />
1. 以降は以下の操作

	* 演習を作成し、講師提出する場合、

		1. 「master」branchに切り替え。
<br />$ git checkout master <br /><br />
		1. 演習の作業を行うbranchを作成し、それにcheckout
<br />$ git checkout -b (演習リポジトリ名) <br /><br />
		1. 演習を行い、成果物をadd, commitで、リポジトリに登録 
<br />$ git add -A
<br />$ git commit -m "コメント"<br /><br />
		1. 演習の成果物を「master」branchにmerge
<br />$ git checkout master 
<br />$ git merge (演習リポジトリ名) <br /><br />
		1. ローカルの「master」をGithubに上げる
<br />$ git push <br /><br />
		1. 講師に演習を作成した旨連絡
			* yamauchi@std.it-college.ac.jp

	* ひな形などの最新を入手する場合、

		1. 「[java.2014](https://github.com/KimiyukiYamauchi/java.2014)」を「git pull」
<br />$ git pull (自分がつけた別名) master<br /><br />

## 演習問題

1. Ex1

	1. Ex1_0<br />
		「Hello World!」と表示する

	1. Ex1_2<br />
		テキストP20 演習 1-2<br />
各行に１文字ずつ自分の名前を表示するプログラムを作成せよ。

	1. Ex1_1<br />
		テキストP20 演習 1-3<br />
各行に１文字ずつ自分の名前を表示するプログラムを作成せよ。<br />
姓と名の間は１行空けること

1. Ex2

	1. Ex2_0<br />
		テキストP32 List 2-6

	1. Ex2_1<br />
		テキストP33 演習 2-1<br />
List 2-6(Ex2_0)の変数へ値を代入している箇所を小数部分を持つ実数値を代入する<br />
ように変更しなさい<br />

	1. Ex2_2<br />
		テキストP33 演習 2-2<br />
三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ<br />

	1. Ex2_00<br />
		テキストP36 List 2-9

	1. Ex2_3<br />
		テキストP40 演習 2-3<br />
キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成せよ<br />

	1. Ex2_4<br />
		テキストP40 演習 2-4<br />
キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力するプログラムを<br />
作成せよ<br />

	1. Ex2_5<br />
		テキストP41 演習 2-5<br />
二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ<br />

	1. Ex2_6<br />
		テキストP41 演習 2-6<br />
三角形の底辺と高さを実数値で読み込んで、その面積を表示するプログラムを作成せよ<br />

	1. Ex2_00<br />
		テキストP44 List 2-14

	1. Ex2_7<br />
		テキストP44 演習 2-7<br />
以下に示すプログラムを作成せよ<br />

		- １桁の正の整数値（すなわち1以上9以下の値）をランダムに生成して表示。
		- １桁の負の整数値（すなわち-9以上-1以下の値）をランダムに生成して表示。
		- ２桁の正の整数値（すんわち10以上99以下の値）をランダムに生成して表示。

	1. Ex2_8<br />
		テキストP45 演習 2-8<br />
キーボードから読み込んだ整数値プラスマイナス5の範囲の整数値をランダムに生成<br />
して表示するプログラムを作成せよ。<br />

	1. Ex2_9<br />
		テキストP45 演習 2-9<br />
以下に示すプログラムを作成せよ（実数値の乱数の生成にはnextDouble()を使うこと）

		- 0.0以上1.0未満の実数値をランダムに生成して表示。
		- 0.0以上10.0未満の実数値をランダムに生成して表示。
		- -1.0以上1.0未満の実数値をランダムに生成して表示。

	1. Ex2_10<br />
		テキストP47 演習 2-10<br />
名前の姓と名を個別にキーボードから読み込んで、挨拶を行うプログラムを作成しなさい<br />

```
$ java Ex2
姓：山内
名：公之
こんにちは山内公之さん。
```

1. Ex3

	1. Ex3_0<br />
		テキストP52 List 3-1<br />

	1. Ex3_1<br />
		テキストP59 演習 3-1<br />
以下のように、整数値を読み込んで、その絶対値を求めて表示するプログラムを作成せよ。

```
$ java Ex3
整数値：-5
その絶対値は5です。
```

	1. Ex3_2<br />
		テキストP59 演習 3-2<br />
二つの正の整数値を読み込んで、後者が前者の約数であれば『BはAの約数です。』と表示し、そうでなければ『BはAの約数ではありません。』と表示するプログラムを作成せよ。

```bash
$ java Ex3
整数A ：12
整数B ：4
BはAの約数です。
```

	1. Ex3_4<br />
		テキストP61 演習 3-4<br />
二つの整数a, bに値を読み込んで、その大小関係を以下のいずれかで表示するプログラムを作成せよ。<br />
『aのほうがおおきいです。』『bのほうが大きいです。』『aとbは同じ値です。』

	1. Ex3_5<br />
テキストP61 演習 3-5<br />
正の整数値を読み込んで、それが5で割り切れれば『その値は5で割り切れます。』と表示し、そうでなければ『その値は5では割り切れません。』と表示するプログラムを作成せよ。<br />
※正正でない数を読み込んだ場合は、『正でない数が入力されました。』と表示されること。
