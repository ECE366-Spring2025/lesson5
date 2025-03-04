package com.ece366.rpsjpa.data;

import jakarta.persistence.*;

@Entity
@Table(name="PLAYER")
public class Player {
    @Id
    @Column(name="PLAYER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long playerId;

    @Column(name="USER_NAME")
    private String userName;

    @Column(name="PASSWORD")
    private String password;

    @Column(name="TOTAL_GAMES")
    private int totalGames;

    @Column(name="TOTAL_WINS")
    private int totalWins;

    @Column(name="TOTAL_LOSSES")
    private int totalLosses;

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
    }

    public int getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(int totalWins) {
        this.totalWins = totalWins;
    }

    public int getTotalLosses() {
        return totalLosses;
    }

    public void setTotalLosses(int totalLosses) {
        this.totalLosses = totalLosses;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + playerId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", totalGames=" + totalGames +
                ", totalWin=" + totalWins +
                ", totalLoss=" + totalLosses +
                '}';
    }
}
