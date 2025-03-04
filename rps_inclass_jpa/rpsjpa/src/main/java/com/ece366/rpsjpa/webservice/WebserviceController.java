package com.ece366.rpsjpa.webservice;

import com.ece366.rpsjpa.business.PlayerService;
import com.ece366.rpsjpa.data.Player;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class WebserviceController {
    private final PlayerService playerService;

    public WebserviceController(PlayerService playerService) {
        this.playerService = playerService;
    }
    @GetMapping("/testPlayer")
    public String getTestPlayer() {
        return "TEST PLAYER";
    }

    @GetMapping("/players")
    public List<Player> getPlayers(){
        System.out.println("getPlayers");
        return this.playerService.getPlayers();
    }

    @GetMapping("/getPlayerById/{id}")
    public List<Player> getPlayerById(@PathVariable("id") long id){
        System.out.println("getPlayerById");
        return this.playerService.getPlayerById(id);
    }

    @PostMapping("/deletePlayerById")
    public boolean deletePlayerById(@RequestBody String json) throws JsonProcessingException{
        System.out.println("deletePlayerById");
        System.out.println(json);
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> inputMap = objectMapper.readValue(json, Map.class);
        return this.playerService.deletePlayerById(Long.parseLong(inputMap.get("id")));
    }
}
