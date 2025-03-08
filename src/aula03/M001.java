package aula03;
public class M001 {
    public static void main(String[] args) {
        Comanda comanda = new Comanda();

        comanda.getPedido();
        int totalCalorias = comanda.getTotalCalorias();

        System.out.printf("\nTotal de Calorias é %d\n", totalCalorias);
    }
}
