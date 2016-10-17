package others;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import model.Player;
import service.PlayerService;

/**
 * TODO: description
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/META-INF/spring-persistence-context.xml", "/META-INF/spring-services-context.xml" })
public class TestHibernate {

    @Autowired
    private PlayerService playerService;

    @After
    public void eraseData() {
    	//playerService.retriveAll().forEach(each -> playerService.delete(each));
    }
    
    @Test
    public void testDelete() {
        //playerService.save(new Player("player2"));
        playerService.delete(playerService.retriveAll().get(0));
        Assert.assertEquals(0, playerService.retriveAll().size());
    }
    @Test
    public void testSave() {
        playerService.save(new Player("player2"));
        Assert.assertEquals(1, playerService.retriveAll().size());
    }
    

}
