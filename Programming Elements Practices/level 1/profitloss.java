import java.util.*;

public class profitloss {
    public static void main(String[] args) {
        int cp = 129, sp = 191;
        int diff = sp - cp;
        double percent = diff * 100.0 / cp;

        System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp +
            (diff > 0 ? "\nThe Profit is INR " + diff + " and the Profit Percentage is " + String.format("%.2f", percent) + "%"
            : diff < 0 ? "\nThe Loss is INR " + -diff + " and the Loss Percentage is " + String.format("%.2f", -percent) + "%"
            : "\nThere is neither Profit nor Loss."));
    }
}
