package thread;

import java.text.SimpleDateFormat;

public class TimeService {

	TimeDTO dto = new TimeDTO();

	public void start() {

		long time = System.currentTimeMillis();

		dto.setStart(time);

		SimpleDateFormat simple = 
				new SimpleDateFormat("yyyy-MM-dd aa hh:mm:ss");

		String date = simple.format( dto.getStart() );
		System.out.println( date );
	}



	public void end() {
		long time = System.currentTimeMillis();

		dto.setEnd(time);
		
		SimpleDateFormat simple = 
				new SimpleDateFormat("yyyy-MM-dd aa hh:mm:ss");


		String date = simple.format( dto.getEnd() );
		System.out.println( date );
	}

	public void total() {

		dto.setTotal(dto.getEnd() - dto.getStart());

		SimpleDateFormat simple = 
				new SimpleDateFormat("ss");

		String date = simple.format( dto.getTotal() );
		System.out.println( date + "초 사용");
	}
}
