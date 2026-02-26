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
 * struct LargeTestStruct3 {
 *     {@link MediumTestStruct1 MediumTestStruct1} mediumTestStruct1Array[1200];
 *     {@link MediumTestStruct5 MediumTestStruct5} mediumTestStruct5Array[1200];
 *     {@link SmallTestStruct8 SmallTestStruct8} smallTestStruct8Array[1200];
 *     {@link SmallTestStruct10 SmallTestStruct10} smallTestStruct10Array[1200];
 * }}</pre>
 */
public class LargeTestStruct3 extends Struct<LargeTestStruct3> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MEDIUMTESTSTRUCT1ARRAY,
        MEDIUMTESTSTRUCT5ARRAY,
        SMALLTESTSTRUCT8ARRAY,
        SMALLTESTSTRUCT10ARRAY;

    static {
        Layout layout = __struct(
            __array(MediumTestStruct1.SIZEOF, MediumTestStruct1.ALIGNOF, 1200),
            __array(MediumTestStruct5.SIZEOF, MediumTestStruct5.ALIGNOF, 1200),
            __array(SmallTestStruct8.SIZEOF, SmallTestStruct8.ALIGNOF, 1200),
            __array(SmallTestStruct10.SIZEOF, SmallTestStruct10.ALIGNOF, 1200)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MEDIUMTESTSTRUCT1ARRAY = layout.offsetof(0);
        MEDIUMTESTSTRUCT5ARRAY = layout.offsetof(1);
        SMALLTESTSTRUCT8ARRAY = layout.offsetof(2);
        SMALLTESTSTRUCT10ARRAY = layout.offsetof(3);
    }

    protected LargeTestStruct3(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LargeTestStruct3 create(long address, @Nullable ByteBuffer container) {
        return new LargeTestStruct3(address, container);
    }

    /**
     * Creates a {@code LargeTestStruct3} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LargeTestStruct3(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link MediumTestStruct1}.Buffer view of the {@code mediumTestStruct1Array} field. */
    @NativeType("MediumTestStruct1[1200]")
    public MediumTestStruct1.Buffer mediumTestStruct1Array() { return nmediumTestStruct1Array(address()); }
    /** @return a {@link MediumTestStruct1} view of the struct at the specified index of the {@code mediumTestStruct1Array} field. */
    public MediumTestStruct1 mediumTestStruct1Array(int index) { return nmediumTestStruct1Array(address(), index); }
    /** @return a {@link MediumTestStruct5}.Buffer view of the {@code mediumTestStruct5Array} field. */
    @NativeType("MediumTestStruct5[1200]")
    public MediumTestStruct5.Buffer mediumTestStruct5Array() { return nmediumTestStruct5Array(address()); }
    /** @return a {@link MediumTestStruct5} view of the struct at the specified index of the {@code mediumTestStruct5Array} field. */
    public MediumTestStruct5 mediumTestStruct5Array(int index) { return nmediumTestStruct5Array(address(), index); }
    /** @return a {@link SmallTestStruct8}.Buffer view of the {@code smallTestStruct8Array} field. */
    @NativeType("SmallTestStruct8[1200]")
    public SmallTestStruct8.Buffer smallTestStruct8Array() { return nsmallTestStruct8Array(address()); }
    /** @return a {@link SmallTestStruct8} view of the struct at the specified index of the {@code smallTestStruct8Array} field. */
    public SmallTestStruct8 smallTestStruct8Array(int index) { return nsmallTestStruct8Array(address(), index); }
    /** @return a {@link SmallTestStruct10}.Buffer view of the {@code smallTestStruct10Array} field. */
    @NativeType("SmallTestStruct10[1200]")
    public SmallTestStruct10.Buffer smallTestStruct10Array() { return nsmallTestStruct10Array(address()); }
    /** @return a {@link SmallTestStruct10} view of the struct at the specified index of the {@code smallTestStruct10Array} field. */
    public SmallTestStruct10 smallTestStruct10Array(int index) { return nsmallTestStruct10Array(address(), index); }

    /** Copies the specified {@link MediumTestStruct1.Buffer} to the {@code mediumTestStruct1Array} field. */
    public LargeTestStruct3 mediumTestStruct1Array(@NativeType("MediumTestStruct1[1200]") MediumTestStruct1.Buffer value) { nmediumTestStruct1Array(address(), value); return this; }
    /** Copies the specified {@link MediumTestStruct1} at the specified index of the {@code mediumTestStruct1Array} field. */
    public LargeTestStruct3 mediumTestStruct1Array(int index, MediumTestStruct1 value) { nmediumTestStruct1Array(address(), index, value); return this; }
    /** Passes the {@code mediumTestStruct1Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct3 mediumTestStruct1Array(java.util.function.Consumer<MediumTestStruct1.Buffer> consumer) { consumer.accept(mediumTestStruct1Array()); return this; }
    /** Passes the element at {@code index} of the {@code mediumTestStruct1Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct3 mediumTestStruct1Array(int index, java.util.function.Consumer<MediumTestStruct1> consumer) { consumer.accept(mediumTestStruct1Array(index)); return this; }
    /** Copies the specified {@link MediumTestStruct5.Buffer} to the {@code mediumTestStruct5Array} field. */
    public LargeTestStruct3 mediumTestStruct5Array(@NativeType("MediumTestStruct5[1200]") MediumTestStruct5.Buffer value) { nmediumTestStruct5Array(address(), value); return this; }
    /** Copies the specified {@link MediumTestStruct5} at the specified index of the {@code mediumTestStruct5Array} field. */
    public LargeTestStruct3 mediumTestStruct5Array(int index, MediumTestStruct5 value) { nmediumTestStruct5Array(address(), index, value); return this; }
    /** Passes the {@code mediumTestStruct5Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct3 mediumTestStruct5Array(java.util.function.Consumer<MediumTestStruct5.Buffer> consumer) { consumer.accept(mediumTestStruct5Array()); return this; }
    /** Passes the element at {@code index} of the {@code mediumTestStruct5Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct3 mediumTestStruct5Array(int index, java.util.function.Consumer<MediumTestStruct5> consumer) { consumer.accept(mediumTestStruct5Array(index)); return this; }
    /** Copies the specified {@link SmallTestStruct8.Buffer} to the {@code smallTestStruct8Array} field. */
    public LargeTestStruct3 smallTestStruct8Array(@NativeType("SmallTestStruct8[1200]") SmallTestStruct8.Buffer value) { nsmallTestStruct8Array(address(), value); return this; }
    /** Copies the specified {@link SmallTestStruct8} at the specified index of the {@code smallTestStruct8Array} field. */
    public LargeTestStruct3 smallTestStruct8Array(int index, SmallTestStruct8 value) { nsmallTestStruct8Array(address(), index, value); return this; }
    /** Passes the {@code smallTestStruct8Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct3 smallTestStruct8Array(java.util.function.Consumer<SmallTestStruct8.Buffer> consumer) { consumer.accept(smallTestStruct8Array()); return this; }
    /** Passes the element at {@code index} of the {@code smallTestStruct8Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct3 smallTestStruct8Array(int index, java.util.function.Consumer<SmallTestStruct8> consumer) { consumer.accept(smallTestStruct8Array(index)); return this; }
    /** Copies the specified {@link SmallTestStruct10.Buffer} to the {@code smallTestStruct10Array} field. */
    public LargeTestStruct3 smallTestStruct10Array(@NativeType("SmallTestStruct10[1200]") SmallTestStruct10.Buffer value) { nsmallTestStruct10Array(address(), value); return this; }
    /** Copies the specified {@link SmallTestStruct10} at the specified index of the {@code smallTestStruct10Array} field. */
    public LargeTestStruct3 smallTestStruct10Array(int index, SmallTestStruct10 value) { nsmallTestStruct10Array(address(), index, value); return this; }
    /** Passes the {@code smallTestStruct10Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct3 smallTestStruct10Array(java.util.function.Consumer<SmallTestStruct10.Buffer> consumer) { consumer.accept(smallTestStruct10Array()); return this; }
    /** Passes the element at {@code index} of the {@code smallTestStruct10Array} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LargeTestStruct3 smallTestStruct10Array(int index, java.util.function.Consumer<SmallTestStruct10> consumer) { consumer.accept(smallTestStruct10Array(index)); return this; }

    /** Initializes this struct with the specified values. */
    public LargeTestStruct3 set(
        MediumTestStruct1.Buffer mediumTestStruct1Array,
        MediumTestStruct5.Buffer mediumTestStruct5Array,
        SmallTestStruct8.Buffer smallTestStruct8Array,
        SmallTestStruct10.Buffer smallTestStruct10Array
    ) {
        mediumTestStruct1Array(mediumTestStruct1Array);
        mediumTestStruct5Array(mediumTestStruct5Array);
        smallTestStruct8Array(smallTestStruct8Array);
        smallTestStruct10Array(smallTestStruct10Array);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LargeTestStruct3 set(LargeTestStruct3 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LargeTestStruct3} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LargeTestStruct3 malloc() {
        return new LargeTestStruct3(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LargeTestStruct3} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LargeTestStruct3 calloc() {
        return new LargeTestStruct3(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LargeTestStruct3} instance allocated with {@link BufferUtils}. */
    public static LargeTestStruct3 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LargeTestStruct3(memAddress(container), container);
    }

    /** Returns a new {@code LargeTestStruct3} instance for the specified memory address. */
    public static LargeTestStruct3 create(long address) {
        return new LargeTestStruct3(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable LargeTestStruct3 createSafe(long address) {
        return address == NULL ? null : new LargeTestStruct3(address, null);
    }

    /**
     * Returns a new {@link LargeTestStruct3.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct3.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LargeTestStruct3.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct3.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LargeTestStruct3.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct3.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LargeTestStruct3.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct3.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static LargeTestStruct3.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code LargeTestStruct3} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LargeTestStruct3 malloc(MemoryStack stack) {
        return new LargeTestStruct3(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LargeTestStruct3} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LargeTestStruct3 calloc(MemoryStack stack) {
        return new LargeTestStruct3(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LargeTestStruct3.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct3.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LargeTestStruct3.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LargeTestStruct3.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mediumTestStruct1Array}. */
    public static MediumTestStruct1.Buffer nmediumTestStruct1Array(long struct) { return MediumTestStruct1.create(struct + LargeTestStruct3.MEDIUMTESTSTRUCT1ARRAY, 1200); }
    /** Unsafe version of {@link #mediumTestStruct1Array(int) mediumTestStruct1Array}. */
    public static MediumTestStruct1 nmediumTestStruct1Array(long struct, int index) {
        return MediumTestStruct1.create(struct + LargeTestStruct3.MEDIUMTESTSTRUCT1ARRAY + check(index, 1200) * MediumTestStruct1.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct5Array}. */
    public static MediumTestStruct5.Buffer nmediumTestStruct5Array(long struct) { return MediumTestStruct5.create(struct + LargeTestStruct3.MEDIUMTESTSTRUCT5ARRAY, 1200); }
    /** Unsafe version of {@link #mediumTestStruct5Array(int) mediumTestStruct5Array}. */
    public static MediumTestStruct5 nmediumTestStruct5Array(long struct, int index) {
        return MediumTestStruct5.create(struct + LargeTestStruct3.MEDIUMTESTSTRUCT5ARRAY + check(index, 1200) * MediumTestStruct5.SIZEOF);
    }
    /** Unsafe version of {@link #smallTestStruct8Array}. */
    public static SmallTestStruct8.Buffer nsmallTestStruct8Array(long struct) { return SmallTestStruct8.create(struct + LargeTestStruct3.SMALLTESTSTRUCT8ARRAY, 1200); }
    /** Unsafe version of {@link #smallTestStruct8Array(int) smallTestStruct8Array}. */
    public static SmallTestStruct8 nsmallTestStruct8Array(long struct, int index) {
        return SmallTestStruct8.create(struct + LargeTestStruct3.SMALLTESTSTRUCT8ARRAY + check(index, 1200) * SmallTestStruct8.SIZEOF);
    }
    /** Unsafe version of {@link #smallTestStruct10Array}. */
    public static SmallTestStruct10.Buffer nsmallTestStruct10Array(long struct) { return SmallTestStruct10.create(struct + LargeTestStruct3.SMALLTESTSTRUCT10ARRAY, 1200); }
    /** Unsafe version of {@link #smallTestStruct10Array(int) smallTestStruct10Array}. */
    public static SmallTestStruct10 nsmallTestStruct10Array(long struct, int index) {
        return SmallTestStruct10.create(struct + LargeTestStruct3.SMALLTESTSTRUCT10ARRAY + check(index, 1200) * SmallTestStruct10.SIZEOF);
    }

    /** Unsafe version of {@link #mediumTestStruct1Array(MediumTestStruct1.Buffer) mediumTestStruct1Array}. */
    public static void nmediumTestStruct1Array(long struct, MediumTestStruct1.Buffer value) {
        if (CHECKS) { checkGT(value, 1200); }
        memCopy(value.address(), struct + LargeTestStruct3.MEDIUMTESTSTRUCT1ARRAY, value.remaining() * MediumTestStruct1.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct1Array(int, MediumTestStruct1) mediumTestStruct1Array}. */
    public static void nmediumTestStruct1Array(long struct, int index, MediumTestStruct1 value) {
        memCopy(value.address(), struct + LargeTestStruct3.MEDIUMTESTSTRUCT1ARRAY + check(index, 1200) * MediumTestStruct1.SIZEOF, MediumTestStruct1.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct5Array(MediumTestStruct5.Buffer) mediumTestStruct5Array}. */
    public static void nmediumTestStruct5Array(long struct, MediumTestStruct5.Buffer value) {
        if (CHECKS) { checkGT(value, 1200); }
        memCopy(value.address(), struct + LargeTestStruct3.MEDIUMTESTSTRUCT5ARRAY, value.remaining() * MediumTestStruct5.SIZEOF);
    }
    /** Unsafe version of {@link #mediumTestStruct5Array(int, MediumTestStruct5) mediumTestStruct5Array}. */
    public static void nmediumTestStruct5Array(long struct, int index, MediumTestStruct5 value) {
        memCopy(value.address(), struct + LargeTestStruct3.MEDIUMTESTSTRUCT5ARRAY + check(index, 1200) * MediumTestStruct5.SIZEOF, MediumTestStruct5.SIZEOF);
    }
    /** Unsafe version of {@link #smallTestStruct8Array(SmallTestStruct8.Buffer) smallTestStruct8Array}. */
    public static void nsmallTestStruct8Array(long struct, SmallTestStruct8.Buffer value) {
        if (CHECKS) { checkGT(value, 1200); }
        memCopy(value.address(), struct + LargeTestStruct3.SMALLTESTSTRUCT8ARRAY, value.remaining() * SmallTestStruct8.SIZEOF);
    }
    /** Unsafe version of {@link #smallTestStruct8Array(int, SmallTestStruct8) smallTestStruct8Array}. */
    public static void nsmallTestStruct8Array(long struct, int index, SmallTestStruct8 value) {
        memCopy(value.address(), struct + LargeTestStruct3.SMALLTESTSTRUCT8ARRAY + check(index, 1200) * SmallTestStruct8.SIZEOF, SmallTestStruct8.SIZEOF);
    }
    /** Unsafe version of {@link #smallTestStruct10Array(SmallTestStruct10.Buffer) smallTestStruct10Array}. */
    public static void nsmallTestStruct10Array(long struct, SmallTestStruct10.Buffer value) {
        if (CHECKS) { checkGT(value, 1200); }
        memCopy(value.address(), struct + LargeTestStruct3.SMALLTESTSTRUCT10ARRAY, value.remaining() * SmallTestStruct10.SIZEOF);
    }
    /** Unsafe version of {@link #smallTestStruct10Array(int, SmallTestStruct10) smallTestStruct10Array}. */
    public static void nsmallTestStruct10Array(long struct, int index, SmallTestStruct10 value) {
        memCopy(value.address(), struct + LargeTestStruct3.SMALLTESTSTRUCT10ARRAY + check(index, 1200) * SmallTestStruct10.SIZEOF, SmallTestStruct10.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link LargeTestStruct3} structs. */
    public static class Buffer extends StructBuffer<LargeTestStruct3, Buffer> implements NativeResource {

        private static final LargeTestStruct3 ELEMENT_FACTORY = LargeTestStruct3.create(-1L);

        /**
         * Creates a new {@code LargeTestStruct3.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LargeTestStruct3#SIZEOF}, and its mark will be undefined.</p>
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
        protected LargeTestStruct3 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link MediumTestStruct1}.Buffer view of the {@code mediumTestStruct1Array} field. */
        @NativeType("MediumTestStruct1[1200]")
        public MediumTestStruct1.Buffer mediumTestStruct1Array() { return LargeTestStruct3.nmediumTestStruct1Array(address()); }
        /** @return a {@link MediumTestStruct1} view of the struct at the specified index of the {@code mediumTestStruct1Array} field. */
        public MediumTestStruct1 mediumTestStruct1Array(int index) { return LargeTestStruct3.nmediumTestStruct1Array(address(), index); }
        /** @return a {@link MediumTestStruct5}.Buffer view of the {@code mediumTestStruct5Array} field. */
        @NativeType("MediumTestStruct5[1200]")
        public MediumTestStruct5.Buffer mediumTestStruct5Array() { return LargeTestStruct3.nmediumTestStruct5Array(address()); }
        /** @return a {@link MediumTestStruct5} view of the struct at the specified index of the {@code mediumTestStruct5Array} field. */
        public MediumTestStruct5 mediumTestStruct5Array(int index) { return LargeTestStruct3.nmediumTestStruct5Array(address(), index); }
        /** @return a {@link SmallTestStruct8}.Buffer view of the {@code smallTestStruct8Array} field. */
        @NativeType("SmallTestStruct8[1200]")
        public SmallTestStruct8.Buffer smallTestStruct8Array() { return LargeTestStruct3.nsmallTestStruct8Array(address()); }
        /** @return a {@link SmallTestStruct8} view of the struct at the specified index of the {@code smallTestStruct8Array} field. */
        public SmallTestStruct8 smallTestStruct8Array(int index) { return LargeTestStruct3.nsmallTestStruct8Array(address(), index); }
        /** @return a {@link SmallTestStruct10}.Buffer view of the {@code smallTestStruct10Array} field. */
        @NativeType("SmallTestStruct10[1200]")
        public SmallTestStruct10.Buffer smallTestStruct10Array() { return LargeTestStruct3.nsmallTestStruct10Array(address()); }
        /** @return a {@link SmallTestStruct10} view of the struct at the specified index of the {@code smallTestStruct10Array} field. */
        public SmallTestStruct10 smallTestStruct10Array(int index) { return LargeTestStruct3.nsmallTestStruct10Array(address(), index); }

        /** Copies the specified {@link MediumTestStruct1.Buffer} to the {@code mediumTestStruct1Array} field. */
        public LargeTestStruct3.Buffer mediumTestStruct1Array(@NativeType("MediumTestStruct1[1200]") MediumTestStruct1.Buffer value) { LargeTestStruct3.nmediumTestStruct1Array(address(), value); return this; }
        /** Copies the specified {@link MediumTestStruct1} at the specified index of the {@code mediumTestStruct1Array} field. */
        public LargeTestStruct3.Buffer mediumTestStruct1Array(int index, MediumTestStruct1 value) { LargeTestStruct3.nmediumTestStruct1Array(address(), index, value); return this; }
        /** Passes the {@code mediumTestStruct1Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LargeTestStruct3.Buffer mediumTestStruct1Array(java.util.function.Consumer<MediumTestStruct1.Buffer> consumer) { consumer.accept(mediumTestStruct1Array()); return this; }
        /** Passes the element at {@code index} of the {@code mediumTestStruct1Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LargeTestStruct3.Buffer mediumTestStruct1Array(int index, java.util.function.Consumer<MediumTestStruct1> consumer) { consumer.accept(mediumTestStruct1Array(index)); return this; }
        /** Copies the specified {@link MediumTestStruct5.Buffer} to the {@code mediumTestStruct5Array} field. */
        public LargeTestStruct3.Buffer mediumTestStruct5Array(@NativeType("MediumTestStruct5[1200]") MediumTestStruct5.Buffer value) { LargeTestStruct3.nmediumTestStruct5Array(address(), value); return this; }
        /** Copies the specified {@link MediumTestStruct5} at the specified index of the {@code mediumTestStruct5Array} field. */
        public LargeTestStruct3.Buffer mediumTestStruct5Array(int index, MediumTestStruct5 value) { LargeTestStruct3.nmediumTestStruct5Array(address(), index, value); return this; }
        /** Passes the {@code mediumTestStruct5Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LargeTestStruct3.Buffer mediumTestStruct5Array(java.util.function.Consumer<MediumTestStruct5.Buffer> consumer) { consumer.accept(mediumTestStruct5Array()); return this; }
        /** Passes the element at {@code index} of the {@code mediumTestStruct5Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LargeTestStruct3.Buffer mediumTestStruct5Array(int index, java.util.function.Consumer<MediumTestStruct5> consumer) { consumer.accept(mediumTestStruct5Array(index)); return this; }
        /** Copies the specified {@link SmallTestStruct8.Buffer} to the {@code smallTestStruct8Array} field. */
        public LargeTestStruct3.Buffer smallTestStruct8Array(@NativeType("SmallTestStruct8[1200]") SmallTestStruct8.Buffer value) { LargeTestStruct3.nsmallTestStruct8Array(address(), value); return this; }
        /** Copies the specified {@link SmallTestStruct8} at the specified index of the {@code smallTestStruct8Array} field. */
        public LargeTestStruct3.Buffer smallTestStruct8Array(int index, SmallTestStruct8 value) { LargeTestStruct3.nsmallTestStruct8Array(address(), index, value); return this; }
        /** Passes the {@code smallTestStruct8Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LargeTestStruct3.Buffer smallTestStruct8Array(java.util.function.Consumer<SmallTestStruct8.Buffer> consumer) { consumer.accept(smallTestStruct8Array()); return this; }
        /** Passes the element at {@code index} of the {@code smallTestStruct8Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LargeTestStruct3.Buffer smallTestStruct8Array(int index, java.util.function.Consumer<SmallTestStruct8> consumer) { consumer.accept(smallTestStruct8Array(index)); return this; }
        /** Copies the specified {@link SmallTestStruct10.Buffer} to the {@code smallTestStruct10Array} field. */
        public LargeTestStruct3.Buffer smallTestStruct10Array(@NativeType("SmallTestStruct10[1200]") SmallTestStruct10.Buffer value) { LargeTestStruct3.nsmallTestStruct10Array(address(), value); return this; }
        /** Copies the specified {@link SmallTestStruct10} at the specified index of the {@code smallTestStruct10Array} field. */
        public LargeTestStruct3.Buffer smallTestStruct10Array(int index, SmallTestStruct10 value) { LargeTestStruct3.nsmallTestStruct10Array(address(), index, value); return this; }
        /** Passes the {@code smallTestStruct10Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LargeTestStruct3.Buffer smallTestStruct10Array(java.util.function.Consumer<SmallTestStruct10.Buffer> consumer) { consumer.accept(smallTestStruct10Array()); return this; }
        /** Passes the element at {@code index} of the {@code smallTestStruct10Array} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LargeTestStruct3.Buffer smallTestStruct10Array(int index, java.util.function.Consumer<SmallTestStruct10> consumer) { consumer.accept(smallTestStruct10Array(index)); return this; }

    }

}