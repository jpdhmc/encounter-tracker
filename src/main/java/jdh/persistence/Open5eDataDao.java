package jdh.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdh.open5edata.Monster;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class Open5eDataDao {
    Monster getMonster() {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.open5e.com/monsters/bandit/?format=json");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
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
