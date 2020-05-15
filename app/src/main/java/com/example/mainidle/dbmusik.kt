package com.example.mainidle

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