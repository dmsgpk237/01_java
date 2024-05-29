package com.dmsgpk.api.string;

public class StringProcess {
    public String preChar(String hw) {

        System.out.println(hw);
        String[] sarr = hw.split("");
        sarr[0] = sarr[0].toUpperCase();

        String result = sarr[0].concat(sarr[1]).concat(sarr[2]).concat(sarr[3])
                .concat(sarr[4]).concat(sarr[5]).concat(sarr[6]).concat(sarr[7])
                .concat(sarr[8]).concat(sarr[9]).concat(sarr[10]);

        return result;
    }


    public int charSu(String str, char ch) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

                if (str.charAt(i) == ch) {
                    count++;
                    System.out.println("ch와 같은 문자를 찾았습니다. count 증가 : " + count);

                }

        }

        return (int) count;
    }

}
