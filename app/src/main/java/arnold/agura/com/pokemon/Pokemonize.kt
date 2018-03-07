package arnold.agura.com.pokemon

/**
 * Created by Arnold on 7 Mar 2018.
 */
data class Pokemonize (
        val id: Int,
        val name: String,
        val sprites: Sprites
)
data class Sprites(
        val front_default: String
)