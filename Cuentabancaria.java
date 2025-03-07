public class Cuentabancaria {
    public static void main(String[] args) {
        int Dinerototal = 1000;
        int Descuentosemanal = 200;
        int Cantidadsemanas = 4;
        int Totalsacadofinmes = (Descuentosemanal * Cantidadsemanas);
        int Totaldinerofinmes = (Dinerototal - Totalsacadofinmes);
            System.out.println("El dinero total en la cuenta a fin de mes es; " +Totaldinerofinmes);
        } 

    } 
    
