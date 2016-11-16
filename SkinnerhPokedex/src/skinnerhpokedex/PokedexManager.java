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
    
    private final String baseUrl = "http://pokeapi.co/api/v2/";
    private String urlString = "";
    
    private String pokemonFilePath = "";
    private ArrayList<Pokemon> pokemonArray;
    
    public PokedexManager() {
        //Check for json file in package
        File pokemonFile = new File(pokemonFilePath);
        if (!pokemonFile.exists()) {
            
        }
        pokemonArray = new ArrayList<>();
    }
    
    private void callAPI() {
        
    }
}
