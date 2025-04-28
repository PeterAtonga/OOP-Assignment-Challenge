// variables

public class variables {
    void showProfit() {
        double sales;
        double cost;
        double profit;

        sales = 2000.00;
        cost = 1760.40;
        profit = sales - cost;

        System.out.println("The profit is: " + profit);
    }

    public static void main(String[] args) { // main method
        variables myVars = new variables(); // creating an object myVars whixh is a new instance of the class variables
        myVars.showProfit(); // calling the method
    }
}
