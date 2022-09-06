package com.xworkz.gym;

import com.xworkz.gym_staff.GymStaff;
import com.xwrokz.gym_rule.GymRule;

public class GymRunner {

	public static void main(String[] args) {
		GymRule gymRule=new PrajwalGymRule();
		
		GymStaff gymStaff=new GymStaff(gymRule);
		gymStaff.checkedRule();
		gymStaff.clean();

	}

}
