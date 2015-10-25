package Others;

import java.util.ArrayList;

class Book {}
class TextBook extends Book {}
public class BookList extends ArrayList<Book>{
	
	public int count = 0;
	public boolean add (Object o)
	{
		if (o instanceof Book) return super.add ((Book ) o);
		else return count ++ == 1;
	}

}

//in valid context

