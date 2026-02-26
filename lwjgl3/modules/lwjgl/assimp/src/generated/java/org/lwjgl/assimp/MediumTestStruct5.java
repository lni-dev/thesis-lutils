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
 * struct MediumTestStruct5 {
 *     int8_t aFloat64Array[21];
 *     {@link MediumTestStruct3 MediumTestStruct3} aMediumTestStruct3;
 *     {@link SmallTestStruct2 SmallTestStruct2} aSmallTestStruct2;
 *     int64_t aPointer64;
 *     {@link SmallTestStruct7 SmallTestStruct7} aStructArray[5];
 * }}</pre>
 */
public class MediumTestStruct5 extends Struct<MediumTestStruct5> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        AFLOAT64ARRAY,
        AMEDIUMTESTSTRUCT3,
        ASMALLTESTSTRUCT2,
        APOINTER64,
        ASTRUCTARRAY;

    static {
        Layout layout = __struct(
            __array(1, 21),
            __member(MediumTestStruct3.SIZEOF, MediumTestStruct3.ALIGNOF),
            __member(SmallTestStruct2.SIZEOF, SmallTestStruct2.ALIGNOF),
            __member(8),
            __array(SmallTestStruct7.SIZEOF, SmallTestStruct7.ALIGNOF, 5)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        AFLOAT64ARRAY = layout.offsetof(0);
        AMEDIUMTESTSTRUCT3 = layout.offsetof(1);
        ASMALLTESTSTRUCT2 = layout.offsetof(2);
        APOINTER64 = layout.offsetof(3);
        ASTRUCTARRAY = layout.offsetof(4);
    }

    protected MediumTestStruct5(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MediumTestStruct5 create(long address, @Nullable ByteBuffer container) {
        return new MediumTestStruct5(address, container);
    }

    /**
     * Creates a {@code MediumTestStruct5} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MediumTestStruct5(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code aFloat64Array} field. */
    @NativeType("int8_t[21]")
    public ByteBuffer aFloat64Array() { return naFloat64Array(address()); }
    /** @return the value at the specified index of the {@code aFloat64Array} field. */
    @NativeType("int8_t")
    public byte aFloat64Array(int index) { return naFloat64Array(address(), index); }
    /** @return a {@link MediumTestStruct3} view of the {@code aMediumTestStruct3} field. */
    public MediumTestStruct3 aMediumTestStruct3() { return naMediumTestStruct3(address()); }
    /** @return a {@link SmallTestStruct2} view of the {@code aSmallTestStruct2} field. */
    public SmallTestStruct2 aSmallTestStruct2() { return naSmallTestStruct2(address()); }
    /** @return the value of the {@code aPointer64} field. */
    @NativeType("int64_t")
    public long aPointer64() { return naPointer64(address()); }
    /** @return a {@link SmallTestStruct7}.Buffer view of the {@code aStructArray} field. */
    @NativeType("SmallTestStruct7[5]")
    public SmallTestStruct7.Buffer aStructArray() { return naStructArray(address()); }
    /** @return a {@link SmallTestStruct7} view of the struct at the specified index of the {@code aStructArray} field. */
    public SmallTestStruct7 aStructArray(int index) { return naStructArray(address(), index); }

    /** Copies the specified {@link ByteBuffer} to the {@code aFloat64Array} field. */
    public MediumTestStruct5 aFloat64Array(@NativeType("int8_t[21]") ByteBuffer value) { naFloat64Array(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code aFloat64Array} field. */
    public MediumTestStruct5 aFloat64Array(int index, @NativeType("int8_t") byte value) { naFloat64Array(address(), index, value); return this; }
    /** Copies the specified {@link MediumTestStruct3} to the {@code aMediumTestStruct3} field. */
    public MediumTestStruct5 aMediumTestStruct3(MediumTestStruct3 value) { naMediumTestStruct3(address(), value); return this; }
    /** Passes the {@code aMediumTestStruct3} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct5 aMediumTestStruct3(java.util.function.Consumer<MediumTestStruct3> consumer) { consumer.accept(aMediumTestStruct3()); return this; }
    /** Copies the specified {@link SmallTestStruct2} to the {@code aSmallTestStruct2} field. */
    public MediumTestStruct5 aSmallTestStruct2(SmallTestStruct2 value) { naSmallTestStruct2(address(), value); return this; }
    /** Passes the {@code aSmallTestStruct2} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct5 aSmallTestStruct2(java.util.function.Consumer<SmallTestStruct2> consumer) { consumer.accept(aSmallTestStruct2()); return this; }
    /** Sets the specified value to the {@code aPointer64} field. */
    public MediumTestStruct5 aPointer64(@NativeType("int64_t") long value) { naPointer64(address(), value); return this; }
    /** Copies the specified {@link SmallTestStruct7.Buffer} to the {@code aStructArray} field. */
    public MediumTestStruct5 aStructArray(@NativeType("SmallTestStruct7[5]") SmallTestStruct7.Buffer value) { naStructArray(address(), value); return this; }
    /** Copies the specified {@link SmallTestStruct7} at the specified index of the {@code aStructArray} field. */
    public MediumTestStruct5 aStructArray(int index, SmallTestStruct7 value) { naStructArray(address(), index, value); return this; }
    /** Passes the {@code aStructArray} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct5 aStructArray(java.util.function.Consumer<SmallTestStruct7.Buffer> consumer) { consumer.accept(aStructArray()); return this; }
    /** Passes the element at {@code index} of the {@code aStructArray} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct5 aStructArray(int index, java.util.function.Consumer<SmallTestStruct7> consumer) { consumer.accept(aStructArray(index)); return this; }

    /** Initializes this struct with the specified values. */
    public MediumTestStruct5 set(
        ByteBuffer aFloat64Array,
        MediumTestStruct3 aMediumTestStruct3,
        SmallTestStruct2 aSmallTestStruct2,
        long aPointer64,
        SmallTestStruct7.Buffer aStructArray
    ) {
        aFloat64Array(aFloat64Array);
        aMediumTestStruct3(aMediumTestStruct3);
        aSmallTestStruct2(aSmallTestStruct2);
        aPointer64(aPointer64);
        aStructArray(aStructArray);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MediumTestStruct5 set(MediumTestStruct5 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MediumTestStruct5} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MediumTestStruct5 malloc() {
        return new MediumTestStruct5(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MediumTestStruct5} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MediumTestStruct5 calloc() {
        return new MediumTestStruct5(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MediumTestStruct5} instance allocated with {@link BufferUtils}. */
    public static MediumTestStruct5 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MediumTestStruct5(memAddress(container), container);
    }

    /** Returns a new {@code MediumTestStruct5} instance for the specified memory address. */
    public static MediumTestStruct5 create(long address) {
        return new MediumTestStruct5(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable MediumTestStruct5 createSafe(long address) {
        return address == NULL ? null : new MediumTestStruct5(address, null);
    }

    /**
     * Returns a new {@link MediumTestStruct5.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct5.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MediumTestStruct5.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct5.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MediumTestStruct5.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct5.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MediumTestStruct5.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct5.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static MediumTestStruct5.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code MediumTestStruct5} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MediumTestStruct5 malloc(MemoryStack stack) {
        return new MediumTestStruct5(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MediumTestStruct5} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MediumTestStruct5 calloc(MemoryStack stack) {
        return new MediumTestStruct5(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MediumTestStruct5.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct5.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MediumTestStruct5.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct5.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aFloat64Array}. */
    public static ByteBuffer naFloat64Array(long struct) { return memByteBuffer(struct + MediumTestStruct5.AFLOAT64ARRAY, 21); }
    /** Unsafe version of {@link #aFloat64Array(int) aFloat64Array}. */
    public static byte naFloat64Array(long struct, int index) {
        return memGetByte(struct + MediumTestStruct5.AFLOAT64ARRAY + check(index, 21) * 1);
    }
    /** Unsafe version of {@link #aMediumTestStruct3}. */
    public static MediumTestStruct3 naMediumTestStruct3(long struct) { return MediumTestStruct3.create(struct + MediumTestStruct5.AMEDIUMTESTSTRUCT3); }
    /** Unsafe version of {@link #aSmallTestStruct2}. */
    public static SmallTestStruct2 naSmallTestStruct2(long struct) { return SmallTestStruct2.create(struct + MediumTestStruct5.ASMALLTESTSTRUCT2); }
    /** Unsafe version of {@link #aPointer64}. */
    public static long naPointer64(long struct) { return memGetLong(struct + MediumTestStruct5.APOINTER64); }
    /** Unsafe version of {@link #aStructArray}. */
    public static SmallTestStruct7.Buffer naStructArray(long struct) { return SmallTestStruct7.create(struct + MediumTestStruct5.ASTRUCTARRAY, 5); }
    /** Unsafe version of {@link #aStructArray(int) aStructArray}. */
    public static SmallTestStruct7 naStructArray(long struct, int index) {
        return SmallTestStruct7.create(struct + MediumTestStruct5.ASTRUCTARRAY + check(index, 5) * SmallTestStruct7.SIZEOF);
    }

    /** Unsafe version of {@link #aFloat64Array(ByteBuffer) aFloat64Array}. */
    public static void naFloat64Array(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 21); }
        memCopy(memAddress(value), struct + MediumTestStruct5.AFLOAT64ARRAY, value.remaining() * 1);
    }
    /** Unsafe version of {@link #aFloat64Array(int, byte) aFloat64Array}. */
    public static void naFloat64Array(long struct, int index, byte value) {
        memPutByte(struct + MediumTestStruct5.AFLOAT64ARRAY + check(index, 21) * 1, value);
    }
    /** Unsafe version of {@link #aMediumTestStruct3(MediumTestStruct3) aMediumTestStruct3}. */
    public static void naMediumTestStruct3(long struct, MediumTestStruct3 value) { memCopy(value.address(), struct + MediumTestStruct5.AMEDIUMTESTSTRUCT3, MediumTestStruct3.SIZEOF); }
    /** Unsafe version of {@link #aSmallTestStruct2(SmallTestStruct2) aSmallTestStruct2}. */
    public static void naSmallTestStruct2(long struct, SmallTestStruct2 value) { memCopy(value.address(), struct + MediumTestStruct5.ASMALLTESTSTRUCT2, SmallTestStruct2.SIZEOF); }
    /** Unsafe version of {@link #aPointer64(long) aPointer64}. */
    public static void naPointer64(long struct, long value) { memPutLong(struct + MediumTestStruct5.APOINTER64, value); }
    /** Unsafe version of {@link #aStructArray(SmallTestStruct7.Buffer) aStructArray}. */
    public static void naStructArray(long struct, SmallTestStruct7.Buffer value) {
        if (CHECKS) { checkGT(value, 5); }
        memCopy(value.address(), struct + MediumTestStruct5.ASTRUCTARRAY, value.remaining() * SmallTestStruct7.SIZEOF);
    }
    /** Unsafe version of {@link #aStructArray(int, SmallTestStruct7) aStructArray}. */
    public static void naStructArray(long struct, int index, SmallTestStruct7 value) {
        memCopy(value.address(), struct + MediumTestStruct5.ASTRUCTARRAY + check(index, 5) * SmallTestStruct7.SIZEOF, SmallTestStruct7.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link MediumTestStruct5} structs. */
    public static class Buffer extends StructBuffer<MediumTestStruct5, Buffer> implements NativeResource {

        private static final MediumTestStruct5 ELEMENT_FACTORY = MediumTestStruct5.create(-1L);

        /**
         * Creates a new {@code MediumTestStruct5.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MediumTestStruct5#SIZEOF}, and its mark will be undefined.</p>
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
        protected MediumTestStruct5 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code aFloat64Array} field. */
        @NativeType("int8_t[21]")
        public ByteBuffer aFloat64Array() { return MediumTestStruct5.naFloat64Array(address()); }
        /** @return the value at the specified index of the {@code aFloat64Array} field. */
        @NativeType("int8_t")
        public byte aFloat64Array(int index) { return MediumTestStruct5.naFloat64Array(address(), index); }
        /** @return a {@link MediumTestStruct3} view of the {@code aMediumTestStruct3} field. */
        public MediumTestStruct3 aMediumTestStruct3() { return MediumTestStruct5.naMediumTestStruct3(address()); }
        /** @return a {@link SmallTestStruct2} view of the {@code aSmallTestStruct2} field. */
        public SmallTestStruct2 aSmallTestStruct2() { return MediumTestStruct5.naSmallTestStruct2(address()); }
        /** @return the value of the {@code aPointer64} field. */
        @NativeType("int64_t")
        public long aPointer64() { return MediumTestStruct5.naPointer64(address()); }
        /** @return a {@link SmallTestStruct7}.Buffer view of the {@code aStructArray} field. */
        @NativeType("SmallTestStruct7[5]")
        public SmallTestStruct7.Buffer aStructArray() { return MediumTestStruct5.naStructArray(address()); }
        /** @return a {@link SmallTestStruct7} view of the struct at the specified index of the {@code aStructArray} field. */
        public SmallTestStruct7 aStructArray(int index) { return MediumTestStruct5.naStructArray(address(), index); }

        /** Copies the specified {@link ByteBuffer} to the {@code aFloat64Array} field. */
        public MediumTestStruct5.Buffer aFloat64Array(@NativeType("int8_t[21]") ByteBuffer value) { MediumTestStruct5.naFloat64Array(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code aFloat64Array} field. */
        public MediumTestStruct5.Buffer aFloat64Array(int index, @NativeType("int8_t") byte value) { MediumTestStruct5.naFloat64Array(address(), index, value); return this; }
        /** Copies the specified {@link MediumTestStruct3} to the {@code aMediumTestStruct3} field. */
        public MediumTestStruct5.Buffer aMediumTestStruct3(MediumTestStruct3 value) { MediumTestStruct5.naMediumTestStruct3(address(), value); return this; }
        /** Passes the {@code aMediumTestStruct3} field to the specified {@link java.util.function.Consumer Consumer}. */
        public MediumTestStruct5.Buffer aMediumTestStruct3(java.util.function.Consumer<MediumTestStruct3> consumer) { consumer.accept(aMediumTestStruct3()); return this; }
        /** Copies the specified {@link SmallTestStruct2} to the {@code aSmallTestStruct2} field. */
        public MediumTestStruct5.Buffer aSmallTestStruct2(SmallTestStruct2 value) { MediumTestStruct5.naSmallTestStruct2(address(), value); return this; }
        /** Passes the {@code aSmallTestStruct2} field to the specified {@link java.util.function.Consumer Consumer}. */
        public MediumTestStruct5.Buffer aSmallTestStruct2(java.util.function.Consumer<SmallTestStruct2> consumer) { consumer.accept(aSmallTestStruct2()); return this; }
        /** Sets the specified value to the {@code aPointer64} field. */
        public MediumTestStruct5.Buffer aPointer64(@NativeType("int64_t") long value) { MediumTestStruct5.naPointer64(address(), value); return this; }
        /** Copies the specified {@link SmallTestStruct7.Buffer} to the {@code aStructArray} field. */
        public MediumTestStruct5.Buffer aStructArray(@NativeType("SmallTestStruct7[5]") SmallTestStruct7.Buffer value) { MediumTestStruct5.naStructArray(address(), value); return this; }
        /** Copies the specified {@link SmallTestStruct7} at the specified index of the {@code aStructArray} field. */
        public MediumTestStruct5.Buffer aStructArray(int index, SmallTestStruct7 value) { MediumTestStruct5.naStructArray(address(), index, value); return this; }
        /** Passes the {@code aStructArray} field to the specified {@link java.util.function.Consumer Consumer}. */
        public MediumTestStruct5.Buffer aStructArray(java.util.function.Consumer<SmallTestStruct7.Buffer> consumer) { consumer.accept(aStructArray()); return this; }
        /** Passes the element at {@code index} of the {@code aStructArray} field to the specified {@link java.util.function.Consumer Consumer}. */
        public MediumTestStruct5.Buffer aStructArray(int index, java.util.function.Consumer<SmallTestStruct7> consumer) { consumer.accept(aStructArray(index)); return this; }

    }

}