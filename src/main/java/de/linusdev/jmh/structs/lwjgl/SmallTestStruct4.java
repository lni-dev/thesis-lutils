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
 * struct SmallTestStruct4 {
 *     int64_t aPointer;
 *     {@link SmallTestStruct1 SmallTestStruct1} aSmallTestStruct1;
 * }}</pre>
 */
public class SmallTestStruct4 extends Struct<SmallTestStruct4> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        APOINTER,
        ASMALLTESTSTRUCT1;

    static {
        Layout layout = __struct(
            __member(8),
            __member(SmallTestStruct1.SIZEOF, SmallTestStruct1.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        APOINTER = layout.offsetof(0);
        ASMALLTESTSTRUCT1 = layout.offsetof(1);
    }

    protected SmallTestStruct4(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SmallTestStruct4 create(long address, @Nullable ByteBuffer container) {
        return new SmallTestStruct4(address, container);
    }

    /**
     * Creates a {@code SmallTestStruct4} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SmallTestStruct4(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code aPointer} field. */
    @NativeType("int64_t")
    public long aPointer() { return naPointer(address()); }
    /** @return a {@link SmallTestStruct1} view of the {@code aSmallTestStruct1} field. */
    public SmallTestStruct1 aSmallTestStruct1() { return naSmallTestStruct1(address()); }

    /** Sets the specified value to the {@code aPointer} field. */
    public SmallTestStruct4 aPointer(@NativeType("int64_t") long value) { naPointer(address(), value); return this; }
    /** Copies the specified {@link SmallTestStruct1} to the {@code aSmallTestStruct1} field. */
    public SmallTestStruct4 aSmallTestStruct1(SmallTestStruct1 value) { naSmallTestStruct1(address(), value); return this; }
    /** Passes the {@code aSmallTestStruct1} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SmallTestStruct4 aSmallTestStruct1(java.util.function.Consumer<SmallTestStruct1> consumer) { consumer.accept(aSmallTestStruct1()); return this; }

    /** Initializes this struct with the specified values. */
    public SmallTestStruct4 set(
        long aPointer,
        SmallTestStruct1 aSmallTestStruct1
    ) {
        aPointer(aPointer);
        aSmallTestStruct1(aSmallTestStruct1);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SmallTestStruct4 set(SmallTestStruct4 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SmallTestStruct4} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SmallTestStruct4 malloc() {
        return new SmallTestStruct4(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct4} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SmallTestStruct4 calloc() {
        return new SmallTestStruct4(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct4} instance allocated with {@link BufferUtils}. */
    public static SmallTestStruct4 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SmallTestStruct4(memAddress(container), container);
    }

    /** Returns a new {@code SmallTestStruct4} instance for the specified memory address. */
    public static SmallTestStruct4 create(long address) {
        return new SmallTestStruct4(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SmallTestStruct4 createSafe(long address) {
        return address == NULL ? null : new SmallTestStruct4(address, null);
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
     * Returns a new {@code SmallTestStruct4} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct4 malloc(MemoryStack stack) {
        return new SmallTestStruct4(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SmallTestStruct4} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct4 calloc(MemoryStack stack) {
        return new SmallTestStruct4(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /** Unsafe version of {@link #aPointer}. */
    public static long naPointer(long struct) { return memGetLong(struct + SmallTestStruct4.APOINTER); }
    /** Unsafe version of {@link #aSmallTestStruct1}. */
    public static SmallTestStruct1 naSmallTestStruct1(long struct) { return SmallTestStruct1.create(struct + SmallTestStruct4.ASMALLTESTSTRUCT1); }

    /** Unsafe version of {@link #aPointer(long) aPointer}. */
    public static void naPointer(long struct, long value) { memPutLong(struct + SmallTestStruct4.APOINTER, value); }
    /** Unsafe version of {@link #aSmallTestStruct1(SmallTestStruct1) aSmallTestStruct1}. */
    public static void naSmallTestStruct1(long struct, SmallTestStruct1 value) { memCopy(value.address(), struct + SmallTestStruct4.ASMALLTESTSTRUCT1, SmallTestStruct1.SIZEOF); }

    // -----------------------------------

    /** An array of {@link SmallTestStruct4} structs. */
    public static class Buffer extends StructBuffer<SmallTestStruct4, Buffer> implements NativeResource {

        private static final SmallTestStruct4 ELEMENT_FACTORY = SmallTestStruct4.create(-1L);

        /**
         * Creates a new {@code SmallTestStruct4.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SmallTestStruct4#SIZEOF}, and its mark will be undefined.</p>
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
        protected SmallTestStruct4 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code aPointer} field. */
        @NativeType("int64_t")
        public long aPointer() { return SmallTestStruct4.naPointer(address()); }
        /** @return a {@link SmallTestStruct1} view of the {@code aSmallTestStruct1} field. */
        public SmallTestStruct1 aSmallTestStruct1() { return SmallTestStruct4.naSmallTestStruct1(address()); }

        /** Sets the specified value to the {@code aPointer} field. */
        public Buffer aPointer(@NativeType("int64_t") long value) { SmallTestStruct4.naPointer(address(), value); return this; }
        /** Copies the specified {@link SmallTestStruct1} to the {@code aSmallTestStruct1} field. */
        public Buffer aSmallTestStruct1(SmallTestStruct1 value) { SmallTestStruct4.naSmallTestStruct1(address(), value); return this; }
        /** Passes the {@code aSmallTestStruct1} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer aSmallTestStruct1(java.util.function.Consumer<SmallTestStruct1> consumer) { consumer.accept(aSmallTestStruct1()); return this; }

    }

}