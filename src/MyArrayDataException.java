public class MyArrayDataException extends Exception {
    private int stringNumber;
    private int columnNumber;

    public MyArrayDataException(String message, int stringNumber, int columnNumber) {
        super(message);
        this.stringNumber = stringNumber;
        this.columnNumber = columnNumber;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }
}
