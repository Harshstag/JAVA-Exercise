class card
{
    int rank;
    char suit;

    card(int r, char s)
    {
        rank = r;
        suit = s;
    }
    int getrank()
    {
        return rank;

    }
    char getsuit()
    {
        return suit;

    }
}

public class CardTester
{
    public static void main(String[] args)
    {
        card c1 = new card(7,'H');
        card c2 = new card(7,'H');
        card c3 = new card(7,'D');
        card c4 = new card(8,'B');
        card c5 = new card(8,'S');

        System.out.println("Card Ran is "+ c1.getrank()+" | card suit is "+c1.getsuit());
        System.out.println("Card Ran is "+ c2.getrank()+" | card suit is "+c2.getsuit());
        System.out.println("Card Ran is "+c3.getrank() +" | card suit is "+c3.getsuit());
        System.out.println("Card Ran is "+c4.getrank() +" | card suit is "+c4.getsuit());
        System.out.println("Card Ran is "+c5.getrank() +" | card suit is "+c5.getsuit());

    }
}
