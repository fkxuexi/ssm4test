package top.fkxuexi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.fkxuexi.dao.ADAO;
import top.fkxuexi.entity.A;
import top.fkxuexi.entity.B;

@Service
@Transactional
public class AService {

    @Autowired
    private ADAO aDAO;
    @Autowired
    private BService bService;


    @Transactional(readOnly = true)
    public A get(int id){
        return aDAO.get(id);
    }

    public void transfer(int toId,int fromId ,int transferMoney){


        A to = aDAO.get(toId);
        A from = aDAO.get(fromId);

        B b = new B();
        b.setMsg(from.getName()+"先生向"+to.getName()+"先生转账"+transferMoney);
        bService.insert(b);

        aDAO.transfer(toId,transferMoney);
        aDAO.transfer(fromId,-transferMoney);
        int i = 1/0;



    }


}
