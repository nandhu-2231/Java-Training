package Day6;

public class Problem12 {
    int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Problem12 obj = new Problem12();
        System.out.println(obj.countVowels("Java Programming"));
    }
}

