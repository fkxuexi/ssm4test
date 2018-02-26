package top.fkxuexi.dao;

import org.apache.ibatis.annotations.Param;
import top.fkxuexi.entity.A;

public interface ADAO {

    A get(int id);

    void transfer(@Param("id") int id, @Param("money") int money);
}
