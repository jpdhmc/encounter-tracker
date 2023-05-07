package jdh.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdh.open5edata.Monster;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * Gets json data from the open5e api and maps it to a Monster object
 */
public class Open5eDataDao {
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
}
