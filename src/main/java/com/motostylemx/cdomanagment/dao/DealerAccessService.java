package com.motostylemx.cdomanagment.dao;

import java.util.List;
import java.util.Optional;

import com.motostylemx.cdomanagment.model.Dealer;

import org.springframework.stereotype.Repository;

@Repository("mariadb")
public class DealerAccessService implements DealerDao {

    @Override
    public int insertDealer(Dealer dealer) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Dealer> selectAllDealers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Dealer> selectDealerById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int deletePerson(int id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updatePerson(int id, Dealer dealer) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
