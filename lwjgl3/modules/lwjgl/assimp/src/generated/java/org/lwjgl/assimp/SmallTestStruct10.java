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
 * struct SmallTestStruct10 {
 *     {@link SmallTestStruct3 SmallTestStruct3} aSmallTestStruct3;
 *     {@link SmallTestStruct7 SmallTestStruct7} aSmallTestStruct7;
 * }}</pre>
 */
public class SmallTestStruct10 extends Struct<SmallTestStruct10> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ASMALLTESTSTRUCT3,
        ASMALLTESTSTRUCT7;

    static {
        Layout layout = __struct(
            __member(SmallTestStruct3.SIZEOF, SmallTestStruct3.ALIGNOF),
            __member(SmallTestStruct7.SIZEOF, SmallTestStruct7.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ASMALLTESTSTRUCT3 = layout.offsetof(0);
        ASMALLTESTSTRUCT7 = layout.offsetof(1);
    }

    protected SmallTestStruct10(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SmallTestStruct10 create(long address, @Nullable ByteBuffer container) {
        return new SmallTestStruct10(address, container);
    }

    /**
     * Creates a {@code SmallTestStruct10} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SmallTestStruct10(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link SmallTestStruct3} view of the {@code aSmallTestStruct3} field. */
    public SmallTestStruct3 aSmallTestStruct3() { return naSmallTestStruct3(address()); }
    /** @return a {@link SmallTestStruct7} view of the {@code aSmallTestStruct7} field. */
    public SmallTestStruct7 aSmallTestStruct7() { return naSmallTestStruct7(address()); }

    /** Copies the specified {@link SmallTestStruct3} to the {@code aSmallTestStruct3} field. */
    public SmallTestStruct10 aSmallTestStruct3(SmallTestStruct3 value) { naSmallTestStruct3(address(), value); return this; }
    /** Passes the {@code aSmallTestStruct3} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SmallTestStruct10 aSmallTestStruct3(java.util.function.Consumer<SmallTestStruct3> consumer) { consumer.accept(aSmallTestStruct3()); return this; }
    /** Copies the specified {@link SmallTestStruct7} to the {@code aSmallTestStruct7} field. */
    public SmallTestStruct10 aSmallTestStruct7(SmallTestStruct7 value) { naSmallTestStruct7(address(), value); return this; }
    /** Passes the {@code aSmallTestStruct7} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SmallTestStruct10 aSmallTestStruct7(java.util.function.Consumer<SmallTestStruct7> consumer) { consumer.accept(aSmallTestStruct7()); return this; }

    /** Initializes this struct with the specified values. */
    public SmallTestStruct10 set(
        SmallTestStruct3 aSmallTestStruct3,
        SmallTestStruct7 aSmallTestStruct7
    ) {
        aSmallTestStruct3(aSmallTestStruct3);
        aSmallTestStruct7(aSmallTestStruct7);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SmallTestStruct10 set(SmallTestStruct10 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SmallTestStruct10} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SmallTestStruct10 malloc() {
        return new SmallTestStruct10(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct10} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SmallTestStruct10 calloc() {
        return new SmallTestStruct10(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SmallTestStruct10} instance allocated with {@link BufferUtils}. */
    public static SmallTestStruct10 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SmallTestStruct10(memAddress(container), container);
    }

    /** Returns a new {@code SmallTestStruct10} instance for the specified memory address. */
    public static SmallTestStruct10 create(long address) {
        return new SmallTestStruct10(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SmallTestStruct10 createSafe(long address) {
        return address == NULL ? null : new SmallTestStruct10(address, null);
    }

    /**
     * Returns a new {@link SmallTestStruct10.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct10.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct10.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct10.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct10.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct10.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SmallTestStruct10.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct10.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SmallTestStruct10.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SmallTestStruct10} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct10 malloc(MemoryStack stack) {
        return new SmallTestStruct10(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SmallTestStruct10} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SmallTestStruct10 calloc(MemoryStack stack) {
        return new SmallTestStruct10(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SmallTestStruct10.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct10.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SmallTestStruct10.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SmallTestStruct10.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aSmallTestStruct3}. */
    public static SmallTestStruct3 naSmallTestStruct3(long struct) { return SmallTestStruct3.create(struct + SmallTestStruct10.ASMALLTESTSTRUCT3); }
    /** Unsafe version of {@link #aSmallTestStruct7}. */
    public static SmallTestStruct7 naSmallTestStruct7(long struct) { return SmallTestStruct7.create(struct + SmallTestStruct10.ASMALLTESTSTRUCT7); }

    /** Unsafe version of {@link #aSmallTestStruct3(SmallTestStruct3) aSmallTestStruct3}. */
    public static void naSmallTestStruct3(long struct, SmallTestStruct3 value) { memCopy(value.address(), struct + SmallTestStruct10.ASMALLTESTSTRUCT3, SmallTestStruct3.SIZEOF); }
    /** Unsafe version of {@link #aSmallTestStruct7(SmallTestStruct7) aSmallTestStruct7}. */
    public static void naSmallTestStruct7(long struct, SmallTestStruct7 value) { memCopy(value.address(), struct + SmallTestStruct10.ASMALLTESTSTRUCT7, SmallTestStruct7.SIZEOF); }

    // -----------------------------------

    /** An array of {@link SmallTestStruct10} structs. */
    public static class Buffer extends StructBuffer<SmallTestStruct10, Buffer> implements NativeResource {

        private static final SmallTestStruct10 ELEMENT_FACTORY = SmallTestStruct10.create(-1L);

        /**
         * Creates a new {@code SmallTestStruct10.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SmallTestStruct10#SIZEOF}, and its mark will be undefined.</p>
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
        protected SmallTestStruct10 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link SmallTestStruct3} view of the {@code aSmallTestStruct3} field. */
        public SmallTestStruct3 aSmallTestStruct3() { return SmallTestStruct10.naSmallTestStruct3(address()); }
        /** @return a {@link SmallTestStruct7} view of the {@code aSmallTestStruct7} field. */
        public SmallTestStruct7 aSmallTestStruct7() { return SmallTestStruct10.naSmallTestStruct7(address()); }

        /** Copies the specified {@link SmallTestStruct3} to the {@code aSmallTestStruct3} field. */
        public SmallTestStruct10.Buffer aSmallTestStruct3(SmallTestStruct3 value) { SmallTestStruct10.naSmallTestStruct3(address(), value); return this; }
        /** Passes the {@code aSmallTestStruct3} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SmallTestStruct10.Buffer aSmallTestStruct3(java.util.function.Consumer<SmallTestStruct3> consumer) { consumer.accept(aSmallTestStruct3()); return this; }
        /** Copies the specified {@link SmallTestStruct7} to the {@code aSmallTestStruct7} field. */
        public SmallTestStruct10.Buffer aSmallTestStruct7(SmallTestStruct7 value) { SmallTestStruct10.naSmallTestStruct7(address(), value); return this; }
        /** Passes the {@code aSmallTestStruct7} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SmallTestStruct10.Buffer aSmallTestStruct7(java.util.function.Consumer<SmallTestStruct7> consumer) { consumer.accept(aSmallTestStruct7()); return this; }

    }

}