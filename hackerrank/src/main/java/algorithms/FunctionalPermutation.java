package algorithms;

class Main {
    private static void swap(String ABC, String adasd) {
        String temp = ABC;
        ABC = adasd;
        adasd = temp;
    }

    private static void permutations() {
        String ABC = "ABC";
        String adasd = "adasd";
        swap(ABC, adasd);
        System.out.println(ABC);
    }

    public static void main(String[] args) {
        permutations();
    }
}