package com.example.testdb.model.dao;

import com.example.testdb.model.dto.MemberInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberDao {
    List<MemberInfo> selectMemberList();
}
