package ENUMS;

public enum Color {
    RED, BLUE, GREEN
}

class a {
    public static void main(String[] args) {
        Object[] objects = Color.class.getEnumConstants();
        Color[] c = Color.values();
        for (Color o : c) {
            System.out.println(o);
        }
        System.out.println();

    }
}
