import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class bedmcDB {

    private static String ip = "jdbc:mysql://localhost:3306/bedmc";
    private static String token = "root";

    public static void set (Pool pool){
        ip = pool.ip;
        token = pool.token;
    }

    public static String sendData(String discorduser, String discordtag){
        return connect(discorduser, discordtag);
    }

    private static String connect(String discordUser, String discordTag){
        try{
            Document connection = Jsoup.connect(ip + "/bedmc/database/inputuser").
                    header("token", token).
                    header("discordUser", discordUser).
                    header("discordTag", discordTag).
                    ignoreContentType(true).
                    get();
            return "Successfully inserted: " + discordUser + "#" + discordTag + " into: " + ip;
        }catch (IOException e){
            return e.toString();
        }
    }

}
