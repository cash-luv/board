package com.icia.board.repository;

import com.icia.board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class BoardRepository {
    @Autowired
    private SqlSessionTemplate sql;
    public int save(BoardDTO boardDTO) {
        return sql.insert("Board.save",boardDTO);
    }
}
