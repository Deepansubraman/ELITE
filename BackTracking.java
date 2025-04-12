class BackTracking {
    public static void main(String[] args) {
        int n = 6;
        loop(n);
    }

    public static void loop(int n) {
        if (n == 10) {
            return;
        }

        n++;
        System.out.println(n);
        loop(n);
        System.out.println(n);
    }
}
