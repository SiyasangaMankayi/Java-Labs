package Part_1;

public class ResultsCalc {

    public ResultStatus CalcResult(int mark) {

        if (mark <= 100 && mark >= 75) {
            return ResultStatus.PASS;
        } else if (mark >= 50 && mark <= 74) {
            return ResultStatus.SUPPLEMENTARY;
        } else if (mark >= 0 && mark <= 49) {
            return ResultStatus.FAIL;
        }
        else{
            return ResultStatus.INVALID;
        }
    }
}


