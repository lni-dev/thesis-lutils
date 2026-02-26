/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package de.linusdev.jmh.structs.lwjgl;

import org.jspecify.annotations.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.*;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct MediumTestStruct4 {
 *     {@link MediumTestStruct1 MediumTestStruct1} aMediumTestStruct1;
 *     {@link MediumTestStruct2 MediumTestStruct2} aMediumTestStruct2;
 *     double aFloat64Array[13];
 *     int8_t aByte;
 *     {@link SmallTestStruct6 SmallTestStruct6} aSmallTestStruct6;
 *     int16_t aShort;
 *     {@link SmallTestStruct7 SmallTestStruct7} aSmallTestStruct7;
 * }}</pre>
 */
public class MediumTestStruct4 extends Struct<MediumTestStruct4> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        AMEDIUMTESTSTRUCT1,
        AMEDIUMTESTSTRUCT2,
        AFLOAT64ARRAY,
        ABYTE,
        ASMALLTESTSTRUCT6,
        ASHORT,
        ASMALLTESTSTRUCT7;

    static {
        Layout layout = __struct(
            __member(MediumTestStruct1.SIZEOF, MediumTestStruct1.ALIGNOF),
            __member(MediumTestStruct2.SIZEOF, MediumTestStruct2.ALIGNOF),
            __array(8, 13),
            __member(1),
            __member(SmallTestStruct6.SIZEOF, SmallTestStruct6.ALIGNOF),
            __member(2),
            __member(SmallTestStruct7.SIZEOF, SmallTestStruct7.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        AMEDIUMTESTSTRUCT1 = layout.offsetof(0);
        AMEDIUMTESTSTRUCT2 = layout.offsetof(1);
        AFLOAT64ARRAY = layout.offsetof(2);
        ABYTE = layout.offsetof(3);
        ASMALLTESTSTRUCT6 = layout.offsetof(4);
        ASHORT = layout.offsetof(5);
        ASMALLTESTSTRUCT7 = layout.offsetof(6);
    }

    protected MediumTestStruct4(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MediumTestStruct4 create(long address, @Nullable ByteBuffer container) {
        return new MediumTestStruct4(address, container);
    }

    /**
     * Creates a {@code MediumTestStruct4} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MediumTestStruct4(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link MediumTestStruct1} view of the {@code aMediumTestStruct1} field. */
    public MediumTestStruct1 aMediumTestStruct1() { return naMediumTestStruct1(address()); }
    /** @return a {@link MediumTestStruct2} view of the {@code aMediumTestStruct2} field. */
    public MediumTestStruct2 aMediumTestStruct2() { return naMediumTestStruct2(address()); }
    /** @return a {@link DoubleBuffer} view of the {@code aFloat64Array} field. */
    @NativeType("double[13]")
    public DoubleBuffer aFloat64Array() { return naFloat64Array(address()); }
    /** @return the value at the specified index of the {@code aFloat64Array} field. */
    public double aFloat64Array(int index) { return naFloat64Array(address(), index); }
    /** @return the value of the {@code aByte} field. */
    @NativeType("int8_t")
    public byte aByte() { return naByte(address()); }
    /** @return a {@link SmallTestStruct6} view of the {@code aSmallTestStruct6} field. */
    public SmallTestStruct6 aSmallTestStruct6() { return naSmallTestStruct6(address()); }
    /** @return the value of the {@code aShort} field. */
    @NativeType("int16_t")
    public short aShort() { return naShort(address()); }
    /** @return a {@link SmallTestStruct7} view of the {@code aSmallTestStruct7} field. */
    public SmallTestStruct7 aSmallTestStruct7() { return naSmallTestStruct7(address()); }

    /** Copies the specified {@link MediumTestStruct1} to the {@code aMediumTestStruct1} field. */
    public MediumTestStruct4 aMediumTestStruct1(MediumTestStruct1 value) { naMediumTestStruct1(address(), value); return this; }
    /** Passes the {@code aMediumTestStruct1} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct4 aMediumTestStruct1(java.util.function.Consumer<MediumTestStruct1> consumer) { consumer.accept(aMediumTestStruct1()); return this; }
    /** Copies the specified {@link MediumTestStruct2} to the {@code aMediumTestStruct2} field. */
    public MediumTestStruct4 aMediumTestStruct2(MediumTestStruct2 value) { naMediumTestStruct2(address(), value); return this; }
    /** Passes the {@code aMediumTestStruct2} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct4 aMediumTestStruct2(java.util.function.Consumer<MediumTestStruct2> consumer) { consumer.accept(aMediumTestStruct2()); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code aFloat64Array} field. */
    public MediumTestStruct4 aFloat64Array(@NativeType("double[13]") DoubleBuffer value) { naFloat64Array(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code aFloat64Array} field. */
    public MediumTestStruct4 aFloat64Array(int index, double value) { naFloat64Array(address(), index, value); return this; }
    /** Sets the specified value to the {@code aByte} field. */
    public MediumTestStruct4 aByte(@NativeType("int8_t") byte value) { naByte(address(), value); return this; }
    /** Copies the specified {@link SmallTestStruct6} to the {@code aSmallTestStruct6} field. */
    public MediumTestStruct4 aSmallTestStruct6(SmallTestStruct6 value) { naSmallTestStruct6(address(), value); return this; }
    /** Passes the {@code aSmallTestStruct6} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct4 aSmallTestStruct6(java.util.function.Consumer<SmallTestStruct6> consumer) { consumer.accept(aSmallTestStruct6()); return this; }
    /** Sets the specified value to the {@code aShort} field. */
    public MediumTestStruct4 aShort(@NativeType("int16_t") short value) { naShort(address(), value); return this; }
    /** Copies the specified {@link SmallTestStruct7} to the {@code aSmallTestStruct7} field. */
    public MediumTestStruct4 aSmallTestStruct7(SmallTestStruct7 value) { naSmallTestStruct7(address(), value); return this; }
    /** Passes the {@code aSmallTestStruct7} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct4 aSmallTestStruct7(java.util.function.Consumer<SmallTestStruct7> consumer) { consumer.accept(aSmallTestStruct7()); return this; }

    /** Initializes this struct with the specified values. */
    public MediumTestStruct4 set(
        MediumTestStruct1 aMediumTestStruct1,
        MediumTestStruct2 aMediumTestStruct2,
        DoubleBuffer aFloat64Array,
        byte aByte,
        SmallTestStruct6 aSmallTestStruct6,
        short aShort,
        SmallTestStruct7 aSmallTestStruct7
    ) {
        aMediumTestStruct1(aMediumTestStruct1);
        aMediumTestStruct2(aMediumTestStruct2);
        aFloat64Array(aFloat64Array);
        aByte(aByte);
        aSmallTestStruct6(aSmallTestStruct6);
        aShort(aShort);
        aSmallTestStruct7(aSmallTestStruct7);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MediumTestStruct4 set(MediumTestStruct4 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MediumTestStruct4} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MediumTestStruct4 malloc() {
        return new MediumTestStruct4(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MediumTestStruct4} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MediumTestStruct4 calloc() {
        return new MediumTestStruct4(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MediumTestStruct4} instance allocated with {@link BufferUtils}. */
    public static MediumTestStruct4 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MediumTestStruct4(memAddress(container), container);
    }

    /** Returns a new {@code MediumTestStruct4} instance for the specified memory address. */
    public static MediumTestStruct4 create(long address) {
        return new MediumTestStruct4(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable MediumTestStruct4 createSafe(long address) {
        return address == NULL ? null : new MediumTestStruct4(address, null);
    }

    /**
     * Returns a new {@link Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code MediumTestStruct4} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MediumTestStruct4 malloc(MemoryStack stack) {
        return new MediumTestStruct4(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MediumTestStruct4} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MediumTestStruct4 calloc(MemoryStack stack) {
        return new MediumTestStruct4(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aMediumTestStruct1}. */
    public static MediumTestStruct1 naMediumTestStruct1(long struct) { return MediumTestStruct1.create(struct + MediumTestStruct4.AMEDIUMTESTSTRUCT1); }
    /** Unsafe version of {@link #aMediumTestStruct2}. */
    public static MediumTestStruct2 naMediumTestStruct2(long struct) { return MediumTestStruct2.create(struct + MediumTestStruct4.AMEDIUMTESTSTRUCT2); }
    /** Unsafe version of {@link #aFloat64Array}. */
    public static DoubleBuffer naFloat64Array(long struct) { return memDoubleBuffer(struct + MediumTestStruct4.AFLOAT64ARRAY, 13); }
    /** Unsafe version of {@link #aFloat64Array(int) aFloat64Array}. */
    public static double naFloat64Array(long struct, int index) {
        return memGetDouble(struct + MediumTestStruct4.AFLOAT64ARRAY + check(index, 13) * 8);
    }
    /** Unsafe version of {@link #aByte}. */
    public static byte naByte(long struct) { return memGetByte(struct + MediumTestStruct4.ABYTE); }
    /** Unsafe version of {@link #aSmallTestStruct6}. */
    public static SmallTestStruct6 naSmallTestStruct6(long struct) { return SmallTestStruct6.create(struct + MediumTestStruct4.ASMALLTESTSTRUCT6); }
    /** Unsafe version of {@link #aShort}. */
    public static short naShort(long struct) { return memGetShort(struct + MediumTestStruct4.ASHORT); }
    /** Unsafe version of {@link #aSmallTestStruct7}. */
    public static SmallTestStruct7 naSmallTestStruct7(long struct) { return SmallTestStruct7.create(struct + MediumTestStruct4.ASMALLTESTSTRUCT7); }

    /** Unsafe version of {@link #aMediumTestStruct1(MediumTestStruct1) aMediumTestStruct1}. */
    public static void naMediumTestStruct1(long struct, MediumTestStruct1 value) { memCopy(value.address(), struct + MediumTestStruct4.AMEDIUMTESTSTRUCT1, MediumTestStruct1.SIZEOF); }
    /** Unsafe version of {@link #aMediumTestStruct2(MediumTestStruct2) aMediumTestStruct2}. */
    public static void naMediumTestStruct2(long struct, MediumTestStruct2 value) { memCopy(value.address(), struct + MediumTestStruct4.AMEDIUMTESTSTRUCT2, MediumTestStruct2.SIZEOF); }
    /** Unsafe version of {@link #aFloat64Array(DoubleBuffer) aFloat64Array}. */
    public static void naFloat64Array(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 13); }
        memCopy(memAddress(value), struct + MediumTestStruct4.AFLOAT64ARRAY, value.remaining() * 8);
    }
    /** Unsafe version of {@link #aFloat64Array(int, double) aFloat64Array}. */
    public static void naFloat64Array(long struct, int index, double value) {
        memPutDouble(struct + MediumTestStruct4.AFLOAT64ARRAY + check(index, 13) * 8, value);
    }
    /** Unsafe version of {@link #aByte(byte) aByte}. */
    public static void naByte(long struct, byte value) { memPutByte(struct + MediumTestStruct4.ABYTE, value); }
    /** Unsafe version of {@link #aSmallTestStruct6(SmallTestStruct6) aSmallTestStruct6}. */
    public static void naSmallTestStruct6(long struct, SmallTestStruct6 value) { memCopy(value.address(), struct + MediumTestStruct4.ASMALLTESTSTRUCT6, SmallTestStruct6.SIZEOF); }
    /** Unsafe version of {@link #aShort(short) aShort}. */
    public static void naShort(long struct, short value) { memPutShort(struct + MediumTestStruct4.ASHORT, value); }
    /** Unsafe version of {@link #aSmallTestStruct7(SmallTestStruct7) aSmallTestStruct7}. */
    public static void naSmallTestStruct7(long struct, SmallTestStruct7 value) { memCopy(value.address(), struct + MediumTestStruct4.ASMALLTESTSTRUCT7, SmallTestStruct7.SIZEOF); }

    // -----------------------------------

    /** An array of {@link MediumTestStruct4} structs. */
    public static class Buffer extends StructBuffer<MediumTestStruct4, Buffer> implements NativeResource {

        private static final MediumTestStruct4 ELEMENT_FACTORY = MediumTestStruct4.create(-1L);

        /**
         * Creates a new {@code MediumTestStruct4.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MediumTestStruct4#SIZEOF}, and its mark will be undefined.</p>
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
        protected MediumTestStruct4 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link MediumTestStruct1} view of the {@code aMediumTestStruct1} field. */
        public MediumTestStruct1 aMediumTestStruct1() { return MediumTestStruct4.naMediumTestStruct1(address()); }
        /** @return a {@link MediumTestStruct2} view of the {@code aMediumTestStruct2} field. */
        public MediumTestStruct2 aMediumTestStruct2() { return MediumTestStruct4.naMediumTestStruct2(address()); }
        /** @return a {@link DoubleBuffer} view of the {@code aFloat64Array} field. */
        @NativeType("double[13]")
        public DoubleBuffer aFloat64Array() { return MediumTestStruct4.naFloat64Array(address()); }
        /** @return the value at the specified index of the {@code aFloat64Array} field. */
        public double aFloat64Array(int index) { return MediumTestStruct4.naFloat64Array(address(), index); }
        /** @return the value of the {@code aByte} field. */
        @NativeType("int8_t")
        public byte aByte() { return MediumTestStruct4.naByte(address()); }
        /** @return a {@link SmallTestStruct6} view of the {@code aSmallTestStruct6} field. */
        public SmallTestStruct6 aSmallTestStruct6() { return MediumTestStruct4.naSmallTestStruct6(address()); }
        /** @return the value of the {@code aShort} field. */
        @NativeType("int16_t")
        public short aShort() { return MediumTestStruct4.naShort(address()); }
        /** @return a {@link SmallTestStruct7} view of the {@code aSmallTestStruct7} field. */
        public SmallTestStruct7 aSmallTestStruct7() { return MediumTestStruct4.naSmallTestStruct7(address()); }

        /** Copies the specified {@link MediumTestStruct1} to the {@code aMediumTestStruct1} field. */
        public Buffer aMediumTestStruct1(MediumTestStruct1 value) { MediumTestStruct4.naMediumTestStruct1(address(), value); return this; }
        /** Passes the {@code aMediumTestStruct1} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer aMediumTestStruct1(java.util.function.Consumer<MediumTestStruct1> consumer) { consumer.accept(aMediumTestStruct1()); return this; }
        /** Copies the specified {@link MediumTestStruct2} to the {@code aMediumTestStruct2} field. */
        public Buffer aMediumTestStruct2(MediumTestStruct2 value) { MediumTestStruct4.naMediumTestStruct2(address(), value); return this; }
        /** Passes the {@code aMediumTestStruct2} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer aMediumTestStruct2(java.util.function.Consumer<MediumTestStruct2> consumer) { consumer.accept(aMediumTestStruct2()); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code aFloat64Array} field. */
        public Buffer aFloat64Array(@NativeType("double[13]") DoubleBuffer value) { MediumTestStruct4.naFloat64Array(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code aFloat64Array} field. */
        public Buffer aFloat64Array(int index, double value) { MediumTestStruct4.naFloat64Array(address(), index, value); return this; }
        /** Sets the specified value to the {@code aByte} field. */
        public Buffer aByte(@NativeType("int8_t") byte value) { MediumTestStruct4.naByte(address(), value); return this; }
        /** Copies the specified {@link SmallTestStruct6} to the {@code aSmallTestStruct6} field. */
        public Buffer aSmallTestStruct6(SmallTestStruct6 value) { MediumTestStruct4.naSmallTestStruct6(address(), value); return this; }
        /** Passes the {@code aSmallTestStruct6} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer aSmallTestStruct6(java.util.function.Consumer<SmallTestStruct6> consumer) { consumer.accept(aSmallTestStruct6()); return this; }
        /** Sets the specified value to the {@code aShort} field. */
        public Buffer aShort(@NativeType("int16_t") short value) { MediumTestStruct4.naShort(address(), value); return this; }
        /** Copies the specified {@link SmallTestStruct7} to the {@code aSmallTestStruct7} field. */
        public Buffer aSmallTestStruct7(SmallTestStruct7 value) { MediumTestStruct4.naSmallTestStruct7(address(), value); return this; }
        /** Passes the {@code aSmallTestStruct7} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer aSmallTestStruct7(java.util.function.Consumer<SmallTestStruct7> consumer) { consumer.accept(aSmallTestStruct7()); return this; }

    }

}