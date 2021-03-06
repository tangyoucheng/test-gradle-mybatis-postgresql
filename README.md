# springboot-gradle-sample
▼使用方法

	DB設定：
    	url: jdbc:postgresql://localhost/test
    	username: postgres
    	password: hmj
    	
	TABLE設定：
		・プロジェクトフォルダ直下のcreate_table.sqlで、テーブル作成・サンプルデータの登録が可能。
		・「drop_table.sql」で、登録した上記テーブルの削除が可能。

	ログイン設定：
		デフォルトで、下記ID・PWでログイン可能。
		ID: user
		PW: pass

▼開発環境

	［開発言語］
	Java(Version:8)
	
	[フレームワーク]
	Spring Boot(Version:　1.3.0.RELEASE)
	Spring Security(Version:　4.2.3.RELEASE)
	
	[IDE]
	Spring Tool Suite(Version: 3.7.1.RELEASE)
	
	[BuildTool]
	Gradle(Version:)
	
	[テンプレート・エンジン]
	Thymeleaf(Version:)
	
	[ORM]
	Mybatis(Version:3.3.0)
	Mybatis　Generator(Version:)
	
	[Database]
	postgresql(Version:9.4)

▼実装点
2015/12/09

	MyHandlerInterceptorクラスに定義した、「商品一覧を呼び出す処理」を、TestControllerクラスに移動。
	(理由：商品一覧を呼び出す処理は、必ずしも全ページで必要な処理ではない為)	

2015/12/03

	会員登録時の入力パスワードを、暗号化する機能を実装

2015/12/02

	会員情報確認画面を実装

▼実装予定

	・会員登録時の情報入力確認画面を作成する。

	・画像をアップロード出来るようにする。
	
	・会員登録時に確認メールを投げるようにする。
	
	・会員登録時のバリテーション(12/15実装済)
	
	・会員情報確認画面(mypage.html)から登録情報を変更出来るようにする(12/15実装済)

▼要修正点

2015/12/21: 未解決

	[画面]
	会員登録画面(input.html)
	
	[状況]
	・ログインIDで既に使用されているIDを指定すると、エラーになる(SQLのユニーク制約エラー)


2015/12/21: 解決済
	
	[画面]
	会員登録画面(input.html)
	
	[状況]
	・ラジオボタンで「男」ををデフォルトチェックにしたいが、タグが反映しない。
	
	[解決]
	formタグで呼び出しているth:objectで指定しているフォームクラスのフィールト値にデフォルトで「男」を設定することで解決。

2015/12/21: 未解決

	[画面]
	購入履歴画面(buyinghistory.html)
	
	[状況]
	商品名で検索できない。
	購入日時の「新しい順」「古い順」が機能しない。
	「決済方法」でソート出来ない。
	「配送方法」でソート出来ない。

2015/12/03: 解決済

	[状況]
	・ユーザー登録時、「名前」項目を指定しなくても登録できてしまう。
	・ユーザー登録時、「パスワード」項目を指定しなくても登録できてしまう。
	
	[解決]
	・バリデーション機能を実装する。

2015/12/03: 未解決

	[状況]
	・DDLを変更しGradlew Generatorを再実行すると、mapperクラスが自動で削除・再生成される。
	その為、独自に実装したメソッドがクラス内から消去されてしまう。
	
	[原因]
	・不明
	
	[解決策]
	・自動生成されるmapperクラスとは別に、独自mapperクラス(Exmapperクラス)を定義する。
	
2015/12/02: 解決済
	
	[状況]
	・hmtlファイルに同じ記述があり、修正時に時間がかかる。＋修正ミスがある
	
	[解決策]
	インクルードについて調べ、実装する。
	
	[解決]
	Thymeleafのインクルードタグを使用し、テンプレート化した。
	
2015/12/02: 解決済

	[状況]
	・会員登録時に「ユーザー名」「パスワード」を同じにすると、会員登録は出来るが、ログイン時にエラーになる。
	
	[原因]
	データベースにログインID列に重複データを入力できる為。
	
	[解決策]
	・loginId列の他に、別途ユーザー管理ID列(シリアル)を追加。
	
