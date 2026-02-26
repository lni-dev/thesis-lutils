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
import java.nio.LongBuffer;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct SmallTestStruct5 {
 *     int64_t aPointer64;
 *     int16_t aShort1;
 *     int64_t aLong3[3];
 * }}</pre>
 */
public class SmallTestStruct5 extends Struct<SmallTestStruct5> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        APOINTER64,
        ASHORT1,
        ALONG3;

    static {
        Layout layout = __struct(
            __member(8),
            __member(2),
            __array(8, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        APOINTER64 = layout.offsetof(0);
        ASHORT1 = layout.offsetof(1);
        ALONG3 = layout.offsetof(2);
    }

    protected SmallTestStruct5(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SmallTestStruct5 create(long address, @Nullable ByteBuffer container) {
        return new SmallTestStruct5(address, container);
    }

    /**
     * Creates a {@code SmallTestStruct5} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SmallTestStruct5(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code aPointer64} field. */
    @NativeType("int64_t")
    public long aPointer64() { return naPointer64(address()); }
    /** @return the value of the {@code aShort1} field. */
    @NativeType("int16_t")
    public short aShort1() { return naShort1(address()); }
    /** @return a {@link LongBuffer} view of the {@code aLong3} field. */
    @NativeType("int64_t[3]")
    public LongBuffer aLong3() { return naLong3(address()); }
    /** @return the value at the specified index of the {@code aLong3} field. */
    @NativeType("int64_t")
    public long aLong3(int index) { return naLong3(address(), index); }

    /** Sets the specified value to the {@code aPointer64} field. */
    public SmallTestStruct5 aPointer64(@NativeType("int64_t") long value) { naPointer64(address(), value); return this; }
    /** Sets the specified value to the {@code aShort1} field. */
    public SmallTestStruct5 aShort1(@NativeType("int16_t") short value) { naShort1(address(), value); return this; }
    /** Copies the specified {@link LongBuffer} to the {@code aLong3} field. */
    public SmallTestStruct5 aLong3(@NativeType("int64_t[3]") LongBuffer value) { naLong3(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code aLong3} field. */
    public SmallTestStruct5 aLong3(int index, @NativeType("int64_t") long value) { naLong3(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public SmallTestStruct5 set(
        long aPointer64,
        short aShort1,
        LongBuffer aLong3
    ) {
        aPointer64(aPointer64);
        aShort1(aShort1);
        aLong3(aLong3);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SmallTestStruct5 set(SmallTestStruct5 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SmallTestStruct5} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SmallTestStruct5 malloc() {
        return new SmallTestStruct5(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct5} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SmallTestStruct5 calloc() {
        return new SmallTestStruct5(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct5} instance allocated with {@link BufferUtils}. */
    public static SmallTestStruct5 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SmallTestStruct5(memAddress(container), container);
    }

    /** Returns a new {@code SmallTestStruct5} instance for the specified memory address. */
    public static SmallTestStruct5 create(long address) {
        return new SmallTestStruct5(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SmallTestStruct5 createSafe(long address) {
        return address == NULL ? null : new SmallTestStruct5(address, null);
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
     * Returns a new {@code SmallTestStruct5} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct5 malloc(MemoryStack stack) {
        return new SmallTestStruct5(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SmallTestStruct5} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct5 calloc(MemoryStack stack) {
        return new SmallTestStruct5(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /** Unsafe version of {@link #aPointer64}. */
    public static long naPointer64(long struct) { return memGetLong(struct + SmallTestStruct5.APOINTER64); }
    /** Unsafe version of {@link #aShort1}. */
    public static short naShort1(long struct) { return memGetShort(struct + SmallTestStruct5.ASHORT1); }
    /** Unsafe version of {@link #aLong3}. */
    public static LongBuffer naLong3(long struct) { return memLongBuffer(struct + SmallTestStruct5.ALONG3, 3); }
    /** Unsafe version of {@link #aLong3(int) aLong3}. */
    public static long naLong3(long struct, int index) {
        return memGetLong(struct + SmallTestStruct5.ALONG3 + check(index, 3) * 8);
    }

    /** Unsafe version of {@link #aPointer64(long) aPointer64}. */
    public static void naPointer64(long struct, long value) { memPutLong(struct + SmallTestStruct5.APOINTER64, value); }
    /** Unsafe version of {@link #aShort1(short) aShort1}. */
    public static void naShort1(long struct, short value) { memPutShort(struct + SmallTestStruct5.ASHORT1, value); }
    /** Unsafe version of {@link #aLong3(LongBuffer) aLong3}. */
    public static void naLong3(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + SmallTestStruct5.ALONG3, value.remaining() * 8);
    }
    /** Unsafe version of {@link #aLong3(int, long) aLong3}. */
    public static void naLong3(long struct, int index, long value) {
        memPutLong(struct + SmallTestStruct5.ALONG3 + check(index, 3) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link SmallTestStruct5} structs. */
    public static class Buffer extends StructBuffer<SmallTestStruct5, Buffer> implements NativeResource {

        private static final SmallTestStruct5 ELEMENT_FACTORY = SmallTestStruct5.create(-1L);

        /**
         * Creates a new {@code SmallTestStruct5.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SmallTestStruct5#SIZEOF}, and its mark will be undefined.</p>
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
        protected SmallTestStruct5 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code aPointer64} field. */
        @NativeType("int64_t")
        public long aPointer64() { return SmallTestStruct5.naPointer64(address()); }
        /** @return the value of the {@code aShort1} field. */
        @NativeType("int16_t")
        public short aShort1() { return SmallTestStruct5.naShort1(address()); }
        /** @return a {@link LongBuffer} view of the {@code aLong3} field. */
        @NativeType("int64_t[3]")
        public LongBuffer aLong3() { return SmallTestStruct5.naLong3(address()); }
        /** @return the value at the specified index of the {@code aLong3} field. */
        @NativeType("int64_t")
        public long aLong3(int index) { return SmallTestStruct5.naLong3(address(), index); }

        /** Sets the specified value to the {@code aPointer64} field. */
        public Buffer aPointer64(@NativeType("int64_t") long value) { SmallTestStruct5.naPointer64(address(), value); return this; }
        /** Sets the specified value to the {@code aShort1} field. */
        public Buffer aShort1(@NativeType("int16_t") short value) { SmallTestStruct5.naShort1(address(), value); return this; }
        /** Copies the specified {@link LongBuffer} to the {@code aLong3} field. */
        public Buffer aLong3(@NativeType("int64_t[3]") LongBuffer value) { SmallTestStruct5.naLong3(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code aLong3} field. */
        public Buffer aLong3(int index, @NativeType("int64_t") long value) { SmallTestStruct5.naLong3(address(), index, value); return this; }

    }

}