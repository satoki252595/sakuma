class Product{

    String name;  //商品名
    int num;      //商品数
    String text;  //仮。商品画像を格納する変数。メソッドで定義するのかも。

    Product(String name){
        this.name = name;
        this.num = 10;
        this.text = "コーラ";
    }

    void sample(){
        System.out.println(name);
    }

}
