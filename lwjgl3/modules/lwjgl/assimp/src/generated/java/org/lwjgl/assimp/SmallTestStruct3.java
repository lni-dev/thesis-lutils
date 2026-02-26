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
 * struct SmallTestStruct3 {
 *     int64_t aLong;
 *     int64_t aSecondLong;
 *     int64_t aThirdLong;
 * }}</pre>
 */
public class SmallTestStruct3 extends Struct<SmallTestStruct3> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALONG,
        ASECONDLONG,
        ATHIRDLONG;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ALONG = layout.offsetof(0);
        ASECONDLONG = layout.offsetof(1);
        ATHIRDLONG = layout.offsetof(2);
    }

    protected SmallTestStruct3(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SmallTestStruct3 create(long address, @Nullable ByteBuffer container) {
        return new SmallTestStruct3(address, container);
    }

    /**
     * Creates a {@code SmallTestStruct3} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SmallTestStruct3(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code aLong} field. */
    @NativeType("int64_t")
    public long aLong() { return naLong(address()); }
    /** @return the value of the {@code aSecondLong} field. */
    @NativeType("int64_t")
    public long aSecondLong() { return naSecondLong(address()); }
    /** @return the value of the {@code aThirdLong} field. */
    @NativeType("int64_t")
    public long aThirdLong() { return naThirdLong(address()); }

    /** Sets the specified value to the {@code aLong} field. */
    public SmallTestStruct3 aLong(@NativeType("int64_t") long value) { naLong(address(), value); return this; }
    /** Sets the specified value to the {@code aSecondLong} field. */
    public SmallTestStruct3 aSecondLong(@NativeType("int64_t") long value) { naSecondLong(address(), value); return this; }
    /** Sets the specified value to the {@code aThirdLong} field. */
    public SmallTestStruct3 aThirdLong(@NativeType("int64_t") long value) { naThirdLong(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SmallTestStruct3 set(
        long aLong,
        long aSecondLong,
        long aThirdLong
    ) {
        aLong(aLong);
        aSecondLong(aSecondLong);
        aThirdLong(aThirdLong);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SmallTestStruct3 set(SmallTestStruct3 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SmallTestStruct3} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SmallTestStruct3 malloc() {
        return new SmallTestStruct3(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct3} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SmallTestStruct3 calloc() {
        return new SmallTestStruct3(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct3} instance allocated with {@link BufferUtils}. */
    public static SmallTestStruct3 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SmallTestStruct3(memAddress(container), container);
    }

    /** Returns a new {@code SmallTestStruct3} instance for the specified memory address. */
    public static SmallTestStruct3 create(long address) {
        return new SmallTestStruct3(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SmallTestStruct3 createSafe(long address) {
        return address == NULL ? null : new SmallTestStruct3(address, null);
    }

    /**
     * Returns a new {@link SmallTestStruct3.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct3.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct3.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct3.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct3.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct3.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SmallTestStruct3.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct3.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SmallTestStruct3.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SmallTestStruct3} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct3 malloc(MemoryStack stack) {
        return new SmallTestStruct3(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SmallTestStruct3} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct3 calloc(MemoryStack stack) {
        return new SmallTestStruct3(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SmallTestStruct3.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct3.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct3.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct3.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aLong}. */
    public static long naLong(long struct) { return memGetLong(struct + SmallTestStruct3.ALONG); }
    /** Unsafe version of {@link #aSecondLong}. */
    public static long naSecondLong(long struct) { return memGetLong(struct + SmallTestStruct3.ASECONDLONG); }
    /** Unsafe version of {@link #aThirdLong}. */
    public static long naThirdLong(long struct) { return memGetLong(struct + SmallTestStruct3.ATHIRDLONG); }

    /** Unsafe version of {@link #aLong(long) aLong}. */
    public static void naLong(long struct, long value) { memPutLong(struct + SmallTestStruct3.ALONG, value); }
    /** Unsafe version of {@link #aSecondLong(long) aSecondLong}. */
    public static void naSecondLong(long struct, long value) { memPutLong(struct + SmallTestStruct3.ASECONDLONG, value); }
    /** Unsafe version of {@link #aThirdLong(long) aThirdLong}. */
    public static void naThirdLong(long struct, long value) { memPutLong(struct + SmallTestStruct3.ATHIRDLONG, value); }

    // -----------------------------------

    /** An array of {@link SmallTestStruct3} structs. */
    public static class Buffer extends StructBuffer<SmallTestStruct3, Buffer> implements NativeResource {

        private static final SmallTestStruct3 ELEMENT_FACTORY = SmallTestStruct3.create(-1L);

        /**
         * Creates a new {@code SmallTestStruct3.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SmallTestStruct3#SIZEOF}, and its mark will be undefined.</p>
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
        protected SmallTestStruct3 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code aLong} field. */
        @NativeType("int64_t")
        public long aLong() { return SmallTestStruct3.naLong(address()); }
        /** @return the value of the {@code aSecondLong} field. */
        @NativeType("int64_t")
        public long aSecondLong() { return SmallTestStruct3.naSecondLong(address()); }
        /** @return the value of the {@code aThirdLong} field. */
        @NativeType("int64_t")
        public long aThirdLong() { return SmallTestStruct3.naThirdLong(address()); }

        /** Sets the specified value to the {@code aLong} field. */
        public SmallTestStruct3.Buffer aLong(@NativeType("int64_t") long value) { SmallTestStruct3.naLong(address(), value); return this; }
        /** Sets the specified value to the {@code aSecondLong} field. */
        public SmallTestStruct3.Buffer aSecondLong(@NativeType("int64_t") long value) { SmallTestStruct3.naSecondLong(address(), value); return this; }
        /** Sets the specified value to the {@code aThirdLong} field. */
        public SmallTestStruct3.Buffer aThirdLong(@NativeType("int64_t") long value) { SmallTestStruct3.naThirdLong(address(), value); return this; }

    }

}