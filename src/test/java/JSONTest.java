import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pcrain.receivejson.pojo.Address;
import com.pcrain.receivejson.pojo.User;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSONTest {
    @Test
    public void ObejectToJson() throws JsonProcessingException {
        List<Address> addressList=new ArrayList<>();
        Address a1=new Address();
        a1.setStreet("XX路");
        a1.setUnit("一单元");
        a1.setFloor(5);
        Address a2=new Address();
        a2.setStreet("XX路");
        a2.setUnit("二单元");
        a2.setFloor(15);
        addressList.add(a1);
        addressList.add(a2);
        User user=new User();
        user.setUsername("张三");
        user.setPassword("pwd");
        user.setAddresses(addressList);
        List<String> strings=new ArrayList<>();
        strings.add("157156846248");
        strings.add("135145625795");
        user.setPhone(strings);
        ObjectMapper mapper=new ObjectMapper();
        String json=mapper.writeValueAsString(user);
        System.out.println(json);
    }
    @Test
    public void jsonToObject() throws IOException {
        String json="{\"username\":\"张三\",\"password\":\"pwd\",\"phone\":[\"157156846248\",\"135145625795\"],\"addresses\":[{\"street\":\"XX路\",\"unit\":\"一单元\",\"floor\":5},{\"street\":\"XX路\",\"unit\":\"二单元\",\"floor\":15}]}";
        ObjectMapper mapper=new ObjectMapper();
        User user=mapper.readValue(json,User.class);
        System.out.println(user);
    }
}
