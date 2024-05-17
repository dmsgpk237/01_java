package com.dmsgpk.section01.conditional;

import java.util.Scanner;

public class D_switch_test {

    public static void testSimpleSwitch2Statement() {

        System.out.println("한 나무꾼이 산 속에서 나무를 베다가 도끼를 연못에 빠뜨리고 말았다.");
        System.out.println("그 때, 연못에서 산신령이 나타나 도끼가 머리에 맞았다고,");
        System.out.println("어떤 도끼를 빠뜨렸는지 솔직히 말하지 않으면, 도끼를 돌려주지 않겠다고 한다.");
        System.out.println();
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 진짜 나무꾼의 도끼인지 물어보는데...!");
        System.out.println("과연 나무꾼의 대답은?...");
        System.out.println();
        System.out.println("산신령: 어느 도끼가 너의 도끼냐? ");
        System.out.println("1. 반짝반짝 빛나는 금도끼");
        System.out.println("2. 윤광이 나는 은도끼");
        System.out.println("3. 빛은 안 나지만 튼튼해보이는 쇠도끼");
        System.out.println();
        System.out.println("당신의 도끼를 선택하세요.");

        Scanner sc = new Scanner(System.in);
        // int answer = sc.nextInt();
        String answer = sc.nextLine();

        switch (answer) {

            case "1" :
                System.out.println("이런 고얀놈! 이건 내 도끼다 임마!");
                System.out.println("거짓말을 한 너에게는 아무런 도끼도 줄 수 없으니 썩 나가!!!");
                break;

            case "금도끼" :
                System.out.println("이런 고얀놈! 이건 내 도끼다 임마!");
                System.out.println("거짓말을 한 너에게는 아무런 도끼도 줄 수 없으니 썩 나가!!!");
                break;

            case "2" :
                System.out.println("은도끼를 선택했구나,,하지만 이건 내 동생 도끼다!!!");
                System.out.println("이 고얀놈!! 아무런 도끼도 줄 수 없으니 썩 나가!!!");
                break;

            case "은도끼" :
                System.out.println("은도끼를 선택했구나,,하지만 이건 내 동생 도끼다!!!");
                System.out.println("이 고얀놈!! 아무런 도끼도 줄 수 없으니 썩 나가!!!");
                break;

            case "3" :
                System.out.println("오..정직하구나..그래 장하다!");
                System.out.println("너에게는 금도끼, 은도끼, 쇠도끼를 모두 다 주겠다! 음하하!");
                break;

            case "쇠도끼" :
                System.out.println("오..정직하구나..그래 장하다!");
                System.out.println("너에게는 금도끼, 은도끼, 쇠도끼를 모두 다 주겠다! 음하하!");
                break;

            default :
                System.out.println("....바보냐?");
                System.out.println("금도끼, 은도끼, 쇠도끼 중에서 선택하라고 했지 않느냐... 돌아가라...");
                break;
        }

        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("그렇게 산신령은...다시 연못으로..사라지고 말았다...");


    }

}
