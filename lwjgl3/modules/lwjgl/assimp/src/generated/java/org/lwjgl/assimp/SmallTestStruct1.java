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
 * struct SmallTestStruct1 {
 *     int32_t aInt;
 *     float aFloat;
 *     int32_t aIntVec4[4];
 * }}</pre>
 */
public class SmallTestStruct1 extends Struct<SmallTestStruct1> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        AINT,
        AFLOAT,
        AINTVEC4;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __array(4, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        AINT = layout.offsetof(0);
        AFLOAT = layout.offsetof(1);
        AINTVEC4 = layout.offsetof(2);
    }

    protected SmallTestStruct1(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SmallTestStruct1 create(long address, @Nullable ByteBuffer container) {
        return new SmallTestStruct1(address, container);
    }

    /**
     * Creates a {@code SmallTestStruct1} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SmallTestStruct1(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code aInt} field. */
    @NativeType("int32_t")
    public int aInt() { return naInt(address()); }
    /** @return the value of the {@code aFloat} field. */
    public float aFloat() { return naFloat(address()); }
    /** @return a {@link IntBuffer} view of the {@code aIntVec4} field. */
    @NativeType("int32_t[4]")
    public IntBuffer aIntVec4() { return naIntVec4(address()); }
    /** @return the value at the specified index of the {@code aIntVec4} field. */
    @NativeType("int32_t")
    public int aIntVec4(int index) { return naIntVec4(address(), index); }

    /** Sets the specified value to the {@code aInt} field. */
    public SmallTestStruct1 aInt(@NativeType("int32_t") int value) { naInt(address(), value); return this; }
    /** Sets the specified value to the {@code aFloat} field. */
    public SmallTestStruct1 aFloat(float value) { naFloat(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code aIntVec4} field. */
    public SmallTestStruct1 aIntVec4(@NativeType("int32_t[4]") IntBuffer value) { naIntVec4(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code aIntVec4} field. */
    public SmallTestStruct1 aIntVec4(int index, @NativeType("int32_t") int value) { naIntVec4(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public SmallTestStruct1 set(
        int aInt,
        float aFloat,
        IntBuffer aIntVec4
    ) {
        aInt(aInt);
        aFloat(aFloat);
        aIntVec4(aIntVec4);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SmallTestStruct1 set(SmallTestStruct1 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SmallTestStruct1} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SmallTestStruct1 malloc() {
        return new SmallTestStruct1(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct1} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SmallTestStruct1 calloc() {
        return new SmallTestStruct1(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct1} instance allocated with {@link BufferUtils}. */
    public static SmallTestStruct1 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SmallTestStruct1(memAddress(container), container);
    }

    /** Returns a new {@code SmallTestStruct1} instance for the specified memory address. */
    public static SmallTestStruct1 create(long address) {
        return new SmallTestStruct1(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SmallTestStruct1 createSafe(long address) {
        return address == NULL ? null : new SmallTestStruct1(address, null);
    }

    /**
     * Returns a new {@link SmallTestStruct1.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct1.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct1.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct1.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct1.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct1.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SmallTestStruct1.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct1.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SmallTestStruct1.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SmallTestStruct1} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct1 malloc(MemoryStack stack) {
        return new SmallTestStruct1(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SmallTestStruct1} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct1 calloc(MemoryStack stack) {
        return new SmallTestStruct1(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SmallTestStruct1.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct1.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct1.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct1.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aInt}. */
    public static int naInt(long struct) { return memGetInt(struct + SmallTestStruct1.AINT); }
    /** Unsafe version of {@link #aFloat}. */
    public static float naFloat(long struct) { return memGetFloat(struct + SmallTestStruct1.AFLOAT); }
    /** Unsafe version of {@link #aIntVec4}. */
    public static IntBuffer naIntVec4(long struct) { return memIntBuffer(struct + SmallTestStruct1.AINTVEC4, 4); }
    /** Unsafe version of {@link #aIntVec4(int) aIntVec4}. */
    public static int naIntVec4(long struct, int index) {
        return memGetInt(struct + SmallTestStruct1.AINTVEC4 + check(index, 4) * 4);
    }

    /** Unsafe version of {@link #aInt(int) aInt}. */
    public static void naInt(long struct, int value) { memPutInt(struct + SmallTestStruct1.AINT, value); }
    /** Unsafe version of {@link #aFloat(float) aFloat}. */
    public static void naFloat(long struct, float value) { memPutFloat(struct + SmallTestStruct1.AFLOAT, value); }
    /** Unsafe version of {@link #aIntVec4(IntBuffer) aIntVec4}. */
    public static void naIntVec4(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + SmallTestStruct1.AINTVEC4, value.remaining() * 4);
    }
    /** Unsafe version of {@link #aIntVec4(int, int) aIntVec4}. */
    public static void naIntVec4(long struct, int index, int value) {
        memPutInt(struct + SmallTestStruct1.AINTVEC4 + check(index, 4) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link SmallTestStruct1} structs. */
    public static class Buffer extends StructBuffer<SmallTestStruct1, Buffer> implements NativeResource {

        private static final SmallTestStruct1 ELEMENT_FACTORY = SmallTestStruct1.create(-1L);

        /**
         * Creates a new {@code SmallTestStruct1.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SmallTestStruct1#SIZEOF}, and its mark will be undefined.</p>
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
        protected SmallTestStruct1 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code aInt} field. */
        @NativeType("int32_t")
        public int aInt() { return SmallTestStruct1.naInt(address()); }
        /** @return the value of the {@code aFloat} field. */
        public float aFloat() { return SmallTestStruct1.naFloat(address()); }
        /** @return a {@link IntBuffer} view of the {@code aIntVec4} field. */
        @NativeType("int32_t[4]")
        public IntBuffer aIntVec4() { return SmallTestStruct1.naIntVec4(address()); }
        /** @return the value at the specified index of the {@code aIntVec4} field. */
        @NativeType("int32_t")
        public int aIntVec4(int index) { return SmallTestStruct1.naIntVec4(address(), index); }

        /** Sets the specified value to the {@code aInt} field. */
        public SmallTestStruct1.Buffer aInt(@NativeType("int32_t") int value) { SmallTestStruct1.naInt(address(), value); return this; }
        /** Sets the specified value to the {@code aFloat} field. */
        public SmallTestStruct1.Buffer aFloat(float value) { SmallTestStruct1.naFloat(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code aIntVec4} field. */
        public SmallTestStruct1.Buffer aIntVec4(@NativeType("int32_t[4]") IntBuffer value) { SmallTestStruct1.naIntVec4(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code aIntVec4} field. */
        public SmallTestStruct1.Buffer aIntVec4(int index, @NativeType("int32_t") int value) { SmallTestStruct1.naIntVec4(address(), index, value); return this; }

    }

}