package top.fkxuexi.service;

import org.omg.CORBA.BAD_CONTEXT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.fkxuexi.dao.BDAO;
import top.fkxuexi.entity.B;

@Service
@Transactional
public class BService {


    @Autowired
    private BDAO bDAO;

    @Transactional(propagation = Propagation.NESTED)
    public void insert(B b){
        //int i = 1/0;
        bDAO.insert(b);
    }

}
