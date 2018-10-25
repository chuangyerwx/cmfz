package cmfz.service;

import cmfz.entity.Banner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BannerService {

    public List<Banner> selectByPage(int rows,int page); //分页查询

    public int selectCount();   //查询个数

    public void insert(Banner b);   //添加

    public void delete(int id);     //删除

    public void update(int id,int status);   //修改
}
