import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class bedmcDB {

    private static String ip = "";
    private static String token = "";

    public static void set (HfPool pool){
        ip = pool.ip;
        token = pool.token;
    }

    public static String sendData(String discorduser, String discordtag, String imgUrl){
        return connect(discorduser, discordtag, imgUrl);
    }

    private static String connect(String discordUser, String discordTag, String imgUrl){
        try{
            Document connection = Jsoup.connect(ip + "/bedmc/inputuser").
                    header("token", token).
                    header("discordUser", discordUser).
                    header("discordTag", discordTag).
                    header("img", imgUrl).
                    ignoreContentType(true).
                    get();
            return "Successfully inserted: " + discordUser + "#" + discordTag + " into: " + ip;
        }catch (IOException e){
            return e.toString();
        }
    }

}
