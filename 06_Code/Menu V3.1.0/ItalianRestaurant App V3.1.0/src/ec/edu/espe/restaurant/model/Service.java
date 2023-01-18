package ec.edu.espe.restaurant.model;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public abstract class Service {
    protected String food;
    protected String cost;
    protected String paymentMethod;
    protected String date;
    protected String hourOfAttention;
    
    
    public Service(){
    
    }

    public Service(String food, String cost, String paymentMethod, String date, String hourOfAttention) {
        this.food = food;
        this.cost = cost;
        this.paymentMethod = paymentMethod;
        this.date = date;
        this.hourOfAttention = hourOfAttention;
    }

    /**
     * @return the food
     */
    public String getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(String food) {
        this.food = food;
    }

    /**
     * @return the cost
     */
    public String getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /**
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the hourOfAttention
     */
    public String getHourOfAttention() {
        return hourOfAttention;
    }

    /**
     * @param hourOfAttention the hourOfAttention to set
     */
    public void setHourOfAttention(String hourOfAttention) {
        this.hourOfAttention = hourOfAttention;
    }
    
}
