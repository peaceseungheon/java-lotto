package lotto;

import lotto.util.LottoUtil;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        int money = LottoUtil.getMoney();
        LottoUtil.buyCoupon(money);
    }
}
