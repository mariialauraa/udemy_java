public class Produto {

    private String name;
    private double price;
    private int qtd;

    public Produto(String name, double price, int qtd) {
        this.name = name;
        this.price = price;
        this.qtd = qtd;
    }

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtd() {
        return qtd;
    }

    public double totalEstoque(){
        return price * qtd;
    }

    public void addProd(int qtde){
        this.qtd += qtde;
        //this.qtd = qtd + qtde;

    }
    public void removeProd(int qtde){
        this.qtd -= qtde;
    }

    public String toString(){
        return name + ", $ "
                + String.format("%.2f", price) + ", "
                + qtd + " unds, Total: $ "
                + String.format("%.2f", totalEstoque());
    }

}
