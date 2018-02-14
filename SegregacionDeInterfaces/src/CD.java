import java.sql.Date;

/**
 * 
 * @author edinfamous
 *
 */

public class CD implements Product{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getStock() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumberOfDisks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Date getReleaseDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRecommendedAge() {
		throw new UnsupportedOperationException();
	}
	
}
