/**
 * Created by dsm2017 on 2017-03-12.
 */
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Main {
    public static void main(String[] args)
    {
        JSONObject obj = new JSONObject();
        obj.put("name", "mkyoung.com");
        obj.put("age", new Integer(100));

        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");

        obj.put("messages", list);

        try {
            FileWriter file = new FileWriter("c:\\test.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);
    }
}
