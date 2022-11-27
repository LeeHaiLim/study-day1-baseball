package baseball.domain;

public class BaseballNumber {
    private final int number;

    public BaseballNumber(int number){
        validate(number);
        this.number = number;
    }

    private void validate(int number){
        //todo: validation logic
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        //todo
        return super.equals(obj);
    }
}
