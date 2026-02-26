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
 * struct SmallTestStruct8 {
 *     int8_t AByte;
 *     int16_t aShort;
 *     int32_t aInt;
 * }}</pre>
 */
public class SmallTestStruct8 extends Struct<SmallTestStruct8> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ABYTE,
        ASHORT,
        AINT;

    static {
        Layout layout = __struct(
            __member(1),
            __member(2),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ABYTE = layout.offsetof(0);
        ASHORT = layout.offsetof(1);
        AINT = layout.offsetof(2);
    }

    protected SmallTestStruct8(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SmallTestStruct8 create(long address, @Nullable ByteBuffer container) {
        return new SmallTestStruct8(address, container);
    }

    /**
     * Creates a {@code SmallTestStruct8} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SmallTestStruct8(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code AByte} field. */
    @NativeType("int8_t")
    public byte AByte() { return nAByte(address()); }
    /** @return the value of the {@code aShort} field. */
    @NativeType("int16_t")
    public short aShort() { return naShort(address()); }
    /** @return the value of the {@code aInt} field. */
    @NativeType("int32_t")
    public int aInt() { return naInt(address()); }

    /** Sets the specified value to the {@code AByte} field. */
    public SmallTestStruct8 AByte(@NativeType("int8_t") byte value) { nAByte(address(), value); return this; }
    /** Sets the specified value to the {@code aShort} field. */
    public SmallTestStruct8 aShort(@NativeType("int16_t") short value) { naShort(address(), value); return this; }
    /** Sets the specified value to the {@code aInt} field. */
    public SmallTestStruct8 aInt(@NativeType("int32_t") int value) { naInt(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SmallTestStruct8 set(
        byte AByte,
        short aShort,
        int aInt
    ) {
        AByte(AByte);
        aShort(aShort);
        aInt(aInt);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SmallTestStruct8 set(SmallTestStruct8 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SmallTestStruct8} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SmallTestStruct8 malloc() {
        return new SmallTestStruct8(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct8} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SmallTestStruct8 calloc() {
        return new SmallTestStruct8(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct8} instance allocated with {@link BufferUtils}. */
    public static SmallTestStruct8 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SmallTestStruct8(memAddress(container), container);
    }

    /** Returns a new {@code SmallTestStruct8} instance for the specified memory address. */
    public static SmallTestStruct8 create(long address) {
        return new SmallTestStruct8(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SmallTestStruct8 createSafe(long address) {
        return address == NULL ? null : new SmallTestStruct8(address, null);
    }

    /**
     * Returns a new {@link SmallTestStruct8.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct8.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct8.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct8.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct8.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct8.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SmallTestStruct8.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct8.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SmallTestStruct8.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SmallTestStruct8} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct8 malloc(MemoryStack stack) {
        return new SmallTestStruct8(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SmallTestStruct8} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct8 calloc(MemoryStack stack) {
        return new SmallTestStruct8(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SmallTestStruct8.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct8.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct8.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct8.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #AByte}. */
    public static byte nAByte(long struct) { return memGetByte(struct + SmallTestStruct8.ABYTE); }
    /** Unsafe version of {@link #aShort}. */
    public static short naShort(long struct) { return memGetShort(struct + SmallTestStruct8.ASHORT); }
    /** Unsafe version of {@link #aInt}. */
    public static int naInt(long struct) { return memGetInt(struct + SmallTestStruct8.AINT); }

    /** Unsafe version of {@link #AByte(byte) AByte}. */
    public static void nAByte(long struct, byte value) { memPutByte(struct + SmallTestStruct8.ABYTE, value); }
    /** Unsafe version of {@link #aShort(short) aShort}. */
    public static void naShort(long struct, short value) { memPutShort(struct + SmallTestStruct8.ASHORT, value); }
    /** Unsafe version of {@link #aInt(int) aInt}. */
    public static void naInt(long struct, int value) { memPutInt(struct + SmallTestStruct8.AINT, value); }

    // -----------------------------------

    /** An array of {@link SmallTestStruct8} structs. */
    public static class Buffer extends StructBuffer<SmallTestStruct8, Buffer> implements NativeResource {

        private static final SmallTestStruct8 ELEMENT_FACTORY = SmallTestStruct8.create(-1L);

        /**
         * Creates a new {@code SmallTestStruct8.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SmallTestStruct8#SIZEOF}, and its mark will be undefined.</p>
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
        protected SmallTestStruct8 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code AByte} field. */
        @NativeType("int8_t")
        public byte AByte() { return SmallTestStruct8.nAByte(address()); }
        /** @return the value of the {@code aShort} field. */
        @NativeType("int16_t")
        public short aShort() { return SmallTestStruct8.naShort(address()); }
        /** @return the value of the {@code aInt} field. */
        @NativeType("int32_t")
        public int aInt() { return SmallTestStruct8.naInt(address()); }

        /** Sets the specified value to the {@code AByte} field. */
        public SmallTestStruct8.Buffer AByte(@NativeType("int8_t") byte value) { SmallTestStruct8.nAByte(address(), value); return this; }
        /** Sets the specified value to the {@code aShort} field. */
        public SmallTestStruct8.Buffer aShort(@NativeType("int16_t") short value) { SmallTestStruct8.naShort(address(), value); return this; }
        /** Sets the specified value to the {@code aInt} field. */
        public SmallTestStruct8.Buffer aInt(@NativeType("int32_t") int value) { SmallTestStruct8.naInt(address(), value); return this; }

    }

}