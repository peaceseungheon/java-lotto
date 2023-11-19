package lotto.util;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class LottoUtil {

    private static final int COUPON_PRICE = 1000;

    public static int getMoney(){
        System.out.println("금액을 입력해 주세요.");
        String m = Console.readLine();
        int money = Integer.parseInt(m);

        if(money % COUPON_PRICE != 0){
            System.out.println("[ERROR] 금액은 1000원으로 나누어 떨어져야 합니다.");
            money = getMoney();
        }
        return money;
    }

    public static List<List<Integer>> buyCoupon(int money){
        int n = money / COUPON_PRICE;
        StringBuilder sb = new StringBuilder();
        List<List<Integer>> couponNumbers = new ArrayList<>();

        for (int i = 0; i < n; i++){
            List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            couponNumbers.add(numbers);
        }
        System.out.printf("%s개를 구매 했습니다.%n", n);
        for(List<Integer> numbers: couponNumbers){
            sb.append(numbers).append("\n");
        }
        System.out.println(sb);
        return couponNumbers;
    }
}
