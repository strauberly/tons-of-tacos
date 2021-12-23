package tacos;

import orders.TakeOrder;

public class Meat {
    private  static String meatSelection = null;
    private  static String groundBeef = "Ground Beef";
    private  static String  grilledChicken = "Grilled Chicken";
    private   static String greenChilePork = "Green Chile Pork";
    private  static String steak = "Steak";

    public Meat(String groundBeef, String grilledChicken, String greenChilePork, String steak) {
        Meat.groundBeef = groundBeef;
        Meat.greenChilePork = greenChilePork;
        Meat.grilledChicken = grilledChicken;
        Meat.steak = steak;
    }

    public static String selectMeat() {
        System.out.println("""
                Please choose a Meat.
                
                Press '1' for  Ground Beef.
                
                Press '2' for  Grilled Chicken.
                
                Press '3' for  Green Chile Pork.
                 
                Press '4' for  Steak.
                """);
        TakeOrder.setSelection();
        switch (TakeOrder.getSelection()) {
            case 1 -> meatSelection = groundBeef;
            case 2 -> meatSelection = grilledChicken;
            case 3 -> meatSelection = greenChilePork;
            case 4 -> meatSelection = steak;
            default -> {
                System.out.println("""

                        Not a valid selection.
                        
                        """);
                selectMeat();
            }
        }
        return null;
    }

    public static String getMeatSelection() {
        return meatSelection;
    }


    public static String getGroundBeef() {
        return groundBeef;
    }

    public static String getGrilledChicken() {
        return grilledChicken;
    }

    public static String getGreenChilePork() {
        return greenChilePork;
    }

    public static String getSteak() {
        return steak;
    }
}