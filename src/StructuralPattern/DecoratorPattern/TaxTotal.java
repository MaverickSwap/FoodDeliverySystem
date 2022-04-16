package StructuralPattern.DecoratorPattern;

import java.text.DecimalFormat;

public class TaxTotal extends payment {
    DecimalFormat df = new DecimalFormat("#.00");

    public TaxTotal(OrderFood orderFood) {
        super(orderFood, 0.00f, " Grand Total = ");
    }

    @Override
    public float cost() {
        System.out.println(" Tax = " + Float.valueOf(df.format(0.1025f * getFood().cost())) + "$" + "  (" + Float.valueOf(df.format(getFood().cost())) + " % 10.25)");
        System.out.println("======================================");
        return 1.1025f * getFood().cost();
    }
}