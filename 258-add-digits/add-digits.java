class Solution {
    public int addDigits(int num) {
        while(num > 9){
            int last = num % 10;
            num /= 10;
            num += last; 
        }
        return num;
    }
}