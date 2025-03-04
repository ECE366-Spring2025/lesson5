package com.ece366.rpsjpa.business;

import com.ece366.rpsjpa.data.Player;
import com.ece366.rpsjpa.data.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers(){
        Iterable<Player> players = this.playerRepository.findAll();
        List<Player> playerList = new ArrayList<>();
        players.forEach(player->{playerList.add(player);});
        return playerList;
    }

    public List<Player> getPlayerById(long id){
        Optional<Player> players = this.playerRepository.findById(Long.toString(id));
        List<Player> playerList = new ArrayList<>();
        players.ifPresent(player->{playerList.add(player);});
        return playerList;
    }

    public boolean deletePlayerById(long id){
        this.playerRepository.deleteById(Long.toString(id));
        return true;
    }
}