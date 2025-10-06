package org.RilLib.Math.Numbers;

import org.RilLib.Math.Nat;
import org.RilLib.Math.Num;

public class N12 extends Num implements Nat<N12> {
    /** Singleton instance of N12 */
    public static final N12 instance = new N12();

    /** Private constructor to enforce singleton pattern */
    private N12() {
    }

    /**
     * Get the number represented by this class
     * 
     * @return The number represented by this class, which is 12.
     */
    @Override
    public int getNum() {
        return 12;
    }

}
