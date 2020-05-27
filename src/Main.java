public class Main {
    final static byte ARRAYBOUNDARY = 4;

    static String[][] strings = {
            {"123", "12", "234"},
            {"156", "645", "876", "0"},
            {"8", "8", "7", "0"},
            {"984", "98", "1", "5"}
    };

    public static void main(String[] args) {
        try {
            System.out.println(arraySum(strings));
        } catch (MyArraySizeException e) {
            System.out.println("Wrong boundaries. String №" + e.getStringNumber() + " length " + e.getColumnsCount() +
                    " strings " + e.getStringsCount());
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.out.println("Wrong data type in string " + (e.getStringNumber() + 1) + " column " + (e.getColumnNumber() + 1));
            e.printStackTrace();
        }
    }

    static int arraySum(String[][] s) throws MyArraySizeException, MyArrayDataException {
        int x = 0;
        if (s.length < ARRAYBOUNDARY) {
            throw new MyArraySizeException("Array boundaries exceeded", s.length, s[0].length, 1);
        }
        for (int i = 0; i < s.length; i++) {
            if (s[i].length < ARRAYBOUNDARY) {
                throw new MyArraySizeException("Array boundaries exceeded", s.length, s[0].length, i + 1);
            }
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                try {
                    x += Integer.parseInt(s[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Wrong data", i, j);
                }

            }
        }
        return x;
    }

}
