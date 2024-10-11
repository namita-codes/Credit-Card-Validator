public class CreditCardValidator {
    
    public static boolean validateCreditCard(String cardNumber) {
        int total = 0;
        boolean alternate = false;

        
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(cardNumber.substring(i, i + 1));

            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n -= 9;
                }
            }
            total += n;
            alternate = !alternate;
        }
        
     
        return (total % 10 == 0);
    }

    public static void main(String[] args) {
        String cardNumber = "4532015112830366"; 

        if (validateCreditCard(cardNumber)) {
            System.out.println("The credit card number is valid.");
        } else {
            System.out.println("The credit card number is invalid.");
        }
    }
}
