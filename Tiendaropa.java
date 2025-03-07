public class Tiendaropa {
    public static void main(String[] args) {
        float Preciocamisa = 25;
        float Preciopantalon = 30;
        float Cantidadcamisas = 1;
        float Cantidadpantalon = 1;
        float Suma = (Preciocamisa + Preciopantalon);
        float Descuentodel15 = Suma * 0.15f;
        float Descuentodel5 = Suma * 0.05f;
        float Descuentototal = Suma - Descuentodel15;

    System.out.println("El descuento total de las prendas es " +Descuentototal);



    }
    
}
