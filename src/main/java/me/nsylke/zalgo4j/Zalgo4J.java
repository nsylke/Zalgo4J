package me.nsylke.zalgo4j;

public class Zalgo4J {
    private static final char[] ZALGO_UP = {
            '̍', '̎', '̄', '̅',
            '̿', '̑', '̆', '̐',
            '͒', '͗', '͑', '̇',
            '̈', '̊', '͂', '̓',
            '̈́', '͊', '͋', '͌',
            '̃', '̂', '̌', '͐',
            '̀', '́', '̋', '̏',
            '̒', '̓', '̔', '̽',
            '̉', 'ͣ', 'ͤ', 'ͥ',
            'ͦ', 'ͧ', 'ͨ', 'ͩ',
            'ͪ', 'ͫ', 'ͬ', 'ͭ',
            'ͮ', 'ͯ', '̾', '͛',
            '͆', '̚'
    };

    private static final char[] ZALGO_MIDDLE = {
            '̕', '̛', '̀', '́',
            '͘', '̡', '̢', '̧',
            '̨', '̴', '̵', '̶',
            '͏', '͜', '͝', '͞',
            '͟', '͠', '͢', '̸',
            '̷', '͡', '҉'
    };

    private static final char[] ZALGO_DOWN = {
            '̖', '̗', '̘', '̙',
            '̜', '̝', '̞', '̟',
            '̠', '̤', '̥', '̦',
            '̩', '̪', '̫', '̬',
            '̭', '̮', '̯', '̰',
            '̱', '̲', '̳', '̹',
            '̺', '̻', '̼', 'ͅ',
            '͇', '͈', '͉', '͍',
            '͎', '͓', '͔', '͕',
            '͖', '͙', '͚', '̣'
    };

    private static int rand(int max) {
        return (int) Math.floor(Math.random() * max);
    }

    public static String zalgolize(String text) {
        String temp = "";

        for (int i = 0; i < text.length(); i++) {
            temp += text.charAt(i);

            for (int j = 0; j < (rand(8) / 2 + 1); j++) {
                temp += ZALGO_UP[(int) Math.floor(Math.random() * ZALGO_UP.length)];
            }

            for (int j = 0; j < (rand(6) / 2); j++) {
                temp += ZALGO_MIDDLE[(int) Math.floor(Math.random() * ZALGO_MIDDLE.length)];
            }

            for (int j = 0; j < (rand(8) / 2 + 1); j++) {
                temp += ZALGO_DOWN[(int) Math.floor(Math.random() * ZALGO_DOWN.length)];
            }
        }

        return temp;
    }
}
