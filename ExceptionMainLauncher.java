package com.dallas.exception.newone.example;

public class ExceptionMainLauncher {

	public boolean trainerAbsent;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			training();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.toString());
		}
		trainerAbsent = true;
		
		

	}

	static void training() throws Exception
	{
		System.out.println("Class will be postponed as trainer is absent");
		if(trainerAbsent==true)
		{
		throw new TrainerAbsentException("Trainer is absent : NO NEW TRAINER AVAILABLE");
		}
		else if(trainerAbsent!=true)
		{
		throw new StudentFeesException("Student did not pay the fees");
		}
	}
}
