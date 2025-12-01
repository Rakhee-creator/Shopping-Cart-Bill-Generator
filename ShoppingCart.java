import java.util.Scanner;
public class ShoppingCart {
          public static void main(String[] args) {

            int totalPrice=0;
            int items=0;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("List of Home Decor Items -Select the Items: ");
                System.out.println("1.Artificial Daisy Greenery Hanging Fern Plants -₹318 per piece");
                System.out.println("2.Artistic Elephant Floral Peacock & Rose Designer Wall Hanging Decoration -₹200 per piece");
                System.out.println("3.Multifunctional Plant Stand-₹500");
                System.out.println("4.Lord Ganesh wall Hanging of Arch Temple Design-₹5000");


                items = sc.nextInt();
                // ✅ check exit before asking for quantity
                if (items == 5) {
                    break;
                }

                System.out.println("Select the quantity: ");
                int quantity = sc.nextInt();
                switch (items) {
                    case 1:
                        totalPrice += 318 * quantity;
                        break;
                    case 2:
                        totalPrice += 200 * quantity;
                        break;
                    case 3:
                        totalPrice += 500 * quantity;
                        break;
                    case 4:
                        totalPrice += 5000 * quantity;
                        break;

                    default:
                        System.out.println("invalid input");

                }
                System.out.println("Item added to your cart. Current total: ₹" + totalPrice);

            }while (items<=4);
            System.out.println("🛒 Final Bill: ₹" + totalPrice);

        }

    }


