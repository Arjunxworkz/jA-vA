package com.xworkz.movieNameDto;

import java.io.Serializable;

public class MovieNameDTO implements Serializable {
private String actorName;
private String actressName;
private Integer totalMovie;
private Double totalBuget;
private String dircetorName;

public MovieNameDTO() {
	
}

//public MovieNameDTO(String actorName, String actressName, Integer totalMovie, Double totalBuget, String dircetorName) {
//	//super();
//	this.actorName = actorName;
//	this.actressName = actressName;
//	this.totalMovie = totalMovie;
//	this.totalBuget = totalBuget;
//	this.dircetorName = dircetorName;
//}

public String getActorName() {
	return actorName;
}

public void setActorName(String actorName) {
	this.actorName = actorName;
}

public String getActressName() {
	return actressName;
}

public void setActressName(String actressName) {
	this.actressName = actressName;
}

public Integer getTotalMovie() {
	return totalMovie;
}

public void setTotalMovie(Integer totalMovie) {
	this.totalMovie = totalMovie;
}

public Double getTotalBuget() {
	return totalBuget;
}

public void setTotalBuget(Double totalBuget) {
	this.totalBuget = totalBuget;
}

public String getDircetorName() {
	return dircetorName;
}

public void setDircetorName(String dircetorName) {
	this.dircetorName = dircetorName;
}


@Override
public String toString() {
	return "MovieNameDTO [actorName=" + actorName + ", actressName=" + actressName + ", totalMovie=" + totalMovie
			+ ", totalBuget=" + totalBuget + ", dircetorName=" + dircetorName + "]";
}



}
