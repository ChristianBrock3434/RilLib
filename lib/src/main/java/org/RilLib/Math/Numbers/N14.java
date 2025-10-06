package org.RilLib.Math.Numbers;

import org.RilLib.Math.Nat;
import org.RilLib.Math.Num;

public class N14 extends Num implements Nat<N14> {
    /** Singleton instance of N14 */
    public static final N14 instance = new N14();

    /** Private constructor to enforce singleton pattern */
    private N14() {
    }

    /**
     * Get the number represented by this class
     * 
     * @return The number represented by this class, which is 14.
     */
    @Override
    public int getNum() {
        return 14;
    }

}
