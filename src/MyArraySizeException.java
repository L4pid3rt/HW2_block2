public class MyArraySizeException extends Exception {
    private int stringsCount;
    private int columnsCount;
    private int stringNumber;

    public MyArraySizeException(String message, int stringsCount, int columnsCount, int stringNumber) {
        super(message);
        this.stringsCount = stringsCount;
        this.columnsCount = columnsCount;
        this.stringNumber = stringNumber;
    }

    public int getStringsCount() {
        return stringsCount;
    }

    public int getColumnsCount() {
        return columnsCount;
    }

    public int getStringNumber() {
        return stringNumber;
    }
}
