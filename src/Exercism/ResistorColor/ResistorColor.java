package Exercism.ResistorColor;

public class ResistorColor {
    String[] colourArray = {"Black",
            "Brown",
            "Red",
            "Orange",
            "Yellow",
            "Green:",
            "Blue",
            "Violet:",
            "Grey:",
            "White:"};

    int colorCode(String color) {
        int index = 0;
        for (int i = 0; i < colourArray.length; i++) {
            if (color.equalsIgnoreCase(colourArray[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

    String[] colors() {
        return colourArray;
    }
}
