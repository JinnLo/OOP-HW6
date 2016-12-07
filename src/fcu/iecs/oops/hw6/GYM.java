package fcu.iecs.oops.hw6;

import fcu.iecs.oops.hw6.Pokemon.PokemonType;

public class GYM {

	public static Player fight(Player p1,Player p2){
	
		//Pokemon[] pkm1 = p1.getPokemons();
		//Pokemon[] pkm2 = p2.getPokemons();
	 
	

		if(PokemonType.FIRE.compareTo(PokemonType.GRASS)==1
				||PokemonType.GRASS.compareTo(PokemonType.WATER)==1
				||PokemonType.WATER.compareTo(PokemonType.FIRE)==1){
			
			    p1.setLevel(1);
		        System.out.println("The Winner is "+ p1.getPlayerName()+",and his/her level becomes "+ p1.getLevel());
		        }
		else{
			p2.setLevel(1);
	        System.out.println("The Winner is "+ p2.getPlayerName()+",and his/her level becomes "+ p2.getLevel());

		}
		return p1;
		
		
	}
	
}
