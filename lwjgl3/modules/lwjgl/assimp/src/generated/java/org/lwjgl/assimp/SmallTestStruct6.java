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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SmallTestStruct6 {
 *     int64_t aPointer;
 *     int8_t aByte1;
 *     int64_t aSecondPointer;
 * }}</pre>
 */
public class SmallTestStruct6 extends Struct<SmallTestStruct6> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        APOINTER,
        ABYTE1,
        ASECONDPOINTER;

    static {
        Layout layout = __struct(
            __member(8),
            __member(1),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        APOINTER = layout.offsetof(0);
        ABYTE1 = layout.offsetof(1);
        ASECONDPOINTER = layout.offsetof(2);
    }

    protected SmallTestStruct6(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SmallTestStruct6 create(long address, @Nullable ByteBuffer container) {
        return new SmallTestStruct6(address, container);
    }

    /**
     * Creates a {@code SmallTestStruct6} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SmallTestStruct6(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code aPointer} field. */
    @NativeType("int64_t")
    public long aPointer() { return naPointer(address()); }
    /** @return the value of the {@code aByte1} field. */
    @NativeType("int8_t")
    public byte aByte1() { return naByte1(address()); }
    /** @return the value of the {@code aSecondPointer} field. */
    @NativeType("int64_t")
    public long aSecondPointer() { return naSecondPointer(address()); }

    /** Sets the specified value to the {@code aPointer} field. */
    public SmallTestStruct6 aPointer(@NativeType("int64_t") long value) { naPointer(address(), value); return this; }
    /** Sets the specified value to the {@code aByte1} field. */
    public SmallTestStruct6 aByte1(@NativeType("int8_t") byte value) { naByte1(address(), value); return this; }
    /** Sets the specified value to the {@code aSecondPointer} field. */
    public SmallTestStruct6 aSecondPointer(@NativeType("int64_t") long value) { naSecondPointer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SmallTestStruct6 set(
        long aPointer,
        byte aByte1,
        long aSecondPointer
    ) {
        aPointer(aPointer);
        aByte1(aByte1);
        aSecondPointer(aSecondPointer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SmallTestStruct6 set(SmallTestStruct6 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SmallTestStruct6} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SmallTestStruct6 malloc() {
        return new SmallTestStruct6(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct6} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SmallTestStruct6 calloc() {
        return new SmallTestStruct6(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct6} instance allocated with {@link BufferUtils}. */
    public static SmallTestStruct6 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SmallTestStruct6(memAddress(container), container);
    }

    /** Returns a new {@code SmallTestStruct6} instance for the specified memory address. */
    public static SmallTestStruct6 create(long address) {
        return new SmallTestStruct6(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SmallTestStruct6 createSafe(long address) {
        return address == NULL ? null : new SmallTestStruct6(address, null);
    }

    /**
     * Returns a new {@link SmallTestStruct6.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct6.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct6.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct6.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct6.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct6.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SmallTestStruct6.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct6.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SmallTestStruct6.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SmallTestStruct6} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct6 malloc(MemoryStack stack) {
        return new SmallTestStruct6(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SmallTestStruct6} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct6 calloc(MemoryStack stack) {
        return new SmallTestStruct6(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SmallTestStruct6.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct6.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct6.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct6.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aPointer}. */
    public static long naPointer(long struct) { return memGetLong(struct + SmallTestStruct6.APOINTER); }
    /** Unsafe version of {@link #aByte1}. */
    public static byte naByte1(long struct) { return memGetByte(struct + SmallTestStruct6.ABYTE1); }
    /** Unsafe version of {@link #aSecondPointer}. */
    public static long naSecondPointer(long struct) { return memGetLong(struct + SmallTestStruct6.ASECONDPOINTER); }

    /** Unsafe version of {@link #aPointer(long) aPointer}. */
    public static void naPointer(long struct, long value) { memPutLong(struct + SmallTestStruct6.APOINTER, value); }
    /** Unsafe version of {@link #aByte1(byte) aByte1}. */
    public static void naByte1(long struct, byte value) { memPutByte(struct + SmallTestStruct6.ABYTE1, value); }
    /** Unsafe version of {@link #aSecondPointer(long) aSecondPointer}. */
    public static void naSecondPointer(long struct, long value) { memPutLong(struct + SmallTestStruct6.ASECONDPOINTER, value); }

    // -----------------------------------

    /** An array of {@link SmallTestStruct6} structs. */
    public static class Buffer extends StructBuffer<SmallTestStruct6, Buffer> implements NativeResource {

        private static final SmallTestStruct6 ELEMENT_FACTORY = SmallTestStruct6.create(-1L);

        /**
         * Creates a new {@code SmallTestStruct6.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SmallTestStruct6#SIZEOF}, and its mark will be undefined.</p>
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
        protected SmallTestStruct6 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code aPointer} field. */
        @NativeType("int64_t")
        public long aPointer() { return SmallTestStruct6.naPointer(address()); }
        /** @return the value of the {@code aByte1} field. */
        @NativeType("int8_t")
        public byte aByte1() { return SmallTestStruct6.naByte1(address()); }
        /** @return the value of the {@code aSecondPointer} field. */
        @NativeType("int64_t")
        public long aSecondPointer() { return SmallTestStruct6.naSecondPointer(address()); }

        /** Sets the specified value to the {@code aPointer} field. */
        public SmallTestStruct6.Buffer aPointer(@NativeType("int64_t") long value) { SmallTestStruct6.naPointer(address(), value); return this; }
        /** Sets the specified value to the {@code aByte1} field. */
        public SmallTestStruct6.Buffer aByte1(@NativeType("int8_t") byte value) { SmallTestStruct6.naByte1(address(), value); return this; }
        /** Sets the specified value to the {@code aSecondPointer} field. */
        public SmallTestStruct6.Buffer aSecondPointer(@NativeType("int64_t") long value) { SmallTestStruct6.naSecondPointer(address(), value); return this; }

    }

}