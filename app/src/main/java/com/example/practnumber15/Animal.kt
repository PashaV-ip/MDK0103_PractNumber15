package com.example.practnumber15

import android.os.Parcel
import android.os.Parcelable

class Animal() : Parcelable {
    private var type: String = ""
    private var breed: String = ""
    private var year: String = ""
    private var month: String = ""

    constructor(parcel: Parcel) : this() {
        type = parcel.readString().toString()
        breed = parcel.readString().toString()
        year = parcel.readString().toString()
        month = parcel.readString().toString()
    }
    companion object CREATOR : Parcelable.Creator<Animal> {
        override fun createFromParcel(parcel: Parcel): Animal {
            return Animal(parcel)
        }

        override fun newArray(size: Int): Array<Animal?> {
            return arrayOfNulls(size)
        }
    }

    constructor(_type: String, _breed: String, _year: String, _month: String) : this() {
        type = _type
        breed = _breed
        year = _year
        month = _month
    }
    fun setType(_type: String){
        type = _type
    }
    fun getType(): String{
        return type
    }
    fun setBreed(_breed: String){
        breed = _breed
    }
    fun getBreed(): String{
        return breed
    }
    fun setYear(_year: String){
        year = _year
    }
    fun getYear(): String{
        return year
    }
    fun setMonth(_month: String){
        month = _month
    }
    fun getMonth(): String{
        return month
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(type)
        dest?.writeString(breed)
        dest?.writeString(year)
        dest?.writeString(month)
    }
}