package uz.muu;

public class MealRecipes {
    int mealID;
    String productName;
    double amount;

    public MealRecipes(int mealID, String productName, double amount) {
        this.mealID = mealID;
        this.productName = productName;
        this.amount = amount;
    }

    public int getMealID() {
        return mealID;
    }

    public void setMealID(int mealID) {
        this.mealID = mealID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "MealRecipes{" +
                "mealID=" + mealID +
                ", productName='" + productName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
