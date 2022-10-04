package com.example.wk7ass

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class friendsAdapter(val context:Context):RecyclerView.Adapter<friendsViewHolder>() {

    val samplefriend=FriendsData()
    val listoffriends=samplefriend.LIST_OF_FRIENDS

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): friendsViewHolder {
        val itemView:View = LayoutInflater.from(context).inflate(R.layout.friends_layout,parent, false)
        return friendsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: friendsViewHolder, position: Int) {
        holder.username.text=listoffriends[position].name
        holder.gender.text=listoffriends[position].gender
        holder.profilepic.setImageResource(listoffriends[position].drawableResource)
    }

    override fun getItemCount(): Int {
        return listoffriends.size
    }
}
class friendsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var username:TextView=itemView.findViewById(R.id.username)
    var gender:TextView=itemView.findViewById(R.id.gender)
    var profilepic:ImageView=itemView.findViewById(R.id.profile_pic)

}