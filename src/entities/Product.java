package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    //criar um contrutor para garantir que o usuário insira os dados
    public Product (String name, double price, int quantity) {
        //this - serve para referenciar o objeto(Public String name)
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock (){
        return price * quantity;
    }

    //usa o valor do quantity(da classe) e soma com o quantity(atributo)
    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    //saida estoque
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    //toString -> converter o objeto produto em string
    public String toString() {
        return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $" + String.format("%.2f", totalValueInStock());
    }
}
