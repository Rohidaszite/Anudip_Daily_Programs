import java.util.Scanner;

class HotelMenuCard {
    public static void main(String[] args) {
        int main_choice, choice, item_choice, n;
        char ch;
        double Bill = 0;
        String Bill_item = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("------- Welcome to Rohidas Restaurant -------");
        System.out.println("******* Menu *******");
        System.out.println("1) Veg\n2) Non-Veg");
        main_choice = sc.nextInt();
        switch (main_choice) {
            case 1:
                do {
                    System.out.println("1) Starters"
                            + "\n2) SUBZ-E-Chaman"
                            + "\n3) Roti / NAN / Kulcha"
                            + "\n4) Papad"
                            + "\n5) Cold Drinks");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            do {
                                System.out.println(" Starters"
                                        + "\n1) Pannir Palak Cheese Tikka\t\t220Rs."
                                        + "\n2) Pannir Afghani Tikka\t\t\t210Rs."
                                        + "\n3) Pannir Seek Kabab\t\t\t210Rs."
                                        + "\n4) Veg Seek Kabab\t\t\t160Rs.");
                                item_choice = sc.nextInt();
                                System.out.print("How many Starters you want=");
                                n = sc.nextInt();

                                switch (item_choice) {
                                    case 1:
                                        Bill += n * 220;
                                        Bill_item += " Pannir Palak Cheese Tikka\t220Rs." + "\t  " + n + "\n";
                                        break;
                                    case 2:
                                        Bill += n * 210;
                                        Bill_item += " Pannir AfghaniTikka\t\t210Rs." + "\t  " + n + "\n";
                                        break;
                                    case 3:
                                        Bill += n * 210;
                                        Bill_item += " Pannir Seek Kabab\t\t210Rs." + "\t  " + n + "\n";
                                        break;
                                    case 4:
                                        Bill += n * 160;
                                        Bill_item += " Veg Seek Kabab\t\t\t160Rs." + "\t  " + n + "\n";
                                        break;
                                    default:
                                        break;
                                }
                                System.out.println("Do you want to more Element in Starts Menu Y/N");
                                ch = sc.next().charAt(0);
                            } while (ch == 'Y' || ch == 'y');
                            break;
                        case 2:
                            do {
                                System.out.println(" SUBZ-E-Chaman"
                                        + "\n1) Pannir Masala\t\t150Rs."
                                        + "\n2) Pannir Kadai\t\t\t210Rs."
                                        + "\n3) Mix Veg\t\t\t160Rs."
                                        + "\n4) Veg Handi\t\t\t180Rs."
                                        + "\n5) Veg Kadai\t\t\t180Rs.");
                                item_choice = sc.nextInt();
                                System.out.print("How many SUBZ-E-Chaman you want=");
                                n = sc.nextInt();

                                switch (item_choice) {
                                    case 1:
                                        Bill += n * 150;
                                        Bill_item += " Pannir Masala\t\t\t150Rs." + "\t  " + n + "\n";
                                        break;
                                    case 2:
                                        Bill += n * 210;
                                        Bill_item += " Pannir Kadai\t\t\t210Rs." + "\t  " + n + "\n";
                                        break;
                                    case 3:
                                        Bill += n * 160;
                                        Bill_item += " Mix Veg\t\t\t160Rs." + "\t  " + n + "\n";
                                        break;
                                    case 4:
                                        Bill += n * 180;
                                        Bill_item += " Veg Handi\t\t\t180Rs." + "\t  " + n + "\n";
                                        break;
                                    case 5:
                                        Bill += n * 180;
                                        Bill_item += " Veg Kadai\t\t\t180Rs." + "\t  " + n + "\n";
                                        break;
                                    default:
                                        break;
                                }
                                System.out.println("Do you want to more Element in Starts Menu Y/N");
                                ch = sc.next().charAt(0);
                            } while (ch == 'Y' || ch == 'y');
                            break;
                        case 3:
                            System.out.println(" Roti / Kulcha"
                                    + "\n1) Roti\t\t\t20Rs."
                                    + "\n2) Wheat Roti\t\t30Rs."
                                    + "\n3) Kulcha\t\t40Rs."
                                    + "\n4) Paratha\t\t40Rs.");
                            item_choice = sc.nextInt();
                            System.out.print("How many Roti / Kulcha you want=");
                            n = sc.nextInt();

                            switch (item_choice) {
                                case 1:
                                    Bill += n * 20;
                                    Bill_item += " Roti\t\t\t\t20Rs." + "\t  " + n + "\n";
                                    break;
                                case 2:
                                    Bill += n * 30;
                                    Bill_item += " Wheat Roti\t\t\t30Rs." + "\t  " + n + "\n";
                                    break;
                                case 3:
                                    Bill += n * 40;
                                    Bill_item += " Kulcha\t\t\t\t40Rs." + "\t  " + n + "\n";
                                    break;
                                case 4:
                                    Bill += n * 40;
                                    Bill_item += " Paratha\t\t\t\t40Rs." + "\t  " + n + "\n";
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println(" Papad"
                                    + "\n1) Masala Papad\t\t\t30Rs."
                                    + "\n2) Fried Papad\t\t\t20Rs."
                                    + "\n3) Roasted Papad\t\t20Rs");
                            item_choice = sc.nextInt();
                            System.out.print("How many Papad you want=");
                            n = sc.nextInt();

                            switch (item_choice) {
                                case 1:
                                    Bill += n * 30;
                                    Bill_item += " Masala Papad\t\t\t30Rs." + "\t  " + n + "\n";
                                    break;
                                case 2:
                                    Bill += n * 20;
                                    Bill_item += " Fried Papad\t\t\t20Rs." + "\t  " + n + "\n";
                                    break;
                                case 3:
                                    Bill += n * 20;
                                    Bill_item += " Roasted Papad\t\t\t20Rs." + "\t  " + n + "\n";
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 5:
                            System.out.println(" Cold Drinks"
                                    + "\n1) Pepsi / Mirinda / 7Up\t\t25Rs."
                                    + "\n2) Pepsi / Mirinda / 7Up(Hafe Litre)\t50Rs."
                                    + "\n3) Mirinda(Full Litre)\t\t\t100Rs."
                                    + "\n4) Aquafina(pure Drinking Water)\t25Rs.");
                            item_choice = sc.nextInt();
                            System.out.print("How many Cold Drinks you want=");
                            n = sc.nextInt();

                            switch (item_choice) {
                                case 1:
                                    Bill += n * 25;
                                    Bill_item += " Pepsi/Mirinda/7Up\t\t25Rs." + "\t  " + n + "\n";
                                    break;
                                case 2:
                                    Bill += n * 50;
                                    Bill_item += " Pepsi/Mirinda/7Up{Hafe Litre)  50Rs." + "\t  " + n + "\n";
                                    break;
                                case 3:
                                    Bill += n * 100;
                                    Bill_item += " Mirinda(Full Ltre)\t\t100Rs." + "\t  " + n + "\n";
                                    break;
                                case 4:
                                    Bill += n * 25;
                                    Bill_item += " Aquafina(Pure Drinking Water)  25Rs." + "\t  " + n + "\n";
                                    break;
                                default:
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Enter Valid case");
                            break;
                    }
                    System.out.println("Do you want to more Element in Main Menu Y/N");
                    ch = sc.next().charAt(0);
                } while (ch == 'Y' || ch == 'y');
                System.out.println("-------------------------------------------------------------");
                System.out.println("<<<<<<<<<<< Bill Details >>>>>>>>>>>");
                System.out.println("-------------------------------------------------------------");
                System.out.println("Item Name\t\t\tPrice\tQuantity\n");
                System.out.println(Bill_item);
                System.out.println("-------------------------------------------------------------");
                System.out.println("Total Amount=" + Bill);
                System.out.println("-------------------------------------------------------------");
                System.out.println("Thank You For Coming in Rohidas Restaurant");
                System.out.println("-------------------------------------------------------------");
                break;
            case 2:

                do {
                    System.out.println("1) Fish Curry"
                            + "\n2) Chicken Thali"
                            + "\n3) Fish Fry"
                            + "\n4) Fish Thali");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            do {
                                System.out.println(" Fish Curry"
                                        + "\n1) Bombil Curry\t\t\t120Rs."
                                        + "\n2) Surmai Curry\t\t\t250Rs."
                                        + "\n3) Halwa Curry\t\t\t250Rs."
                                        + "\n4) Paplet Curry\t\t\t270Rs.");
                                item_choice = sc.nextInt();
                                System.out.print("How many Fish Curry you want=");
                                n = sc.nextInt();

                                switch (item_choice) {
                                    case 1:
                                        Bill += n * 120;
                                        Bill_item += " Bombil Curry\t\t\t120Rs." + "\t  " + n + "\n";
                                        break;
                                    case 2:
                                        Bill += n * 250;
                                        Bill_item += " Surmai Curry\t\t\t250Rs." + "\t  " + n + "\n";
                                        break;
                                    case 3:
                                        Bill += n * 250;
                                        Bill_item += " Halwa Curry\t\t\t250Rs." + "\t  " + n + "\n";
                                        break;
                                    case 4:
                                        Bill += n * 270;
                                        Bill_item += " Paplet Curry\t\t\t270Rs." + "\t  " + n + "\n";
                                        break;
                                    default:
                                        break;
                                }
                                System.out.println("Do you want to more Element in Fish Curry Menu Y/N");
                                ch = sc.next().charAt(0);
                            } while (ch == 'Y' || ch == 'y');
                            break;
                        case 2:
                            do {
                                System.out.println(" Chicken Thali"
                                        + "\n1) Malvani Chicken Thali\t200Rs."
                                        + "\n2) Malvani Mutton Thali\t\t350Rs."
                                        + "\n3) Chicken Liver Thali\t\t200Rs.");
                                item_choice = sc.nextInt();
                                System.out.print("How many Chicken Thali you want=");
                                n = sc.nextInt();

                                switch (item_choice) {
                                    case 1:
                                        Bill += n * 200;
                                        Bill_item += " Malvani Chicken Thali\t\t200Rs." + "\t  " + n + "\n";
                                        break;
                                    case 2:
                                        Bill += n * 350;
                                        Bill_item += " Malvani Mutton Thali\t\t350Rs." + "\t  " + n + "\n";
                                        break;
                                    case 3:
                                        Bill += n * 200;
                                        Bill_item += " Chicken Liver Thali\t\t200Rs." + "\t  " + n + "\n";
                                        break;
                                    default:
                                        break;
                                }
                                System.out.println("Do you want to more Element in Chicken Thali Menu Y/N");
                                ch = sc.next().charAt(0);
                            } while (ch == 'Y' || ch == 'y');
                            break;
                        case 3:
                            do {
                                System.out.println(" Fish Fry"
                                        + "\n1) Bombil Fry\t\t\t155Rs."
                                        + "\n2) Surmai Fry\t\t\t220Rs."
                                        + "\n3) Halwa Fry\t\t\t220Rs."
                                        + "\n4) Chicken Liver Fry\t\t200Rs.");
                                item_choice = sc.nextInt();
                                System.out.print("How many Fish Fry you want=");
                                n = sc.nextInt();

                                switch (item_choice) {
                                    case 1:
                                        Bill += n * 155;
                                        Bill_item += " Bombil Fry\t\t\t155Rs." + "\t  " + n + "\n";
                                        break;
                                    case 2:
                                        Bill += n * 220;
                                        Bill_item += " Surmai Fry\t\t\t220Rs." + "\t  " + n + "\n";
                                        break;
                                    case 3:
                                        Bill += n * 220;
                                        Bill_item += " Halwa Fry\t\t\t220Rs." + "\t  " + n + "\n";
                                        break;
                                    case 4:
                                        Bill += n * 200;
                                        Bill_item += " Chicken Liver Fry\t\t200Rs." + "\t  " + n + "\n";
                                        break;
                                    default:
                                        break;
                                }
                                System.out.println("Do you want to more Element in Fish Fry Menu Y/N");
                                ch = sc.next().charAt(0);
                            } while (ch == 'Y' || ch == 'y');
                            break;
                        case 4:
                            do {
                                System.out.println(" Fish Thali"
                                        + "\n1) Bombil Thali\t\t\t200Rs."
                                        + "\n2) Paplet Thali\t\t\t400Rs."
                                        + "\n3) Halwa Thali\t\t\t380Rs");
                                item_choice = sc.nextInt();
                                System.out.print("How many Fish Thali you want=");
                                n = sc.nextInt();

                                switch (item_choice) {
                                    case 1:
                                        Bill += n * 200;
                                        Bill_item += " Bombil Thali\t\t\t200Rs." + "\t  " + n + "\n";
                                        break;
                                    case 2:
                                        Bill += n * 400;
                                        Bill_item += " Paplet Thali\t\t\t400Rs." + "\t  " + n + "\n";
                                        break;
                                    case 3:
                                        Bill += n * 380;
                                        Bill_item += " Halwa Thali\t\t\t380Rs." + "\t  " + n + "\n";
                                        break;
                                    default:
                                        break;
                                }
                                System.out.println("Do you want to more Element in Fish Thali Menu Y/N");
                                ch = sc.next().charAt(0);
                            } while (ch == 'Y' || ch == 'y');
                            break;
                        default:
                            System.out.println("Enter Valid case");
                            break;
                    }
                    System.out.println("Do you want to more Element in Main Menu Y/N");
                    ch = sc.next().charAt(0);
                } while (ch == 'Y' || ch == 'y');
                System.out.println("-------------------------------------------------------------");
                System.out.println("<<<<<<<<<<< Bill Details >>>>>>>>>>>");
                System.out.println("-------------------------------------------------------------");
                System.out.println("Item Name\t\t\tPrice\tQuantity\n");
                System.out.println(Bill_item);
                System.out.println("-------------------------------------------------------------");
                System.out.println("Total Amount=" + Bill);
                System.out.println("-------------------------------------------------------------");
                System.out.println("Thank You For Coming in Rohidas Restaurant");
                System.out.println("-------------------------------------------------------------");
                break;
            default:
                System.out.println("Enter valid case");
                break;
        }
    }
}