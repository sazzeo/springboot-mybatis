package se.tmkr.system.repository;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import se.tmkr.system.dto.RequestDto;

import java.util.Map;

@Mapper
public interface RequestRepository {

    @Select("SELECT * FROM SYS_REQUEST WHERE REQ_NO = #{reqNo}")
    RequestDto selectRequest(String reqNo);


    Map<String, Object> selectRequestMap(String reqNo);

}
