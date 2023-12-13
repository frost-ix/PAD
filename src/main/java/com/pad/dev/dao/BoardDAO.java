package com.pad.dev.dao;

import java.util.List;

import com.pad.dev.vo.boardVO.BoardImgCateVO;
import com.pad.dev.vo.boardVO.BoardImgVO;
import com.pad.dev.vo.boardVO.BoardVO;
import com.pad.dev.vo.imgVO.ImgVO;

public interface BoardDAO {
	public List<BoardImgVO> getMyBoardVO(int currentBoardID, String memID);

	public int getMyBoardMax(String memID);

	public int getBoardID(String boardTitle);

	public BoardImgCateVO getBoardOne(int boardID);

	public List<BoardVO> getBoardList();

	public int getBoardMax();

	public List<BoardImgCateVO> getThumbnailList(BoardImgCateVO boardImgCateVO);

	public int postBoard(BoardImgVO boardImgVO);

	public int postBoardImg(BoardImgVO imgVO);

	public int putBoard(BoardImgVO boardImgVO, ImgVO imgVO);

	public int deleteBoard(BoardImgVO boardImgVO);
}
