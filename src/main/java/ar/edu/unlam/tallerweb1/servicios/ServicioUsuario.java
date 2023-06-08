package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Objeto;
import ar.edu.unlam.tallerweb1.modelo.Pokemon;
import ar.edu.unlam.tallerweb1.modelo.RarezaPokemon;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface ServicioUsuario {

	void guardarEquipo(String[] pokemons,Long id);

	Usuario buscarUsuario(Long idUsuario);
	
	public List<Pokemon> obtenerListaDePokemons(Long idUsuario);

	Boolean restarPuntos(Integer monedas, Usuario usuario);

	public List<Objeto> obtenerListaDeObjetos(Long attribute);

	void sumarPuntos(Long idUsuario, Integer puntos);

	void sumarpokeMonedas(RarezaPokemon rarezaPokemon, Usuario usuario);
	
	void sumarTiradasComunes(Usuario usuario);
	
	void sumarTiradasTotales(Usuario usuario);

	void reiniciarTiradasComunes(Usuario usuario);
	
	void reiniciarTiradasTotales(Usuario usuario);

}