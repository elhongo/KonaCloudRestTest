
package konaresttest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import LogicaNegocio.User;
import com.google.gson.JsonArray;

/**
 *
 * @author elhongo
 * Testing the Rest API of KonaCloud
 */
public class KonaRestTest {

    public static void main(String[] args) {
        
        String userJsonString = ConsumidorRest.consumirGet();
        Gson gson = new GsonBuilder().create();
        JsonObject json = gson.fromJson(userJsonString, JsonObject.class);
        JsonArray jsonUsers = json.getAsJsonArray("data");
        for(int i = 0; i<jsonUsers.size(); i++){
            JsonElement jsonUserElement =  jsonUsers.get(i);
            JsonObject jsonUser = (JsonObject) jsonUserElement;
            User newUser = new User(jsonUser.get("nombre").toString(),
                    jsonUser.get("apellido").toString()
                    ,Integer.parseInt(jsonUser.get("edad").toString()));
            System.out.println(newUser.toString());
        }           
    }
    
}
