package Exercism.days;

class TwelveDays {
    String[] days = {"first", "second", "third",
            "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth",
            "tenth", "eleventh", "twelfth"};
    String[] gifts = {"twelve Drummers Drumming, ", "eleven Pipers Piping, ", "ten Lords-a-Leaping, ", "nine Ladies Dancing, ",
            "eight Maids-a-Milking, ", "seven Swans-a-Swimming, ", "six Geese-a-Laying, ", "five Gold Rings, ",
            "four Calling Birds, ", "three French Hens, ", "two Turtle Doves, ", "a Partridge in a Pear Tree.\n"};


    public static void main(String[] args) {
        TwelveDays twelveDays = new TwelveDays();
        System.out.println(twelveDays.verse(12));
    }

    private String sing() {
        return verses(1, 12);
    }

    private String verses(int startVerse, int stopVerse) {
        StringBuilder result = new StringBuilder();
        for (int i = startVerse; i <= stopVerse; i++) {
            if (i != stopVerse)
                result.append(verse(i)).append("\n");
            else
                result.append(verse(i));
        }
        return result.toString();
    }

    private String verse(int number) {
        StringBuilder lyrics = new StringBuilder(String.format("On the %s", days[number - 1] + " day of Christmas my true love gave to me: "));
        int wordIndex = gifts.length - number;
        if (wordIndex != gifts.length - 1)
            for (int j = wordIndex; j < gifts.length; j++) {
                if (j == gifts.length - 1) {
                    lyrics.append("and ").append(gifts[j]);
                } else {
                    lyrics.append(gifts[j]);
                }
            }
        else {
            lyrics.append(gifts[wordIndex]);
        }
        return lyrics.toString();
    }


}

