package org.example;

public class Block {
    int width;
    int length;
    int hight;

    public Block(int[] sides) {
        width = sides[0];
        length = sides[1];
        hight = sides[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHight() {
        return hight;
    }

    public Block(int width, int length, int high) {
        this.width = width;
        this.length = length;
        this.hight = high;
    }

    public int getVolume() {
        return length * hight * width;
    }

    public int getSurfaceArea() {
        return 2 * length * width + 2 * width * hight + 2 * length * hight;
    }

}
