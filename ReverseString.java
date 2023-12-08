class Solution {
    public void reverseString(char[] s) {
        int length = s.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = s[i];
            s[i] = s[length - i - 1];
            s[length - i - 1] = temp;
        }
    }
}

It has a time complexity of O(n), where n is the length of the array, because it processes each element once. 
The space complexity is O(1), as it uses a constant amount of extra space for the temporary variable (temp).
