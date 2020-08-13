# Geb Simple Sample

## このプロジェクトは？
Geb+Spockを使った単純なサンプルです
GoogleでGebを検索するシナリオを実装してます

## テストの実行
以下のコマンドを実行します

```sh
./gradlew check
```

## テスト結果
テスト結果は以下に出力されます

`build/reports/tests`

また、specのメソッドの単位で自動的にキャプチャが取得されます。以下に出力されます

`build/geb-reports`


## 環境
実行環境はWinidowsを想定します。
ブラウザはChromeを利用しています。変更する場合は`src/test/resources/GebConfig.groovy`を参照してください