package Lesson6;

public class childUser<SUM extends Number> extends user<Long, SUM>{
    public childUser(Long aLong, SUM sum) {
        super(aLong, sum);
    }


}
