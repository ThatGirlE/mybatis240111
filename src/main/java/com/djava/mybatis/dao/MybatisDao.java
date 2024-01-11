package com.djava.mybatis.dao;

import java.util.ArrayList;

import com.djava.mybatis.dto.MybatisDto;

public interface MybatisDao {
	
	// 인터페이스 추상메서드만 사용 (선언부)
	
	public ArrayList<MybatisDto> listDao(); // 게시판 모든 글 목록 가져오기 (반환타입만 잘 써라 array~~)
	
	public void writeDao(String fbname, String fbtitle, String fbcontent); // 게시판 글쓰기
	
	public MybatisDto contentDao(String fbnum); // 게시판 글 내용

	public void modifyDao(String fbtitle, String fbname, String fbcontent, String fbnum); // 게시판 글 수정하기

	public ArrayList<MybatisDto> searchDao(String searchKey); // 제목 또는 내용에 특정단어 포함 결과 검색
	 // 반환 타입 arraylist 여러개 or x 위에 mybatisdto 1개
	public void deleteDao(String fbnum); // 글삭제
	
	
}	 