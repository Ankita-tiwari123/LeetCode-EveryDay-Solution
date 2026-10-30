class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        
        int original = x;
        int reverse = 0;
        while(x>0){
           int result = x%10;
             reverse = reverse * 10 + result;
            x = x/10;
            
        }
        // return bool;
        return reverse == original;
        
    }
}