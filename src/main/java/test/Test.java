package test;

import entity.TDemo;
import mapper.TDemoMapper;
import org.apache.ibatis.session.SqlSession;
import util.MybatisUtil;

import java.util.List;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 15:31 2018/5/4
 *@Modified By:
 *
 */
public class Test {

    public static void main(String[] args) {
        SqlSession sqlsession = MybatisUtil.getSqlsession();
        TDemoMapper mapper = sqlsession.getMapper(TDemoMapper.class);
        List<TDemo> all = mapper.getAll();
        for (TDemo item : all)
            System.out.println(item);
    }
}
