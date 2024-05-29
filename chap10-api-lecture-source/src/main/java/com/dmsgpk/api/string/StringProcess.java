package com.dmsgpk.api.string;

public class StringProcess {
    public String preChar(String hw) {

        System.out.println(hw);
        String[] sarr = hw.split("");
        System.out.println();

//       String sarr[] = hw.substring(0, 1);
//        sarr[1] = hw.substring(1);

        // 앞부분 자른 애를 대문자로 바꾸고 뒷 부분이랑 합쳐서 리턴해주면 됨
        for (int i = 0; i < sarr.length; i++) {
            System.out.println("sarr[" + i + "] : " + sarr[i]);
        }

        String c = sarr[0].toUpperCase();

        String result = c.concat(sarr[1]);

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
