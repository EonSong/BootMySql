package com.example.testdb.service;

import com.example.testdb.model.dao.MemberDao;
import com.example.testdb.model.dto.MemberInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@MapperScan("com.example.testdb.model.dao")
public class MemberService {

    @Autowired
    private MemberDao memberdao;

    public MemberService(MemberDao memberdao){
        this.memberdao = memberdao;
    }

    public List<MemberInfo> getAll(){
//        List<MemberInfo> memberList = new ArrayList<MemberInfo>();
//
//        memberList.add(new MemberInfo("1","경영기획부","대리","송상언","email.com","010-1111-1111"));
//        memberList.add(new MemberInfo("2","경영기획부","사원","홍길동","email.com","010-1111-1111"));
//        memberList.add(new MemberInfo("3","인사팀","과장","장희영","email.com","010-1111-1111"));
         return memberdao.selectMemberList();
        //return memberList;
    }
}
