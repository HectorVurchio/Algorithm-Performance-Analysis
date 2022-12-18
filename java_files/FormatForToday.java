import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.locale;

public class FormatForToday{
	private void today(){
		ZoneId zi = ZoneId.of("America/New_York");
		ZonedDateTime now = ZonedDateTime.now(zi);
		FormatStyle fs = FormatStyle.LONG;
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(fs);
		String formatted =  formatter.format(now);
		System.out.println("Now format LONG: "+formatted);
		zi = ZoneId.of("America/Caracas");
		now = ZonedDateTime.now(zi);
		fs = FormatStyle.MEDIUM;
		formatter = DateTimeFormatter.ofLocalizedDateTime(fs);
		formatted =  formatter.format(now);
		System.out.println("Now format MEDIUM: "+formatted);
		Locale lo = new Locale("es","VE");
		fs = FormatStyle.FULL;
		formatter = DateTimeFormatter.ofLocalizedDateTime(fs);
		formatted =  formatter.withLocale(lo).format(now);
		System.out.println("Now format FULL: "+formatted);
		lo = new Locale("de","DE");
		fs = FormatStyle.FULL;
		formatter = DateTimeFormatter.ofLocalizedDateTime(fs);
		formatted =  formatter.withLocale(lo).format(now);
		System.out.println("Now format FULL: "+formatted);
	}
	public static void main (String[] args){
		FormatForToday fft = new FormatForToday();
		fft.today();
	}
}