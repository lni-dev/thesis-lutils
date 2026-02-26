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
 * struct LargeTestStruct5 {
 *     {@link LargeTestStruct1 LargeTestStruct1} largeTestStruct1;
 *     {@link LargeTestStruct4 LargeTestStruct4} largeTestStruct4;
 * }}</pre>
 */
public class LargeTestStruct5 extends Struct<LargeTestStruct5> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LARGETESTSTRUCT1,
        LARGETESTSTRUCT4;

    static {
        Layout layout = __struct(
            __member(LargeTestStruct1.SIZEOF, LargeTestStruct1.ALIGNOF),
            __member(LargeTestStruct4.SIZEOF, LargeTestStruct4.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LARGETESTSTRUCT1 = layout.offsetof(0);
        LARGETESTSTRUCT4 = layout.offsetof(1);
    }

    protected LargeTestStruct5(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LargeTestStruct5 create(long address, @Nullable ByteBuffer container) {
        return new LargeTestStruct5(address, container);
    }

    /**
     * Creates a {@code LargeTestStruct5} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LargeTestStruct5(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link LargeTestStruct1} view of the {@code largeTestStruct1} field. */
    public LargeTestStruct1 largeTestStruct1() { return nlargeTestStruct1(address()); }
    /** @return a {@link LargeTestStruct4} view of the {@code largeTestStruct4} field. */
    public LargeTestStruct4 largeTestStruct4() { return nlargeTestStruct4(address()); }

    /** Copies the specified {@link LargeTestStruct1} to the {@code largeTestStruct1} field. */
    public LargeTestStruct5 largeTestStruct1(LargeTestStruct1 value) { nlargeTestStruct1(address(), value); return this; }
    /** Passes the {@code largeTestStruct1} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct5 largeTestStruct1(java.util.function.Consumer<LargeTestStruct1> consumer) { consumer.accept(largeTestStruct1()); return this; }
    /** Copies the specified {@link LargeTestStruct4} to the {@code largeTestStruct4} field. */
    public LargeTestStruct5 largeTestStruct4(LargeTestStruct4 value) { nlargeTestStruct4(address(), value); return this; }
    /** Passes the {@code largeTestStruct4} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct5 largeTestStruct4(java.util.function.Consumer<LargeTestStruct4> consumer) { consumer.accept(largeTestStruct4()); return this; }

    /** Initializes this struct with the specified values. */
    public LargeTestStruct5 set(
        LargeTestStruct1 largeTestStruct1,
        LargeTestStruct4 largeTestStruct4
    ) {
        largeTestStruct1(largeTestStruct1);
        largeTestStruct4(largeTestStruct4);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LargeTestStruct5 set(LargeTestStruct5 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LargeTestStruct5} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LargeTestStruct5 malloc() {
        return new LargeTestStruct5(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LargeTestStruct5} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LargeTestStruct5 calloc() {
        return new LargeTestStruct5(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LargeTestStruct5} instance allocated with {@link BufferUtils}. */
    public static LargeTestStruct5 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LargeTestStruct5(memAddress(container), container);
    }

    /** Returns a new {@code LargeTestStruct5} instance for the specified memory address. */
    public static LargeTestStruct5 create(long address) {
        return new LargeTestStruct5(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable LargeTestStruct5 createSafe(long address) {
        return address == NULL ? null : new LargeTestStruct5(address, null);
    }

    /**
     * Returns a new {@link LargeTestStruct5.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct5.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LargeTestStruct5.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct5.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LargeTestStruct5.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct5.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LargeTestStruct5.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct5.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static LargeTestStruct5.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code LargeTestStruct5} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LargeTestStruct5 malloc(MemoryStack stack) {
        return new LargeTestStruct5(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LargeTestStruct5} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LargeTestStruct5 calloc(MemoryStack stack) {
        return new LargeTestStruct5(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LargeTestStruct5.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct5.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LargeTestStruct5.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct5.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #largeTestStruct1}. */
    public static LargeTestStruct1 nlargeTestStruct1(long struct) { return LargeTestStruct1.create(struct + LargeTestStruct5.LARGETESTSTRUCT1); }
    /** Unsafe version of {@link #largeTestStruct4}. */
    public static LargeTestStruct4 nlargeTestStruct4(long struct) { return LargeTestStruct4.create(struct + LargeTestStruct5.LARGETESTSTRUCT4); }

    /** Unsafe version of {@link #largeTestStruct1(LargeTestStruct1) largeTestStruct1}. */
    public static void nlargeTestStruct1(long struct, LargeTestStruct1 value) { memCopy(value.address(), struct + LargeTestStruct5.LARGETESTSTRUCT1, LargeTestStruct1.SIZEOF); }
    /** Unsafe version of {@link #largeTestStruct4(LargeTestStruct4) largeTestStruct4}. */
    public static void nlargeTestStruct4(long struct, LargeTestStruct4 value) { memCopy(value.address(), struct + LargeTestStruct5.LARGETESTSTRUCT4, LargeTestStruct4.SIZEOF); }

    // -----------------------------------

    /** An array of {@link LargeTestStruct5} structs. */
    public static class Buffer extends StructBuffer<LargeTestStruct5, Buffer> implements NativeResource {

        private static final LargeTestStruct5 ELEMENT_FACTORY = LargeTestStruct5.create(-1L);

        /**
         * Creates a new {@code LargeTestStruct5.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LargeTestStruct5#SIZEOF}, and its mark will be undefined.</p>
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
        protected LargeTestStruct5 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link LargeTestStruct1} view of the {@code largeTestStruct1} field. */
        public LargeTestStruct1 largeTestStruct1() { return LargeTestStruct5.nlargeTestStruct1(address()); }
        /** @return a {@link LargeTestStruct4} view of the {@code largeTestStruct4} field. */
        public LargeTestStruct4 largeTestStruct4() { return LargeTestStruct5.nlargeTestStruct4(address()); }

        /** Copies the specified {@link LargeTestStruct1} to the {@code largeTestStruct1} field. */
        public LargeTestStruct5.Buffer largeTestStruct1(LargeTestStruct1 value) { LargeTestStruct5.nlargeTestStruct1(address(), value); return this; }
        /** Passes the {@code largeTestStruct1} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LargeTestStruct5.Buffer largeTestStruct1(java.util.function.Consumer<LargeTestStruct1> consumer) { consumer.accept(largeTestStruct1()); return this; }
        /** Copies the specified {@link LargeTestStruct4} to the {@code largeTestStruct4} field. */
        public LargeTestStruct5.Buffer largeTestStruct4(LargeTestStruct4 value) { LargeTestStruct5.nlargeTestStruct4(address(), value); return this; }
        /** Passes the {@code largeTestStruct4} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LargeTestStruct5.Buffer largeTestStruct4(java.util.function.Consumer<LargeTestStruct4> consumer) { consumer.accept(largeTestStruct4()); return this; }

    }

}