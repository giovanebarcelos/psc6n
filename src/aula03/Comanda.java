package aula03;

import java.util.ArrayList;
import java.util.Scanner;

public class Comanda {
    private ArrayList<TipoComanda> itensComanda;
    private int prato;
    private int sobremesa;
    private int bebida;

    public Comanda(){
        this.itensComanda = new ArrayList<TipoComanda>();
        this.itensComanda.add(new TipoComanda("PRATO", 1, "Vegetariano", 180));
        this.itensComanda.add(new TipoComanda("PRATO", 2, "Peixe", 230));
        this.itensComanda.add(new TipoComanda("PRATO", 3, "Frango", 250));
        this.itensComanda.add(new TipoComanda("PRATO", 4, "Carne", 350));
        this.itensComanda.add(new TipoComanda("SOBREMESA", 5, "Abacaxi", 75));
        this.itensComanda.add(new TipoComanda("SOBREMESA", 6, "Sorvete Diet", 110));
        this.itensComanda.add(new TipoComanda("SOBREMESA", 7, "Mousse Diet", 170));
        this.itensComanda.add(new TipoComanda("SOBREMESA", 8, "Mousse Chocolate", 200));
        this.itensComanda.add(new TipoComanda("BEBIDA", 9, "Chá", 20));
        this.itensComanda.add(new TipoComanda("BEBIDA", 10, "Suco de Laranja", 70));
        this.itensComanda.add(new TipoComanda("BEBIDA", 11, "Suco de Melão", 100));
        this.itensComanda.add(new TipoComanda("BEBIDA", 12, "Refrigerante diet", 65));

    }
    public void getPedido() {
        this.prato = getCodigoPrato();
        this.sobremesa = getCodigoSobremesa();
        this.bebida = getCodigoBebida();
    }

    private int getCodigoBebida() {
        imprimirMenu("BEBIDA");

        System.out.print("\nDigite código da bebida: ");
        Scanner scanner = new Scanner(System.in);
        int codigoBebida = scanner.nextInt();

        return codigoBebida;
    }

    private int getCodigoSobremesa() {
        imprimirMenu("SOBREMESA");

        System.out.print("\nDigite código da sobremesa: ");
        Scanner scanner = new Scanner(System.in);
        int codigoSobremesa = scanner.nextInt();

        return codigoSobremesa;
    }

    private int getCodigoPrato() {
        imprimirMenu("PRATO");

        System.out.print("\nDigite código do prato: ");
        Scanner scanner = new Scanner(System.in);
        int codigoPrato = scanner.nextInt();

        return codigoPrato;
    }

    private void imprimirMenu(String tipo) {
        for (TipoComanda tipoComanda: this.itensComanda){
            if (tipo.equals(tipoComanda.getTipo())){
                System.out.printf("\n%d - %s",
                        tipoComanda.getCodigo(),
                        tipoComanda.getDescricao());
            }
        }

    }

    private int getCalorias(String tipoPrato, int codigoPrato){
        int calorias = 0;
        for (TipoComanda tipoComanda: itensComanda){
            if (tipoPrato.equals(tipoComanda.getTipo()) &&
                codigoPrato == tipoComanda.getCodigo()){
                calorias = tipoComanda.getCalorias();
            }
        }
        return calorias;
    }

    public int getTotalCalorias() {
        return this.getCalorias("PRATO", prato) +
                this.getCalorias("SOBREMESA", sobremesa) +
                this.getCalorias("BEBIDA", bebida);
    }
}
