package webService;

import java.util.List;
import java.util.Set;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.apache.commons.lang.StringUtils;
import model.Player;
import repository.PlayerRepository;
import service.PlayerService;

/**
 * 
 * 
 * @author cristian
 */
@Path("/player")
public class PlayerRest {

    public static final int NUMBER_OF_POST = 10;

    /**
     * IMPORTANTE!! - Acá deben inyectar el servicio de la aplicación y este
     * servicio REST solo debe hacer un delegate simple.
     */
    //private PostRepository postRepository;
    private PlayerService playerService;
    
    @GET
    @Path("/players")
    @Produces("application/json")
    public List<Player> getAllPlayers() {
        List<Player> posts = playerService.retriveAll();
        return posts;
    }
    
    /*

    @GET
    @Path("/{from}")
    @Produces("application/json")
    public List<Post> findPostsPublishedByBlogId(@PathParam("from") final Integer from) {
        List<Post> posts = postRepository.getPosts(from, NUMBER_OF_POST, "");
        return posts;
    }

    @GET
    @Path("/byAuthor/{id}")
    @Produces("application/json")
    public List<Post> findPostsPublishedByAuthorId(@PathParam("id") final String id) {
        List<Post> posts = postRepository.getPosts(id);
        return posts;
    }

    @GET
    @Path("/count")
    @Produces("application/json")
    public Integer countPostsPublishedByBlogId(@DefaultValue(StringUtils.EMPTY) @QueryParam("tag") final String tag) {
        return postRepository.getcount(tag);
    }

    @GET
    @Path("/tags")
    @Produces("application/json")
    public Set<String> getTagsByBlogId() {
        return postRepository.getTags();
    }
*/
    public void setPlayerService(final PlayerService playerDAO) {
        playerService = playerDAO;
    }

}
