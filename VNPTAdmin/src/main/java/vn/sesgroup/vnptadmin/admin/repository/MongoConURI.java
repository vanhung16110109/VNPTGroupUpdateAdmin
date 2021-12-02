package vn.sesgroup.vnptadmin.admin.repository;

import org.bson.Document;

import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoConURI {

	public static void main(String arg[]) {

		String uri = "mongodb://localhost:27017/mongodbVNPTAdmin";

		String myDb = "mongodbVNPTAdmin";

		MongoClientURI mongoClientURI = new MongoClientURI(uri);

		MongoClient mongoClient = MongoClients.create();

		// MongoClient mongo =
		// MongoClients.create("mongodb://hostOne:27017,hostTwo:27018");

		MongoDatabase db = mongoClient.getDatabase(myDb);

		MongoCollection<Document> coll = db.getCollection("BranchWebsiteVNPT");

		FindIterable<Document> doc = coll.find();

		for (Document document : doc) {
			System.out.println(document);
		}

		mongoClient.close();

	}
}
