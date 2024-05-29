package com.dmsgpk.section02;

public class Application1 {
    // String 클래스의 자주 사용하는 메서드 숙지
    public static void main(String[] args) {

        /*
        * CharAt() : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다.
        *            인덱스를 벗어나면 IndexOutOfBoundsException이 발생한다.
        * */

        String str1 = "apple";
        for (int i = 0; i < str1.length(); i++) {
            System.out.println("charAt(" + i + ") = " + str1.charAt(i));
        }


        /*
        * compareTo() : 인자로 전달된 문자열과 사전 순으로 비교하여
        * 두 문자열이 같다면 0을 반환하고 인자로 전달된 문자열보다 작으면 음수를, 크면 양수를 반환한다.
        * 대소문자를 구분하여 비교한다.
        * */

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        // 같으면 0을 반환한다.
        System.out.println("compareTo() : " + str2.compareTo(str3));

        // 대문자와 소문자 차이는 32
        System.out.println("compareTo() : " + str2.compareTo(str4));
        System.out.println("compareTo() : " + str4.compareTo(str2));

        // compareToIgnoreCase() : 대소문자 구분하지 않고 비교
        System.out.println("compareToIgnoreCase : " + str3.compareToIgnoreCase(str4));

        /*
        * concat() : 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환
        * 원분 문자열에는 영향을 주지 않는다.
        * */

        System.out.println("concat() : " + (str2.concat(str5))); // java + oracle
        System.out.println("str2 : " + str2); // 원본 문자열에 영향 주지 않음.

        /*
        * indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환
        * 단, 일치하는 문자가 없을 때는 -1을 반환한다.
        * */

        String indexStr = "java oracle";
        System.out.println("indexStr('a') : " + indexStr.indexOf('a'));
        System.out.println("indexStr('z') : " + indexStr.indexOf('z'));

        /*
        * trim() : 문자열의 앞 뒤 공백을 제거한 문자열을 반환한다.
        * */
        String trimStr = "             i'm java                 ";

        System.out.println("trimStr : #" + trimStr + "#");
        System.out.println("trimStr : #" + trimStr.trim() + "#");

        // 원본에는 영향을 주지 않는다.
        System.out.println("trimStr : #" + trimStr + "#");

        /*
        * toLowerCase() : 모든 문자를 소문자로 변환시킨다.
        * toUpperCase() : 모든 문자를 대문자로 변환시킨다.
        * */

        String caseStr = "JavaOracle";

        System.out.println("toLowerCase() : " + caseStr.toLowerCase()); //전부 소문자로
        System.out.println("toUpperCase() : " + caseStr.toUpperCase()); //전부 대문자로

        // 원본에는 영향을 주지 않는다.
        System.out.println("caseStr : " + caseStr);

        /*
        * substring() : 문자열의 일부분을 잘라내어 새로운 문자열을 반환한다.
        * 원본에 영향을 주지 않는다.
        * */

        String javaOracle = "javaOracle";

        System.out.println("substring(3, 6) : " + javaOracle.substring(3, 6));
        System.out.println("substring(2) : " + javaOracle.substring(2));

        // 원본은 유지됨.
        System.out.println("javaOracle : " + javaOracle);

        /*
        * replace() : 문자열에 대체할 문자열로 기존 문자열을 변경해서 반환한다.
        * 원본에 유지를 주지 않는다.
        * */
        System.out.println("replace() : " + javaOracle.replace("java", "python"));


        // 원본 유지
        System.out.println("javaOracle : " + javaOracle);

        /*
        * length() : 문자열의 길이를 정수형으로 반환한다.
        * 길이가 0인 문자열은 null과는 다르다.
        * */
        System.out.println("length() : " + javaOracle.length());
        System.out.println("빈문자열 : " + "".length());

        /*
        * isEmpty() : 문자열의 길이가 0이면 true를 반환, 아니면 false를 반환
        * 길이가 0인 문자열은 null과 다르다.
        * */
        System.out.println("isEmpty() : " + "".isEmpty());
        System.out.println("isEmpty() : " + "abcdefghijklmnopqrstuvwxyz".isEmpty());

//        String nullStr = null;
//        System.out.println("isEmpty() : " + nullStr.isEmpty());
    }
}
