package com.board.mapper;

import java.util.List;

import com.board.domain.BoardVO;

//CRUD 구현
public interface BoardMapper {

    public List<BoardVO> getList();
    //단순히 시퀀스 다음 값을 구해서 insert할 때 사용, 추가된 pk 값 알 수 x
    public void insert(BoardVO board);
    //미리 pk값을 sql을 통해서 처리해두고 결과를 보관, 자동으로 추가되는 PK 값을 확인해야 하는 상황에서 유용
    public void insertSelectKey(BoardVO board);
    public BoardVO read(Long bno);
    public int delete(Long bno);
    public int update(BoardVO board);

}
