package util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 14:52 2018/5/4
 *@Modified By:
 *
 */
public class MybatisUtil {

    public static SqlSession getSqlsession(){
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(MybatisUtil.class.getClassLoader().getResourceAsStream("mybatis.cfg.xml"));
        return build.openSession();
    }




}
