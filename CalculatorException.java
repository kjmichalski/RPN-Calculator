public class CalculatorException extends Exception {
    private String mesg;
    public CalculatorException(String mesg) {

        this.mesg = mesg;
    }

    public CalculatorException() {
        this("");
    }

    public String toString() {
        return "CalculatorException: "+mesg;
    }
}
