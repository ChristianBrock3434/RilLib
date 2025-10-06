package org.RilLib.Math.Numbers;

import org.RilLib.Math.Nat;
import org.RilLib.Math.Num;

public class N19 extends Num implements Nat<N19> {
    /** Singleton instance of N19 */
    public static final N19 instance = new N19();

    /** Private constructor to enforce singleton pattern */
    private N19() {
    }

    /**
     * Get the number represented by this class
     * 
     * @return The number represented by this class, which is 19.
     */
    @Override
    public int getNum() {
        return 19;
    }

}
