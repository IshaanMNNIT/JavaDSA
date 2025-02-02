public class Product_of_Digits {

        public static void main(String[] args) {
            int n = 1342;
            System.out.println("Product of Digits : " + ProductOfDigits(n));
        }
        static int ProductOfDigits(int n)
        {
            // If One digit is remaining return that digit i.e. ----> n%10 = n
            if(n % 10 == n) return n;
            return n % 10 * ProductOfDigits(n/10);
        }
    }

