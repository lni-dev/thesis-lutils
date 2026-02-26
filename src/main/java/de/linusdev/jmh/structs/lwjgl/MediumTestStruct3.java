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
 * struct MediumTestStruct3 {
 *     {@link SmallTestStruct1 SmallTestStruct1} aSmallTestStruct1;
 *     {@link SmallTestStruct2 SmallTestStruct2} aSmallTestStruct2;
 *     {@link SmallTestStruct3 SmallTestStruct3} aSmallTestStruct3;
 *     {@link SmallTestStruct4 SmallTestStruct4} aSmallTestStruct4;
 *     {@link SmallTestStruct5 SmallTestStruct5} aSmallTestStruct5;
 *     {@link SmallTestStruct6 SmallTestStruct6} aSmallTestStruct6;
 *     {@link SmallTestStruct7 SmallTestStruct7} aSmallTestStruct7;
 *     {@link SmallTestStruct8 SmallTestStruct8} aSmallTestStruct8;
 *     {@link SmallTestStruct9 SmallTestStruct9} aSmallTestStruct9;
 *     {@link SmallTestStruct10 SmallTestStruct10} aSmallTestStruct10;
 * }}</pre>
 */
public class MediumTestStruct3 extends Struct<MediumTestStruct3> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ASMALLTESTSTRUCT1,
        ASMALLTESTSTRUCT2,
        ASMALLTESTSTRUCT3,
        ASMALLTESTSTRUCT4,
        ASMALLTESTSTRUCT5,
        ASMALLTESTSTRUCT6,
        ASMALLTESTSTRUCT7,
        ASMALLTESTSTRUCT8,
        ASMALLTESTSTRUCT9,
        ASMALLTESTSTRUCT10;

    static {
        Layout layout = __struct(
            __member(SmallTestStruct1.SIZEOF, SmallTestStruct1.ALIGNOF),
            __member(SmallTestStruct2.SIZEOF, SmallTestStruct2.ALIGNOF),
            __member(SmallTestStruct3.SIZEOF, SmallTestStruct3.ALIGNOF),
            __member(SmallTestStruct4.SIZEOF, SmallTestStruct4.ALIGNOF),
            __member(SmallTestStruct5.SIZEOF, SmallTestStruct5.ALIGNOF),
            __member(SmallTestStruct6.SIZEOF, SmallTestStruct6.ALIGNOF),
            __member(SmallTestStruct7.SIZEOF, SmallTestStruct7.ALIGNOF),
            __member(SmallTestStruct8.SIZEOF, SmallTestStruct8.ALIGNOF),
            __member(SmallTestStruct9.SIZEOF, SmallTestStruct9.ALIGNOF),
            __member(SmallTestStruct10.SIZEOF, SmallTestStruct10.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ASMALLTESTSTRUCT1 = layout.offsetof(0);
        ASMALLTESTSTRUCT2 = layout.offsetof(1);
        ASMALLTESTSTRUCT3 = layout.offsetof(2);
        ASMALLTESTSTRUCT4 = layout.offsetof(3);
        ASMALLTESTSTRUCT5 = layout.offsetof(4);
        ASMALLTESTSTRUCT6 = layout.offsetof(5);
        ASMALLTESTSTRUCT7 = layout.offsetof(6);
        ASMALLTESTSTRUCT8 = layout.offsetof(7);
        ASMALLTESTSTRUCT9 = layout.offsetof(8);
        ASMALLTESTSTRUCT10 = layout.offsetof(9);
    }

    protected MediumTestStruct3(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MediumTestStruct3 create(long address, @Nullable ByteBuffer container) {
        return new MediumTestStruct3(address, container);
    }

    /**
     * Creates a {@code MediumTestStruct3} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MediumTestStruct3(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link SmallTestStruct1} view of the {@code aSmallTestStruct1} field. */
    public SmallTestStruct1 aSmallTestStruct1() { return naSmallTestStruct1(address()); }
    /** @return a {@link SmallTestStruct2} view of the {@code aSmallTestStruct2} field. */
    public SmallTestStruct2 aSmallTestStruct2() { return naSmallTestStruct2(address()); }
    /** @return a {@link SmallTestStruct3} view of the {@code aSmallTestStruct3} field. */
    public SmallTestStruct3 aSmallTestStruct3() { return naSmallTestStruct3(address()); }
    /** @return a {@link SmallTestStruct4} view of the {@code aSmallTestStruct4} field. */
    public SmallTestStruct4 aSmallTestStruct4() { return naSmallTestStruct4(address()); }
    /** @return a {@link SmallTestStruct5} view of the {@code aSmallTestStruct5} field. */
    public SmallTestStruct5 aSmallTestStruct5() { return naSmallTestStruct5(address()); }
    /** @return a {@link SmallTestStruct6} view of the {@code aSmallTestStruct6} field. */
    public SmallTestStruct6 aSmallTestStruct6() { return naSmallTestStruct6(address()); }
    /** @return a {@link SmallTestStruct7} view of the {@code aSmallTestStruct7} field. */
    public SmallTestStruct7 aSmallTestStruct7() { return naSmallTestStruct7(address()); }
    /** @return a {@link SmallTestStruct8} view of the {@code aSmallTestStruct8} field. */
    public SmallTestStruct8 aSmallTestStruct8() { return naSmallTestStruct8(address()); }
    /** @return a {@link SmallTestStruct9} view of the {@code aSmallTestStruct9} field. */
    public SmallTestStruct9 aSmallTestStruct9() { return naSmallTestStruct9(address()); }
    /** @return a {@link SmallTestStruct10} view of the {@code aSmallTestStruct10} field. */
    public SmallTestStruct10 aSmallTestStruct10() { return naSmallTestStruct10(address()); }

    /** Copies the specified {@link SmallTestStruct1} to the {@code aSmallTestStruct1} field. */
    public MediumTestStruct3 aSmallTestStruct1(SmallTestStruct1 value) { naSmallTestStruct1(address(), value); return this; }
    /** Passes the {@code aSmallTestStruct1} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct3 aSmallTestStruct1(java.util.function.Consumer<SmallTestStruct1> consumer) { consumer.accept(aSmallTestStruct1()); return this; }
    /** Copies the specified {@link SmallTestStruct2} to the {@code aSmallTestStruct2} field. */
    public MediumTestStruct3 aSmallTestStruct2(SmallTestStruct2 value) { naSmallTestStruct2(address(), value); return this; }
    /** Passes the {@code aSmallTestStruct2} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct3 aSmallTestStruct2(java.util.function.Consumer<SmallTestStruct2> consumer) { consumer.accept(aSmallTestStruct2()); return this; }
    /** Copies the specified {@link SmallTestStruct3} to the {@code aSmallTestStruct3} field. */
    public MediumTestStruct3 aSmallTestStruct3(SmallTestStruct3 value) { naSmallTestStruct3(address(), value); return this; }
    /** Passes the {@code aSmallTestStruct3} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct3 aSmallTestStruct3(java.util.function.Consumer<SmallTestStruct3> consumer) { consumer.accept(aSmallTestStruct3()); return this; }
    /** Copies the specified {@link SmallTestStruct4} to the {@code aSmallTestStruct4} field. */
    public MediumTestStruct3 aSmallTestStruct4(SmallTestStruct4 value) { naSmallTestStruct4(address(), value); return this; }
    /** Passes the {@code aSmallTestStruct4} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct3 aSmallTestStruct4(java.util.function.Consumer<SmallTestStruct4> consumer) { consumer.accept(aSmallTestStruct4()); return this; }
    /** Copies the specified {@link SmallTestStruct5} to the {@code aSmallTestStruct5} field. */
    public MediumTestStruct3 aSmallTestStruct5(SmallTestStruct5 value) { naSmallTestStruct5(address(), value); return this; }
    /** Passes the {@code aSmallTestStruct5} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct3 aSmallTestStruct5(java.util.function.Consumer<SmallTestStruct5> consumer) { consumer.accept(aSmallTestStruct5()); return this; }
    /** Copies the specified {@link SmallTestStruct6} to the {@code aSmallTestStruct6} field. */
    public MediumTestStruct3 aSmallTestStruct6(SmallTestStruct6 value) { naSmallTestStruct6(address(), value); return this; }
    /** Passes the {@code aSmallTestStruct6} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct3 aSmallTestStruct6(java.util.function.Consumer<SmallTestStruct6> consumer) { consumer.accept(aSmallTestStruct6()); return this; }
    /** Copies the specified {@link SmallTestStruct7} to the {@code aSmallTestStruct7} field. */
    public MediumTestStruct3 aSmallTestStruct7(SmallTestStruct7 value) { naSmallTestStruct7(address(), value); return this; }
    /** Passes the {@code aSmallTestStruct7} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct3 aSmallTestStruct7(java.util.function.Consumer<SmallTestStruct7> consumer) { consumer.accept(aSmallTestStruct7()); return this; }
    /** Copies the specified {@link SmallTestStruct8} to the {@code aSmallTestStruct8} field. */
    public MediumTestStruct3 aSmallTestStruct8(SmallTestStruct8 value) { naSmallTestStruct8(address(), value); return this; }
    /** Passes the {@code aSmallTestStruct8} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct3 aSmallTestStruct8(java.util.function.Consumer<SmallTestStruct8> consumer) { consumer.accept(aSmallTestStruct8()); return this; }
    /** Copies the specified {@link SmallTestStruct9} to the {@code aSmallTestStruct9} field. */
    public MediumTestStruct3 aSmallTestStruct9(SmallTestStruct9 value) { naSmallTestStruct9(address(), value); return this; }
    /** Passes the {@code aSmallTestStruct9} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct3 aSmallTestStruct9(java.util.function.Consumer<SmallTestStruct9> consumer) { consumer.accept(aSmallTestStruct9()); return this; }
    /** Copies the specified {@link SmallTestStruct10} to the {@code aSmallTestStruct10} field. */
    public MediumTestStruct3 aSmallTestStruct10(SmallTestStruct10 value) { naSmallTestStruct10(address(), value); return this; }
    /** Passes the {@code aSmallTestStruct10} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct3 aSmallTestStruct10(java.util.function.Consumer<SmallTestStruct10> consumer) { consumer.accept(aSmallTestStruct10()); return this; }

    /** Initializes this struct with the specified values. */
    public MediumTestStruct3 set(
        SmallTestStruct1 aSmallTestStruct1,
        SmallTestStruct2 aSmallTestStruct2,
        SmallTestStruct3 aSmallTestStruct3,
        SmallTestStruct4 aSmallTestStruct4,
        SmallTestStruct5 aSmallTestStruct5,
        SmallTestStruct6 aSmallTestStruct6,
        SmallTestStruct7 aSmallTestStruct7,
        SmallTestStruct8 aSmallTestStruct8,
        SmallTestStruct9 aSmallTestStruct9,
        SmallTestStruct10 aSmallTestStruct10
    ) {
        aSmallTestStruct1(aSmallTestStruct1);
        aSmallTestStruct2(aSmallTestStruct2);
        aSmallTestStruct3(aSmallTestStruct3);
        aSmallTestStruct4(aSmallTestStruct4);
        aSmallTestStruct5(aSmallTestStruct5);
        aSmallTestStruct6(aSmallTestStruct6);
        aSmallTestStruct7(aSmallTestStruct7);
        aSmallTestStruct8(aSmallTestStruct8);
        aSmallTestStruct9(aSmallTestStruct9);
        aSmallTestStruct10(aSmallTestStruct10);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MediumTestStruct3 set(MediumTestStruct3 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MediumTestStruct3} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MediumTestStruct3 malloc() {
        return new MediumTestStruct3(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MediumTestStruct3} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MediumTestStruct3 calloc() {
        return new MediumTestStruct3(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MediumTestStruct3} instance allocated with {@link BufferUtils}. */
    public static MediumTestStruct3 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MediumTestStruct3(memAddress(container), container);
    }

    /** Returns a new {@code MediumTestStruct3} instance for the specified memory address. */
    public static MediumTestStruct3 create(long address) {
        return new MediumTestStruct3(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable MediumTestStruct3 createSafe(long address) {
        return address == NULL ? null : new MediumTestStruct3(address, null);
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
     * Returns a new {@code MediumTestStruct3} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MediumTestStruct3 malloc(MemoryStack stack) {
        return new MediumTestStruct3(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MediumTestStruct3} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MediumTestStruct3 calloc(MemoryStack stack) {
        return new MediumTestStruct3(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /** Unsafe version of {@link #aSmallTestStruct1}. */
    public static SmallTestStruct1 naSmallTestStruct1(long struct) { return SmallTestStruct1.create(struct + MediumTestStruct3.ASMALLTESTSTRUCT1); }
    /** Unsafe version of {@link #aSmallTestStruct2}. */
    public static SmallTestStruct2 naSmallTestStruct2(long struct) { return SmallTestStruct2.create(struct + MediumTestStruct3.ASMALLTESTSTRUCT2); }
    /** Unsafe version of {@link #aSmallTestStruct3}. */
    public static SmallTestStruct3 naSmallTestStruct3(long struct) { return SmallTestStruct3.create(struct + MediumTestStruct3.ASMALLTESTSTRUCT3); }
    /** Unsafe version of {@link #aSmallTestStruct4}. */
    public static SmallTestStruct4 naSmallTestStruct4(long struct) { return SmallTestStruct4.create(struct + MediumTestStruct3.ASMALLTESTSTRUCT4); }
    /** Unsafe version of {@link #aSmallTestStruct5}. */
    public static SmallTestStruct5 naSmallTestStruct5(long struct) { return SmallTestStruct5.create(struct + MediumTestStruct3.ASMALLTESTSTRUCT5); }
    /** Unsafe version of {@link #aSmallTestStruct6}. */
    public static SmallTestStruct6 naSmallTestStruct6(long struct) { return SmallTestStruct6.create(struct + MediumTestStruct3.ASMALLTESTSTRUCT6); }
    /** Unsafe version of {@link #aSmallTestStruct7}. */
    public static SmallTestStruct7 naSmallTestStruct7(long struct) { return SmallTestStruct7.create(struct + MediumTestStruct3.ASMALLTESTSTRUCT7); }
    /** Unsafe version of {@link #aSmallTestStruct8}. */
    public static SmallTestStruct8 naSmallTestStruct8(long struct) { return SmallTestStruct8.create(struct + MediumTestStruct3.ASMALLTESTSTRUCT8); }
    /** Unsafe version of {@link #aSmallTestStruct9}. */
    public static SmallTestStruct9 naSmallTestStruct9(long struct) { return SmallTestStruct9.create(struct + MediumTestStruct3.ASMALLTESTSTRUCT9); }
    /** Unsafe version of {@link #aSmallTestStruct10}. */
    public static SmallTestStruct10 naSmallTestStruct10(long struct) { return SmallTestStruct10.create(struct + MediumTestStruct3.ASMALLTESTSTRUCT10); }

    /** Unsafe version of {@link #aSmallTestStruct1(SmallTestStruct1) aSmallTestStruct1}. */
    public static void naSmallTestStruct1(long struct, SmallTestStruct1 value) { memCopy(value.address(), struct + MediumTestStruct3.ASMALLTESTSTRUCT1, SmallTestStruct1.SIZEOF); }
    /** Unsafe version of {@link #aSmallTestStruct2(SmallTestStruct2) aSmallTestStruct2}. */
    public static void naSmallTestStruct2(long struct, SmallTestStruct2 value) { memCopy(value.address(), struct + MediumTestStruct3.ASMALLTESTSTRUCT2, SmallTestStruct2.SIZEOF); }
    /** Unsafe version of {@link #aSmallTestStruct3(SmallTestStruct3) aSmallTestStruct3}. */
    public static void naSmallTestStruct3(long struct, SmallTestStruct3 value) { memCopy(value.address(), struct + MediumTestStruct3.ASMALLTESTSTRUCT3, SmallTestStruct3.SIZEOF); }
    /** Unsafe version of {@link #aSmallTestStruct4(SmallTestStruct4) aSmallTestStruct4}. */
    public static void naSmallTestStruct4(long struct, SmallTestStruct4 value) { memCopy(value.address(), struct + MediumTestStruct3.ASMALLTESTSTRUCT4, SmallTestStruct4.SIZEOF); }
    /** Unsafe version of {@link #aSmallTestStruct5(SmallTestStruct5) aSmallTestStruct5}. */
    public static void naSmallTestStruct5(long struct, SmallTestStruct5 value) { memCopy(value.address(), struct + MediumTestStruct3.ASMALLTESTSTRUCT5, SmallTestStruct5.SIZEOF); }
    /** Unsafe version of {@link #aSmallTestStruct6(SmallTestStruct6) aSmallTestStruct6}. */
    public static void naSmallTestStruct6(long struct, SmallTestStruct6 value) { memCopy(value.address(), struct + MediumTestStruct3.ASMALLTESTSTRUCT6, SmallTestStruct6.SIZEOF); }
    /** Unsafe version of {@link #aSmallTestStruct7(SmallTestStruct7) aSmallTestStruct7}. */
    public static void naSmallTestStruct7(long struct, SmallTestStruct7 value) { memCopy(value.address(), struct + MediumTestStruct3.ASMALLTESTSTRUCT7, SmallTestStruct7.SIZEOF); }
    /** Unsafe version of {@link #aSmallTestStruct8(SmallTestStruct8) aSmallTestStruct8}. */
    public static void naSmallTestStruct8(long struct, SmallTestStruct8 value) { memCopy(value.address(), struct + MediumTestStruct3.ASMALLTESTSTRUCT8, SmallTestStruct8.SIZEOF); }
    /** Unsafe version of {@link #aSmallTestStruct9(SmallTestStruct9) aSmallTestStruct9}. */
    public static void naSmallTestStruct9(long struct, SmallTestStruct9 value) { memCopy(value.address(), struct + MediumTestStruct3.ASMALLTESTSTRUCT9, SmallTestStruct9.SIZEOF); }
    /** Unsafe version of {@link #aSmallTestStruct10(SmallTestStruct10) aSmallTestStruct10}. */
    public static void naSmallTestStruct10(long struct, SmallTestStruct10 value) { memCopy(value.address(), struct + MediumTestStruct3.ASMALLTESTSTRUCT10, SmallTestStruct10.SIZEOF); }

    // -----------------------------------

    /** An array of {@link MediumTestStruct3} structs. */
    public static class Buffer extends StructBuffer<MediumTestStruct3, Buffer> implements NativeResource {

        private static final MediumTestStruct3 ELEMENT_FACTORY = MediumTestStruct3.create(-1L);

        /**
         * Creates a new {@code MediumTestStruct3.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MediumTestStruct3#SIZEOF}, and its mark will be undefined.</p>
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
        protected MediumTestStruct3 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link SmallTestStruct1} view of the {@code aSmallTestStruct1} field. */
        public SmallTestStruct1 aSmallTestStruct1() { return MediumTestStruct3.naSmallTestStruct1(address()); }
        /** @return a {@link SmallTestStruct2} view of the {@code aSmallTestStruct2} field. */
        public SmallTestStruct2 aSmallTestStruct2() { return MediumTestStruct3.naSmallTestStruct2(address()); }
        /** @return a {@link SmallTestStruct3} view of the {@code aSmallTestStruct3} field. */
        public SmallTestStruct3 aSmallTestStruct3() { return MediumTestStruct3.naSmallTestStruct3(address()); }
        /** @return a {@link SmallTestStruct4} view of the {@code aSmallTestStruct4} field. */
        public SmallTestStruct4 aSmallTestStruct4() { return MediumTestStruct3.naSmallTestStruct4(address()); }
        /** @return a {@link SmallTestStruct5} view of the {@code aSmallTestStruct5} field. */
        public SmallTestStruct5 aSmallTestStruct5() { return MediumTestStruct3.naSmallTestStruct5(address()); }
        /** @return a {@link SmallTestStruct6} view of the {@code aSmallTestStruct6} field. */
        public SmallTestStruct6 aSmallTestStruct6() { return MediumTestStruct3.naSmallTestStruct6(address()); }
        /** @return a {@link SmallTestStruct7} view of the {@code aSmallTestStruct7} field. */
        public SmallTestStruct7 aSmallTestStruct7() { return MediumTestStruct3.naSmallTestStruct7(address()); }
        /** @return a {@link SmallTestStruct8} view of the {@code aSmallTestStruct8} field. */
        public SmallTestStruct8 aSmallTestStruct8() { return MediumTestStruct3.naSmallTestStruct8(address()); }
        /** @return a {@link SmallTestStruct9} view of the {@code aSmallTestStruct9} field. */
        public SmallTestStruct9 aSmallTestStruct9() { return MediumTestStruct3.naSmallTestStruct9(address()); }
        /** @return a {@link SmallTestStruct10} view of the {@code aSmallTestStruct10} field. */
        public SmallTestStruct10 aSmallTestStruct10() { return MediumTestStruct3.naSmallTestStruct10(address()); }

        /** Copies the specified {@link SmallTestStruct1} to the {@code aSmallTestStruct1} field. */
        public Buffer aSmallTestStruct1(SmallTestStruct1 value) { MediumTestStruct3.naSmallTestStruct1(address(), value); return this; }
        /** Passes the {@code aSmallTestStruct1} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer aSmallTestStruct1(java.util.function.Consumer<SmallTestStruct1> consumer) { consumer.accept(aSmallTestStruct1()); return this; }
        /** Copies the specified {@link SmallTestStruct2} to the {@code aSmallTestStruct2} field. */
        public Buffer aSmallTestStruct2(SmallTestStruct2 value) { MediumTestStruct3.naSmallTestStruct2(address(), value); return this; }
        /** Passes the {@code aSmallTestStruct2} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer aSmallTestStruct2(java.util.function.Consumer<SmallTestStruct2> consumer) { consumer.accept(aSmallTestStruct2()); return this; }
        /** Copies the specified {@link SmallTestStruct3} to the {@code aSmallTestStruct3} field. */
        public Buffer aSmallTestStruct3(SmallTestStruct3 value) { MediumTestStruct3.naSmallTestStruct3(address(), value); return this; }
        /** Passes the {@code aSmallTestStruct3} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer aSmallTestStruct3(java.util.function.Consumer<SmallTestStruct3> consumer) { consumer.accept(aSmallTestStruct3()); return this; }
        /** Copies the specified {@link SmallTestStruct4} to the {@code aSmallTestStruct4} field. */
        public Buffer aSmallTestStruct4(SmallTestStruct4 value) { MediumTestStruct3.naSmallTestStruct4(address(), value); return this; }
        /** Passes the {@code aSmallTestStruct4} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer aSmallTestStruct4(java.util.function.Consumer<SmallTestStruct4> consumer) { consumer.accept(aSmallTestStruct4()); return this; }
        /** Copies the specified {@link SmallTestStruct5} to the {@code aSmallTestStruct5} field. */
        public Buffer aSmallTestStruct5(SmallTestStruct5 value) { MediumTestStruct3.naSmallTestStruct5(address(), value); return this; }
        /** Passes the {@code aSmallTestStruct5} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer aSmallTestStruct5(java.util.function.Consumer<SmallTestStruct5> consumer) { consumer.accept(aSmallTestStruct5()); return this; }
        /** Copies the specified {@link SmallTestStruct6} to the {@code aSmallTestStruct6} field. */
        public Buffer aSmallTestStruct6(SmallTestStruct6 value) { MediumTestStruct3.naSmallTestStruct6(address(), value); return this; }
        /** Passes the {@code aSmallTestStruct6} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer aSmallTestStruct6(java.util.function.Consumer<SmallTestStruct6> consumer) { consumer.accept(aSmallTestStruct6()); return this; }
        /** Copies the specified {@link SmallTestStruct7} to the {@code aSmallTestStruct7} field. */
        public Buffer aSmallTestStruct7(SmallTestStruct7 value) { MediumTestStruct3.naSmallTestStruct7(address(), value); return this; }
        /** Passes the {@code aSmallTestStruct7} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer aSmallTestStruct7(java.util.function.Consumer<SmallTestStruct7> consumer) { consumer.accept(aSmallTestStruct7()); return this; }
        /** Copies the specified {@link SmallTestStruct8} to the {@code aSmallTestStruct8} field. */
        public Buffer aSmallTestStruct8(SmallTestStruct8 value) { MediumTestStruct3.naSmallTestStruct8(address(), value); return this; }
        /** Passes the {@code aSmallTestStruct8} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer aSmallTestStruct8(java.util.function.Consumer<SmallTestStruct8> consumer) { consumer.accept(aSmallTestStruct8()); return this; }
        /** Copies the specified {@link SmallTestStruct9} to the {@code aSmallTestStruct9} field. */
        public Buffer aSmallTestStruct9(SmallTestStruct9 value) { MediumTestStruct3.naSmallTestStruct9(address(), value); return this; }
        /** Passes the {@code aSmallTestStruct9} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer aSmallTestStruct9(java.util.function.Consumer<SmallTestStruct9> consumer) { consumer.accept(aSmallTestStruct9()); return this; }
        /** Copies the specified {@link SmallTestStruct10} to the {@code aSmallTestStruct10} field. */
        public Buffer aSmallTestStruct10(SmallTestStruct10 value) { MediumTestStruct3.naSmallTestStruct10(address(), value); return this; }
        /** Passes the {@code aSmallTestStruct10} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer aSmallTestStruct10(java.util.function.Consumer<SmallTestStruct10> consumer) { consumer.accept(aSmallTestStruct10()); return this; }

    }

}