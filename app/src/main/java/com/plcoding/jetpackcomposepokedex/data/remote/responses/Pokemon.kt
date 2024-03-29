package com.plcoding.jetpackcomposepokedex.data.remote.responses

data class Pokemon(
    val base_experience: Int,
    val height: Int,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val name: String,
    val order: Int,
    val past_types: List<Any>,
    val stats: List<Stat>,
    val types: List<Type>,
    val weight: Int,
    val sprites: Sprites,

)