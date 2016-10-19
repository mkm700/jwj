package misc;

/**
 * The titler changes a book title into proper uppercase for a title.  It skips
 * words in the skip-words list, such as "the", "of", etc.
 * 
 * Title case: Every word gets capitalized except skipwords.  The
 * skipwords only get capitalized if they are the first or last
 * word of the book title, since the first and last are always capitalized.
 * 
 * 
 */
public class BookTitler
{
    String[] skipwords = { "a", "an", "the", "and", "but", "for", "nor", "or", "so", "yet", "by", 
        "like", "as", "to", "at", "on", "of", "from", "is", "in" };
    
    public BookTitler()
    {
    }
    
    public String fixCase(String input)
    {
        // --- your code here ----
        // you may also add more methods to this class if you want them.
    	
    	//parse the individual words of input into a string array (.split)
    	//compare the word to skipwords
    		//if found, add the word to the newTitle as-is
    		//if not found, capitalize the first letter and add to the newTitle
    	//return the newTitle
    	
    	String titleWord = "";
    	String[] inputArray = input.split(" ");						//create inputArray of individual title words
    	StringBuilder newTitle = new StringBuilder(CapitaizeFirstLetter(inputArray[0] + " "));	//initialize with first word
    	
    	for(int i = 1; i<inputArray.length-1; i++) {		
    		titleWord = checkSkipWords(inputArray[i]);				
    		newTitle.append(titleWord + " ");
    	}	
    	
    	newTitle.append(CapitaizeFirstLetter(inputArray[inputArray.length-1]));
    	
        return newTitle.toString(); 
        
        // --- end your code -----

    }
    
    public String checkSkipWords(String word) {
    	String skipWord = "";
		boolean canSkip = false;
		int j = 0;

		while (!canSkip && j < skipwords.length) {
			skipWord = skipwords[j];
			if (word.equalsIgnoreCase(skipWord)) {
				canSkip = true;
			}
			j++;
		}
		
		String titleWord = "";
		if (!canSkip) {
			titleWord = word.substring(0, 1).toUpperCase() + word.substring(1);
		}
		else {
			titleWord = word;
		}
	
    	return titleWord;
    }
    
    public String CapitaizeFirstLetter(String word) {
    	return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
    
    
    public static void main(String[] args)
    {
        BookTitler titler = new BookTitler();
        
        System.out.println(titler.fixCase("a cat sat on a hat"));
        System.out.println(titler.fixCase("the pig is in the corn"));
        System.out.println(titler.fixCase("where did the barn blow off to"));
        System.out.println(titler.fixCase("charlotte's web"));
        System.out.println(titler.fixCase("alice in wonderland"));
        
        if (! "A Cat Sat on a Hat".equals(titler.fixCase("a cat sat on a hat"))) {
            System.out.println("Error in cat-hat");
        }
        if (! "The Pig is in the Corn".equals(titler.fixCase("the pig is in the corn"))) {
            System.out.println("Error in pig");
        }
        if (! "Where Did the Barn Blow Off To".equals(titler.fixCase("where did the barn blow off to"))) {
            System.out.println("Error in barn");
        }
        if (! "Charlotte's Web".equals(titler.fixCase("charlotte's web"))) {
            System.out.println("Error in web");
        }
        if (! "Alice in Wonderland".equals(titler.fixCase("alice in wonderland"))) {
            System.out.println("Error in wonderland.");
        }
    }


}

