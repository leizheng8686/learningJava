


/**
 * Julian Date: pick a base date.
 * J2000  2000, Jan. 1 = 0
 * Jan.2 = 1
 * Jan. 3 = 2 ...
 * Ja. 1 2001 = 366
 * 
 *http://www.amazon.com/Astronomical-Algorithms-Jean-Meeus/dp/0943396611%3FSubscriptionId%3DAKIAILSHYYTFIVPWUY6Q%26tag%3Dduckduckgo-ffab-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3D0943396611
 *http://pdc.ro.nu/jd-code.html
 *http://www.koshko.com/calendar/julian-day.shtml
 * leap year = 366 days (Feb. 29)
 * year mod 4 == 0 , eg 2004, 2008, 2012 LEAP YEAR
 * year mod 100 == 0, eg 1900, 1700, 1500 NOT A LEAP YEAR (Exception)
 * year mod 400 == 0, LEAP YEAR, 2000 is a leap year, 2400 LEAP
 */
public class JulianDate { 
	private double julianDate;
	private int year,month,day;
	// only one variable monthNames or ALL JulianDate objects (shared)
	private final static String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	public JulianDate(int year, int mon, int day) {
		if(mon<3) { year--; mon+=12; }
		julianDate = (year*365) +(year/4) -(year/100) +(year/400)
	              +(mon*153+3)/5-92
	              +day-1
		;
	}
	public JulianDate(int year, int mon, int day,
				int hour, int min, int sec) {
		
		
	}
	
	public int getYear() {
		int j = (int)julianDate;
		return 
			year = j/(146097)*400+
				(j-j/(146097)*146097)/36524*100+
				  ((j-j/(146097)*146097)-(j-j/(146097)*146097)/36524*36524)/1461*4+
				    (((j-j/(146097)*146097)-(j-j/(146097)*146097)/36524*36524)-((j-j/(146097)*146097)-(j-j/(146097)*146097)/36524*36524)/1461*1461)/365;
	}
	public int getMonth() {
		int j = (int)julianDate;
		int monthd = j - ((year*365) +(year/4) -(year/100) +(year/400));
		return 
			month = monthd;
	}
	
	public int getDay() {
		return day;
	}
//	// return 0 for Sunday, 1=monday, ... 6 = Saturday
//	public int dayOfWeek() {
//		
//	}
//	public String getMonthName() {
//		
//	}
	public String toString(){
		return getMonth()+"/"+getDay()+"/"+getYear();
	}
	
	
	
	public static void main(String[] a) {
		JulianDate d1 = new JulianDate(2016, 2, 29);
		JulianDate d2 = new JulianDate(2016, 3, 1);
		System.out.println(d1);
//		JulianDate d3 = d1.add(1); // tomorrow
//		System.out.println(d3);  // 2016 Mar. 1
//		JulianDate d4 = d1.add(-1); //yesterday
//		JulianDate d5 = d1.add(1.5); //tomorrow noon
//		JulianDate d6 = d5.sub(2); // 2 days before d2
//		double days = d5.sub(d2);
//		System.out.println(d1);  // 2016 Feb. 29
//		JulianDate d7 = new JulianDate(2017, 2, 27);
//		System.out.println(d7.add(2)); // 2017 Mar. 1
	}
}
