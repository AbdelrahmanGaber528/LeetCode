class Palindrome_Number {
   public boolean isPalindrome(int x) {
            if(x < 0 || (x %10 == 0 && x >=10)  ){
                return false;
            }
            int a = x, b = 0;
            while(a != 0){
                int first_digit = a % 10;
                b = b*10 + first_digit;
                a /=10;
            }
            return x == b;
        }
    }

