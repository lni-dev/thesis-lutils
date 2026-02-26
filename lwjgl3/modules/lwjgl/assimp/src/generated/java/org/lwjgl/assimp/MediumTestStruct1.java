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
 * struct MediumTestStruct1 {
 *     int64_t aLong;
 *     int64_t aSecondLong;
 *     int64_t aThirdLong;
 *     int32_t aInt4[4];
 *     int16_t aShort;
 *     {@link SmallTestStruct1 SmallTestStruct1} aSubStruct;
 *     {@link SmallTestStruct2 SmallTestStruct2} aSecondSubStruct;
 *     int8_t aByteArray[20];
 * }}</pre>
 */
public class MediumTestStruct1 extends Struct<MediumTestStruct1> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALONG,
        ASECONDLONG,
        ATHIRDLONG,
        AINT4,
        ASHORT,
        ASUBSTRUCT,
        ASECONDSUBSTRUCT,
        ABYTEARRAY;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __array(4, 4),
            __member(2),
            __member(SmallTestStruct1.SIZEOF, SmallTestStruct1.ALIGNOF),
            __member(SmallTestStruct2.SIZEOF, SmallTestStruct2.ALIGNOF),
            __array(1, 20)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ALONG = layout.offsetof(0);
        ASECONDLONG = layout.offsetof(1);
        ATHIRDLONG = layout.offsetof(2);
        AINT4 = layout.offsetof(3);
        ASHORT = layout.offsetof(4);
        ASUBSTRUCT = layout.offsetof(5);
        ASECONDSUBSTRUCT = layout.offsetof(6);
        ABYTEARRAY = layout.offsetof(7);
    }

    protected MediumTestStruct1(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MediumTestStruct1 create(long address, @Nullable ByteBuffer container) {
        return new MediumTestStruct1(address, container);
    }

    /**
     * Creates a {@code MediumTestStruct1} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MediumTestStruct1(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code aLong} field. */
    @NativeType("int64_t")
    public long aLong() { return naLong(address()); }
    /** @return the value of the {@code aSecondLong} field. */
    @NativeType("int64_t")
    public long aSecondLong() { return naSecondLong(address()); }
    /** @return the value of the {@code aThirdLong} field. */
    @NativeType("int64_t")
    public long aThirdLong() { return naThirdLong(address()); }
    /** @return a {@link IntBuffer} view of the {@code aInt4} field. */
    @NativeType("int32_t[4]")
    public IntBuffer aInt4() { return naInt4(address()); }
    /** @return the value at the specified index of the {@code aInt4} field. */
    @NativeType("int32_t")
    public int aInt4(int index) { return naInt4(address(), index); }
    /** @return the value of the {@code aShort} field. */
    @NativeType("int16_t")
    public short aShort() { return naShort(address()); }
    /** @return a {@link SmallTestStruct1} view of the {@code aSubStruct} field. */
    public SmallTestStruct1 aSubStruct() { return naSubStruct(address()); }
    /** @return a {@link SmallTestStruct2} view of the {@code aSecondSubStruct} field. */
    public SmallTestStruct2 aSecondSubStruct() { return naSecondSubStruct(address()); }
    /** @return a {@link ByteBuffer} view of the {@code aByteArray} field. */
    @NativeType("int8_t[20]")
    public ByteBuffer aByteArray() { return naByteArray(address()); }
    /** @return the value at the specified index of the {@code aByteArray} field. */
    @NativeType("int8_t")
    public byte aByteArray(int index) { return naByteArray(address(), index); }

    /** Sets the specified value to the {@code aLong} field. */
    public MediumTestStruct1 aLong(@NativeType("int64_t") long value) { naLong(address(), value); return this; }
    /** Sets the specified value to the {@code aSecondLong} field. */
    public MediumTestStruct1 aSecondLong(@NativeType("int64_t") long value) { naSecondLong(address(), value); return this; }
    /** Sets the specified value to the {@code aThirdLong} field. */
    public MediumTestStruct1 aThirdLong(@NativeType("int64_t") long value) { naThirdLong(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code aInt4} field. */
    public MediumTestStruct1 aInt4(@NativeType("int32_t[4]") IntBuffer value) { naInt4(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code aInt4} field. */
    public MediumTestStruct1 aInt4(int index, @NativeType("int32_t") int value) { naInt4(address(), index, value); return this; }
    /** Sets the specified value to the {@code aShort} field. */
    public MediumTestStruct1 aShort(@NativeType("int16_t") short value) { naShort(address(), value); return this; }
    /** Copies the specified {@link SmallTestStruct1} to the {@code aSubStruct} field. */
    public MediumTestStruct1 aSubStruct(SmallTestStruct1 value) { naSubStruct(address(), value); return this; }
    /** Passes the {@code aSubStruct} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct1 aSubStruct(java.util.function.Consumer<SmallTestStruct1> consumer) { consumer.accept(aSubStruct()); return this; }
    /** Copies the specified {@link SmallTestStruct2} to the {@code aSecondSubStruct} field. */
    public MediumTestStruct1 aSecondSubStruct(SmallTestStruct2 value) { naSecondSubStruct(address(), value); return this; }
    /** Passes the {@code aSecondSubStruct} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MediumTestStruct1 aSecondSubStruct(java.util.function.Consumer<SmallTestStruct2> consumer) { consumer.accept(aSecondSubStruct()); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code aByteArray} field. */
    public MediumTestStruct1 aByteArray(@NativeType("int8_t[20]") ByteBuffer value) { naByteArray(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code aByteArray} field. */
    public MediumTestStruct1 aByteArray(int index, @NativeType("int8_t") byte value) { naByteArray(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public MediumTestStruct1 set(
        long aLong,
        long aSecondLong,
        long aThirdLong,
        IntBuffer aInt4,
        short aShort,
        SmallTestStruct1 aSubStruct,
        SmallTestStruct2 aSecondSubStruct,
        ByteBuffer aByteArray
    ) {
        aLong(aLong);
        aSecondLong(aSecondLong);
        aThirdLong(aThirdLong);
        aInt4(aInt4);
        aShort(aShort);
        aSubStruct(aSubStruct);
        aSecondSubStruct(aSecondSubStruct);
        aByteArray(aByteArray);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MediumTestStruct1 set(MediumTestStruct1 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MediumTestStruct1} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MediumTestStruct1 malloc() {
        return new MediumTestStruct1(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MediumTestStruct1} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MediumTestStruct1 calloc() {
        return new MediumTestStruct1(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MediumTestStruct1} instance allocated with {@link BufferUtils}. */
    public static MediumTestStruct1 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MediumTestStruct1(memAddress(container), container);
    }

    /** Returns a new {@code MediumTestStruct1} instance for the specified memory address. */
    public static MediumTestStruct1 create(long address) {
        return new MediumTestStruct1(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable MediumTestStruct1 createSafe(long address) {
        return address == NULL ? null : new MediumTestStruct1(address, null);
    }

    /**
     * Returns a new {@link MediumTestStruct1.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct1.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MediumTestStruct1.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct1.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MediumTestStruct1.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct1.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MediumTestStruct1.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct1.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static MediumTestStruct1.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code MediumTestStruct1} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MediumTestStruct1 malloc(MemoryStack stack) {
        return new MediumTestStruct1(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MediumTestStruct1} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MediumTestStruct1 calloc(MemoryStack stack) {
        return new MediumTestStruct1(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MediumTestStruct1.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct1.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MediumTestStruct1.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MediumTestStruct1.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aLong}. */
    public static long naLong(long struct) { return memGetLong(struct + MediumTestStruct1.ALONG); }
    /** Unsafe version of {@link #aSecondLong}. */
    public static long naSecondLong(long struct) { return memGetLong(struct + MediumTestStruct1.ASECONDLONG); }
    /** Unsafe version of {@link #aThirdLong}. */
    public static long naThirdLong(long struct) { return memGetLong(struct + MediumTestStruct1.ATHIRDLONG); }
    /** Unsafe version of {@link #aInt4}. */
    public static IntBuffer naInt4(long struct) { return memIntBuffer(struct + MediumTestStruct1.AINT4, 4); }
    /** Unsafe version of {@link #aInt4(int) aInt4}. */
    public static int naInt4(long struct, int index) {
        return memGetInt(struct + MediumTestStruct1.AINT4 + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #aShort}. */
    public static short naShort(long struct) { return memGetShort(struct + MediumTestStruct1.ASHORT); }
    /** Unsafe version of {@link #aSubStruct}. */
    public static SmallTestStruct1 naSubStruct(long struct) { return SmallTestStruct1.create(struct + MediumTestStruct1.ASUBSTRUCT); }
    /** Unsafe version of {@link #aSecondSubStruct}. */
    public static SmallTestStruct2 naSecondSubStruct(long struct) { return SmallTestStruct2.create(struct + MediumTestStruct1.ASECONDSUBSTRUCT); }
    /** Unsafe version of {@link #aByteArray}. */
    public static ByteBuffer naByteArray(long struct) { return memByteBuffer(struct + MediumTestStruct1.ABYTEARRAY, 20); }
    /** Unsafe version of {@link #aByteArray(int) aByteArray}. */
    public static byte naByteArray(long struct, int index) {
        return memGetByte(struct + MediumTestStruct1.ABYTEARRAY + check(index, 20) * 1);
    }

    /** Unsafe version of {@link #aLong(long) aLong}. */
    public static void naLong(long struct, long value) { memPutLong(struct + MediumTestStruct1.ALONG, value); }
    /** Unsafe version of {@link #aSecondLong(long) aSecondLong}. */
    public static void naSecondLong(long struct, long value) { memPutLong(struct + MediumTestStruct1.ASECONDLONG, value); }
    /** Unsafe version of {@link #aThirdLong(long) aThirdLong}. */
    public static void naThirdLong(long struct, long value) { memPutLong(struct + MediumTestStruct1.ATHIRDLONG, value); }
    /** Unsafe version of {@link #aInt4(IntBuffer) aInt4}. */
    public static void naInt4(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + MediumTestStruct1.AINT4, value.remaining() * 4);
    }
    /** Unsafe version of {@link #aInt4(int, int) aInt4}. */
    public static void naInt4(long struct, int index, int value) {
        memPutInt(struct + MediumTestStruct1.AINT4 + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #aShort(short) aShort}. */
    public static void naShort(long struct, short value) { memPutShort(struct + MediumTestStruct1.ASHORT, value); }
    /** Unsafe version of {@link #aSubStruct(SmallTestStruct1) aSubStruct}. */
    public static void naSubStruct(long struct, SmallTestStruct1 value) { memCopy(value.address(), struct + MediumTestStruct1.ASUBSTRUCT, SmallTestStruct1.SIZEOF); }
    /** Unsafe version of {@link #aSecondSubStruct(SmallTestStruct2) aSecondSubStruct}. */
    public static void naSecondSubStruct(long struct, SmallTestStruct2 value) { memCopy(value.address(), struct + MediumTestStruct1.ASECONDSUBSTRUCT, SmallTestStruct2.SIZEOF); }
    /** Unsafe version of {@link #aByteArray(ByteBuffer) aByteArray}. */
    public static void naByteArray(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 20); }
        memCopy(memAddress(value), struct + MediumTestStruct1.ABYTEARRAY, value.remaining() * 1);
    }
    /** Unsafe version of {@link #aByteArray(int, byte) aByteArray}. */
    public static void naByteArray(long struct, int index, byte value) {
        memPutByte(struct + MediumTestStruct1.ABYTEARRAY + check(index, 20) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link MediumTestStruct1} structs. */
    public static class Buffer extends StructBuffer<MediumTestStruct1, Buffer> implements NativeResource {

        private static final MediumTestStruct1 ELEMENT_FACTORY = MediumTestStruct1.create(-1L);

        /**
         * Creates a new {@code MediumTestStruct1.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MediumTestStruct1#SIZEOF}, and its mark will be undefined.</p>
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
        protected MediumTestStruct1 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code aLong} field. */
        @NativeType("int64_t")
        public long aLong() { return MediumTestStruct1.naLong(address()); }
        /** @return the value of the {@code aSecondLong} field. */
        @NativeType("int64_t")
        public long aSecondLong() { return MediumTestStruct1.naSecondLong(address()); }
        /** @return the value of the {@code aThirdLong} field. */
        @NativeType("int64_t")
        public long aThirdLong() { return MediumTestStruct1.naThirdLong(address()); }
        /** @return a {@link IntBuffer} view of the {@code aInt4} field. */
        @NativeType("int32_t[4]")
        public IntBuffer aInt4() { return MediumTestStruct1.naInt4(address()); }
        /** @return the value at the specified index of the {@code aInt4} field. */
        @NativeType("int32_t")
        public int aInt4(int index) { return MediumTestStruct1.naInt4(address(), index); }
        /** @return the value of the {@code aShort} field. */
        @NativeType("int16_t")
        public short aShort() { return MediumTestStruct1.naShort(address()); }
        /** @return a {@link SmallTestStruct1} view of the {@code aSubStruct} field. */
        public SmallTestStruct1 aSubStruct() { return MediumTestStruct1.naSubStruct(address()); }
        /** @return a {@link SmallTestStruct2} view of the {@code aSecondSubStruct} field. */
        public SmallTestStruct2 aSecondSubStruct() { return MediumTestStruct1.naSecondSubStruct(address()); }
        /** @return a {@link ByteBuffer} view of the {@code aByteArray} field. */
        @NativeType("int8_t[20]")
        public ByteBuffer aByteArray() { return MediumTestStruct1.naByteArray(address()); }
        /** @return the value at the specified index of the {@code aByteArray} field. */
        @NativeType("int8_t")
        public byte aByteArray(int index) { return MediumTestStruct1.naByteArray(address(), index); }

        /** Sets the specified value to the {@code aLong} field. */
        public MediumTestStruct1.Buffer aLong(@NativeType("int64_t") long value) { MediumTestStruct1.naLong(address(), value); return this; }
        /** Sets the specified value to the {@code aSecondLong} field. */
        public MediumTestStruct1.Buffer aSecondLong(@NativeType("int64_t") long value) { MediumTestStruct1.naSecondLong(address(), value); return this; }
        /** Sets the specified value to the {@code aThirdLong} field. */
        public MediumTestStruct1.Buffer aThirdLong(@NativeType("int64_t") long value) { MediumTestStruct1.naThirdLong(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code aInt4} field. */
        public MediumTestStruct1.Buffer aInt4(@NativeType("int32_t[4]") IntBuffer value) { MediumTestStruct1.naInt4(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code aInt4} field. */
        public MediumTestStruct1.Buffer aInt4(int index, @NativeType("int32_t") int value) { MediumTestStruct1.naInt4(address(), index, value); return this; }
        /** Sets the specified value to the {@code aShort} field. */
        public MediumTestStruct1.Buffer aShort(@NativeType("int16_t") short value) { MediumTestStruct1.naShort(address(), value); return this; }
        /** Copies the specified {@link SmallTestStruct1} to the {@code aSubStruct} field. */
        public MediumTestStruct1.Buffer aSubStruct(SmallTestStruct1 value) { MediumTestStruct1.naSubStruct(address(), value); return this; }
        /** Passes the {@code aSubStruct} field to the specified {@link java.util.function.Consumer Consumer}. */
        public MediumTestStruct1.Buffer aSubStruct(java.util.function.Consumer<SmallTestStruct1> consumer) { consumer.accept(aSubStruct()); return this; }
        /** Copies the specified {@link SmallTestStruct2} to the {@code aSecondSubStruct} field. */
        public MediumTestStruct1.Buffer aSecondSubStruct(SmallTestStruct2 value) { MediumTestStruct1.naSecondSubStruct(address(), value); return this; }
        /** Passes the {@code aSecondSubStruct} field to the specified {@link java.util.function.Consumer Consumer}. */
        public MediumTestStruct1.Buffer aSecondSubStruct(java.util.function.Consumer<SmallTestStruct2> consumer) { consumer.accept(aSecondSubStruct()); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code aByteArray} field. */
        public MediumTestStruct1.Buffer aByteArray(@NativeType("int8_t[20]") ByteBuffer value) { MediumTestStruct1.naByteArray(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code aByteArray} field. */
        public MediumTestStruct1.Buffer aByteArray(int index, @NativeType("int8_t") byte value) { MediumTestStruct1.naByteArray(address(), index, value); return this; }

    }

}