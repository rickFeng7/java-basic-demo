package rick.enums;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnumDemoTest {

    @Test
    public void getDescByCode() {
        Assert.assertEquals("枚举1", EnumDemo.getDescByCode(1));
    }

    @Test
    public void getEnumByCode() {
        Assert.assertEquals(EnumDemo.ENUM_ONE, EnumDemo.getEnumByCode(1));
    }

    @Test
    public void getMap() {
        Map<Integer, EnumDemo> map = new HashMap<Integer, EnumDemo>() {{
            put(1, EnumDemo.ENUM_ONE);
            put(2, EnumDemo.ENUM_TWO);
        }};
        Assert.assertEquals(map, EnumDemo.getMap());
    }

    @Test
    public void getMaps() {
        Map<String, Object> map1 = new HashMap<String, Object>() {{
            put("code", 1);
            put("desc", "枚举1");
        }};
        Map<String, Object> map2 = new HashMap<String, Object>() {{
            put("code", 2);
            put("desc", "枚举2");
        }};
        List<Map<String, Object>> maps = new ArrayList<>();
        maps.add(map1);
        maps.add(map2);
        Assert.assertEquals(maps, EnumDemo.getMaps());
    }
}