package exercise;

public class ReversedSequence implements CharSequence {
    final String original;

    public ReversedSequence(String original) {
        this.original = original;
    }
    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end > length() || start > end) {
            throw new IndexOutOfBoundsException();
        }
        StringBuilder sb = new StringBuilder();
        for (var i = end; i > start; i--) {
            sb.append(original.charAt(i));
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = length() - 1; i >= 0; i--) {
            sb.append(original.charAt(i));
        }
        return sb.toString();
    }

    @Override
    public int length() {
        return original.length();
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= length()) {
            throw new IndexOutOfBoundsException();
        }
        return original.charAt(length() - 1 - index);
    }
}
