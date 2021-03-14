package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.Menu;
import org.apache.ibatis.annotations.*;

@Mapper
public interface MenuMapper {
    @Select("select * from Menu where id =  #{id}")
    Menu findById(Integer id);
    @Insert("insert into Menu values(#{id},#{url},#{path},#{component},#{name},#{iconCls},#{keepAlive},#{requireAuth},#{parentId},#{enabled})")
    int insert(Menu record);

    int insertSelective(Menu record);
    @Delete("delete from Menu where id = #{id}")
    int deleteById(Integer id);
    @Update("update Menu set url = #{url},path=#{path},component=#{component},name#{name},iconCls=#{iconCls}," +
            "keepAlive=#{keepAlive},requireAuth=#{requireAuth},parentId=#{parentId},enabled=#{enabled} where id = #{id}")
    int updateById(Menu record);

    int updateByIdSelective(Menu record);
}
