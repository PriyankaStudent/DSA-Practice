class TernarySearch {
    static int ternarySearch(int l, int r, int key, int ar[])
    {
        if (r >= l) {
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;
            if (ar[mid1] == key) {
                return mid1;
            }
            if (ar[mid2] == key) {
                return mid2;
            }
            if (key < ar[mid1]) {
                return ternarySearch(l, mid1 - 1, key, ar);
            }
            else if (key > ar[mid2]) {
                return ternarySearch(mid2 + 1, r, key, ar);
            }
            else {
                return ternarySearch(mid1 + 1, mid2 - 1, key, ar);
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int l, r, p, key;
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        l = 0;
        r = ar.length-1;
        key = 5;
        p = ternarySearch(l, r, key, ar);
        System.out.println(p);
    }
}