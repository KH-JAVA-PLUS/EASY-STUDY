package model.service;


import java.util.HashMap;

import model.dto.Score;
import model.dto.Store;

public class ScoreService {
	
	//리뷰 추가
	public int addScore(Score score) {
		int check= 0;
		return check;
	}
	
	//리뷰 수정
	public int updateScore(Store store) {
		int check= 0;
		return check;
	}	
	//상점 리뷰 정보 
	public HashMap scoreList(String storeId) {
		HashMap map=null;
		return map;
	}
	
	//개인사용자 리뷰 정보
	public HashMap scoreInfo(String userId) {
		HashMap map =null;
		return map;
	}
	
	//개인 사용자  리뷰 수
	public int storeLength(String userId){
		int check = 0;
		return check;
	}

	
}

