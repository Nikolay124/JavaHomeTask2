public class TextCleaner {
    public static String removeEmptyLines(String input) {
        String[] lines = input.split("\n");
        StringBuilder result = new StringBuilder();
        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                if (result.length() > 0) {
                    result.append('\n');
                }
                result.append(line);
            }
        }
        return result.toString();
    }
}
