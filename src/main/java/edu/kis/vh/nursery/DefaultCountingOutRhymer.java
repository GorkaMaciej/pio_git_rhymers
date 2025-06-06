package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int DEFAULT_CAPACITY = 12;
    private static final int EMPTY_VALUE = -1;
    private static final int FULL_VALUE = DEFAULT_CAPACITY - 1;

    private final int[] numbers = new int[DEFAULT_CAPACITY];
    private int total = EMPTY_VALUE;

    public int getTotal() {
		return total;
	}

	public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_VALUE;
    }

    public boolean isFull() {
        return total == FULL_VALUE;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_VALUE;
        return numbers[total--];
    }

}
