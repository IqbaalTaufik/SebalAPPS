package com.example.mainidle
//NIM : 10117188
//KELAS : IF-5
//NAMA : MUHAMMAD IQBAL TAUFIK
//TGL PENGERJAAN : 05-05-2020 S/D 15-05-2020
data class dbmusik(val nama : String){
    companion object{
        fun Datamusk() : ArrayList<dbmusik>{
            val list = ArrayList<dbmusik>()
            list.add(dbmusik("Billy Eilish - wish you we're gay "))
            list.add(dbmusik("Billy Eilish - Party favor "))
            return list
        }
    }
}