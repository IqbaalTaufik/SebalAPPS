package com.example.mainidle

data class dbfrenlist(val nama : String,val imagee : Int){
    companion object{
        fun Datafren() : ArrayList<dbfrenlist>{
            val list = ArrayList<dbfrenlist>()
            list.add(dbfrenlist("Fikri",R.drawable.sfik))
            list.add(dbfrenlist("Muiz",R.drawable.seiz))
            list.add(dbfrenlist("Faiz",R.drawable.skis))
            list.add(dbfrenlist("Devi",R.drawable.sdev))
            return list
        }
    }
}