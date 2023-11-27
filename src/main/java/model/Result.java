package model;

public class Result {
    private boolean ifCondition = false;
    private boolean elseCondition = false;

    public boolean isIfCondition() {
        return ifCondition;
    }

    public void setIfCondition(boolean ifCondition) {
        this.ifCondition = ifCondition;
    }

    public boolean isElseCondition() {
        return elseCondition;
    }

    public void setElseCondition(boolean elseCondition) {
        this.elseCondition = elseCondition;
    }
}
