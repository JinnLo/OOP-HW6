package fcu.iecs.oops.hw6;

import java.util.Random;

import fcu.iecs.oops.hw6.Pokemon.PokemonType;

public class GYM {

	public static Player fight(Player p1,Player p2){
	
		Pokemon[] pkm1 = p1.getPokemons();
		Pokemon[] pkm2 = p2.getPokemons();
		Random ran = new Random();
	    int count1=0,count2=0;
	    do{
        for(int j=0;j<pkm1.length;j++){
        	if(PokemonType.FIRE.compareTo(PokemonType.GRASS)==1
    				||PokemonType.GRASS.compareTo(PokemonType.WATER)==1
    				||PokemonType.WATER.compareTo(PokemonType.FIRE)==1){
        		if(pkm1[j].getType().compareTo(pkm2[j].getType())==1){
            
            			count1++;
         		
            		
        	    } 
        		else if(pkm2[j].getType().compareTo(pkm1[j].getType())==1){
        			count2++;
        		}
        	}
        	if(pkm1[j].getType().compareTo(pkm2[j].getType())==0){
        		if(pkm1[j].getCp()>pkm2[j].getCp()){
        			count1++;
        		}
        		else if(pkm1[j].getCp()>pkm2[j].getCp()){
        			count2++;
        		}
        		else{
        			int temp = ran.nextInt(2)+1;
        	        if(temp == 1){
        	        	
        	        	count1++;
        	        }
        	        else
        	        {
        	        	
        	        	count2++;
        	        }
        		}
        	}
        
       }
      }while(count1==2||count2==2);
        if(count1==2){
        	   p1.setLevel(1);
		        System.out.println("The Winner is "+ p1.getPlayerName()+",and his/her level becomes "+ p1.getLevel());
		        return p1;
        }
        else{
        	  p2.setLevel(1);
		        System.out.println("The Winner is "+ p2.getPlayerName()+",and his/her level becomes "+ p2.getLevel());
		        return p2;
        }
		
		
	    
	}
	
}
