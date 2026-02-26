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
 * struct TestStruct1 {
 *     int32_t aInt;
 *     float aFloat;
 *     int32_t aIntVec4[4];
 * }}</pre>
 */
public class TestStruct1 extends Struct<TestStruct1> implements NativeResource {

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

    protected TestStruct1(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected TestStruct1 create(long address, @Nullable ByteBuffer container) {
        return new TestStruct1(address, container);
    }

    /**
     * Creates a {@code TestStruct1} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public TestStruct1(ByteBuffer container) {
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
    public TestStruct1 aInt(@NativeType("int32_t") int value) { naInt(address(), value); return this; }
    /** Sets the specified value to the {@code aFloat} field. */
    public TestStruct1 aFloat(float value) { naFloat(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code aIntVec4} field. */
    public TestStruct1 aIntVec4(@NativeType("int32_t[4]") IntBuffer value) { naIntVec4(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code aIntVec4} field. */
    public TestStruct1 aIntVec4(int index, @NativeType("int32_t") int value) { naIntVec4(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public TestStruct1 set(
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
    public TestStruct1 set(TestStruct1 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code TestStruct1} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static TestStruct1 malloc() {
        return new TestStruct1(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code TestStruct1} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static TestStruct1 calloc() {
        return new TestStruct1(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code TestStruct1} instance allocated with {@link BufferUtils}. */
    public static TestStruct1 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new TestStruct1(memAddress(container), container);
    }

    /** Returns a new {@code TestStruct1} instance for the specified memory address. */
    public static TestStruct1 create(long address) {
        return new TestStruct1(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable TestStruct1 createSafe(long address) {
        return address == NULL ? null : new TestStruct1(address, null);
    }

    /**
     * Returns a new {@link TestStruct1.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static TestStruct1.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link TestStruct1.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static TestStruct1.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link TestStruct1.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static TestStruct1.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link TestStruct1.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static TestStruct1.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static TestStruct1.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static TestStruct1 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static TestStruct1 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static TestStruct1 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static TestStruct1 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static TestStruct1.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static TestStruct1.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static TestStruct1.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static TestStruct1.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code TestStruct1} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static TestStruct1 malloc(MemoryStack stack) {
        return new TestStruct1(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code TestStruct1} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static TestStruct1 calloc(MemoryStack stack) {
        return new TestStruct1(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link TestStruct1.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static TestStruct1.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link TestStruct1.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static TestStruct1.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aInt}. */
    public static int naInt(long struct) { return memGetInt(struct + TestStruct1.AINT); }
    /** Unsafe version of {@link #aFloat}. */
    public static float naFloat(long struct) { return memGetFloat(struct + TestStruct1.AFLOAT); }
    /** Unsafe version of {@link #aIntVec4}. */
    public static IntBuffer naIntVec4(long struct) { return memIntBuffer(struct + TestStruct1.AINTVEC4, 4); }
    /** Unsafe version of {@link #aIntVec4(int) aIntVec4}. */
    public static int naIntVec4(long struct, int index) {
        return memGetInt(struct + TestStruct1.AINTVEC4 + check(index, 4) * 4);
    }

    /** Unsafe version of {@link #aInt(int) aInt}. */
    public static void naInt(long struct, int value) { memPutInt(struct + TestStruct1.AINT, value); }
    /** Unsafe version of {@link #aFloat(float) aFloat}. */
    public static void naFloat(long struct, float value) { memPutFloat(struct + TestStruct1.AFLOAT, value); }
    /** Unsafe version of {@link #aIntVec4(IntBuffer) aIntVec4}. */
    public static void naIntVec4(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + TestStruct1.AINTVEC4, value.remaining() * 4);
    }
    /** Unsafe version of {@link #aIntVec4(int, int) aIntVec4}. */
    public static void naIntVec4(long struct, int index, int value) {
        memPutInt(struct + TestStruct1.AINTVEC4 + check(index, 4) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link TestStruct1} structs. */
    public static class Buffer extends StructBuffer<TestStruct1, Buffer> implements NativeResource {

        private static final TestStruct1 ELEMENT_FACTORY = TestStruct1.create(-1L);

        /**
         * Creates a new {@code TestStruct1.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link TestStruct1#SIZEOF}, and its mark will be undefined.</p>
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
        protected TestStruct1 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code aInt} field. */
        @NativeType("int32_t")
        public int aInt() { return TestStruct1.naInt(address()); }
        /** @return the value of the {@code aFloat} field. */
        public float aFloat() { return TestStruct1.naFloat(address()); }
        /** @return a {@link IntBuffer} view of the {@code aIntVec4} field. */
        @NativeType("int32_t[4]")
        public IntBuffer aIntVec4() { return TestStruct1.naIntVec4(address()); }
        /** @return the value at the specified index of the {@code aIntVec4} field. */
        @NativeType("int32_t")
        public int aIntVec4(int index) { return TestStruct1.naIntVec4(address(), index); }

        /** Sets the specified value to the {@code aInt} field. */
        public TestStruct1.Buffer aInt(@NativeType("int32_t") int value) { TestStruct1.naInt(address(), value); return this; }
        /** Sets the specified value to the {@code aFloat} field. */
        public TestStruct1.Buffer aFloat(float value) { TestStruct1.naFloat(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code aIntVec4} field. */
        public TestStruct1.Buffer aIntVec4(@NativeType("int32_t[4]") IntBuffer value) { TestStruct1.naIntVec4(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code aIntVec4} field. */
        public TestStruct1.Buffer aIntVec4(int index, @NativeType("int32_t") int value) { TestStruct1.naIntVec4(address(), index, value); return this; }

    }

}