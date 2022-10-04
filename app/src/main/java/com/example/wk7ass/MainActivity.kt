package com.example.wk7ass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wk7ass.databinding.ActivityMainBinding
import com.google.android.material.appbar.AppBarLayout

class MainActivity : AppCompatActivity() {
    private lateinit var RecyclerView: RecyclerView
    private lateinit var toolbar: Toolbar
//    private lateinit var appBarLayout: AppBarLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar =findViewById(R.id.tool_bar)
        setSupportActionBar(toolbar)

        RecyclerView = findViewById(R.id.list_of_friends)
        RecyclerView.layoutManager= LinearLayoutManager(this)
        RecyclerView.adapter= friendsAdapter(this)

        val decor = DividerItemDecoration(this, androidx.recyclerview.widget.RecyclerView.VERTICAL)
        RecyclerView.addItemDecoration(decor)




    }
}