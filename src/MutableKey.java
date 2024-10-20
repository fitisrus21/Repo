import java.util.HashMap;
import java.util.Objects;

public class MutableKey {
    private String key;

    public MutableKey(String key) {
        this.key = key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(key);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MutableKey mutableKey = (MutableKey) obj;
        return Objects.equals(key, mutableKey.key);
    }

    public static void main(String[] args) {
        HashMap<MutableKey, String> mutableKeyMap = new HashMap<>();

        MutableKey key1 = new MutableKey("key1");
        mutableKeyMap.put(key1, "value1");

        System.out.println("Before changing key: " +
                mutableKeyMap.get(key1));

        // Изменение ключа после его добавления в HashMap
        key1.setKey("newKey1");

        // Вернет null
        System.out.println("After changing key: " + mutableKeyMap.get(key1));
    }
}
