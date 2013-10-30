/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;



import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Mark
 */
@Named
@RequestScoped
public class MovieBean implements Serializable{

    /**
     * Creates a new instance of MovieBean
     */
    public MovieBean() {
    }
    
    private static Map<String,Object> movieList;
	static{
		movieList = new LinkedHashMap<String,Object>();
		movieList.put("The Princess Bride", "The Princess Bride"); //label, value
		movieList.put("Serenity", "Serenity");
		movieList.put("Thor", "Thor");
                movieList.put("Alien","Alien");
	}
 
	public Map<String,Object> getMovieList() {
		return movieList;
	}
    
}
