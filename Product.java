class Product{

    String name;  //商品名
    int num;      //商品数
    int price;    //値段

    Product(String name,int price){
        this.name = name;
        this.num = 10;
        this.price = price;

    }

    void sample(){
        System.out.println(name);
    }

}
