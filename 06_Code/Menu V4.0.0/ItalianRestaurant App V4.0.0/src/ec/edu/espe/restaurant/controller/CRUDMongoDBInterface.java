package ec.edu.espe.restaurant.controller;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public interface CRUDMongoDBInterface {
    
    public void createToDatabase(Document document);
    public Document readToDatabase(String key, String value);
    public void uploadToDatabase(Document query, Document upload);
    public void deleteToDatabase(Document document);
    public MongoCollection<Document> getMongoCollection(); 
    
}
