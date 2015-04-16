
package konaresttest;

import LogicaNegocio.User;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elhongo
 */
public class ConsumidorRest {
    
    public static String consumirGet(){
        BufferedReader reader = null;
        try{
            URL url = new URL("http://app.konacloud.io:80/api/elhongo/KonaRestTest/mr_Usuario");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setReadTimeout(5000);
            connection.setConnectTimeout(10000);
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            connection.connect();
            
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
            String valorJson = reader.readLine();
            return valorJson;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return "ERROR";
        }finally{
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(ConsumidorRest.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    
    }
}
