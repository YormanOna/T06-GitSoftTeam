package ec.edu.espe.restaurant.controller;

import org.bson.Document;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class CustomerController extends CRUDMongoDBController implements CustomerInterface{

    public CustomerController(String mongoCollection) {
        super(mongoCollection);
        
    } 

    @Override
    public Document RegisterAndBuildDocument(String fullNames, String surnames, String identification, String cellphone, String email, String food, String cost, String paymentMethod, String date, String hourOfAttention) {
        Document document = new Document("fullNames", fullNames)
            .append("surnames", surnames)
            .append("identification", identification)
            .append("cellphone", cellphone)
            .append("email", email)
            .append("food", food)
            .append("cost", cost)
            .append("paymentMethod", paymentMethod)
            .append("date", date)
            .append("hourOfAttention",hourOfAttention);

    return document;
    
    }
    
}
