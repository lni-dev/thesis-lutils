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
 * struct LargeTestStruct1 {
 *     {@link MediumTestStruct1 MediumTestStruct1} mediumTestStruct1Array[600];
 *     {@link SmallTestStruct3 SmallTestStruct3} smallTestStruct3Array[1200];
 *     int32_t intArray[100000];
 * }}</pre>
 */
public class LargeTestStruct1 extends Struct<LargeTestStruct1> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MEDIUMTESTSTRUCT1ARRAY,
        SMALLTESTSTRUCT3ARRAY,
        INTARRAY;

    static {
        Layout layout = __struct(
            __array(MediumTestStruct1.SIZEOF, MediumTestStruct1.ALIGNOF, 600),
            __array(SmallTestStruct3.SIZEOF, SmallTestStruct3.ALIGNOF, 1200),
            __array(4, 100000)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MEDIUMTESTSTRUCT1ARRAY = layout.offsetof(0);
        SMALLTESTSTRUCT3ARRAY = layout.offsetof(1);
        INTARRAY = layout.offsetof(2);
    }

    protected LargeTestStruct1(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LargeTestStruct1 create(long address, @Nullable ByteBuffer container) {
        return new LargeTestStruct1(address, container);
    }

    /**
     * Creates a {@code LargeTestStruct1} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LargeTestStruct1(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link MediumTestStruct1}.Buffer view of the {@code mediumTestStruct1Array} field. */
    @NativeType("MediumTestStruct1[600]")
    public MediumTestStruct1.Buffer mediumTestStruct1Array() { return nmediumTestStruct1Array(address()); }
    /** @return a {@link MediumTestStruct1} view of the struct at the specified index of the {@code mediumTestStruct1Array} field. */
    public MediumTestStruct1 mediumTestStruct1Array(int index) { return nmediumTestStruct1Array(address(), index); }
    /** @return a {@link SmallTestStruct3}.Buffer view of the {@code smallTestStruct3Array} field. */
    @NativeType("SmallTestStruct3[1200]")
    public SmallTestStruct3.Buffer smallTestStruct3Array() { return nsmallTestStruct3Array(address()); }
    /** @return a {@link SmallTestStruct3} view of the struct at the specified index of the {@code smallTestStruct3Array} field. */
    public SmallTestStruct3 smallTestStruct3Array(int index) { return nsmallTestStruct3Array(address(), index); }
    /** @return a {@link IntBuffer} view of the {@code intArray} field. */
    @NativeType("int32_t[100000]")
    public IntBuffer intArray() { return nintArray(address()); }
    /** @return the value at the specified index of the {@code intArray} field. */
    @NativeType("int32_t")
    public int intArray(int index) { return nintArray(address(), index); }

    /** Copies the specified {@link MediumTestStruct1.Buffer} to the {@code mediumTestStruct1Array} field. */
    public LargeTestStruct1 mediumTestStruct1Array(@NativeType("MediumTestStruct1[600]") MediumTestStruct1.Buffer value) { nmediumTestStruct1Array(address(), value); return this; }
    /** Copies the specified {@link MediumTestStruct1} at the specified index of the {@code mediumTestStruct1Array} field. */
    public LargeTestStruct1 mediumTestStruct1Array(int index, MediumTestStruct1 value) { nmediumTestStruct1Array(address(), index, value); return this; }
    /** Passes the {@code mediumTestStruct1Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct1 mediumTestStruct1Array(java.util.function.Consumer<MediumTestStruct1.Buffer> consumer) { consumer.accept(mediumTestStruct1Array()); return this; }
    /** Passes the element at {@code index} of the {@code mediumTestStruct1Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct1 mediumTestStruct1Array(int index, java.util.function.Consumer<MediumTestStruct1> consumer) { consumer.accept(mediumTestStruct1Array(index)); return this; }
    /** Copies the specified {@link SmallTestStruct3.Buffer} to the {@code smallTestStruct3Array} field. */
    public LargeTestStruct1 smallTestStruct3Array(@NativeType("SmallTestStruct3[1200]") SmallTestStruct3.Buffer value) { nsmallTestStruct3Array(address(), value); return this; }
    /** Copies the specified {@link SmallTestStruct3} at the specified index of the {@code smallTestStruct3Array} field. */
    public LargeTestStruct1 smallTestStruct3Array(int index, SmallTestStruct3 value) { nsmallTestStruct3Array(address(), index, value); return this; }
    /** Passes the {@code smallTestStruct3Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct1 smallTestStruct3Array(java.util.function.Consumer<SmallTestStruct3.Buffer> consumer) { consumer.accept(smallTestStruct3Array()); return this; }
    /** Passes the element at {@code index} of the {@code smallTestStruct3Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct1 smallTestStruct3Array(int index, java.util.function.Consumer<SmallTestStruct3> consumer) { consumer.accept(smallTestStruct3Array(index)); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code intArray} field. */
    public LargeTestStruct1 intArray(@NativeType("int32_t[100000]") IntBuffer value) { nintArray(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code intArray} field. */
    public LargeTestStruct1 intArray(int index, @NativeType("int32_t") int value) { nintArray(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public LargeTestStruct1 set(
        MediumTestStruct1.Buffer mediumTestStruct1Array,
        SmallTestStruct3.Buffer smallTestStruct3Array,
        IntBuffer intArray
    ) {
        mediumTestStruct1Array(mediumTestStruct1Array);
        smallTestStruct3Array(smallTestStruct3Array);
        intArray(intArray);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LargeTestStruct1 set(LargeTestStruct1 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LargeTestStruct1} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LargeTestStruct1 malloc() {
        return new LargeTestStruct1(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LargeTestStruct1} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LargeTestStruct1 calloc() {
        return new LargeTestStruct1(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LargeTestStruct1} instance allocated with {@link BufferUtils}. */
    public static LargeTestStruct1 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LargeTestStruct1(memAddress(container), container);
    }

    /** Returns a new {@code LargeTestStruct1} instance for the specified memory address. */
    public static LargeTestStruct1 create(long address) {
        return new LargeTestStruct1(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable LargeTestStruct1 createSafe(long address) {
        return address == NULL ? null : new LargeTestStruct1(address, null);
    }

    /**
     * Returns a new {@link LargeTestStruct1.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct1.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LargeTestStruct1.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct1.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LargeTestStruct1.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct1.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LargeTestStruct1.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct1.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static LargeTestStruct1.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code LargeTestStruct1} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LargeTestStruct1 malloc(MemoryStack stack) {
        return new LargeTestStruct1(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LargeTestStruct1} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LargeTestStruct1 calloc(MemoryStack stack) {
        return new LargeTestStruct1(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LargeTestStruct1.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct1.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LargeTestStruct1.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct1.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mediumTestStruct1Array}. */
    public static MediumTestStruct1.Buffer nmediumTestStruct1Array(long struct) { return MediumTestStruct1.create(struct + LargeTestStruct1.MEDIUMTESTSTRUCT1ARRAY, 600); }
    /** Unsafe version of {@link #mediumTestStruct1Array(int) mediumTestStruct1Array}. */
    public static MediumTestStruct1 nmediumTestStruct1Array(long struct, int index) {
        return MediumTestStruct1.create(struct + LargeTestStruct1.MEDIUMTESTSTRUCT1ARRAY + check(index, 600) * MediumTestStruct1.SIZEOF);
    }
    /** Unsafe version of {@link #smallTestStruct3Array}. */
    public static SmallTestStruct3.Buffer nsmallTestStruct3Array(long struct) { return SmallTestStruct3.create(struct + LargeTestStruct1.SMALLTESTSTRUCT3ARRAY, 1200); }
    /** Unsafe version of {@link #smallTestStruct3Array(int) smallTestStruct3Array}. */
    public static SmallTestStruct3 nsmallTestStruct3Array(long struct, int index) {
        return SmallTestStruct3.create(struct + LargeTestStruct1.SMALLTESTSTRUCT3ARRAY + check(index, 1200) * SmallTestStruct3.SIZEOF);
    }
    /** Unsafe version of {@link #intArray}. */
    public static IntBuffer nintArray(long struct) { return memIntBuffer(struct + LargeTestStruct1.INTARRAY, 100000); }
    /** Unsafe version of {@link #intArray(int) intArray}. */
    public static int nintArray(long struct, int index) {
        return memGetInt(struct + LargeTestStruct1.INTARRAY + check(index, 100000) * 4);
    }

    /** Unsafe version of {@link #mediumTestStruct1Array(MediumTestStruct1.Buffer) mediumTestStruct1Array}. */
    public static void nmediumTestStruct1Array(long struct, MediumTestStruct1.Buffer value) {
        if (CHECKS) { checkGT(value, 600); }
        memCopy(value.address(), struct + LargeTestStruct1.MEDIUMTESTSTRUCT1ARRAY, value.remaining() * MediumTestStruct1.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct1Array(int, MediumTestStruct1) mediumTestStruct1Array}. */
    public static void nmediumTestStruct1Array(long struct, int index, MediumTestStruct1 value) {
        memCopy(value.address(), struct + LargeTestStruct1.MEDIUMTESTSTRUCT1ARRAY + check(index, 600) * MediumTestStruct1.SIZEOF, MediumTestStruct1.SIZEOF);
    }
    /** Unsafe version of {@link #smallTestStruct3Array(SmallTestStruct3.Buffer) smallTestStruct3Array}. */
    public static void nsmallTestStruct3Array(long struct, SmallTestStruct3.Buffer value) {
        if (CHECKS) { checkGT(value, 1200); }
        memCopy(value.address(), struct + LargeTestStruct1.SMALLTESTSTRUCT3ARRAY, value.remaining() * SmallTestStruct3.SIZEOF);
    }
    /** Unsafe version of {@link #smallTestStruct3Array(int, SmallTestStruct3) smallTestStruct3Array}. */
    public static void nsmallTestStruct3Array(long struct, int index, SmallTestStruct3 value) {
        memCopy(value.address(), struct + LargeTestStruct1.SMALLTESTSTRUCT3ARRAY + check(index, 1200) * SmallTestStruct3.SIZEOF, SmallTestStruct3.SIZEOF);
    }
    /** Unsafe version of {@link #intArray(IntBuffer) intArray}. */
    public static void nintArray(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 100000); }
        memCopy(memAddress(value), struct + LargeTestStruct1.INTARRAY, value.remaining() * 4);
    }
    /** Unsafe version of {@link #intArray(int, int) intArray}. */
    public static void nintArray(long struct, int index, int value) {
        memPutInt(struct + LargeTestStruct1.INTARRAY + check(index, 100000) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link LargeTestStruct1} structs. */
    public static class Buffer extends StructBuffer<LargeTestStruct1, Buffer> implements NativeResource {

        private static final LargeTestStruct1 ELEMENT_FACTORY = LargeTestStruct1.create(-1L);

        /**
         * Creates a new {@code LargeTestStruct1.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LargeTestStruct1#SIZEOF}, and its mark will be undefined.</p>
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
        protected LargeTestStruct1 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link MediumTestStruct1}.Buffer view of the {@code mediumTestStruct1Array} field. */
        @NativeType("MediumTestStruct1[600]")
        public MediumTestStruct1.Buffer mediumTestStruct1Array() { return LargeTestStruct1.nmediumTestStruct1Array(address()); }
        /** @return a {@link MediumTestStruct1} view of the struct at the specified index of the {@code mediumTestStruct1Array} field. */
        public MediumTestStruct1 mediumTestStruct1Array(int index) { return LargeTestStruct1.nmediumTestStruct1Array(address(), index); }
        /** @return a {@link SmallTestStruct3}.Buffer view of the {@code smallTestStruct3Array} field. */
        @NativeType("SmallTestStruct3[1200]")
        public SmallTestStruct3.Buffer smallTestStruct3Array() { return LargeTestStruct1.nsmallTestStruct3Array(address()); }
        /** @return a {@link SmallTestStruct3} view of the struct at the specified index of the {@code smallTestStruct3Array} field. */
        public SmallTestStruct3 smallTestStruct3Array(int index) { return LargeTestStruct1.nsmallTestStruct3Array(address(), index); }
        /** @return a {@link IntBuffer} view of the {@code intArray} field. */
        @NativeType("int32_t[100000]")
        public IntBuffer intArray() { return LargeTestStruct1.nintArray(address()); }
        /** @return the value at the specified index of the {@code intArray} field. */
        @NativeType("int32_t")
        public int intArray(int index) { return LargeTestStruct1.nintArray(address(), index); }

        /** Copies the specified {@link MediumTestStruct1.Buffer} to the {@code mediumTestStruct1Array} field. */
        public LargeTestStruct1.Buffer mediumTestStruct1Array(@NativeType("MediumTestStruct1[600]") MediumTestStruct1.Buffer value) { LargeTestStruct1.nmediumTestStruct1Array(address(), value); return this; }
        /** Copies the specified {@link MediumTestStruct1} at the specified index of the {@code mediumTestStruct1Array} field. */
        public LargeTestStruct1.Buffer mediumTestStruct1Array(int index, MediumTestStruct1 value) { LargeTestStruct1.nmediumTestStruct1Array(address(), index, value); return this; }
        /** Passes the {@code mediumTestStruct1Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LargeTestStruct1.Buffer mediumTestStruct1Array(java.util.function.Consumer<MediumTestStruct1.Buffer> consumer) { consumer.accept(mediumTestStruct1Array()); return this; }
        /** Passes the element at {@code index} of the {@code mediumTestStruct1Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LargeTestStruct1.Buffer mediumTestStruct1Array(int index, java.util.function.Consumer<MediumTestStruct1> consumer) { consumer.accept(mediumTestStruct1Array(index)); return this; }
        /** Copies the specified {@link SmallTestStruct3.Buffer} to the {@code smallTestStruct3Array} field. */
        public LargeTestStruct1.Buffer smallTestStruct3Array(@NativeType("SmallTestStruct3[1200]") SmallTestStruct3.Buffer value) { LargeTestStruct1.nsmallTestStruct3Array(address(), value); return this; }
        /** Copies the specified {@link SmallTestStruct3} at the specified index of the {@code smallTestStruct3Array} field. */
        public LargeTestStruct1.Buffer smallTestStruct3Array(int index, SmallTestStruct3 value) { LargeTestStruct1.nsmallTestStruct3Array(address(), index, value); return this; }
        /** Passes the {@code smallTestStruct3Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LargeTestStruct1.Buffer smallTestStruct3Array(java.util.function.Consumer<SmallTestStruct3.Buffer> consumer) { consumer.accept(smallTestStruct3Array()); return this; }
        /** Passes the element at {@code index} of the {@code smallTestStruct3Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LargeTestStruct1.Buffer smallTestStruct3Array(int index, java.util.function.Consumer<SmallTestStruct3> consumer) { consumer.accept(smallTestStruct3Array(index)); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code intArray} field. */
        public LargeTestStruct1.Buffer intArray(@NativeType("int32_t[100000]") IntBuffer value) { LargeTestStruct1.nintArray(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code intArray} field. */
        public LargeTestStruct1.Buffer intArray(int index, @NativeType("int32_t") int value) { LargeTestStruct1.nintArray(address(), index, value); return this; }

    }

}