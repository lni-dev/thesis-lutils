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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct LargeTestStruct4 {
 *     {@link MediumTestStruct1 MediumTestStruct1} mediumTestStruct1Array[400];
 *     {@link MediumTestStruct2 MediumTestStruct2} mediumTestStruct2Array[500];
 *     {@link MediumTestStruct3 MediumTestStruct3} mediumTestStruct3Array[600];
 *     {@link MediumTestStruct4 MediumTestStruct4} mediumTestStruct4Array[300];
 *     {@link MediumTestStruct5 MediumTestStruct5} mediumTestStruct5Array[700];
 * }}</pre>
 */
public class LargeTestStruct4 extends Struct<LargeTestStruct4> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MEDIUMTESTSTRUCT1ARRAY,
        MEDIUMTESTSTRUCT2ARRAY,
        MEDIUMTESTSTRUCT3ARRAY,
        MEDIUMTESTSTRUCT4ARRAY,
        MEDIUMTESTSTRUCT5ARRAY;

    static {
        Layout layout = __struct(
            __array(MediumTestStruct1.SIZEOF, MediumTestStruct1.ALIGNOF, 400),
            __array(MediumTestStruct2.SIZEOF, MediumTestStruct2.ALIGNOF, 500),
            __array(MediumTestStruct3.SIZEOF, MediumTestStruct3.ALIGNOF, 600),
            __array(MediumTestStruct4.SIZEOF, MediumTestStruct4.ALIGNOF, 300),
            __array(MediumTestStruct5.SIZEOF, MediumTestStruct5.ALIGNOF, 700)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MEDIUMTESTSTRUCT1ARRAY = layout.offsetof(0);
        MEDIUMTESTSTRUCT2ARRAY = layout.offsetof(1);
        MEDIUMTESTSTRUCT3ARRAY = layout.offsetof(2);
        MEDIUMTESTSTRUCT4ARRAY = layout.offsetof(3);
        MEDIUMTESTSTRUCT5ARRAY = layout.offsetof(4);
    }

    protected LargeTestStruct4(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LargeTestStruct4 create(long address, @Nullable ByteBuffer container) {
        return new LargeTestStruct4(address, container);
    }

    /**
     * Creates a {@code LargeTestStruct4} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LargeTestStruct4(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link MediumTestStruct1}.Buffer view of the {@code mediumTestStruct1Array} field. */
    @NativeType("MediumTestStruct1[400]")
    public MediumTestStruct1.Buffer mediumTestStruct1Array() { return nmediumTestStruct1Array(address()); }
    /** @return a {@link MediumTestStruct1} view of the struct at the specified index of the {@code mediumTestStruct1Array} field. */
    public MediumTestStruct1 mediumTestStruct1Array(int index) { return nmediumTestStruct1Array(address(), index); }
    /** @return a {@link MediumTestStruct2}.Buffer view of the {@code mediumTestStruct2Array} field. */
    @NativeType("MediumTestStruct2[500]")
    public MediumTestStruct2.Buffer mediumTestStruct2Array() { return nmediumTestStruct2Array(address()); }
    /** @return a {@link MediumTestStruct2} view of the struct at the specified index of the {@code mediumTestStruct2Array} field. */
    public MediumTestStruct2 mediumTestStruct2Array(int index) { return nmediumTestStruct2Array(address(), index); }
    /** @return a {@link MediumTestStruct3}.Buffer view of the {@code mediumTestStruct3Array} field. */
    @NativeType("MediumTestStruct3[600]")
    public MediumTestStruct3.Buffer mediumTestStruct3Array() { return nmediumTestStruct3Array(address()); }
    /** @return a {@link MediumTestStruct3} view of the struct at the specified index of the {@code mediumTestStruct3Array} field. */
    public MediumTestStruct3 mediumTestStruct3Array(int index) { return nmediumTestStruct3Array(address(), index); }
    /** @return a {@link MediumTestStruct4}.Buffer view of the {@code mediumTestStruct4Array} field. */
    @NativeType("MediumTestStruct4[300]")
    public MediumTestStruct4.Buffer mediumTestStruct4Array() { return nmediumTestStruct4Array(address()); }
    /** @return a {@link MediumTestStruct4} view of the struct at the specified index of the {@code mediumTestStruct4Array} field. */
    public MediumTestStruct4 mediumTestStruct4Array(int index) { return nmediumTestStruct4Array(address(), index); }
    /** @return a {@link MediumTestStruct5}.Buffer view of the {@code mediumTestStruct5Array} field. */
    @NativeType("MediumTestStruct5[700]")
    public MediumTestStruct5.Buffer mediumTestStruct5Array() { return nmediumTestStruct5Array(address()); }
    /** @return a {@link MediumTestStruct5} view of the struct at the specified index of the {@code mediumTestStruct5Array} field. */
    public MediumTestStruct5 mediumTestStruct5Array(int index) { return nmediumTestStruct5Array(address(), index); }

    /** Copies the specified {@link MediumTestStruct1.Buffer} to the {@code mediumTestStruct1Array} field. */
    public LargeTestStruct4 mediumTestStruct1Array(@NativeType("MediumTestStruct1[400]") MediumTestStruct1.Buffer value) { nmediumTestStruct1Array(address(), value); return this; }
    /** Copies the specified {@link MediumTestStruct1} at the specified index of the {@code mediumTestStruct1Array} field. */
    public LargeTestStruct4 mediumTestStruct1Array(int index, MediumTestStruct1 value) { nmediumTestStruct1Array(address(), index, value); return this; }
    /** Passes the {@code mediumTestStruct1Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct4 mediumTestStruct1Array(java.util.function.Consumer<MediumTestStruct1.Buffer> consumer) { consumer.accept(mediumTestStruct1Array()); return this; }
    /** Passes the element at {@code index} of the {@code mediumTestStruct1Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct4 mediumTestStruct1Array(int index, java.util.function.Consumer<MediumTestStruct1> consumer) { consumer.accept(mediumTestStruct1Array(index)); return this; }
    /** Copies the specified {@link MediumTestStruct2.Buffer} to the {@code mediumTestStruct2Array} field. */
    public LargeTestStruct4 mediumTestStruct2Array(@NativeType("MediumTestStruct2[500]") MediumTestStruct2.Buffer value) { nmediumTestStruct2Array(address(), value); return this; }
    /** Copies the specified {@link MediumTestStruct2} at the specified index of the {@code mediumTestStruct2Array} field. */
    public LargeTestStruct4 mediumTestStruct2Array(int index, MediumTestStruct2 value) { nmediumTestStruct2Array(address(), index, value); return this; }
    /** Passes the {@code mediumTestStruct2Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct4 mediumTestStruct2Array(java.util.function.Consumer<MediumTestStruct2.Buffer> consumer) { consumer.accept(mediumTestStruct2Array()); return this; }
    /** Passes the element at {@code index} of the {@code mediumTestStruct2Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct4 mediumTestStruct2Array(int index, java.util.function.Consumer<MediumTestStruct2> consumer) { consumer.accept(mediumTestStruct2Array(index)); return this; }
    /** Copies the specified {@link MediumTestStruct3.Buffer} to the {@code mediumTestStruct3Array} field. */
    public LargeTestStruct4 mediumTestStruct3Array(@NativeType("MediumTestStruct3[600]") MediumTestStruct3.Buffer value) { nmediumTestStruct3Array(address(), value); return this; }
    /** Copies the specified {@link MediumTestStruct3} at the specified index of the {@code mediumTestStruct3Array} field. */
    public LargeTestStruct4 mediumTestStruct3Array(int index, MediumTestStruct3 value) { nmediumTestStruct3Array(address(), index, value); return this; }
    /** Passes the {@code mediumTestStruct3Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct4 mediumTestStruct3Array(java.util.function.Consumer<MediumTestStruct3.Buffer> consumer) { consumer.accept(mediumTestStruct3Array()); return this; }
    /** Passes the element at {@code index} of the {@code mediumTestStruct3Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct4 mediumTestStruct3Array(int index, java.util.function.Consumer<MediumTestStruct3> consumer) { consumer.accept(mediumTestStruct3Array(index)); return this; }
    /** Copies the specified {@link MediumTestStruct4.Buffer} to the {@code mediumTestStruct4Array} field. */
    public LargeTestStruct4 mediumTestStruct4Array(@NativeType("MediumTestStruct4[300]") MediumTestStruct4.Buffer value) { nmediumTestStruct4Array(address(), value); return this; }
    /** Copies the specified {@link MediumTestStruct4} at the specified index of the {@code mediumTestStruct4Array} field. */
    public LargeTestStruct4 mediumTestStruct4Array(int index, MediumTestStruct4 value) { nmediumTestStruct4Array(address(), index, value); return this; }
    /** Passes the {@code mediumTestStruct4Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct4 mediumTestStruct4Array(java.util.function.Consumer<MediumTestStruct4.Buffer> consumer) { consumer.accept(mediumTestStruct4Array()); return this; }
    /** Passes the element at {@code index} of the {@code mediumTestStruct4Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct4 mediumTestStruct4Array(int index, java.util.function.Consumer<MediumTestStruct4> consumer) { consumer.accept(mediumTestStruct4Array(index)); return this; }
    /** Copies the specified {@link MediumTestStruct5.Buffer} to the {@code mediumTestStruct5Array} field. */
    public LargeTestStruct4 mediumTestStruct5Array(@NativeType("MediumTestStruct5[700]") MediumTestStruct5.Buffer value) { nmediumTestStruct5Array(address(), value); return this; }
    /** Copies the specified {@link MediumTestStruct5} at the specified index of the {@code mediumTestStruct5Array} field. */
    public LargeTestStruct4 mediumTestStruct5Array(int index, MediumTestStruct5 value) { nmediumTestStruct5Array(address(), index, value); return this; }
    /** Passes the {@code mediumTestStruct5Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct4 mediumTestStruct5Array(java.util.function.Consumer<MediumTestStruct5.Buffer> consumer) { consumer.accept(mediumTestStruct5Array()); return this; }
    /** Passes the element at {@code index} of the {@code mediumTestStruct5Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct4 mediumTestStruct5Array(int index, java.util.function.Consumer<MediumTestStruct5> consumer) { consumer.accept(mediumTestStruct5Array(index)); return this; }

    /** Initializes this struct with the specified values. */
    public LargeTestStruct4 set(
        MediumTestStruct1.Buffer mediumTestStruct1Array,
        MediumTestStruct2.Buffer mediumTestStruct2Array,
        MediumTestStruct3.Buffer mediumTestStruct3Array,
        MediumTestStruct4.Buffer mediumTestStruct4Array,
        MediumTestStruct5.Buffer mediumTestStruct5Array
    ) {
        mediumTestStruct1Array(mediumTestStruct1Array);
        mediumTestStruct2Array(mediumTestStruct2Array);
        mediumTestStruct3Array(mediumTestStruct3Array);
        mediumTestStruct4Array(mediumTestStruct4Array);
        mediumTestStruct5Array(mediumTestStruct5Array);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LargeTestStruct4 set(LargeTestStruct4 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LargeTestStruct4} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LargeTestStruct4 malloc() {
        return new LargeTestStruct4(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LargeTestStruct4} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LargeTestStruct4 calloc() {
        return new LargeTestStruct4(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LargeTestStruct4} instance allocated with {@link BufferUtils}. */
    public static LargeTestStruct4 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LargeTestStruct4(memAddress(container), container);
    }

    /** Returns a new {@code LargeTestStruct4} instance for the specified memory address. */
    public static LargeTestStruct4 create(long address) {
        return new LargeTestStruct4(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable LargeTestStruct4 createSafe(long address) {
        return address == NULL ? null : new LargeTestStruct4(address, null);
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
     * Returns a new {@code LargeTestStruct4} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LargeTestStruct4 malloc(MemoryStack stack) {
        return new LargeTestStruct4(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LargeTestStruct4} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LargeTestStruct4 calloc(MemoryStack stack) {
        return new LargeTestStruct4(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /** Unsafe version of {@link #mediumTestStruct1Array}. */
    public static MediumTestStruct1.Buffer nmediumTestStruct1Array(long struct) { return MediumTestStruct1.create(struct + LargeTestStruct4.MEDIUMTESTSTRUCT1ARRAY, 400); }
    /** Unsafe version of {@link #mediumTestStruct1Array(int) mediumTestStruct1Array}. */
    public static MediumTestStruct1 nmediumTestStruct1Array(long struct, int index) {
        return MediumTestStruct1.create(struct + LargeTestStruct4.MEDIUMTESTSTRUCT1ARRAY + check(index, 400) * MediumTestStruct1.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct2Array}. */
    public static MediumTestStruct2.Buffer nmediumTestStruct2Array(long struct) { return MediumTestStruct2.create(struct + LargeTestStruct4.MEDIUMTESTSTRUCT2ARRAY, 500); }
    /** Unsafe version of {@link #mediumTestStruct2Array(int) mediumTestStruct2Array}. */
    public static MediumTestStruct2 nmediumTestStruct2Array(long struct, int index) {
        return MediumTestStruct2.create(struct + LargeTestStruct4.MEDIUMTESTSTRUCT2ARRAY + check(index, 500) * MediumTestStruct2.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct3Array}. */
    public static MediumTestStruct3.Buffer nmediumTestStruct3Array(long struct) { return MediumTestStruct3.create(struct + LargeTestStruct4.MEDIUMTESTSTRUCT3ARRAY, 600); }
    /** Unsafe version of {@link #mediumTestStruct3Array(int) mediumTestStruct3Array}. */
    public static MediumTestStruct3 nmediumTestStruct3Array(long struct, int index) {
        return MediumTestStruct3.create(struct + LargeTestStruct4.MEDIUMTESTSTRUCT3ARRAY + check(index, 600) * MediumTestStruct3.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct4Array}. */
    public static MediumTestStruct4.Buffer nmediumTestStruct4Array(long struct) { return MediumTestStruct4.create(struct + LargeTestStruct4.MEDIUMTESTSTRUCT4ARRAY, 300); }
    /** Unsafe version of {@link #mediumTestStruct4Array(int) mediumTestStruct4Array}. */
    public static MediumTestStruct4 nmediumTestStruct4Array(long struct, int index) {
        return MediumTestStruct4.create(struct + LargeTestStruct4.MEDIUMTESTSTRUCT4ARRAY + check(index, 300) * MediumTestStruct4.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct5Array}. */
    public static MediumTestStruct5.Buffer nmediumTestStruct5Array(long struct) { return MediumTestStruct5.create(struct + LargeTestStruct4.MEDIUMTESTSTRUCT5ARRAY, 700); }
    /** Unsafe version of {@link #mediumTestStruct5Array(int) mediumTestStruct5Array}. */
    public static MediumTestStruct5 nmediumTestStruct5Array(long struct, int index) {
        return MediumTestStruct5.create(struct + LargeTestStruct4.MEDIUMTESTSTRUCT5ARRAY + check(index, 700) * MediumTestStruct5.SIZEOF);
    }

    /** Unsafe version of {@link #mediumTestStruct1Array(MediumTestStruct1.Buffer) mediumTestStruct1Array}. */
    public static void nmediumTestStruct1Array(long struct, MediumTestStruct1.Buffer value) {
        if (CHECKS) { checkGT(value, 400); }
        memCopy(value.address(), struct + LargeTestStruct4.MEDIUMTESTSTRUCT1ARRAY, value.remaining() * MediumTestStruct1.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct1Array(int, MediumTestStruct1) mediumTestStruct1Array}. */
    public static void nmediumTestStruct1Array(long struct, int index, MediumTestStruct1 value) {
        memCopy(value.address(), struct + LargeTestStruct4.MEDIUMTESTSTRUCT1ARRAY + check(index, 400) * MediumTestStruct1.SIZEOF, MediumTestStruct1.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct2Array(MediumTestStruct2.Buffer) mediumTestStruct2Array}. */
    public static void nmediumTestStruct2Array(long struct, MediumTestStruct2.Buffer value) {
        if (CHECKS) { checkGT(value, 500); }
        memCopy(value.address(), struct + LargeTestStruct4.MEDIUMTESTSTRUCT2ARRAY, value.remaining() * MediumTestStruct2.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct2Array(int, MediumTestStruct2) mediumTestStruct2Array}. */
    public static void nmediumTestStruct2Array(long struct, int index, MediumTestStruct2 value) {
        memCopy(value.address(), struct + LargeTestStruct4.MEDIUMTESTSTRUCT2ARRAY + check(index, 500) * MediumTestStruct2.SIZEOF, MediumTestStruct2.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct3Array(MediumTestStruct3.Buffer) mediumTestStruct3Array}. */
    public static void nmediumTestStruct3Array(long struct, MediumTestStruct3.Buffer value) {
        if (CHECKS) { checkGT(value, 600); }
        memCopy(value.address(), struct + LargeTestStruct4.MEDIUMTESTSTRUCT3ARRAY, value.remaining() * MediumTestStruct3.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct3Array(int, MediumTestStruct3) mediumTestStruct3Array}. */
    public static void nmediumTestStruct3Array(long struct, int index, MediumTestStruct3 value) {
        memCopy(value.address(), struct + LargeTestStruct4.MEDIUMTESTSTRUCT3ARRAY + check(index, 600) * MediumTestStruct3.SIZEOF, MediumTestStruct3.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct4Array(MediumTestStruct4.Buffer) mediumTestStruct4Array}. */
    public static void nmediumTestStruct4Array(long struct, MediumTestStruct4.Buffer value) {
        if (CHECKS) { checkGT(value, 300); }
        memCopy(value.address(), struct + LargeTestStruct4.MEDIUMTESTSTRUCT4ARRAY, value.remaining() * MediumTestStruct4.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct4Array(int, MediumTestStruct4) mediumTestStruct4Array}. */
    public static void nmediumTestStruct4Array(long struct, int index, MediumTestStruct4 value) {
        memCopy(value.address(), struct + LargeTestStruct4.MEDIUMTESTSTRUCT4ARRAY + check(index, 300) * MediumTestStruct4.SIZEOF, MediumTestStruct4.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct5Array(MediumTestStruct5.Buffer) mediumTestStruct5Array}. */
    public static void nmediumTestStruct5Array(long struct, MediumTestStruct5.Buffer value) {
        if (CHECKS) { checkGT(value, 700); }
        memCopy(value.address(), struct + LargeTestStruct4.MEDIUMTESTSTRUCT5ARRAY, value.remaining() * MediumTestStruct5.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct5Array(int, MediumTestStruct5) mediumTestStruct5Array}. */
    public static void nmediumTestStruct5Array(long struct, int index, MediumTestStruct5 value) {
        memCopy(value.address(), struct + LargeTestStruct4.MEDIUMTESTSTRUCT5ARRAY + check(index, 700) * MediumTestStruct5.SIZEOF, MediumTestStruct5.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link LargeTestStruct4} structs. */
    public static class Buffer extends StructBuffer<LargeTestStruct4, Buffer> implements NativeResource {

        private static final LargeTestStruct4 ELEMENT_FACTORY = LargeTestStruct4.create(-1L);

        /**
         * Creates a new {@code LargeTestStruct4.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LargeTestStruct4#SIZEOF}, and its mark will be undefined.</p>
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
        protected LargeTestStruct4 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link MediumTestStruct1}.Buffer view of the {@code mediumTestStruct1Array} field. */
        @NativeType("MediumTestStruct1[400]")
        public MediumTestStruct1.Buffer mediumTestStruct1Array() { return LargeTestStruct4.nmediumTestStruct1Array(address()); }
        /** @return a {@link MediumTestStruct1} view of the struct at the specified index of the {@code mediumTestStruct1Array} field. */
        public MediumTestStruct1 mediumTestStruct1Array(int index) { return LargeTestStruct4.nmediumTestStruct1Array(address(), index); }
        /** @return a {@link MediumTestStruct2}.Buffer view of the {@code mediumTestStruct2Array} field. */
        @NativeType("MediumTestStruct2[500]")
        public MediumTestStruct2.Buffer mediumTestStruct2Array() { return LargeTestStruct4.nmediumTestStruct2Array(address()); }
        /** @return a {@link MediumTestStruct2} view of the struct at the specified index of the {@code mediumTestStruct2Array} field. */
        public MediumTestStruct2 mediumTestStruct2Array(int index) { return LargeTestStruct4.nmediumTestStruct2Array(address(), index); }
        /** @return a {@link MediumTestStruct3}.Buffer view of the {@code mediumTestStruct3Array} field. */
        @NativeType("MediumTestStruct3[600]")
        public MediumTestStruct3.Buffer mediumTestStruct3Array() { return LargeTestStruct4.nmediumTestStruct3Array(address()); }
        /** @return a {@link MediumTestStruct3} view of the struct at the specified index of the {@code mediumTestStruct3Array} field. */
        public MediumTestStruct3 mediumTestStruct3Array(int index) { return LargeTestStruct4.nmediumTestStruct3Array(address(), index); }
        /** @return a {@link MediumTestStruct4}.Buffer view of the {@code mediumTestStruct4Array} field. */
        @NativeType("MediumTestStruct4[300]")
        public MediumTestStruct4.Buffer mediumTestStruct4Array() { return LargeTestStruct4.nmediumTestStruct4Array(address()); }
        /** @return a {@link MediumTestStruct4} view of the struct at the specified index of the {@code mediumTestStruct4Array} field. */
        public MediumTestStruct4 mediumTestStruct4Array(int index) { return LargeTestStruct4.nmediumTestStruct4Array(address(), index); }
        /** @return a {@link MediumTestStruct5}.Buffer view of the {@code mediumTestStruct5Array} field. */
        @NativeType("MediumTestStruct5[700]")
        public MediumTestStruct5.Buffer mediumTestStruct5Array() { return LargeTestStruct4.nmediumTestStruct5Array(address()); }
        /** @return a {@link MediumTestStruct5} view of the struct at the specified index of the {@code mediumTestStruct5Array} field. */
        public MediumTestStruct5 mediumTestStruct5Array(int index) { return LargeTestStruct4.nmediumTestStruct5Array(address(), index); }

        /** Copies the specified {@link MediumTestStruct1.Buffer} to the {@code mediumTestStruct1Array} field. */
        public Buffer mediumTestStruct1Array(@NativeType("MediumTestStruct1[400]") MediumTestStruct1.Buffer value) { LargeTestStruct4.nmediumTestStruct1Array(address(), value); return this; }
        /** Copies the specified {@link MediumTestStruct1} at the specified index of the {@code mediumTestStruct1Array} field. */
        public Buffer mediumTestStruct1Array(int index, MediumTestStruct1 value) { LargeTestStruct4.nmediumTestStruct1Array(address(), index, value); return this; }
        /** Passes the {@code mediumTestStruct1Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer mediumTestStruct1Array(java.util.function.Consumer<MediumTestStruct1.Buffer> consumer) { consumer.accept(mediumTestStruct1Array()); return this; }
        /** Passes the element at {@code index} of the {@code mediumTestStruct1Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer mediumTestStruct1Array(int index, java.util.function.Consumer<MediumTestStruct1> consumer) { consumer.accept(mediumTestStruct1Array(index)); return this; }
        /** Copies the specified {@link MediumTestStruct2.Buffer} to the {@code mediumTestStruct2Array} field. */
        public Buffer mediumTestStruct2Array(@NativeType("MediumTestStruct2[500]") MediumTestStruct2.Buffer value) { LargeTestStruct4.nmediumTestStruct2Array(address(), value); return this; }
        /** Copies the specified {@link MediumTestStruct2} at the specified index of the {@code mediumTestStruct2Array} field. */
        public Buffer mediumTestStruct2Array(int index, MediumTestStruct2 value) { LargeTestStruct4.nmediumTestStruct2Array(address(), index, value); return this; }
        /** Passes the {@code mediumTestStruct2Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer mediumTestStruct2Array(java.util.function.Consumer<MediumTestStruct2.Buffer> consumer) { consumer.accept(mediumTestStruct2Array()); return this; }
        /** Passes the element at {@code index} of the {@code mediumTestStruct2Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer mediumTestStruct2Array(int index, java.util.function.Consumer<MediumTestStruct2> consumer) { consumer.accept(mediumTestStruct2Array(index)); return this; }
        /** Copies the specified {@link MediumTestStruct3.Buffer} to the {@code mediumTestStruct3Array} field. */
        public Buffer mediumTestStruct3Array(@NativeType("MediumTestStruct3[600]") MediumTestStruct3.Buffer value) { LargeTestStruct4.nmediumTestStruct3Array(address(), value); return this; }
        /** Copies the specified {@link MediumTestStruct3} at the specified index of the {@code mediumTestStruct3Array} field. */
        public Buffer mediumTestStruct3Array(int index, MediumTestStruct3 value) { LargeTestStruct4.nmediumTestStruct3Array(address(), index, value); return this; }
        /** Passes the {@code mediumTestStruct3Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer mediumTestStruct3Array(java.util.function.Consumer<MediumTestStruct3.Buffer> consumer) { consumer.accept(mediumTestStruct3Array()); return this; }
        /** Passes the element at {@code index} of the {@code mediumTestStruct3Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer mediumTestStruct3Array(int index, java.util.function.Consumer<MediumTestStruct3> consumer) { consumer.accept(mediumTestStruct3Array(index)); return this; }
        /** Copies the specified {@link MediumTestStruct4.Buffer} to the {@code mediumTestStruct4Array} field. */
        public Buffer mediumTestStruct4Array(@NativeType("MediumTestStruct4[300]") MediumTestStruct4.Buffer value) { LargeTestStruct4.nmediumTestStruct4Array(address(), value); return this; }
        /** Copies the specified {@link MediumTestStruct4} at the specified index of the {@code mediumTestStruct4Array} field. */
        public Buffer mediumTestStruct4Array(int index, MediumTestStruct4 value) { LargeTestStruct4.nmediumTestStruct4Array(address(), index, value); return this; }
        /** Passes the {@code mediumTestStruct4Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer mediumTestStruct4Array(java.util.function.Consumer<MediumTestStruct4.Buffer> consumer) { consumer.accept(mediumTestStruct4Array()); return this; }
        /** Passes the element at {@code index} of the {@code mediumTestStruct4Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer mediumTestStruct4Array(int index, java.util.function.Consumer<MediumTestStruct4> consumer) { consumer.accept(mediumTestStruct4Array(index)); return this; }
        /** Copies the specified {@link MediumTestStruct5.Buffer} to the {@code mediumTestStruct5Array} field. */
        public Buffer mediumTestStruct5Array(@NativeType("MediumTestStruct5[700]") MediumTestStruct5.Buffer value) { LargeTestStruct4.nmediumTestStruct5Array(address(), value); return this; }
        /** Copies the specified {@link MediumTestStruct5} at the specified index of the {@code mediumTestStruct5Array} field. */
        public Buffer mediumTestStruct5Array(int index, MediumTestStruct5 value) { LargeTestStruct4.nmediumTestStruct5Array(address(), index, value); return this; }
        /** Passes the {@code mediumTestStruct5Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer mediumTestStruct5Array(java.util.function.Consumer<MediumTestStruct5.Buffer> consumer) { consumer.accept(mediumTestStruct5Array()); return this; }
        /** Passes the element at {@code index} of the {@code mediumTestStruct5Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer mediumTestStruct5Array(int index, java.util.function.Consumer<MediumTestStruct5> consumer) { consumer.accept(mediumTestStruct5Array(index)); return this; }

    }

}