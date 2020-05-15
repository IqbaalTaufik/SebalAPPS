package com.example.mainidle

data class DataGaeri(val nama : String,val image : Int){
    companion object{
        fun Datagal() : ArrayList<DataGaeri>{
            val list = ArrayList<DataGaeri>()
            list.add(
                DataGaeri("a", R.drawable.splashlogo)
            )
            return list
        }
    }
}