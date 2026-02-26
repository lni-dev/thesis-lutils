package de.linusdev.jmh;

import java.util.Random;

public class MyRandom {

    private final Random random;

    public MyRandom(long seed) {
        this.random = new Random(seed);
    }

    public short getShort() {
        return (short) random.nextInt(Short.MIN_VALUE, Short.MAX_VALUE + 1);
    }

    public short[] getShorts(int length) {
        short[] array = new short[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = getShort();
        }
        return array;
    }

    public short[][] getShorts(int length, int times) {
        short[][] array = new short[times][length];
        for (int i = 0; i < times; i++) {
            array[i] = getShorts(length);
        }
        return array;
    }

    public int getInt() {
        return random.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int[] getInts(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = getInt();
        }
        return array;
    }

    public int[][] getInts(int length, int times) {
        int[][] array = new int[times][length];
        for (int i = 0; i < times; i++) {
            array[i] = getInts(length);
        }
        return array;
    }

    public long getLong() {
        return random.nextLong(Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public long[] getLongs(int length) {
        long[] array = new long[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = getLong();
        }
        return array;
    }

    public long[][] getLongs(int length, int times) {
        long[][] array = new long[times][length];
        for (int i = 0; i < times; i++) {
            array[i] = getLongs(length);
        }
        return array;
    }

    public byte[] getBytes(int length) {
        byte[] array = new byte[length];
        random.nextBytes(array);
        return array;
    }

    public byte[][] getBytes(int length, int times) {
        byte[][] array = new byte[times][length];
        for (int i = 0; i < times; i++) {
            array[i] = getBytes(length);
        }
        return array;
    }

    public float getFloat() {
        return random.nextFloat();
    }

    public float[] getFloats(int length) {
        float[] array = new float[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = getFloat();
        }
        return array;
    }

    public float[][] getFloats(int length, int times) {
        float[][] array = new float[times][length];
        for (int i = 0; i < times; i++) {
            array[i] = getFloats(length);
        }
        return array;
    }

    public double getDouble() {
        return random.nextDouble();
    }

    public double[] getDoubles(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = getDouble();
        }
        return array;
    }

    public double[][] getDoubles(int length, int times) {
        double[][] array = new double[times][length];
        for (int i = 0; i < times; i++) {
            array[i] = getDoubles(length);
        }
        return array;
    }
}
