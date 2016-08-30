package model.dto;

import java.sql.Date;
import java.util.ArrayList;

public class Score {

	private String storeId;
	private String listNo;
	private String nickName;
	private Date enrollDate; //localName 으로 변경?
	private int score;
	private String contents;
	private ArrayList photoList;
	public Score() {}
	public Score(String storeId, String listNo, String nickName, Date enrollDate, int score, String contents,
			ArrayList photoList) {
		super();
		this.storeId = storeId;
		this.listNo = listNo;
		this.nickName = nickName;
		this.enrollDate = enrollDate;
		this.score = score;
		this.contents = contents;
		this.photoList = photoList;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getListNo() {
		return listNo;
	}
	public void setListNo(String listNo) {
		this.listNo = listNo;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public ArrayList getPhotoList() {
		return photoList;
	}
	public void setPhotoList(ArrayList photoList) {
		this.photoList = photoList;
	}
	@Override
	public String toString() {
		return  storeId + " " + listNo + " " + nickName + " " +
				enrollDate + " " + score + " " + contents + " " +
				photoList.get(0) + " " + photoList.get(1) + " " + 
				photoList.get(2) + " " + photoList.get(3) + " " + 
				photoList.get(4) ;
	}
		
}