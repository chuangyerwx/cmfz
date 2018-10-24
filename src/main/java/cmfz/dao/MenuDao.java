package cmfz.dao;

import cmfz.entity.Menu;

import java.util.List;

/**
 * Created by Administrator on 2018/10/23.
 */
public interface MenuDao {
    public List<Menu> selectAll();
}
