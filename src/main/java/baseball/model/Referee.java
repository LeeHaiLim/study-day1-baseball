package baseball.model;

public class Referee {
    PitcherNumber pitcherNumber;
    CatcherNumber catcherNumber;
    int ballCount;
    int strikeCount;


    public Referee(PitcherNumber pitcherNumber, CatcherNumber catcherNumber) {
        this.pitcherNumber = pitcherNumber;
        this.catcherNumber = catcherNumber;
        ballCount = 0;
        strikeCount = 0;
    }

    public void judge() {
        for(int num : pitcherNumber.getNumber()) {
            isStrikeOrBall(num);
        }
    }

    private void isStrikeOrBall(int num) {
        if(catcherNumber.contains(num)) {
            if(catcherNumber.indexOf(num) == pitcherNumber.indexOf(num)) {
                strikeCount++;
                return;
            }
            ballCount++;
        }
    }

    public boolean isStrikeOut() {
        return strikeCount == 3;
    }

    public int getBallCount() {
        return ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }
}
