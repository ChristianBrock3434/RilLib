package org.RilLib.Math.Numbers;

import org.RilLib.Math.Nat;
import org.RilLib.Math.Num;

public class N2 extends Num implements Nat<N2> {
    /** Singleton instance of N2 */
    public static final N2 instance = new N2();

    /** Private constructor to enforce singleton pattern */
    private N2() {
    }

    /**
     * Get the number represented by this class
     * 
     * @return The number represented by this class, which is 2.
     */
    @Override
    public int getNum() {
        return 2;
    }

}
