/**
 * MIT License
 *
 * Copyright (c) 2018-2019 Nicholas Sylke
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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
