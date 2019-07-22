package Anagrans;


import java.util.Optional;

public class Result {
    String twofer(String name) {
        return String.format("One for %s, one for me.",
                Optional.ofNullable(name).orElse("you"));
    }

    public static void main(String[] args) {
        Result r = new Result();
        System.out.println(r.twofer(null));
        System.out.println(r.twofer("Alice"));
    }
}

