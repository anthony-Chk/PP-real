public class Sides {
    int breadstick;
    int breadbites;
    int cookie;
    int marinara;

    public Sides(int bs,int bb, int cc, int m)
    {
        breadstick= bs;
        breadbites=bb;
        cookie=cc;
        marinara=m;
    }

    public String toString()
    {
        return "breadsticks: "+breadstick+", "+"breadstick bites: "+breadbites+", "+"Big Chocolate Chip Cookie: "+cookie+", "+"marinara's: "+marinara;
    }
}
