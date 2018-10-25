package cmfz.dao;

import cmfz.entity.Banner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/10/24.
 */

//轮播图
public interface BannerDao {

    public List<Banner> selectByPage(@Param("start") int rows,@Param("page") int page); //分页查询

    public int selectCount();   //查询个数

    public void insert(Banner b);   //添加

    public void delete(int id);     //删除

    public void update(@Param("id")int id,@Param("status") int status);   //修改

}
