package com.hj.musiccharttp.mybatisTemp.controller;

import com.hj.musiccharttp.mybatisTemp.mapper.MybatisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@MapperScan
public class MybatisController {

    @Autowired
    MybatisMapper mapper;

//     JAVA 를 사용한 조회 (XML 미사용)
    @GetMapping("/")
    public String mybatisTemp(){

        System.out.println("hy 경로의 신규 프로젝트 mybatistTemp, JAVA를 사용한 조회 실행 ");

        return "index";
    }

    @GetMapping("/board")
    public String mybatisTemp2(){

        System.out.println("hy 경로의 신규 프로젝트 mybatisTemp2 , XML을 사용한 조회 실행");
        int result = mapper.getBoardListCnt2();

        return result + "명, xml 사용 조회";
    }

}
