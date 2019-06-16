package it.heima.Services.Impl;

import it.heima.Dao.itemdao;
import it.heima.Services.itemService;
import it.heima.domain.item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class itemServiceImpl implements itemService {
    @Autowired
    private itemdao dao;
    public item findById(int id) {
        item byId = dao.findById(id);
        return byId;
    }
}
