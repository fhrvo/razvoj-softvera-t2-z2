package sample;

import javafx.event.ActionEvent;

import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField uneseno;
    public TextArea area;

    public int sumaCifara(int broj) {
        int suma=0;
        while(broj>0){
            suma = suma + broj%10;
            broj = broj/10;
        }
        return suma;
    }

    public void Unesi(ActionEvent actionEvent){
        String vrijednost = uneseno.getText();
        int broj = Integer.parseInt(vrijednost), brojac=1;
        String ispis = new String();
        for (int i=1; i<=broj; i++) {
            if (brojac==10) {
                ispis= ispis + "\n";
                brojac=0;
            }
            if (i%sumaCifara(i)==0) {
                ispis = ispis + i + ", ";
                brojac++;
            }
        }
            area.setText(ispis);
    }
}
