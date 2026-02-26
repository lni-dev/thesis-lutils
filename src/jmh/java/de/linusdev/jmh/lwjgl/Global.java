package de.linusdev.jmh.lwjgl;

import de.linusdev.lutils.result.BiResult;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Struct;

import java.nio.ByteBuffer;
import java.util.function.Function;

public class Global {

    public static <T extends Struct<?>> BiResult<ByteBuffer, T> allocate(int size, Function<ByteBuffer, T> creator) {
        ByteBuffer mem = MemoryUtil.memAlloc(size);
        return new BiResult<>(mem, creator.apply(mem));
    }

}
