import org.json.JSONObject;

public class Solution2 {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "John");
        jsonObject.put("age", 30);
        jsonObject.put("city", "New York");

        String serializedObject = jsonObject.toString();
        System.out.println("Serialized Object: " + serializedObject);

        JSONObject deserializedObject = new JSONObject(serializedObject);
        System.out.println("Deserialized Object: " + deserializedObject.toString());
    }
}
