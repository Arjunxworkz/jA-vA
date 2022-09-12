package com.xworkz.movieNameDao;

import com.xworkz.movieNameDto.MovieNameDTO;

public class MovieNameDaoImpl implements MovieNameDAO {
//	private String[] lakeNames = new String[10];
//
//	@Override
//	public boolean save(String lakeName) {
//		for (int i = 0; i < lakeNames.length; i++) {
//			if (lakeNames[i] == null) {
//				lakeNames[i] = lakeName;
//				return true;
//			}
//
//		}
//		return true;

//	}
	
	private MovieNameDTO[] res =new MovieNameDTO[10];
	
	
	@Override
	public MovieNameDTO create(MovieNameDTO movieNameDto) {
		try {
			for (int i = 0; i < res.length; i++) {
				if(res[i] ==null) {
				res[i]=movieNameDto ;
				}
				
				System.out.println(res[i]);
				
			}
			//return movieNameDto;
			
		} catch (Exception e) {
			
		}
		return movieNameDto;

		
	}

}
