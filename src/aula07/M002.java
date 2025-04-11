package aula07;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class M002 {
    public static void main(String[] args) {
        ArrayList<Itinerario> itinerarios =
                new ArrayList<Itinerario>();

        itinerarios.add(new Itinerario("Região Norte",
                500.0, 900.0));
        itinerarios.add(new Itinerario("Região Nordeste",
                350.0, 650.0));
        itinerarios.add(new Itinerario("Região Centro-Oeste",
                350.0, 600.0));
        itinerarios.add(new Itinerario("Região Sul",
                300.0, 550.0));

        for (int pos = 0; pos < itinerarios.size(); pos++){
            Itinerario itinerario = itinerarios.get(pos);
            System.out.printf("%d) Destino: %s - Ida: %f - Ida e Volta: %f\n",
                    pos, itinerario.destino, itinerario.ida, itinerario.idaVolta);
        }

        int pos = Integer.parseInt(JOptionPane.showInputDialog("Qual Itinerário?"));
        int soIda = JOptionPane.showConfirmDialog(null
                , "Somente Ida?", "Confirmação",
                JOptionPane.YES_NO_OPTION);

        JOptionPane.showMessageDialog(null,
                soIda == JOptionPane.YES_OPTION ?
                itinerarios.get(pos).ida:
                itinerarios.get(pos).idaVolta);






    }
}
