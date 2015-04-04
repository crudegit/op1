package com.op1.iff.types;

/**
 * 32 bits. A concatenation of four characters, as defined in Inside Macintosh, vol II.
 */
public class OSType extends DataType {

    public OSType(byte[] bytes) {
        super(bytes);
    }

    @Override
    public String toString() {
        return new String(bytes);
    }
}