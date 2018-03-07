package arnold.agura.com.pokemon

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.pokemon.view.*

/**
 * Created by Arnold on 7 Mar 2018.
 */
class MainAdapter(val pokemonList: ArrayList<Pokemonize>): RecyclerView.Adapter<CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.pokemon, parent, false)
        return CustomViewHolder(cellForRow)  }

    override fun getItemCount(): Int {
        return pokemonList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
        val pokemon: Pokemonize = pokemonList[position]
        holder?.view?.pokemon_name?.text = pokemon.name
        val pokemonImage = holder?.view?.pokemon_image
        Picasso.with(holder?.view?.context).load(pokemon.sprites.front_default).into(pokemonImage)
    }

}

class CustomViewHolder (val view:View): RecyclerView.ViewHolder(view){

}
