/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.adapter

import android.content.Context
import android.provider.Settings.Global.getString
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.data.DataSource
import com.example.dogglers.model.Dog

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    val dogs: List<Dog> = DataSource.dogs

    /**
     * Initialize view elements
     */
    class DogCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val dog_image: ImageView = view!!.findViewById(R.id.item_image)
        val dog_name: TextView = view!!.findViewById(R.id.item_name)
        val dog_age: TextView = view!!.findViewById(R.id.item_age)
        val dog_hobbies: TextView = view!!.findViewById(R.id.item_hobbies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        val adapterLayout: View = when (layout){
            3 -> LayoutInflater.from(parent.context)
                .inflate(R.layout.grid_list_item, parent, false)
            else -> LayoutInflater.from(parent.context)
                .inflate(R.layout.vertical_horizontal_list_item, parent, false)
        }

        return DogCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int = dogs.size

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val item = dogs[position]
        holder.dog_image.setImageResource(item.imageResourceId)
        val resources = context?.resources
        holder.dog_name.text = resources?.getString(R.string.dog_name, item.name)
        holder.dog_age.text = resources?.getString(R.string.dog_age, item.age)
        holder.dog_hobbies.text = resources?.getString(R.string.dog_hobbies, item.hobbies)
    }
}
