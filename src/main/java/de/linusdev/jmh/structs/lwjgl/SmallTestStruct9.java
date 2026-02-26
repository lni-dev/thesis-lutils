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
 * struct SmallTestStruct9 {
 *     {@link SmallTestStruct8 SmallTestStruct8} aSmallTestStruct8;
 *     int32_t aSmallInt;
 *     int32_t aSecondSmallInt;
 * }}</pre>
 */
public class SmallTestStruct9 extends Struct<SmallTestStruct9> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ASMALLTESTSTRUCT8,
        ASMALLINT,
        ASECONDSMALLINT;

    static {
        Layout layout = __struct(
            __member(SmallTestStruct8.SIZEOF, SmallTestStruct8.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ASMALLTESTSTRUCT8 = layout.offsetof(0);
        ASMALLINT = layout.offsetof(1);
        ASECONDSMALLINT = layout.offsetof(2);
    }

    protected SmallTestStruct9(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SmallTestStruct9 create(long address, @Nullable ByteBuffer container) {
        return new SmallTestStruct9(address, container);
    }

    /**
     * Creates a {@code SmallTestStruct9} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SmallTestStruct9(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link SmallTestStruct8} view of the {@code aSmallTestStruct8} field. */
    public SmallTestStruct8 aSmallTestStruct8() { return naSmallTestStruct8(address()); }
    /** @return the value of the {@code aSmallInt} field. */
    @NativeType("int32_t")
    public int aSmallInt() { return naSmallInt(address()); }
    /** @return the value of the {@code aSecondSmallInt} field. */
    @NativeType("int32_t")
    public int aSecondSmallInt() { return naSecondSmallInt(address()); }

    /** Copies the specified {@link SmallTestStruct8} to the {@code aSmallTestStruct8} field. */
    public SmallTestStruct9 aSmallTestStruct8(SmallTestStruct8 value) { naSmallTestStruct8(address(), value); return this; }
    /** Passes the {@code aSmallTestStruct8} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SmallTestStruct9 aSmallTestStruct8(java.util.function.Consumer<SmallTestStruct8> consumer) { consumer.accept(aSmallTestStruct8()); return this; }
    /** Sets the specified value to the {@code aSmallInt} field. */
    public SmallTestStruct9 aSmallInt(@NativeType("int32_t") int value) { naSmallInt(address(), value); return this; }
    /** Sets the specified value to the {@code aSecondSmallInt} field. */
    public SmallTestStruct9 aSecondSmallInt(@NativeType("int32_t") int value) { naSecondSmallInt(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SmallTestStruct9 set(
        SmallTestStruct8 aSmallTestStruct8,
        int aSmallInt,
        int aSecondSmallInt
    ) {
        aSmallTestStruct8(aSmallTestStruct8);
        aSmallInt(aSmallInt);
        aSecondSmallInt(aSecondSmallInt);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SmallTestStruct9 set(SmallTestStruct9 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SmallTestStruct9} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SmallTestStruct9 malloc() {
        return new SmallTestStruct9(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct9} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SmallTestStruct9 calloc() {
        return new SmallTestStruct9(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct9} instance allocated with {@link BufferUtils}. */
    public static SmallTestStruct9 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SmallTestStruct9(memAddress(container), container);
    }

    /** Returns a new {@code SmallTestStruct9} instance for the specified memory address. */
    public static SmallTestStruct9 create(long address) {
        return new SmallTestStruct9(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SmallTestStruct9 createSafe(long address) {
        return address == NULL ? null : new SmallTestStruct9(address, null);
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
     * Returns a new {@code SmallTestStruct9} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct9 malloc(MemoryStack stack) {
        return new SmallTestStruct9(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SmallTestStruct9} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct9 calloc(MemoryStack stack) {
        return new SmallTestStruct9(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /** Unsafe version of {@link #aSmallTestStruct8}. */
    public static SmallTestStruct8 naSmallTestStruct8(long struct) { return SmallTestStruct8.create(struct + SmallTestStruct9.ASMALLTESTSTRUCT8); }
    /** Unsafe version of {@link #aSmallInt}. */
    public static int naSmallInt(long struct) { return memGetInt(struct + SmallTestStruct9.ASMALLINT); }
    /** Unsafe version of {@link #aSecondSmallInt}. */
    public static int naSecondSmallInt(long struct) { return memGetInt(struct + SmallTestStruct9.ASECONDSMALLINT); }

    /** Unsafe version of {@link #aSmallTestStruct8(SmallTestStruct8) aSmallTestStruct8}. */
    public static void naSmallTestStruct8(long struct, SmallTestStruct8 value) { memCopy(value.address(), struct + SmallTestStruct9.ASMALLTESTSTRUCT8, SmallTestStruct8.SIZEOF); }
    /** Unsafe version of {@link #aSmallInt(int) aSmallInt}. */
    public static void naSmallInt(long struct, int value) { memPutInt(struct + SmallTestStruct9.ASMALLINT, value); }
    /** Unsafe version of {@link #aSecondSmallInt(int) aSecondSmallInt}. */
    public static void naSecondSmallInt(long struct, int value) { memPutInt(struct + SmallTestStruct9.ASECONDSMALLINT, value); }

    // -----------------------------------

    /** An array of {@link SmallTestStruct9} structs. */
    public static class Buffer extends StructBuffer<SmallTestStruct9, Buffer> implements NativeResource {

        private static final SmallTestStruct9 ELEMENT_FACTORY = SmallTestStruct9.create(-1L);

        /**
         * Creates a new {@code SmallTestStruct9.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SmallTestStruct9#SIZEOF}, and its mark will be undefined.</p>
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
        protected SmallTestStruct9 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link SmallTestStruct8} view of the {@code aSmallTestStruct8} field. */
        public SmallTestStruct8 aSmallTestStruct8() { return SmallTestStruct9.naSmallTestStruct8(address()); }
        /** @return the value of the {@code aSmallInt} field. */
        @NativeType("int32_t")
        public int aSmallInt() { return SmallTestStruct9.naSmallInt(address()); }
        /** @return the value of the {@code aSecondSmallInt} field. */
        @NativeType("int32_t")
        public int aSecondSmallInt() { return SmallTestStruct9.naSecondSmallInt(address()); }

        /** Copies the specified {@link SmallTestStruct8} to the {@code aSmallTestStruct8} field. */
        public Buffer aSmallTestStruct8(SmallTestStruct8 value) { SmallTestStruct9.naSmallTestStruct8(address(), value); return this; }
        /** Passes the {@code aSmallTestStruct8} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer aSmallTestStruct8(java.util.function.Consumer<SmallTestStruct8> consumer) { consumer.accept(aSmallTestStruct8()); return this; }
        /** Sets the specified value to the {@code aSmallInt} field. */
        public Buffer aSmallInt(@NativeType("int32_t") int value) { SmallTestStruct9.naSmallInt(address(), value); return this; }
        /** Sets the specified value to the {@code aSecondSmallInt} field. */
        public Buffer aSecondSmallInt(@NativeType("int32_t") int value) { SmallTestStruct9.naSecondSmallInt(address(), value); return this; }

    }

}