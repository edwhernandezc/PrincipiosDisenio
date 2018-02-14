import java.sql.Date;

/**
 * 
 * @author edinfamous
 *
 */
public interface Product {
	String getName();
	int getStock();
	int getNumberOfDisks();
	int getRecommendedAge();
	Date getReleaseDate();
}
