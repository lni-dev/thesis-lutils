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
 * struct SmallTestStruct2 {
 *     int32_t aInt;
 *     int8_t aByte;
 *     int64_t aLong;
 * }}</pre>
 */
public class SmallTestStruct2 extends Struct<SmallTestStruct2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        AINT,
        ABYTE,
        ALONG;

    static {
        Layout layout = __struct(
            __member(4),
            __member(1),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        AINT = layout.offsetof(0);
        ABYTE = layout.offsetof(1);
        ALONG = layout.offsetof(2);
    }

    protected SmallTestStruct2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SmallTestStruct2 create(long address, @Nullable ByteBuffer container) {
        return new SmallTestStruct2(address, container);
    }

    /**
     * Creates a {@code SmallTestStruct2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SmallTestStruct2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code aInt} field. */
    @NativeType("int32_t")
    public int aInt() { return naInt(address()); }
    /** @return the value of the {@code aByte} field. */
    @NativeType("int8_t")
    public byte aByte() { return naByte(address()); }
    /** @return the value of the {@code aLong} field. */
    @NativeType("int64_t")
    public long aLong() { return naLong(address()); }

    /** Sets the specified value to the {@code aInt} field. */
    public SmallTestStruct2 aInt(@NativeType("int32_t") int value) { naInt(address(), value); return this; }
    /** Sets the specified value to the {@code aByte} field. */
    public SmallTestStruct2 aByte(@NativeType("int8_t") byte value) { naByte(address(), value); return this; }
    /** Sets the specified value to the {@code aLong} field. */
    public SmallTestStruct2 aLong(@NativeType("int64_t") long value) { naLong(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SmallTestStruct2 set(
        int aInt,
        byte aByte,
        long aLong
    ) {
        aInt(aInt);
        aByte(aByte);
        aLong(aLong);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SmallTestStruct2 set(SmallTestStruct2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SmallTestStruct2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SmallTestStruct2 malloc() {
        return new SmallTestStruct2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SmallTestStruct2 calloc() {
        return new SmallTestStruct2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct2} instance allocated with {@link BufferUtils}. */
    public static SmallTestStruct2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SmallTestStruct2(memAddress(container), container);
    }

    /** Returns a new {@code SmallTestStruct2} instance for the specified memory address. */
    public static SmallTestStruct2 create(long address) {
        return new SmallTestStruct2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SmallTestStruct2 createSafe(long address) {
        return address == NULL ? null : new SmallTestStruct2(address, null);
    }

    /**
     * Returns a new {@link SmallTestStruct2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SmallTestStruct2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SmallTestStruct2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SmallTestStruct2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct2 malloc(MemoryStack stack) {
        return new SmallTestStruct2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SmallTestStruct2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct2 calloc(MemoryStack stack) {
        return new SmallTestStruct2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SmallTestStruct2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aInt}. */
    public static int naInt(long struct) { return memGetInt(struct + SmallTestStruct2.AINT); }
    /** Unsafe version of {@link #aByte}. */
    public static byte naByte(long struct) { return memGetByte(struct + SmallTestStruct2.ABYTE); }
    /** Unsafe version of {@link #aLong}. */
    public static long naLong(long struct) { return memGetLong(struct + SmallTestStruct2.ALONG); }

    /** Unsafe version of {@link #aInt(int) aInt}. */
    public static void naInt(long struct, int value) { memPutInt(struct + SmallTestStruct2.AINT, value); }
    /** Unsafe version of {@link #aByte(byte) aByte}. */
    public static void naByte(long struct, byte value) { memPutByte(struct + SmallTestStruct2.ABYTE, value); }
    /** Unsafe version of {@link #aLong(long) aLong}. */
    public static void naLong(long struct, long value) { memPutLong(struct + SmallTestStruct2.ALONG, value); }

    // -----------------------------------

    /** An array of {@link SmallTestStruct2} structs. */
    public static class Buffer extends StructBuffer<SmallTestStruct2, Buffer> implements NativeResource {

        private static final SmallTestStruct2 ELEMENT_FACTORY = SmallTestStruct2.create(-1L);

        /**
         * Creates a new {@code SmallTestStruct2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SmallTestStruct2#SIZEOF}, and its mark will be undefined.</p>
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
        protected SmallTestStruct2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code aInt} field. */
        @NativeType("int32_t")
        public int aInt() { return SmallTestStruct2.naInt(address()); }
        /** @return the value of the {@code aByte} field. */
        @NativeType("int8_t")
        public byte aByte() { return SmallTestStruct2.naByte(address()); }
        /** @return the value of the {@code aLong} field. */
        @NativeType("int64_t")
        public long aLong() { return SmallTestStruct2.naLong(address()); }

        /** Sets the specified value to the {@code aInt} field. */
        public SmallTestStruct2.Buffer aInt(@NativeType("int32_t") int value) { SmallTestStruct2.naInt(address(), value); return this; }
        /** Sets the specified value to the {@code aByte} field. */
        public SmallTestStruct2.Buffer aByte(@NativeType("int8_t") byte value) { SmallTestStruct2.naByte(address(), value); return this; }
        /** Sets the specified value to the {@code aLong} field. */
        public SmallTestStruct2.Buffer aLong(@NativeType("int64_t") long value) { SmallTestStruct2.naLong(address(), value); return this; }

    }

}