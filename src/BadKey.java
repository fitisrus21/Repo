import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BadKey {
    private String key;

    public BadKey(String key){
        this.key = key;
    }

    @Override
    public int hashCode(){
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        BadKey badKey = (BadKey) obj;
        return Objects.equals(key, badKey.key);
    }

    public static void main(String[] args) {
        HashMap<BadKey,String> badKeyMap = new HashMap<>();

        badKeyMap.put(new BadKey("key1"), "value1");
        badKeyMap.put(new BadKey("key2"), "value2");
        badKeyMap.put(new BadKey("key3"), "value3");

        System.out.println("Size of the HashMap " + badKeyMap.size());

        for (Map.Entry<BadKey,String> entry:badKeyMap.entrySet()){
            System.out.println(entry);
        }
    }
}
