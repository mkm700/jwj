package misc;

import static java.lang.System.out;

public class MergeLetter
{
    String text = "Dear _title_ _lastname_,\n\nWe appreciate your donation of _amount_ to our charity.\n\n";
    Donor[] donors = null;

    public MergeLetter()
    {
        donors = new Donor[4];
        donors[0] = new Donor("Ms.", "Jamie", "Sandan", 50.00F);
        donors[1] = new Donor("Mrs.", "Jessie", "Marvan", 25.00F);
        donors[2] = new Donor("Mr.", "Toni", "Dara", 70.00F);
        donors[3] = new Donor("Ms.", "Anni", "Frost", 100.00F);
    }

    public void runMerge() 
    {
        for (int i = 0; i < 4; i++) {
            System.out.println(merge(donors[i]));
        }
    }

    public String merge(Donor donor)
    {
        String mergedLetter = text;
        // ----- your code here -----
        String newText;
        Float insertAmt;

        newText = text.replaceFirst("_title_", donor.getTitle());
        newText = newText.replaceFirst("_lastname_", donor.getLastName());
        insertAmt = donor.getAmount();
        newText = newText.replaceFirst("_amount_", String.valueOf(insertAmt));
        		
        mergedLetter = newText;
        		
        // ----- end your code ------
        return mergedLetter;
    }

    public static void main(String[] args)
    {
        MergeLetter letters = new MergeLetter();
        letters.runMerge();
    }

}
