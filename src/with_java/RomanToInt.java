class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) {
            numbers[i] = map(s.charAt(i));
        }
        int sum = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (i == 0) {
                sum += numbers[i];
                break;
            }
            if (numbers[i] <= numbers[i - 1]) {
                sum += numbers[i];
            } else {
                sum = sum + numbers[i] - numbers[i - 1];
                i--;
            }
        }
        return sum;
    }
    
    public int map(char c) {
        switch(c) {
            case('V'):
                return 5;
            case('X'):
                return 10;
            case('L'):
                return 50;
            case('C'):
                return 100;
            case('D'):
                return 500;
            case('M'):
                return 1000;
            default:
                return 1;
        }
    }
}