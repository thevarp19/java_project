package comp.company;

import java.util.Scanner;

public class ClientMod extends AdminMod {
    Scanner in = new Scanner(System.in);
    String Basket="Basket: \n";
    int TotalPrice;
    String[] msggg;
    String[] menuu;
    String[][] Smenu;
    int[][] price;
    int Menuselect;
    int subselect;

    public void setAll(String[] menuu, String[][] Smenu, String[] msggg, int[][] price) {
        this.menuu = menuu;
        this.Smenu = Smenu;
        this.msggg = msggg;
        this.price = price;
    }

    public void setMenu(int select) {
        Menuselect = select;
    }

    public void setSub(int subselect) {
        this.subselect = subselect;
    }

    public void Msg() {
        System.out.println();
        for (int i = 0; i < msggg.length; i++) {
            System.out.println(msggg[i]);
        }
        System.out.println("\n");
    }

    public void Menu() {
        for (int i = 0; i < menuu.length; i++) {
            if (menuu[i] == null) {
                ;
            } else {
                System.out.println(i + 1 + ". " + menuu[i] + ".");
            }
        }
    }

    public void Smenu() {
        for (int i = 1; i < Smenu[Menuselect].length+1; i++) {
            if (Smenu[Menuselect][i] == null) {break;} else {
                System.out.println(i  + ". " + Smenu[Menuselect][i-1] + " - " + price[Menuselect][i] + " kzt.");}}
                System.out.println();
                System.out.print("\nChoose a "+ menuu[Menuselect-1]+": ");
        }
        public void Basket(int Menuselect, int subselect){
            Basket+=Smenu[Menuselect][subselect-1]+" - "+price[Menuselect][subselect]+" kzt.\n";
            TotalPrice += price[Menuselect][subselect];
        }

        public String getBasket(){
        if(TotalPrice==0||Basket.equals("Basket: \n"))return "Basket is empty.\n"+"Total price: " + TotalPrice + " kzt.";
        return Basket+"\nTotal price: " + TotalPrice + " kzt.";
        }

    public String ClearBasket() {
        Basket="Basket: \n";
        TotalPrice=0;
        return Basket;
    }


}


