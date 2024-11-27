public class SegmentTree {
    int stArr[];

    SegmentTree(int a[], int n) {
        int h = (int) (Math.ceil(Math.log(n) / Math.log(2)));
        int size = 2 * (int) Math.pow(2, h) - 1;
        stArr = new int[size];
        constructST(a, 0, n - 1, 0);
    }

    int getMidIndex(int first, int last) {
        return first + (last - first) / 2;
    }

    int constructST(int a[], int x, int y, int si) {
        if (x == y) {
            stArr[si] = a[x];
            return a[x];
        }

        int mid = getMidIndex(x, y);

        stArr[si] = constructST(a, x, mid, 2 * si + 1) + constructST(a, mid + 1, y, 2 * si + 2);

        return stArr[si];
    }

    int getSum(int n, int x, int y) {
        if (x < 0 || x > n - 1 || x > y) {
            System.out.println("Invalid input");
            return -1;
        }

        return getSumUtil(0, n - 1, x, y, 0);
    }

    int getSumUtil(int x, int y, int i, int j, int si) {
        if (i <= x && j >= y) { // in correct range
            return stArr[si];
        }

        if (y < i || x > j) {
            return 0; // out of range
        }

        int midVal = getMidIndex(x, y);
        return getSumUtil(x, midVal, i, j, 2 * si + 1) + getSumUtil(midVal + 1, y, i, j, 2 * si + 2);
    }

    void updateVal(int a[], int n, int j, int newUpdatedVal) {
        if (j < 0 || j > n - 1) {
            System.out.println("Input is Invalid");
            return;
        }

        int diffVal = newUpdatedVal - a[j];

        a[j] = newUpdatedVal;

        updateValUtil(0, n - 1, j, diffVal, 0);
    }

    void updateValUtil(int x, int y, int j, int val, int si) {
        if (j < x || j > y) return; // outside range

        stArr[si] = stArr[si] + val;

        if (y != x) {
            int midVal = getMidIndex(x, y);
            updateValUtil(x, midVal, j, val, 2 * si + 1);
            updateValUtil(midVal + 1, y, j, val, 2 * si + 2);
        }
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 7, 10, 12, 13};
        int n = a.length;

        SegmentTree tree = new SegmentTree(a, n);

        System.out.println("Sum of values in the given range 1 to 4 = " + tree.getSum(n, 1, 4));

        tree.updateVal(a, n, 3, 11);

        System.out.println("Updated sum of values in the given range = " + tree.getSum(n, 1, 4));
    }
}