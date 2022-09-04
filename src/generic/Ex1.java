package generic;

import java.util.ArrayList;

class Product {
}

class Tv extends Product {
}

class Audio extends Product {
}

// 제네릭 다형성
public class Ex1 {
    public static void main(String[] args) {

        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvList = new ArrayList<Tv>();

        // product 자식이라 가능
        productList.add(new Tv());  // 다형성
        productList.add(new Audio());   // 다형성

        // 부모 객체...
        // tvList.add(new Product());

    }
}
