package de.linusdev.jmh.ffma;

import de.linusdev.jmh.Common;
import de.linusdev.jmh.MyRandom;
import de.linusdev.jmh.structs.ffma.generated.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.profile.GCProfiler;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.concurrent.TimeUnit;

import static de.linusdev.jmh.Constants.*;
import static de.linusdev.jmh.Helper.mustBeEquals;
import static de.linusdev.jmh.Main.fixBenchmarkName;

@BenchmarkMode(Mode.SingleShotTime)
@Fork(value = B10_FORKS)
@Warmup(iterations = B10_WARMUP_ITERATIONS)
@Measurement(iterations = B10_MEASUREMENT_ITERATIONS)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@State(value = Scope.Benchmark)
public class Benchmark10 {

    @Setup
    public void setup() {
    }

    public MyRandom random = new MyRandom(B9_RANDOM_SEED);
    public byte[][] byteValues = random.getBytes(10, 600);
    public short[][] shortValues = random.getShorts(10, 600);
    public int[][] intValues = random.getInts(10, 600);
    public long[][] longValues = random.getLongs(10, 600);
    public float[][] floatValues = random.getFloats(10, 600);
    public byte[][] byteArray = random.getBytes(20, 600);

    public long[][] long2Values = random.getLongs(3, 1200);
    public int[] int2Values = random.getInts(100000);

    @Benchmark
    public void benchmark(Blackhole bh) {
        Arena arena = Arena.ofConfined();

        MemorySegment struct1 = arena.allocate(LargeTestStruct1.LAYOUT);

        for (int i = 0; i < 600; i++) {
            MemorySegment struct = LargeTestStruct1.mediumTestStruct1ArrayAccessor(struct1, i);

            MediumTestStruct1.aLongHandle.set(struct, 0L, longValues[i][0]);
            MediumTestStruct1.aSecondLongHandle.set(struct, 0L, longValues[i][1]);
            MediumTestStruct1.aThirdLongHandle.set(struct, 0L, longValues[i][2]);
            MediumTestStruct1.aInt4Handle.set(struct, 0L, 0L, intValues[i][0]);
            MediumTestStruct1.aInt4Handle.set(struct, 0L, 1L, intValues[i][1]);
            MediumTestStruct1.aInt4Handle.set(struct, 0L, 2L, intValues[i][2]);
            MediumTestStruct1.aInt4Handle.set(struct, 0L, 3L, intValues[i][3]);
            MediumTestStruct1.aShortHandle.set(struct, 0L, shortValues[i][0]);

            var aSubStruct = MediumTestStruct1.aSubStructAccessor(struct);
            SmallTestStruct1.aIntHandle.set(aSubStruct, 0L, intValues[i][4]);
            SmallTestStruct1.aFloatHandle.set(aSubStruct, 0L, floatValues[i][0]);
            SmallTestStruct1.aIntVec4Handle.set(aSubStruct, 0L, 0L, intValues[i][5]);
            SmallTestStruct1.aIntVec4Handle.set(aSubStruct, 0L, 1L, intValues[i][6]);
            SmallTestStruct1.aIntVec4Handle.set(aSubStruct, 0L, 2L, intValues[i][7]);
            SmallTestStruct1.aIntVec4Handle.set(aSubStruct, 0L, 3L, intValues[i][8]);

            var aSecondSubStruct = MediumTestStruct1.aSecondSubStructAccessor(struct);
            SmallTestStruct2.aIntHandle.set(aSecondSubStruct, 0L, intValues[i][9]);
            SmallTestStruct2.aLongHandle.set(aSecondSubStruct, 0L, longValues[i][3]);
            SmallTestStruct2.aByteHandle.set(aSecondSubStruct, 0L, byteValues[i][0]);

            struct.asSlice(MediumTestStruct1.LAYOUT.byteOffset(MediumTestStruct1.aByteArray), byteArray[i].length).copyFrom(
                    MemorySegment.ofArray(byteArray[i])
            );
        }

        for (int i = 0; i < 1200; i++) {
            MemorySegment struct = LargeTestStruct1.smallTestStruct3ArrayAccessor(struct1, i);


            SmallTestStruct3.aLongHandle.set(struct, 0L, long2Values[i][0]);
            SmallTestStruct3.aSecondLongHandle.set(struct, 0L, long2Values[i][1]);
            SmallTestStruct3.aThirdLongHandle.set(struct, 0L, long2Values[i][2]);
        }

        for (int i = 0; i < 100000; i++) {
            LargeTestStruct1.intArrayHandle.set(struct1, 0L, (long) i, int2Values[i]);
        }



        for (int i = 0; i < 600; i++) {
            MemorySegment struct = LargeTestStruct1.mediumTestStruct1ArrayAccessor(struct1, i);

            mustBeEquals(MediumTestStruct1.aLongHandle.get(struct, 0L), longValues[i][0]);
            mustBeEquals(MediumTestStruct1.aSecondLongHandle.get(struct, 0L), longValues[i][1]);
            mustBeEquals(MediumTestStruct1.aThirdLongHandle.get(struct, 0L), longValues[i][2]);
            mustBeEquals(MediumTestStruct1.aInt4Handle.get(struct, 0L, 0L), intValues[i][0]);
            mustBeEquals(MediumTestStruct1.aInt4Handle.get(struct, 0L, 1L), intValues[i][1]);
            mustBeEquals(MediumTestStruct1.aInt4Handle.get(struct, 0L, 2L), intValues[i][2]);
            mustBeEquals(MediumTestStruct1.aInt4Handle.get(struct, 0L, 3L), intValues[i][3]);
            mustBeEquals(MediumTestStruct1.aShortHandle.get(struct, 0L), shortValues[i][0]);

            var aSubStruct = MediumTestStruct1.aSubStructAccessor(struct);
            mustBeEquals(SmallTestStruct1.aIntHandle.get(aSubStruct, 0L), intValues[i][4]);
            mustBeEquals(SmallTestStruct1.aFloatHandle.get(aSubStruct, 0L), floatValues[i][0]);
            mustBeEquals(SmallTestStruct1.aIntVec4Handle.get(aSubStruct, 0L, 0L), intValues[i][5]);
            mustBeEquals(SmallTestStruct1.aIntVec4Handle.get(aSubStruct, 0L, 1L), intValues[i][6]);
            mustBeEquals(SmallTestStruct1.aIntVec4Handle.get(aSubStruct, 0L, 2L), intValues[i][7]);
            mustBeEquals(SmallTestStruct1.aIntVec4Handle.get(aSubStruct, 0L, 3L), intValues[i][8]);

            var aSecondSubStruct = MediumTestStruct1.aSecondSubStructAccessor(struct);
            mustBeEquals(SmallTestStruct2.aIntHandle.get(aSecondSubStruct, 0L), intValues[i][9]);
            mustBeEquals(SmallTestStruct2.aLongHandle.get(aSecondSubStruct, 0L), longValues[i][3]);
            mustBeEquals(SmallTestStruct2.aByteHandle.get(aSecondSubStruct, 0L), byteValues[i][0]);

            for (int j = 0; j < 20; j++) {
                mustBeEquals(MediumTestStruct1.aByteArrayHandle.get(struct, 0L, (long) j), byteArray[i][j]);
            }
        }

        for (int i = 0; i < 1200; i++) {
            MemorySegment struct = LargeTestStruct1.smallTestStruct3ArrayAccessor(struct1, i);

            mustBeEquals( SmallTestStruct3.aLongHandle.get(struct, 0L), long2Values[i][0]);
            mustBeEquals(SmallTestStruct3.aSecondLongHandle.get(struct, 0L), long2Values[i][1]);
            mustBeEquals(SmallTestStruct3.aThirdLongHandle.get(struct, 0L), long2Values[i][2]);
        }

        for (int i = 0; i < 100000; i++) {
            mustBeEquals(LargeTestStruct1.intArrayHandle.get(struct1, 0L, (long) i), int2Values[i]);
        }


        arena.close();
    }

    @TearDown
    public void teardown() {

    }

    public static void main(String[] args) throws RunnerException {
        // Do setup before everything, so the async profiler can be initialized
        Common.setup();
        Class<?> selfClazz = Benchmark10.class;
        Common.runBenchmark(selfClazz, SINGLE_DO_GC);
    }

}
