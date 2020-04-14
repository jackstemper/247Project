import org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;


public class MovieAppTests {
    @BeforeClass
    public static void oneTimeSetUp(){

    }

    @AfterClass
    public static void oneTimeTearDown(){

    }

    @Before
    public void setup(){

    }
    @After
    public void tearDown(){

    }

    @Test
    public void testUser(){
        User user = new User();
        user.Username = "JoeExotic";
        user.Password = "TigerKing";
        assertNotNull(user.Username, user.Password);
    }

    @Test
    public void testManager(){
        Manager manager1 = new Manager();
        Manager manager2 = new Manager();
        manager2.Username = "CarolBaskins";
        manager2.Password = "BigCatRescue";
        assertNotSame(manager1.Username, manager2.Username);
    }

    @Test
    public void testLoad(){
        Movie[] Movies = new Movie[4];
        Theater[] Theaters = new Theater[2];
        Movie Frozen = new Movie("Frozen 2", 9.50, 6.50, "AMC", 60, 0, "Elsa");
        Movies[0] = Frozen;
        Movie Jungle = new Movie("The Jungle Book", 9.50, 5.0, "AMC", 60, 0, "Mowgli");
        Movies[1] = Jungle;
        Movie[] AMCList = {Frozen, Jungle};
        Theater AMC = new Theater("AMC", "6969 Test Dr.", AMCList);
        Theaters[0]= AMC;
        Movie Matrix = new Movie("The Matrix", 11.50, 8.50, "Carmike", 40, 0, "Neo");
        Movie Community = new Movie("Community: the Movie", 11.50, 7.0,"Carmike", 40, 0, "Abhed");
        Movie[] CarmikeList = {Matrix, Community};
        Theater Carmike = new Theater("Carmike", "457984 Greendale Rd.", CarmikeList);
        Theaters[1] = Carmike;

        assertNotNull(Theaters);
        assertNotEquals(Theaters, Movies);
        assertNotEquals(CarmikeList, AMCList);
    }

    @Test
    public void testCreateTicket(){
        Ticket ticket = new Ticket();
        ticket.Title = "Frozen 2";
        ticket.Venue = "AMC";
        assertNull(ticket.Time);

    }

    @Test
    public void testIsManager(){
        Manager manager = new Manager();
        User user = new User();
        assertNotEquals(manager.IsManager, user.IsManager);
    }
}
