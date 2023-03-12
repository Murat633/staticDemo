public class ProductValidator {

    static {
        System.out.println("Static Yapıcı Blok Çalıştırıldı");
    }

    public ProductValidator(){
        System.out.println("Yapıcı Blok Çalıştırıldı.");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
