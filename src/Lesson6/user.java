package Lesson6;

import java.io.Serializable;

public class user<ID extends Number & Serializable, SUM> { // можем ограничивать то что будет использовать мэйн
    private ID id;
    private SUM sum;

    public ID getId() {
        return id;
    }

    public SUM getSum() throws MyException {
        if (sum.equals(0)){
            throw new MyException();
        }
        return sum;
    }

    public user(ID id, SUM sum) {
        this.id = id;
        this.sum = sum;
    }


    public <T> String convertToString(T data) {
        return data.toString();
    }


}
