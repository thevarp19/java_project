package comp.company;
import java.util.*;
public class project1 {
    public static void main(String[] args) {

        int TotalPrice = 0;
        int Price=0;
        String basket = "Basket: \n";
        Scanner s = new Scanner(System.in);
        System.out.println("Hi there!");
        System.out.println("");
        System.out.println("Welcome to the menu of \"SALAM BRO\" Fast Food Station. ");
        System.out.println("Here you can see our menu below.");

        while (true) {
            // menu

            System.out.println("");
            System.out.println("0. Exit menu.");
            System.out.println("1. Burgers.");
            System.out.println("2. Hot dogs.");
            System.out.println("3. French fries.");
            System.out.println("4. Drinks.");
            System.out.println("5. Sauces.");
            System.out.println("6. Additives.");
            System.out.println("7. Clear basket.");
            System.out.println("8. Check basket.");
            System.out.println(" ");
            System.out.println("Choose one: ");
            //price
            TotalPrice=TotalPrice+Price;
            //choose
            int a = s.nextInt();


            if (a == 1) {
                System.out.println("0. Exit menu.");
                //burgers
                System.out.println("1. Chicken hamburger - 590 kzt");
                System.out.println("2. Beef hamburger - 790 kzt.");
                System.out.println("3. Chicken cheeseburger - 790 kzt.");
                System.out.println("4. Beef cheeseburger - 890 kzt.");
                System.out.println("5. Double chicken hamburger - 990 kzt.");
                System.out.println("6. Double chicken cheeseburger - 1090 kzt.");
                System.out.println("7. Double beef hamburger - 1090 kzt.");
                System.out.println("8. Double beef cheeseburger - 1190 kzt.");
                System.out.println("9. Mixed hamburger - 1090 kzt.");
                System.out.println("10. Mixed cheeseburger - 1190 kzt.");
                System.out.println(" ");
                System.out.println("Choose a burger: ");
                int b = s.nextInt();

                switch (b) {
                    case 1:
                        //Chicken hamburger
                        Price = 590;
                        basket += "Chicken hamburger - 590 kzt.\n";
                        break;
                    case 2:
                        //Beef hamburger
                        Price = 790;
                        basket += "Beef hamburger - 790 kzt.\n";
                        break;
                    case 3:
                        //Chicken cheeseburger
                        Price = 790;
                        basket += "Chicken cheeseburger - 790 kzt.\n";
                        break;
                    case 4:
                        //Beef cheeseburger
                        Price = 890;
                        basket += "Beef cheeseburger - 890 kzt.\n";
                        break;
                    case 5:
                        //Double chicken hamburger
                        Price = 990;
                        basket += "Double chicken hamburger - 990 kzt.\n";
                        break;
                    case 6:
                        //Double chicken cheeseburger
                        Price = 1090;
                        basket += "Double chicken cheeseburger - 1090 kzt.\n";
                        break;
                    case 7:
                        //Double beef hamburger
                        Price = 1090;
                        basket += "Double beef hamburger - 1090 kzt.\n";
                        break;
                    case 8:
                        //Double beef cheeseburger
                        Price = 1190;
                        basket += "Double beef cheeseburger - 1190 kzt.\n";
                        break;
                    case 9:
                        //Mixed hamburger
                        Price = 1090;
                        basket += "Mixed hamburger - 1090 kzt.\n";
                        break;
                    case 10:
                        //Mixed cheeseburger
                        Price = 1190;
                        basket += "Mixed cheeseburger - 1190 kzt.\n";
                        break;
                }
            }
            if (a == 2) {
                System.out.println("0. Exit menu.");
                //Hot dogs
                System.out.println("1. Spicy hot dog - 590 kzt.");
                System.out.println("2. Hot dog - 590 kzt.");
                System.out.println("");
                System.out.println("Choose a hot dog: ");
                int c = s.nextInt();
                switch (c) {
                    case 1:
                        //Spicy hot dog
                        Price = 590;
                        basket += "Spicy hot dog - 590 kzt.\n";
                        break;
                    case 2:
                        //Hot dog
                        Price = 590;
                        basket += "Hot dog - 590 kzt.\n";
                        break;
                }
            }
            if (a == 3) {
                System.out.println("0. Exit menu.");
                //fries
                System.out.println("1. French fries - 390 kzt.");
                System.out.println("");
                System.out.println("Choose french fries: ");
                int d = s.nextInt();
                switch (d) {
                    case 1:  //french fries
                        Price = 390;
                        basket += "French fries - 390 kzt.\n";
                        break;
                }
            }

            if (a == 4) {
                System.out.println("0. Exit menu.");
                //drinks
                System.out.println("1. Coca-cola 0.5l - 250 kzt.");
                System.out.println("2. Fanta 0.5l - 250 kzt.");
                System.out.println("3. Sprite 0.5l - 250 kzt.");
                System.out.println("4. Fuse tea 0.5l - 250 kzt.");
                System.out.println("5. Bon aqua 0.5l - 250 kzt.");
                System.out.println("6. Raspberry compote 0.3l - 250 kzt.");
                System.out.println("7. Currant compote 0.3l - 250 kzt.");
                System.out.println("8. Piko pulpy 0.5l - 350 kzt.");
                System.out.println("");
                System.out.println("Choose a drink: ");
                int f = s.nextInt();
                switch (f) {
                    case 1:
                        //Coca-cola 0.5l
                        Price = 250;
                        basket = basket + "Coca-cola 0.5l - 250 kzt.\n";
                        break;
                    case 2:
                        //Fanta 0.5l
                        Price = 250;
                        basket = basket + "Fanta 0.5l - 250 kzt.\n";
                        break;
                    case 3:
                        //Sprite 0.5l
                        Price = 250;
                        basket += "Sprite 0.5l - 250 kzt.\n";
                        break;
                    case 4:
                        //Fuse tea 0.5l
                        Price = 250;
                        basket += "Fuse tea 0.5l - 250 kzt.\n";
                        break;
                    case 5:
                        //Bon aqua 0.5l
                        Price = 250;
                        basket += "Bon aqua 0.5l - 250 kzt.\n";
                        break;
                    case 6:
                        //Raspberry compote 0.3l
                        Price = 250;
                        basket += "Raspberry compote 0.3l - 250 kzt.\n";
                        break;
                    case 7:
                        //Currant compote 0.3l
                        Price = 250;
                        basket += "Currant compote 0.3l - 250 kzt.\n";
                        break;
                    case 8:
                        //Piko pulpy 0.5l
                        Price = 350;
                        basket += "Piko pulpy 0.5l - 350 kzt.\n";
                        break;
                }
            }

            if (a == 5) {
                System.out.println("0. Exit menu");
                //sauces
                System.out.println("1. Ketchup - 100 kzt.");
                System.out.println("2. Cheese sauce - 100 kzt.");
                System.out.println("3. Sauce BBQ - 100 kzt.");
                System.out.println("4. Spicy sauce - 50 kzt.");
                System.out.println("5. Mustard sauce - 100 kzt.");
                System.out.println("");
                System.out.println("Choose a sauce: ");
                int g = s.nextInt();
                switch (g) {
                    case 1:
                        //Ketchup
                        Price = 100;
                        basket += "Ketchup - 100 kzt.\n";
                        break;
                    case 2:
                        //Cheese sauce
                        Price = 100;
                        basket += "Cheese sauce - 100 kzt.\n";
                        break;
                    case 3:
                        //Sauce BBQ
                        Price = 100;
                        basket += "Sauce BBQ - 100 kzt.\n";
                        break;
                    case 4:
                        // Spicy sauce
                        Price = 50;
                        basket += "Spicy sauce - 50 kzt.\n";
                        break;
                    case 5:
                        //Mustard sauce
                        Price = 100;
                        basket += "Mustard sauce - 100 kzt.\n";
                        break;
                }
            }

            if (a == 6) {
                System.out.println("0. Exit menu.");
                // additives
                System.out.println("1. Jalapeno - 100 kzt.");
                System.out.println("2. Cheese - 150 kzt.");
                System.out.println("");
                System.out.println("Choose an additive: ");
                int h = s.nextInt();
                switch (h) {
                    case 1:
                        //Jalapeno
                        Price = 100;
                        basket += "Jalapeno - 100 kzt.\n";
                        break;
                    case 2:
                        //Cheese
                        Price = 150;
                        basket += "Cheese - 150 kzt.\n";
                        break;
                }
            }
            if (a == 7) {
                Price = 0;
                TotalPrice = 0;
                basket = "";

            }

            if (a == 8) {


                if (TotalPrice == 0) {
                    System.out.println();
                    System.out.println("Basket is empty.");
                    System.out.println("Total price: " + TotalPrice + " kzt");

                } else {

                    System.out.println(basket);
                    System.out.println("Total price: " + TotalPrice + " kzt");
                }
            }
        }
    }
}






