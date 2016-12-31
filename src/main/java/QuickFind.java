/******************************************************************************
 *  Compilation:  javac QuickFind.java
 *  Execution:    java QuickFind
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.StdOut;

public class QuickFind {
    private int[] id;

    private QuickFind(int n) {
        id = new int[n];

        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public static void main(String[] args) {
        QuickFind qf = new QuickFind(10);

        qf.printArray(qf.id);

        StdOut.println(qf.connected(0, 1));
        StdOut.println(qf.connected(9, 9));
        StdOut.println(qf.connected(9, 1));

        qf.id[5] = 99;
        qf.id[7] = 99;
        qf.id[9] = 100;

        StdOut.println(qf.connected(5, 7));

        qf.printArray(qf.id);

        qf.union();

        qf.printArray(qf.id);
    }

    private boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    private void union() {
        int pid = id[5];
        int qid = id[9];

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    private void printArray(int[] myArray) {
        for (int aMyArray : myArray) {
            StdOut.print(aMyArray);
            StdOut.println();
        }
    }
}
