package pw.aru.patreon;

import org.json.JSONObject;
import pw.aru.patreon.builder.EntityBuilder;

public class PatreonWebhookJava {
    public static PatreonWebhookEvent parse(String type, String json) {
        return parse(type, new JSONObject(json));
    }

    public static PatreonWebhookEvent parse(String type, JSONObject json) {
        return EntityBuilder.createWebhookEvent(type, json);
    }
}
