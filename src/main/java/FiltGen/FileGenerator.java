package FiltGen;

public abstract class FileGenerator {
    static final String PATHCREATE = "C:\\Users\\Korepanov\\Desktop\\1";

    public static long convertByte(String size) {
        String intSize = size.replaceAll("[\\.,]\\d+", "");
        Long result = Long.valueOf(intSize) * 1048576;
        if (size.contains(".") || size.contains(",")) {
            String floatSize = size.replaceAll("\\d+[\\.,]", "0.");
            result += (long) (Double.valueOf(floatSize) * Math.pow(2, 20));
            return result;
        }
        return result;
    }
}
