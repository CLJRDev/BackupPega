public class Product<T, U> {

    T item;
    U price;

    Product(T item, U price){
        this.item = item;
        this.price = price;
    }

    T getItem(){
        return  this.item;
    }
    U getPrice() {
        return this.price;
    }
}
