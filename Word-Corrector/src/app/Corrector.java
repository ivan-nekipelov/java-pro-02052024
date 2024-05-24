package app;

public class Corrector {

    public String handleData(String[] strs) {
        final var stringBuilder = new StringBuilder();
        int count = 0;
        for (String str : strs) {
            if (str.contains("b")) {
                str = str.replace("b", "o");
            }
            count += 1;
            stringBuilder.append(count).append(") ").append(str).append("\n");
        }
        return stringBuilder.toString();
    }
}
