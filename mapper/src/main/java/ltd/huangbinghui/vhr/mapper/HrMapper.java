package ltd.huangbinghui.vhr.mapper;


import ltd.huangbinghui.vhr.model.Hr;
import org.apache.ibatis.annotations.*;

@Mapper
public interface HrMapper {
    @Select("select from hr where id = #{id}")
    Hr findById(Integer id);
    @Insert("insert into hr values(id,name,phone,telephone,address,enable,username,password,userface,remark)")
    int insert(Hr record);

    int insertSelective(Hr record);
    @Delete("delete from hr where id = #{id}")
    int deleteById(Integer id);
    @Update("update he set name = #{name},phone = #{phone},telephone = #{telephone},address = #{address}," +
            "enable = #{enable},username = #{username},password = #{password},userface = #{username},remark = #{remark}")
    int updateById(Hr record);

    int updateByIdSelective(Hr record);
}
