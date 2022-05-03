package project.dao.impl;

import project.dao.BetDao;
import project.db.Storage;
import project.models.Bet;

import java.util.List;

public class BetDaoImpl implements BetDao {

    @Override
    public void add(Bet bet) {
        Storage.bets.add(bet);
    }

    @Override
    public List<Bet> getAll() {
        return Storage.bets;
    }

    @Override
    public Bet getBet(int index) {
        return Storage.bets.get(index);
    }
}
