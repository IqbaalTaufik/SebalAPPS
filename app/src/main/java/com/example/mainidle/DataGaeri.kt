package com.example.mainidle
//NIM : 10117188
//KELAS : IF-5
//NAMA : MUHAMMAD IQBAL TAUFIK
//TGL PENGERJAAN : 05-05-2020 S/D 15-05-2020
data class DataGaeri(val nama : String,val image : Int){
    companion object{
        fun Datagal() : ArrayList<DataGaeri>{
            val list = ArrayList<DataGaeri>()
            list.add(DataGaeri("a", R.drawable.splashlogo))
            return list
        }
    }
}