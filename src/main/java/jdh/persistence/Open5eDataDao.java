package jdh.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdh.open5edata.Monster;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class Open5eDataDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    public Monster getMonster(String enteredName) {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.open5e.com/monsters/" + enteredName + "/?format=json");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        logger.info("json response: " + response);
        ObjectMapper mapper = new ObjectMapper();
        Monster monster = null;
        try {
            monster = mapper.readValue(response, Monster.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return monster;
    }
}
