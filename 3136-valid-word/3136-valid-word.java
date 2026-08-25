class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3)
            return false;

        boolean vowel = false;
        boolean consonant = false;

        for (char ch : word.toCharArray()) {

            if (!Character.isLetterOrDigit(ch))
                return false;

            if ("aeiouAEIOU".indexOf(ch) != -1)
                vowel = true;
            else if (Character.isLetter(ch))
                consonant = true;
        }

        return vowel && consonant;
    }
}