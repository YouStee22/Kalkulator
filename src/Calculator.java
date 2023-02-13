public class Calculator {
    public static void main(String[] args) {

        CalcFack calcFack = new CalcFack();
        calcFack.calckFackIn(10, 10, (a,b) -> CalcFunctions.calcFunctionsIn(a,b));
    }
}
