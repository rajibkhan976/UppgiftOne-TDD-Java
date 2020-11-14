package ec.java.testdriven;

import java.util.Arrays;

public class UnitTest implements IIntArray {

    private int[] numArr;

    public UnitTest(int[] numArr) {
        this.numArr = numArr;
    }

    public int[] getNumArr() {
        return this.numArr;
    }

    @Override
    public double getAverage() {
        double sum = 0;
        double avg;
        for (int num: this.numArr) {
            sum += num;
        }
        avg = sum / this.numArr.length;
        return avg;
    }

    @Override
    public int[] findPositions(int val) {
        int counter = 0;
        for (int c = 0; c < this.numArr.length; c++) {
            if (this.numArr[c] == val) {
                counter++;
            }
        }
        int[] positionArr = new int[counter];
        counter = 0;
        for (int c = 0; c < this.numArr.length; c++) {
            if (this.numArr[c] == val) {
                positionArr[counter] = c;
                counter++;
            }
        }
        return positionArr;
    }

    @Override
    public void appendLast(int value) {
        this.numArr = Arrays.copyOf(this.numArr, this.numArr.length + 1);
        this.numArr[this.numArr.length - 1] = value;
    }

    @Override
    public void insertAt(int pos, int value) {
        if (!(pos < 0)) {
            if (pos < this.numArr.length) {
                for (int c = 0; c < this.numArr.length; c++) {
                    if (c == pos) {
                        this.numArr[c] = value;
                    }
                }
            } else {
                this.numArr = Arrays.copyOf(this.numArr, pos + 1);
                this.numArr[pos] = value;
            }
        }
    }

    @Override
    public int getAt(int pos) {
        int val = 0;
        if (!(pos < 0) && pos < this.numArr.length) {
            for (int c = 0; c < this.numArr.length; c++) {
                if (c == pos) {
                    val = this.numArr[c];
                }
            }
        }
        return val;
    }

    @Override
    public void setAt(int pos, int element) {
        if (!(pos < 0) && pos < this.numArr.length) {
            for (int c = 0; c < this.numArr.length; c++) {
                if (c == pos) {
                    this.numArr[c] = element;
                }
            }
        }
    }

    @Override
    public int deleteAt(int pos) {
        int val = 0;
        if (!(pos < 0) && pos < this.numArr.length) {
            for (int c = 0; c < this.numArr.length; c++) {
                if (c == pos) {
                    val = this.numArr[c];
                    this.numArr[c] = 0;
                }
            }
        }
        return val;
    }
}
