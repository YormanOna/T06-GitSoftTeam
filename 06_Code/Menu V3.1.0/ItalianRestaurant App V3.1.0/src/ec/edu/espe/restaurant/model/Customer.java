package ec.edu.espe.restaurant.model;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class Customer extends Service {

    protected String fullNames;
    protected String surnames;
    protected String identification;
    protected String cellphone;
    protected String email;
    

public Customer(String fullNames, String surnames, String identification, String cellphone, String email, String food, String cost, String paymentMethod, String date, String hourOfAttention) {
    super(food, cost, paymentMethod, date, hourOfAttention);
    this.fullNames = fullNames;
    this.surnames = surnames;
    this.identification = identification;
    this.cellphone = cellphone;
    this.email = email;
}

public Customer() {
}
    

public String getFullNames() {
    return fullNames;
}

public void setFullNames(String fullNames) {
    this.fullNames = fullNames;
}

public String getSurnames() {
    return surnames;
}

public void setSurnames(String surnames) {
    this.surnames = surnames;
}

public String getIdentification() {
    return identification;
}

public void setIdentification(String identification) {
    this.identification = identification;
}

public String getCellphone() {
    return cellphone;
}

public void setCellphone(String cellphone) {
    this.cellphone = cellphone;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

}
