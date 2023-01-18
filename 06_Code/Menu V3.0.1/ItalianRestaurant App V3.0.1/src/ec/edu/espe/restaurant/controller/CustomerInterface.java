package ec.edu.espe.restaurant.controller;

import org.bson.Document;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public interface CustomerInterface {
public Document RegisterAndBuildDocument(String fullNames,String surnames, String identification, String cellphone, String email,String food, String cost, String paymentMethod, String date, String hourOfAttention);
 
}
