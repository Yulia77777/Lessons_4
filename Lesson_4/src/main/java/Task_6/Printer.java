package Task_6;

public class Printer {
    private int tonerLevel;
    private int pageNumber;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pageNumber, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.pageNumber = pageNumber;
        this.isDuplex = isDuplex;
    }

    public static void main(String[] args) {
        Printer pr1 = new Printer(1, 2, true);
        pr1.fillToner(2);
        pr1.printOnePage();
    }

    public void fillToner(int tonerLevelToAdd) {
        tonerLevel = tonerLevel + tonerLevelToAdd;
        System.out.println("Current toner level after filling =" + "" + tonerLevel);
    }

    public void printOnePage() {
        pageNumber = pageNumber + 1;
        System.out.println("Printing the page #" + "" + pageNumber);
    }
}
