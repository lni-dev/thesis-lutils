/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct MediumTestStruct2 {
 *     int64_t aLong;
 *     int8_t aByte;
 *     double aSecondLong;
 *     int8_t aByteArray[20];
 *     {@link SmallTestStruct1 SmallTestStruct1} aSubStruct;
 *     int64_t aThirdLong;
 *     int32_t aInt4[4];
 *     int16_t aShort;
 *     {@link SmallTestStruct3 SmallTestStruct3} aSecondSubStruct;
 *     int64_t aPointer;
 * }}</pre>
 */
public class MediumTestStruct2 extends Struct<MediumTestStruct2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALONG,
        ABYTE,
        ASECONDLONG,
        ABYTEARRAY,
        ASUBSTRUCT,
        ATHIRDLONG,
        AINT4,
        ASHORT,
        ASECONDSUBSTRUCT,
        APOINTER;

    static {
        Layout layout = __struct(
            __member(8),
            __member(1),
            __member(8),
            __array(1, 20),
            __member(SmallTestStruct1.SIZEOF, SmallTestStruct1.ALIGNOF),
            __member(8),
            __array(4, 4),
            __member(2),
            __member(SmallTestStruct3.SIZEOF, SmallTestStruct3.ALIGNOF),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ALONG = layout.offsetof(0);
        ABYTE = layout.offsetof(1);
        ASECONDLONG = layout.offsetof(2);
        ABYTEARRAY = layout.offsetof(3);
        ASUBSTRUCT = layout.offsetof(4);
        ATHIRDLONG = layout.offsetof(5);
        AINT4 = layout.offsetof(6);
        ASHORT = layout.offsetof(7);
        ASECONDSUBSTRUCT = layout.offsetof(8);
        APOINTER = layout.offsetof(9);
    }

    protected MediumTestStruct2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MediumTestStruct2 create(long address, @Nullable ByteBuffer container) {
        return new MediumTestStruct2(address, container);
    }

    /**
     * Creates a {@code MediumTestStruct2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MediumTestStruct2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code aLong} field. */
    @NativeType("int64_t")
    public long aLong() { return naLong(address()); }
    /** @return the value of the {@code aByte} field. */
    @NativeType("int8_t")
    public byte aByte() { return naByte(address()); }
    /** @return the value of the {@code aSecondLong} field. */
    public double aSecondLong() { return naSecondLong(address()); }
    /** @return a {@link ByteBuffer} view of the {@code aByteArray} field. */
    @NativeType("int8_t[20]")
    public ByteBuffer aByteArray() { return naByteArray(address()); }
    /** @return the value at the specified index of the {@code aByteArray} field. */
    @NativeType("int8_t")
    public byte aByteArray(int index) { return naByteArray(address(), index); }
    /** @return a {@link SmallTestStruct1} view of the {@code aSubStruct} field. */
    public SmallTestStruct1 aSubStruct() { return naSubStruct(address()); }
    /** @return the value of the {@code aThirdLong} field. */
    @NativeType("int64_t")
    public long aThirdLong() { return naThirdLong(address()); }
    /** @return a {@link IntBuffer} view of the {@code aInt4} field. */
    @NativeType("int32_t[4]")
    public IntBuffer aInt4() { return naInt4(address()); }
    /** @return the value at the specified index of the {@code aInt4} field. */
    @NativeType("int32_t")
    public int aInt4(int index) { return naInt4(address(), index); }
    /** @return the value of the {@code aShort} field. */
    @NativeType("int16_t")
    public short aShort() { return naShort(address()); }
    /** @return a {@link SmallTestStruct3} view of the {@code aSecondSubStruct} field. */
    public SmallTestStruct3 aSecondSubStruct() { return naSecondSubStruct(address()); }
    /** @return the value of the {@code aPointer} field. */
    @NativeType("int64_t")
    public long aPointer() { return naPointer(address()); }

    /** Sets the specified value to the {@code aLong} field. */
    public MediumTestStruct2 aLong(@NativeType("int64_t") long value) { naLong(address(), value); return this; }
    /** Sets the specified value to the {@code aByte} field. */
    public MediumTestStruct2 aByte(@NativeType("int8_t") byte value) { naByte(address(), value); return this; }
    /** Sets the specified value to the {@code aSecondLong} field. */
    public MediumTestStruct2 aSecondLong(double value) { naSecondLong(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code aByteArray} field. */
    public MediumTestStruct2 aByteArray(@NativeType("int8_t[20]") ByteBuffer value) { naByteArray(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code aByteArray} field. */
    public MediumTestStruct2 aByteArray(int index, @NativeType("int8_t") byte value) { naByteArray(address(), index, value); return this; }
    /** Copies the specified {@link SmallTestStruct1} to the {@code aSubStruct} field. */
    public MediumTestStruct2 aSubStruct(SmallTestStruct1 value) { naSubStruct(address(), value); return this; }
    /** Passes the {@code aSubStruct} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct2 aSubStruct(java.util.function.Consumer<SmallTestStruct1> consumer) { consumer.accept(aSubStruct()); return this; }
    /** Sets the specified value to the {@code aThirdLong} field. */
    public MediumTestStruct2 aThirdLong(@NativeType("int64_t") long value) { naThirdLong(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code aInt4} field. */
    public MediumTestStruct2 aInt4(@NativeType("int32_t[4]") IntBuffer value) { naInt4(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code aInt4} field. */
    public MediumTestStruct2 aInt4(int index, @NativeType("int32_t") int value) { naInt4(address(), index, value); return this; }
    /** Sets the specified value to the {@code aShort} field. */
    public MediumTestStruct2 aShort(@NativeType("int16_t") short value) { naShort(address(), value); return this; }
    /** Copies the specified {@link SmallTestStruct3} to the {@code aSecondSubStruct} field. */
    public MediumTestStruct2 aSecondSubStruct(SmallTestStruct3 value) { naSecondSubStruct(address(), value); return this; }
    /** Passes the {@code aSecondSubStruct} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct2 aSecondSubStruct(java.util.function.Consumer<SmallTestStruct3> consumer) { consumer.accept(aSecondSubStruct()); return this; }
    /** Sets the specified value to the {@code aPointer} field. */
    public MediumTestStruct2 aPointer(@NativeType("int64_t") long value) { naPointer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public MediumTestStruct2 set(
        long aLong,
        byte aByte,
        double aSecondLong,
        ByteBuffer aByteArray,
        SmallTestStruct1 aSubStruct,
        long aThirdLong,
        IntBuffer aInt4,
        short aShort,
        SmallTestStruct3 aSecondSubStruct,
        long aPointer
    ) {
        aLong(aLong);
        aByte(aByte);
        aSecondLong(aSecondLong);
        aByteArray(aByteArray);
        aSubStruct(aSubStruct);
        aThirdLong(aThirdLong);
        aInt4(aInt4);
        aShort(aShort);
        aSecondSubStruct(aSecondSubStruct);
        aPointer(aPointer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MediumTestStruct2 set(MediumTestStruct2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MediumTestStruct2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MediumTestStruct2 malloc() {
        return new MediumTestStruct2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MediumTestStruct2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MediumTestStruct2 calloc() {
        return new MediumTestStruct2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MediumTestStruct2} instance allocated with {@link BufferUtils}. */
    public static MediumTestStruct2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MediumTestStruct2(memAddress(container), container);
    }

    /** Returns a new {@code MediumTestStruct2} instance for the specified memory address. */
    public static MediumTestStruct2 create(long address) {
        return new MediumTestStruct2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable MediumTestStruct2 createSafe(long address) {
        return address == NULL ? null : new MediumTestStruct2(address, null);
    }

    /**
     * Returns a new {@link MediumTestStruct2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MediumTestStruct2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MediumTestStruct2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MediumTestStruct2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static MediumTestStruct2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code MediumTestStruct2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MediumTestStruct2 malloc(MemoryStack stack) {
        return new MediumTestStruct2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MediumTestStruct2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MediumTestStruct2 calloc(MemoryStack stack) {
        return new MediumTestStruct2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MediumTestStruct2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MediumTestStruct2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aLong}. */
    public static long naLong(long struct) { return memGetLong(struct + MediumTestStruct2.ALONG); }
    /** Unsafe version of {@link #aByte}. */
    public static byte naByte(long struct) { return memGetByte(struct + MediumTestStruct2.ABYTE); }
    /** Unsafe version of {@link #aSecondLong}. */
    public static double naSecondLong(long struct) { return memGetDouble(struct + MediumTestStruct2.ASECONDLONG); }
    /** Unsafe version of {@link #aByteArray}. */
    public static ByteBuffer naByteArray(long struct) { return memByteBuffer(struct + MediumTestStruct2.ABYTEARRAY, 20); }
    /** Unsafe version of {@link #aByteArray(int) aByteArray}. */
    public static byte naByteArray(long struct, int index) {
        return memGetByte(struct + MediumTestStruct2.ABYTEARRAY + check(index, 20) * 1);
    }
    /** Unsafe version of {@link #aSubStruct}. */
    public static SmallTestStruct1 naSubStruct(long struct) { return SmallTestStruct1.create(struct + MediumTestStruct2.ASUBSTRUCT); }
    /** Unsafe version of {@link #aThirdLong}. */
    public static long naThirdLong(long struct) { return memGetLong(struct + MediumTestStruct2.ATHIRDLONG); }
    /** Unsafe version of {@link #aInt4}. */
    public static IntBuffer naInt4(long struct) { return memIntBuffer(struct + MediumTestStruct2.AINT4, 4); }
    /** Unsafe version of {@link #aInt4(int) aInt4}. */
    public static int naInt4(long struct, int index) {
        return memGetInt(struct + MediumTestStruct2.AINT4 + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #aShort}. */
    public static short naShort(long struct) { return memGetShort(struct + MediumTestStruct2.ASHORT); }
    /** Unsafe version of {@link #aSecondSubStruct}. */
    public static SmallTestStruct3 naSecondSubStruct(long struct) { return SmallTestStruct3.create(struct + MediumTestStruct2.ASECONDSUBSTRUCT); }
    /** Unsafe version of {@link #aPointer}. */
    public static long naPointer(long struct) { return memGetLong(struct + MediumTestStruct2.APOINTER); }

    /** Unsafe version of {@link #aLong(long) aLong}. */
    public static void naLong(long struct, long value) { memPutLong(struct + MediumTestStruct2.ALONG, value); }
    /** Unsafe version of {@link #aByte(byte) aByte}. */
    public static void naByte(long struct, byte value) { memPutByte(struct + MediumTestStruct2.ABYTE, value); }
    /** Unsafe version of {@link #aSecondLong(double) aSecondLong}. */
    public static void naSecondLong(long struct, double value) { memPutDouble(struct + MediumTestStruct2.ASECONDLONG, value); }
    /** Unsafe version of {@link #aByteArray(ByteBuffer) aByteArray}. */
    public static void naByteArray(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 20); }
        memCopy(memAddress(value), struct + MediumTestStruct2.ABYTEARRAY, value.remaining() * 1);
    }
    /** Unsafe version of {@link #aByteArray(int, byte) aByteArray}. */
    public static void naByteArray(long struct, int index, byte value) {
        memPutByte(struct + MediumTestStruct2.ABYTEARRAY + check(index, 20) * 1, value);
    }
    /** Unsafe version of {@link #aSubStruct(SmallTestStruct1) aSubStruct}. */
    public static void naSubStruct(long struct, SmallTestStruct1 value) { memCopy(value.address(), struct + MediumTestStruct2.ASUBSTRUCT, SmallTestStruct1.SIZEOF); }
    /** Unsafe version of {@link #aThirdLong(long) aThirdLong}. */
    public static void naThirdLong(long struct, long value) { memPutLong(struct + MediumTestStruct2.ATHIRDLONG, value); }
    /** Unsafe version of {@link #aInt4(IntBuffer) aInt4}. */
    public static void naInt4(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + MediumTestStruct2.AINT4, value.remaining() * 4);
    }
    /** Unsafe version of {@link #aInt4(int, int) aInt4}. */
    public static void naInt4(long struct, int index, int value) {
        memPutInt(struct + MediumTestStruct2.AINT4 + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #aShort(short) aShort}. */
    public static void naShort(long struct, short value) { memPutShort(struct + MediumTestStruct2.ASHORT, value); }
    /** Unsafe version of {@link #aSecondSubStruct(SmallTestStruct3) aSecondSubStruct}. */
    public static void naSecondSubStruct(long struct, SmallTestStruct3 value) { memCopy(value.address(), struct + MediumTestStruct2.ASECONDSUBSTRUCT, SmallTestStruct3.SIZEOF); }
    /** Unsafe version of {@link #aPointer(long) aPointer}. */
    public static void naPointer(long struct, long value) { memPutLong(struct + MediumTestStruct2.APOINTER, value); }

    // -----------------------------------

    /** An array of {@link MediumTestStruct2} structs. */
    public static class Buffer extends StructBuffer<MediumTestStruct2, Buffer> implements NativeResource {

        private static final MediumTestStruct2 ELEMENT_FACTORY = MediumTestStruct2.create(-1L);

        /**
         * Creates a new {@code MediumTestStruct2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MediumTestStruct2#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected MediumTestStruct2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code aLong} field. */
        @NativeType("int64_t")
        public long aLong() { return MediumTestStruct2.naLong(address()); }
        /** @return the value of the {@code aByte} field. */
        @NativeType("int8_t")
        public byte aByte() { return MediumTestStruct2.naByte(address()); }
        /** @return the value of the {@code aSecondLong} field. */
        public double aSecondLong() { return MediumTestStruct2.naSecondLong(address()); }
        /** @return a {@link ByteBuffer} view of the {@code aByteArray} field. */
        @NativeType("int8_t[20]")
        public ByteBuffer aByteArray() { return MediumTestStruct2.naByteArray(address()); }
        /** @return the value at the specified index of the {@code aByteArray} field. */
        @NativeType("int8_t")
        public byte aByteArray(int index) { return MediumTestStruct2.naByteArray(address(), index); }
        /** @return a {@link SmallTestStruct1} view of the {@code aSubStruct} field. */
        public SmallTestStruct1 aSubStruct() { return MediumTestStruct2.naSubStruct(address()); }
        /** @return the value of the {@code aThirdLong} field. */
        @NativeType("int64_t")
        public long aThirdLong() { return MediumTestStruct2.naThirdLong(address()); }
        /** @return a {@link IntBuffer} view of the {@code aInt4} field. */
        @NativeType("int32_t[4]")
        public IntBuffer aInt4() { return MediumTestStruct2.naInt4(address()); }
        /** @return the value at the specified index of the {@code aInt4} field. */
        @NativeType("int32_t")
        public int aInt4(int index) { return MediumTestStruct2.naInt4(address(), index); }
        /** @return the value of the {@code aShort} field. */
        @NativeType("int16_t")
        public short aShort() { return MediumTestStruct2.naShort(address()); }
        /** @return a {@link SmallTestStruct3} view of the {@code aSecondSubStruct} field. */
        public SmallTestStruct3 aSecondSubStruct() { return MediumTestStruct2.naSecondSubStruct(address()); }
        /** @return the value of the {@code aPointer} field. */
        @NativeType("int64_t")
        public long aPointer() { return MediumTestStruct2.naPointer(address()); }

        /** Sets the specified value to the {@code aLong} field. */
        public MediumTestStruct2.Buffer aLong(@NativeType("int64_t") long value) { MediumTestStruct2.naLong(address(), value); return this; }
        /** Sets the specified value to the {@code aByte} field. */
        public MediumTestStruct2.Buffer aByte(@NativeType("int8_t") byte value) { MediumTestStruct2.naByte(address(), value); return this; }
        /** Sets the specified value to the {@code aSecondLong} field. */
        public MediumTestStruct2.Buffer aSecondLong(double value) { MediumTestStruct2.naSecondLong(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code aByteArray} field. */
        public MediumTestStruct2.Buffer aByteArray(@NativeType("int8_t[20]") ByteBuffer value) { MediumTestStruct2.naByteArray(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code aByteArray} field. */
        public MediumTestStruct2.Buffer aByteArray(int index, @NativeType("int8_t") byte value) { MediumTestStruct2.naByteArray(address(), index, value); return this; }
        /** Copies the specified {@link SmallTestStruct1} to the {@code aSubStruct} field. */
        public MediumTestStruct2.Buffer aSubStruct(SmallTestStruct1 value) { MediumTestStruct2.naSubStruct(address(), value); return this; }
        /** Passes the {@code aSubStruct} field to the specified {@link java.util.function.Consumer Consumer}. */
        public MediumTestStruct2.Buffer aSubStruct(java.util.function.Consumer<SmallTestStruct1> consumer) { consumer.accept(aSubStruct()); return this; }
        /** Sets the specified value to the {@code aThirdLong} field. */
        public MediumTestStruct2.Buffer aThirdLong(@NativeType("int64_t") long value) { MediumTestStruct2.naThirdLong(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code aInt4} field. */
        public MediumTestStruct2.Buffer aInt4(@NativeType("int32_t[4]") IntBuffer value) { MediumTestStruct2.naInt4(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code aInt4} field. */
        public MediumTestStruct2.Buffer aInt4(int index, @NativeType("int32_t") int value) { MediumTestStruct2.naInt4(address(), index, value); return this; }
        /** Sets the specified value to the {@code aShort} field. */
        public MediumTestStruct2.Buffer aShort(@NativeType("int16_t") short value) { MediumTestStruct2.naShort(address(), value); return this; }
        /** Copies the specified {@link SmallTestStruct3} to the {@code aSecondSubStruct} field. */
        public MediumTestStruct2.Buffer aSecondSubStruct(SmallTestStruct3 value) { MediumTestStruct2.naSecondSubStruct(address(), value); return this; }
        /** Passes the {@code aSecondSubStruct} field to the specified {@link java.util.function.Consumer Consumer}. */
        public MediumTestStruct2.Buffer aSecondSubStruct(java.util.function.Consumer<SmallTestStruct3> consumer) { consumer.accept(aSecondSubStruct()); return this; }
        /** Sets the specified value to the {@code aPointer} field. */
        public MediumTestStruct2.Buffer aPointer(@NativeType("int64_t") long value) { MediumTestStruct2.naPointer(address(), value); return this; }

    }

}