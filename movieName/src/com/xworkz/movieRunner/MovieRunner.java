package com.xworkz.movieRunner;

import com.xworkz.movieNameDao.MovieNameDAO;
import com.xworkz.movieNameDao.MovieNameDaoImpl;
import com.xworkz.movieNameDto.MovieNameDTO;


public class MovieRunner {

	public static void main(String[] args) {
		//MovieNameDAO movieNamedao=new MovieNameDaoImpl();
		MovieNameDTO movieNamedto=new MovieNameDTO();
		movieNamedto.setActorName("Ravi");
		movieNamedto.setActressName("shalini");
		movieNamedto.setDircetorName("umar");
		movieNamedto.setTotalBuget(20d);
		movieNamedto.setTotalMovie(4);
		
		MovieNameDAO movieNamedao=new MovieNameDaoImpl();
		movieNamedao.create(movieNamedto);
		
		System.out.println("===================");
		
		movieNamedto.setActorName("Rav");
		movieNamedto.setActressName("shaini");
		movieNamedto.setDircetorName("uma");
		movieNamedto.setTotalBuget(40d);
		movieNamedto.setTotalMovie(5);
		movieNamedao.create(movieNamedto);
	}

}
