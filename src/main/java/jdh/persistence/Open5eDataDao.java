package jdh.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdh.open5edata.Monster;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Gets json data from the open5e api and maps it to a Monster object
 */
public class Open5eDataDao {
    /**
     * Gets an individual monster
     * @param enteredName
     * @return
     */
    public Monster getMonster(String enteredName) {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.open5e.com/monsters/" + enteredName + "/?format=json");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Monster monster = null;
        try {
            mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
            monster = mapper.readValue(response, Monster.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return monster;
    }

    /**
     * Gets a string list of monster names that are like the entered term
     * @param enteredTerm
     * @return
     */
    public List<String> getMonstersByName(String enteredTerm) {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.open5e.com/monsters/?format=json&search=" + enteredTerm);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        List<String> monsterNames = new ArrayList<>();
        JSONObject receivedJson = new JSONObject(response);
        JSONArray receivedArray = receivedJson.getJSONArray("results");

        for (int i = 0; i < receivedArray.length(); i++) {
            JSONObject obj = receivedArray.getJSONObject(i);
            String name = obj.getString("slug");
            monsterNames.add(name);
        }
        return monsterNames;
    }
}
