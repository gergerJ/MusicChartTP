package com.hj.musiccharttp.mybatisTemp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MybatisMapper {

    // JAVA를 사용한 조회
    @Select("SELECT count(*) FROM BOARD")
    int getBoardListCnt();

    // XML을 사용한 조회
    int getBoardListCnt2();
}
