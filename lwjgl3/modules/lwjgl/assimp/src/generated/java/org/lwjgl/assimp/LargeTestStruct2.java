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
 * struct LargeTestStruct2 {
 *     int8_t nativeInt8Array[500000];
 * }}</pre>
 */
public class LargeTestStruct2 extends Struct<LargeTestStruct2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NATIVEINT8ARRAY;

    static {
        Layout layout = __struct(
            __array(1, 500000)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NATIVEINT8ARRAY = layout.offsetof(0);
    }

    protected LargeTestStruct2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LargeTestStruct2 create(long address, @Nullable ByteBuffer container) {
        return new LargeTestStruct2(address, container);
    }

    /**
     * Creates a {@code LargeTestStruct2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LargeTestStruct2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code nativeInt8Array} field. */
    @NativeType("int8_t[500000]")
    public ByteBuffer nativeInt8Array() { return nnativeInt8Array(address()); }
    /** @return the value at the specified index of the {@code nativeInt8Array} field. */
    @NativeType("int8_t")
    public byte nativeInt8Array(int index) { return nnativeInt8Array(address(), index); }

    /** Copies the specified {@link ByteBuffer} to the {@code nativeInt8Array} field. */
    public LargeTestStruct2 nativeInt8Array(@NativeType("int8_t[500000]") ByteBuffer value) { nnativeInt8Array(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code nativeInt8Array} field. */
    public LargeTestStruct2 nativeInt8Array(int index, @NativeType("int8_t") byte value) { nnativeInt8Array(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LargeTestStruct2 set(LargeTestStruct2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LargeTestStruct2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LargeTestStruct2 malloc() {
        return new LargeTestStruct2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LargeTestStruct2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LargeTestStruct2 calloc() {
        return new LargeTestStruct2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LargeTestStruct2} instance allocated with {@link BufferUtils}. */
    public static LargeTestStruct2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LargeTestStruct2(memAddress(container), container);
    }

    /** Returns a new {@code LargeTestStruct2} instance for the specified memory address. */
    public static LargeTestStruct2 create(long address) {
        return new LargeTestStruct2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable LargeTestStruct2 createSafe(long address) {
        return address == NULL ? null : new LargeTestStruct2(address, null);
    }

    /**
     * Returns a new {@link LargeTestStruct2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LargeTestStruct2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LargeTestStruct2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LargeTestStruct2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static LargeTestStruct2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code LargeTestStruct2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LargeTestStruct2 malloc(MemoryStack stack) {
        return new LargeTestStruct2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LargeTestStruct2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LargeTestStruct2 calloc(MemoryStack stack) {
        return new LargeTestStruct2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LargeTestStruct2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LargeTestStruct2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #nativeInt8Array}. */
    public static ByteBuffer nnativeInt8Array(long struct) { return memByteBuffer(struct + LargeTestStruct2.NATIVEINT8ARRAY, 500000); }
    /** Unsafe version of {@link #nativeInt8Array(int) nativeInt8Array}. */
    public static byte nnativeInt8Array(long struct, int index) {
        return memGetByte(struct + LargeTestStruct2.NATIVEINT8ARRAY + check(index, 500000) * 1);
    }

    /** Unsafe version of {@link #nativeInt8Array(ByteBuffer) nativeInt8Array}. */
    public static void nnativeInt8Array(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 500000); }
        memCopy(memAddress(value), struct + LargeTestStruct2.NATIVEINT8ARRAY, value.remaining() * 1);
    }
    /** Unsafe version of {@link #nativeInt8Array(int, byte) nativeInt8Array}. */
    public static void nnativeInt8Array(long struct, int index, byte value) {
        memPutByte(struct + LargeTestStruct2.NATIVEINT8ARRAY + check(index, 500000) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link LargeTestStruct2} structs. */
    public static class Buffer extends StructBuffer<LargeTestStruct2, Buffer> implements NativeResource {

        private static final LargeTestStruct2 ELEMENT_FACTORY = LargeTestStruct2.create(-1L);

        /**
         * Creates a new {@code LargeTestStruct2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LargeTestStruct2#SIZEOF}, and its mark will be undefined.</p>
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
        protected LargeTestStruct2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code nativeInt8Array} field. */
        @NativeType("int8_t[500000]")
        public ByteBuffer nativeInt8Array() { return LargeTestStruct2.nnativeInt8Array(address()); }
        /** @return the value at the specified index of the {@code nativeInt8Array} field. */
        @NativeType("int8_t")
        public byte nativeInt8Array(int index) { return LargeTestStruct2.nnativeInt8Array(address(), index); }

        /** Copies the specified {@link ByteBuffer} to the {@code nativeInt8Array} field. */
        public LargeTestStruct2.Buffer nativeInt8Array(@NativeType("int8_t[500000]") ByteBuffer value) { LargeTestStruct2.nnativeInt8Array(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code nativeInt8Array} field. */
        public LargeTestStruct2.Buffer nativeInt8Array(int index, @NativeType("int8_t") byte value) { LargeTestStruct2.nnativeInt8Array(address(), index, value); return this; }

    }

}