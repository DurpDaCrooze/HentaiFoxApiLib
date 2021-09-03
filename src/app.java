import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class app {
    
    static String ip;
    static String token;
    static String mastertoken;

    public String name(int id){
        return attr(connect(id), "name");
    }

    public String img(int id){
        return attr(connect(id), "img");
    }

    public String author(int id){
        return attr(connect(id), "author");
    }

    private String connect(int id){
        try{
            Document doc = Jsoup.connect(ip + "/photo/" + id)
            .ignoreContentType(true)
            .header("token", token)
            .get();
            return(doc.toString());
        }catch(IOException e){
            return(e.toString());
        }
    }

    private static String attr(String data, String attr){
        int starttext = data.indexOf(attr) + attr.length() + 3;

        int temp = starttext;

        while(data.charAt(temp) != '"'){
            temp++;
        }
        
        int endtext = temp;

        return data.substring(starttext, endtext);
    }


}
