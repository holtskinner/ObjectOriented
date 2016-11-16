/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skinnerhpokedex;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.json.simple.*;

/**
 *
 * @author holtskinner
 */
public class PokedexManager {
    
    //Add the number of the pokemon at the end to get the data (1-151)
    private final String baseUrl = "http://pokeapi.co/api/v2/pokemon/";
    private final String baseUrlForImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/";
    
    private String urlString = "";
    private URL url;
    
    private String pokemonFilePath = "";
    private ArrayList<Pokemon> pokemonArray;
    int numberOfPokemon = 151;
    
    public PokedexManager() {
        //All Pokemon from API
        pokemonArray = new ArrayList<>();
    }
    
    public void callAPI() throws Exception {
        
        //Check for json file in package
//        File pokemonFile = new File(pokemonFilePath);
//        if (!pokemonFile.exists()) {
//            
//        }
        
        String jsonString = "";
        BufferedReader in;
        String inputLine = "";
        
        //Get first 151 Pokemon (first gen)
        for (int i = 1; i <= numberOfPokemon; i++) {
            
            urlString = baseUrl + String.valueOf(i); //Add id of pokemon to API URL string
            
            try {
                url = new URL(urlString);
            } catch (MalformedURLException muex) {
               throw muex;
            }
            
            try {
                in = new BufferedReader(
                new InputStreamReader(url.openStream()));

                while ((inputLine = in.readLine()) != null) {
                  jsonString += inputLine;  
                }

                in.close();

            } catch (IOException ioex) {
                throw ioex;
            }
            
             try {
                parseJSONData(jsonString);
            } catch (Exception ex) {
                throw ex;
            }
             
        }//end for
    }
    
    private void parseJSONData(String jsonString) throws Exception{
        
        if(jsonString == null || jsonString.equals("")) {
            return;
        }
        
        JSONObject tempObject;
        
        try {
            tempObject = (JSONObject)JSONValue.parse(jsonString);
        } catch (Exception ex) {
            throw ex;
        }
        
    }
    
    public ArrayList<Pokemon> getPokemons() {
        return pokemonArray;
    }
}
