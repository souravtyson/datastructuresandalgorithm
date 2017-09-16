package chapter2;

public class VideoGame {

	private String _title;
	private int _year;
	private String _rating;
	private String[] _platforms;

	public VideoGame() {
	}

	public VideoGame(String title, int year, String rating, String[] platform) {
		this._title = title;
		this._year = year;
		this._rating = rating;
		this._platforms = platform;
	}

	public String get_title() {
		return _title;
	}

	public void set_title(String _title) {
		this._title = _title;
	}

	public int get_year() {
		return _year;
	}

	public void set_year(int _year) {
		this._year = _year;
	}

	public String get_rating() {
		return _rating;
	}

	public void set_rating(String _rating) {
		this._rating = _rating;
	}

	public String[] get_platforms() {
		return _platforms;
	}

	public void set_platforms(String[] _platforms) {
		this._platforms = _platforms;
	}

    @Override
    public String toString()
    {
        String result = "";
        result += "\nTitle: "+ get_title() + "\nYear: "+get_year()+
                "\nRating: "+get_rating()+"\nPlatforms: ";
        for (String platform : get_platforms()) {
            result += platform + "  ";
        }
        return result;
    }
}
