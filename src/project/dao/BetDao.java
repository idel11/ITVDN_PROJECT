package project.dao;

import project.models.Bet;

import java.util.List;

public interface BetDao {

    void add(Bet bet);
    List<Bet> getAll();

    // взяти ставку по індексу
    Bet getBet(int index);


}
