# tdd-myself

## cloud9
### test
`./gradlew test --tests "*FizzBuzzTest*"`

### vendingMachine
`http://devtesting.jp/tddbc/?TDDBC%E5%A4%A7%E9%98%AA3.0%2F%E8%AA%B2%E9%A1%8C`


## refactoring's codeSmell

- Long Method
    - 長過ぎるメソッド
    - メソッドの中で複数の仕事をしていないか？メソッドが分割できないか？

- Big Class
    - 長過ぎるクラス
    - そのクラスが複数の機能を持っていないか？クラスが分割できないか？

- Arrow
    - ifやforのネスト構造が深くなっていないか？
        ```
            if(){
                if(){
                    for(){
                        
                    }
                }
            }else{
                if(){
                    if(){
                        
                    }
                }
                
            }
        ```
    - ネストが深い条件式を別メソッドとして抽出できないか？

- Naming
    - 変数名や、メソッド名、クラス名が意味のある名前となっているか？
    - 意味のある名前に変える
        `i -> XXXcounter`、`name -> playerName`とか

- Long Parameters
    - メソッドの引数に渡しているパラメータが多すぎていないか？（大体２個とか３個くらいまで）
    - 多すぎるパラメータはオブジェクトにひとまとめにし、オブジェクトに意味を持たせる
        - `calcArea(int width, int height, int pai, String color)` → `calcArea(Round round)`

- Duplicate Code
    - コード上に重複した記述がないか？
    - メソッドなどで共通化する

- Primitive Obsession
    - intやbooleanなど、プリミティブ型の変数をメソッド内で直接使用していないか？
    - プリミティブ型を持つ小さなクラスを作り、その値を使用する。
    - プリミティブな変数を使用するメソッドは小さなクラスに移動できるかもしれない。

- Data class
    - データを格納するだけのオブジェクトになっていないか？
    - そのオブジェクトを使っているロジックはオブジェクト内に移動できる可能性がある。
        ```
            int summary = object.getXXX() + object.getYYY(); 
            object.setUUU(summary);
        ```
        ↓
        ```
            void calc(){
                int summary = this.XXX + this.YYY 
                this.UUU = summary; 
            }
        ```

- Feature Envy
    - 他のクラスのデータに頻繁にアクセスするロジックとなっていないか？
    - 他のクラス自体にそのロジックを移植できる可能性がある。

- Dead Code
    - 到達不可能なロジックが存在していないか？

- Magic Number
    - ロジック内に数字をそのまま埋め込んでいないか？
    - 数字自体は自分が何者なのかを何も語らない。
    - 定数などに置き換えて、数字に意味を持たせる。