package lotto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또번호는 6개여야 합니다.");
        }
        checkDuplicate(numbers);
    }

    private void checkDuplicate(List<Integer> numbers){
        Set<Integer> numberSet = new HashSet<>(numbers);
        if(numberSet.size() < 6){
            throw new IllegalArgumentException("[ERROR] 로또 번호는 중복되어선 안 됩니다.");
        }
    }


    // TODO: 추가 기능 구현
}
