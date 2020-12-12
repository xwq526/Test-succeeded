import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xwq.model.Message;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-09
 * Time: 10:40:57
 */
public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        //单个的
      /*  String s = "{\n" +
                "    \"who\": \"达摩老祖\",\n" +
                "    \"when\": \"2020-12-09 10:34:07\",\n" +
                "    \"what\": \"快去休闲\"\n" +
                "  }";
        ObjectMapper mapper = new ObjectMapper();
        Message message = mapper.readValue(s, Message.class);
        System.out.println(message);*/

        //list的
        String s = "[\n" +
                "  {\n" +
                "    \"who\": \"达摩老祖\",\n" +
                "    \"when\": \"2020-12-09 10:34:07\",\n" +
                "    \"what\": \"快去休闲\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"who\": \"达摩老祖2\",\n" +
                "    \"when\": \"2020-12-08 10:34:07\",\n" +
                "    \"what\": \"快去休闲吧\"\n" +
                "  }\n" +
                "]";
        ObjectMapper mapper = new ObjectMapper();
        JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class, Message.class);
        List<Message> messageList = mapper.readValue(s,javaType);
        System.out.println(messageList);
    }
}
