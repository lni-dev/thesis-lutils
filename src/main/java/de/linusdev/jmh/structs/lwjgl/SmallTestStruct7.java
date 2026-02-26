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

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct SmallTestStruct7 {
 *     int32_t aInt;
 *     int64_t aPointer;
 *     int32_t aSecondInt;
 *     int32_t aThirdInt;
 * }}</pre>
 */
public class SmallTestStruct7 extends Struct<SmallTestStruct7> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        AINT,
        APOINTER,
        ASECONDINT,
        ATHIRDINT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        AINT = layout.offsetof(0);
        APOINTER = layout.offsetof(1);
        ASECONDINT = layout.offsetof(2);
        ATHIRDINT = layout.offsetof(3);
    }

    protected SmallTestStruct7(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SmallTestStruct7 create(long address, @Nullable ByteBuffer container) {
        return new SmallTestStruct7(address, container);
    }

    /**
     * Creates a {@code SmallTestStruct7} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SmallTestStruct7(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code aInt} field. */
    @NativeType("int32_t")
    public int aInt() { return naInt(address()); }
    /** @return the value of the {@code aPointer} field. */
    @NativeType("int64_t")
    public long aPointer() { return naPointer(address()); }
    /** @return the value of the {@code aSecondInt} field. */
    @NativeType("int32_t")
    public int aSecondInt() { return naSecondInt(address()); }
    /** @return the value of the {@code aThirdInt} field. */
    @NativeType("int32_t")
    public int aThirdInt() { return naThirdInt(address()); }

    /** Sets the specified value to the {@code aInt} field. */
    public SmallTestStruct7 aInt(@NativeType("int32_t") int value) { naInt(address(), value); return this; }
    /** Sets the specified value to the {@code aPointer} field. */
    public SmallTestStruct7 aPointer(@NativeType("int64_t") long value) { naPointer(address(), value); return this; }
    /** Sets the specified value to the {@code aSecondInt} field. */
    public SmallTestStruct7 aSecondInt(@NativeType("int32_t") int value) { naSecondInt(address(), value); return this; }
    /** Sets the specified value to the {@code aThirdInt} field. */
    public SmallTestStruct7 aThirdInt(@NativeType("int32_t") int value) { naThirdInt(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SmallTestStruct7 set(
        int aInt,
        long aPointer,
        int aSecondInt,
        int aThirdInt
    ) {
        aInt(aInt);
        aPointer(aPointer);
        aSecondInt(aSecondInt);
        aThirdInt(aThirdInt);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SmallTestStruct7 set(SmallTestStruct7 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SmallTestStruct7} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SmallTestStruct7 malloc() {
        return new SmallTestStruct7(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct7} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SmallTestStruct7 calloc() {
        return new SmallTestStruct7(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct7} instance allocated with {@link BufferUtils}. */
    public static SmallTestStruct7 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SmallTestStruct7(memAddress(container), container);
    }

    /** Returns a new {@code SmallTestStruct7} instance for the specified memory address. */
    public static SmallTestStruct7 create(long address) {
        return new SmallTestStruct7(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SmallTestStruct7 createSafe(long address) {
        return address == NULL ? null : new SmallTestStruct7(address, null);
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
     * Returns a new {@code SmallTestStruct7} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct7 malloc(MemoryStack stack) {
        return new SmallTestStruct7(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SmallTestStruct7} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct7 calloc(MemoryStack stack) {
        return new SmallTestStruct7(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /** Unsafe version of {@link #aInt}. */
    public static int naInt(long struct) { return memGetInt(struct + SmallTestStruct7.AINT); }
    /** Unsafe version of {@link #aPointer}. */
    public static long naPointer(long struct) { return memGetLong(struct + SmallTestStruct7.APOINTER); }
    /** Unsafe version of {@link #aSecondInt}. */
    public static int naSecondInt(long struct) { return memGetInt(struct + SmallTestStruct7.ASECONDINT); }
    /** Unsafe version of {@link #aThirdInt}. */
    public static int naThirdInt(long struct) { return memGetInt(struct + SmallTestStruct7.ATHIRDINT); }

    /** Unsafe version of {@link #aInt(int) aInt}. */
    public static void naInt(long struct, int value) { memPutInt(struct + SmallTestStruct7.AINT, value); }
    /** Unsafe version of {@link #aPointer(long) aPointer}. */
    public static void naPointer(long struct, long value) { memPutLong(struct + SmallTestStruct7.APOINTER, value); }
    /** Unsafe version of {@link #aSecondInt(int) aSecondInt}. */
    public static void naSecondInt(long struct, int value) { memPutInt(struct + SmallTestStruct7.ASECONDINT, value); }
    /** Unsafe version of {@link #aThirdInt(int) aThirdInt}. */
    public static void naThirdInt(long struct, int value) { memPutInt(struct + SmallTestStruct7.ATHIRDINT, value); }

    // -----------------------------------

    /** An array of {@link SmallTestStruct7} structs. */
    public static class Buffer extends StructBuffer<SmallTestStruct7, Buffer> implements NativeResource {

        private static final SmallTestStruct7 ELEMENT_FACTORY = SmallTestStruct7.create(-1L);

        /**
         * Creates a new {@code SmallTestStruct7.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SmallTestStruct7#SIZEOF}, and its mark will be undefined.</p>
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
        protected SmallTestStruct7 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code aInt} field. */
        @NativeType("int32_t")
        public int aInt() { return SmallTestStruct7.naInt(address()); }
        /** @return the value of the {@code aPointer} field. */
        @NativeType("int64_t")
        public long aPointer() { return SmallTestStruct7.naPointer(address()); }
        /** @return the value of the {@code aSecondInt} field. */
        @NativeType("int32_t")
        public int aSecondInt() { return SmallTestStruct7.naSecondInt(address()); }
        /** @return the value of the {@code aThirdInt} field. */
        @NativeType("int32_t")
        public int aThirdInt() { return SmallTestStruct7.naThirdInt(address()); }

        /** Sets the specified value to the {@code aInt} field. */
        public Buffer aInt(@NativeType("int32_t") int value) { SmallTestStruct7.naInt(address(), value); return this; }
        /** Sets the specified value to the {@code aPointer} field. */
        public Buffer aPointer(@NativeType("int64_t") long value) { SmallTestStruct7.naPointer(address(), value); return this; }
        /** Sets the specified value to the {@code aSecondInt} field. */
        public Buffer aSecondInt(@NativeType("int32_t") int value) { SmallTestStruct7.naSecondInt(address(), value); return this; }
        /** Sets the specified value to the {@code aThirdInt} field. */
        public Buffer aThirdInt(@NativeType("int32_t") int value) { SmallTestStruct7.naThirdInt(address(), value); return this; }

    }

}