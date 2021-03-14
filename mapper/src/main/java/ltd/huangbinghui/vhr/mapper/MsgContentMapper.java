package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.MsgContent;
import org.apache.ibatis.annotations.*;

@Mapper
public interface MsgContentMapper {
    @Select("select * from MsgContent where id = #{id}")
    MsgContent findById(Integer id);
    @Insert("insert into MsgContent vlaues (#{id},#{title},#{message},#{createDate})")
    int insert(MsgContent record);

    int insertSelective(MsgContent record);
    @Delete("delete from MsgContent where id = #{id}")
    int deleteById(Integer id);
    @Update("update MsgContent set title = #{title},message = #{message},createDate = #{createDate} where id = #{id}")
    int updateById(MsgContent record);

    int updateByIdSelective(MsgContent record);
}
