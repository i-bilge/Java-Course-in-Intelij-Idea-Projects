
public class Main {

    public static void main(String[] args) {
        Pruduct product = new Pruduct();
        product.name = "Laptop";
        product.id = 1;
        product.description = "Asus Laptop";
        product.price = 5000;
        product.stockAmount = 3;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }
    // bu özellikleri tutacak classi actik. bir de bu zellikleri kullanaak class aciyoruz; ProductManager diye.
    // Bu single responsbility kuralidir. islem classlari islemleri, attribut classlari da özellikleri icermeli.


}
