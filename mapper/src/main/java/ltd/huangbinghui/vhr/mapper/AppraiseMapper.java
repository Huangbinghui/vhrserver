package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.Appraise;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AppraiseMapper {
    @Select("select id,eid,appDate,appResult," +
            "appContent,remark from appraise where id = #{id}")
    Appraise findById(Integer id);
    @Select("select * from Appraise where eid = #{eid}")
    List<Appraise> findByEid(Integer eid);
    @Insert("insert into appraise (id,eid,appDate,appResult,appContent,remark)" +
            " values(#{id},#{eid},#{appDate},#{appResult},#{appContent},#{remark})")
    int insert(Appraise record);
    @Delete("delete from appraise where id = #{id}")
    int deleteById(Integer id);
    @Update("update appraise set id=#{id},eid=#{eid},appDate=#{appDate},")
    int updateById(Appraise record);

    int updateByIdSelective(Appraise record);

    int insertSelective(Appraise record);
}
