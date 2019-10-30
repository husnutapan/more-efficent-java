package algorithms;

public class Staircase {

    static void staircase(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++)
            stringBuilder.append(" ");
        int j = 0;

        for (int i = 1; i <=n; i++) {
            stringBuilder.replace(stringBuilder.length()-i,
                    stringBuilder.length() - j, "#");
            System.out.println(stringBuilder);
            j++;
        }
    }

    public static void main(String[] args) {
        staircase(6);
    }
}
