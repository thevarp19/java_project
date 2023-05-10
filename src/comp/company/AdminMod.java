package comp.company;
import java.util.*;
public class AdminMod {
    public static void main(String[] args) {
        ClientMod client=new ClientMod();
        int l=1;
        Scanner in = new Scanner(System.in);
        int[] count = null;
        String msg = "";String menu = "";String submenu = "";String change="";String indexes="";
        String []msggg=null;String[] menuu = new String[0];String[][] Smenu = new String[0][0];String []sub=null;String []choice=null;String[]index=null;
        int []numbers=new int[0];int [][]price=new int [0][0];int []remove=new int[100];


        System.out.println("Welcome to the Admin Panel of \"SALAM BRO\" Fast Food Station! \nHere you can do the following activities:");
        while (true) {
            // menu
            System.out.print(" \n0. Exit.\n1. Change Welcome Message.\n2. Change Menu.\n3. Change Submenu.\n4. Change Prices.\n5. Display Welcome Message.\n6. Display Menu.\n7. Display Submenu.\n8. Display Prices.\n9. Switch to Client Mode.\n \nChoose an activity:");
            int n = in.nextInt();
            switch (n) {
                case 0: {
                    System.out.println("Good bye :)");
                    break;
                }
                case 1: {
                    //massage
                    System.out.println("Please, type the message that clients will see when they enter the menu: \nTip: use underscore (_) as a splitter");
                    in.nextLine();
                    System.out.print(">");
                    msg = in.nextLine();
                    msggg = msg.split(" _ ");

                }
                break;
                case 2: {
                    //menu
                    while (true) {
                        System.out.print("Here you can do the following activities: \n0. Go Back. \n1. Add categories.\n2. Remove categories. \n \nYou choice: ");

                        int twoo = in.nextInt();
                        if (twoo == 0) {
                            break;
                        }
                        if (twoo == 1) {
                            System.out.println("Write the names of categories separated by comma(c1, c2, ...):");
                            in.nextLine();
                            System.out.print(">");
                            menu = in.nextLine();
                            menuu = menu.split(", ");
                            Smenu=new String[menuu.length+1][100];
                            price=new int[menuu.length][100];
                            count=new int[menuu.length];
                            break;
                        }
                        if (twoo == 2) {
                            if (menu.length() == 0) {
                                System.out.println("You don't have a menu yet");
                            } else {
                                menu = "";
                                submenu = "";
//                                System.out.println("Choose the menu you want to remove by its index shown below: ");
//                                l=1;
//                                for (int i = 0; i < menuu.length; i++) {
//                                    if (menuu[i]==null){break;}
//                                    else {System.out.println(l + ". " + menuu[i] + ".");}
//                                    l++;
//                                }
//                                in.nextLine();
//                                indexes = in.nextLine();
//                                index = indexes.split(", ");
//                                remove = new int[index.length];
//                                for (int i = 0; i < remove.length; i++) {
//                                    remove[i] = Integer.parseInt(index[i]);
//                                }
//                                int count = 0;
//                                for (int i = 0; i < remove.length; i++) {
//                                    System.arraycopy(menuu, remove[i] - 1 - count, menuu, remove[i] - 1, menuu.length - remove[i]);
//                                    menuu[remove[i] - 1-count] = null;
//                                    for (int j = 0; j < menuu.length; j++) {
//                                        Smenu[remove[i] - count][j] = null;
//                                        price[remove[i] - count][j] = 0;
//                                    }
//                                    count++;

                            }

                            break;
                        }
                    }
                }

                break;
                case 3: {
                    while (true) {
                        System.out.print("Here you can do the following activities: \n0. Go Back. \n1. Add categories.\n2. Remove categories. \n \nYou choice: ");
                        int threee = in.nextInt();
                        if (threee == 0) {
                            break;
                        }
                        if (threee == 1) {
                            for (int i = 0; i < menuu.length; i++) {
                                System.out.println(i+1 + ". " + menuu[i] + ".");
                            }
                            int sss = in.nextInt();
                            System.out.println();
                            System.out.println("Write the names of categories separated by comma(c1, c2, ...): ");
                            in.nextLine();
                            System.out.print(">");
                            submenu = in.nextLine();
                            sub = submenu.split(", ");
                            for (int i = 0; i < sub.length; i++){
                                Smenu[sss][count[sss]] = sub[i];
                            count[sss]++;
                            }
                            break;
                        }
                        if (threee == 2) {
                            for (int i = 0; i < menuu.length; i++) {
                                System.out.println(i + 1 + ". " + menuu[i] + ".");
                            }
                            int sss = in.nextInt();
                            System.out.println("Choose subcategories you want to remove by its index shown below: ");
                            if (Smenu[sss][0] == null) {
                                System.out.println("You don't have subcategories in this category.");
                                System.out.println();
                            } else {
                                for (int i = 0; i < Smenu[sss].length; i++) {
                                    if (Smenu[sss][i] == null) {
                                        break;
                                    } else {
                                        System.out.println(i + 1 + ". " + Smenu[sss][i] + ".");
                                    }
                                }
                                System.out.println("Tip: write the indexes separated by comma (i1, i2, ...)");
                                System.out.print("\n>");
                                in.nextLine();
                                indexes = in.nextLine();
                                index = indexes.split(", ");
                                remove = new int[index.length];
                                for (int i = 0; i < remove.length; i++) {
                                    remove[i] = Integer.parseInt(index[i]);
                                }
                                int countt = 0;
                                for (int i = 0; i < remove.length; i++) {
                                    System.arraycopy(Smenu[sss], remove[i] - countt, Smenu[sss], remove[i] - 1 - countt, 25);
                                    System.arraycopy(price[sss], remove[i] + 1 - countt, price[sss], remove[i] - countt, 25);
                                    countt++;
                                }
                            }
                        }

                        break;}

                }

                break;

                case 4: {
                    while (true) {
                        if (menu.length() == 0) {
                            System.out.println("You don't have a menu yet. ");
                        } else {
                            System.out.println("Choose the category for which you want to change prices of subcategories: ");
                            for (int i = 0; i < menuu.length; i++) {
                                System.out.println(i + 1 + ". " + menuu[i] + ".");
                            }
                            int prc = in.nextInt();
                            if (Smenu[prc][0] == null) {
                                System.out.println("You don't have subcategories in this category.");
                                System.out.println();
                            } else {
                                for (int i = 0; i < Smenu[prc].length; i++) {
                                    if (Smenu[prc][i] == null) {
                                        break;
                                    } else {
                                        System.out.println(i + 1 + ". " + Smenu[prc][i] + " - " + price[prc][i] + " kzt.");
                                    }
                                }
                                System.out.println("Tip: write the indexes separated by comma (i1, i2, ...)");
                                in.nextLine();
                                change = in.nextLine();
                                choice = change.split(", ");
                                numbers = new int[choice.length];
                                for (int i = 0; i < choice.length; i++) {
                                    numbers[i] = Integer.parseInt(choice[i]);
                                }
                                for (int i = 0; i < numbers.length; i++) {
                                    System.out.print("Enter a new price for " + Smenu[prc][numbers[i] - 1] + ":");
                                    price[prc][numbers[i]] = in.nextInt();
                                }
                            }

                        }
                        break;
                    }

                }


                break;
                case 5: {
                    if (msg.equals("")) {
                        System.out.println("You don't have a Welcome Message yet.");
                    } else {
                        for (int i=0;i<msggg.length;i++)
                        System.out.println(msggg[i]);
                    }
                }
                break;
                case 6: {
                    if (menu.length() == 0) {
                        System.out.println("You don't have a menu yet. ");
                    } else {
                        for (int i = 0; i < menuu.length; i++) {
                            if (menuu[i] == null) {
                                ;
                            } else {
                                System.out.println(i+1 + ". " + menuu[i] + ".");
                            }
                        }
                    }
                }


                break;
                case 7: {
                    while (true) {
                        if (submenu.equals("")) {
                            System.out.println("You don't have a menu yet. ");
                        } else {
                            l=1;
                            System.out.println("Choose the category for which you want to see its subcategories: ");
                            for (int i = 0; i < menuu.length; i++) {
                                if(menuu[i]==null){;}
                                else{System.out.println(l + ". " + menuu[i] + ".");
                                l++;}
                            }
                            int svn = in.nextInt();
                            if (Smenu[svn][0]==null) {
                                System.out.println("You don't have subcategories in this category.");
                                System.out.println();
                            } else {
                                for (int i = 0; i < Smenu[svn].length; i++) {
                                    if(Smenu[svn][i]==null){break;}
                                    else {
                                        System.out.println(i+1  + ". " + Smenu[svn][i] + ".");
                                    }
                                }

                            }
                        }
                        break;
                    }
                }
                break;

                case 8: {
                    while (true) {
                        if (menu.length() == 0) {
                            System.out.println("You don't have a menu yet. ");
                        } else {
                            System.out.println("Choose the category for which you want to change prices of subcategories: ");
                            for (int i = 0; i < menuu.length; i++) {
                                System.out.println(i + 1 + ". " + menuu[i] + ".");
                            }
                            int prc = in.nextInt();
                            if (Smenu[prc][0] == null) {
                                System.out.println("You don't have subcategories in this category.");
                                System.out.println();
                            } else {
                                for (int i = 1; i < Smenu[prc].length+1; i++) {
                                    if (Smenu[prc][i-1] == null) {
                                        break;
                                    } else {
                                        System.out.println(i  + ". " + Smenu[prc][i-1] + " - " + price[prc][i] + " kzt.");
                                    }
                                }
                            }
                        }
                        break;}
                }break;
                case 9:{
                    client.setAll(menuu, Smenu, msggg, price);
                    int MenuSelect;
                    int SubSelect;
                    client.Msg();
                    while (true){

                        client.Menu();
                        System.out.print(""+(menuu.length+1) +". Clear basket."+"\n"+(menuu.length+2) +". Check basket.\n \nChoose one: ");
                        MenuSelect= in.nextInt();
                        if(MenuSelect==0){break;}
                        if(MenuSelect==menuu.length+1){client.ClearBasket();
                            System.out.println();continue;}
                        if(MenuSelect==menuu.length+2) {System.out.println(client.getBasket());
                            System.out.println();continue;}
                        client.setMenu(MenuSelect);
                        client.Smenu();
                        SubSelect = in.nextInt();
                        client.Basket(MenuSelect,SubSelect);
                        client.setSub(SubSelect);
                        }


                    }

                }


            }
        }
    }
