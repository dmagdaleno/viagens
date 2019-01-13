package com.dmagdaleno.viagens.model

import android.os.Parcel
import android.os.Parcelable

data class Pacote(
        val imagem: String = "indefinido",
        val local: String = "indefinido",
        val dias: Int = 0,
        val preco: Double = 0.0
): Parcelable {

    constructor(parcel: Parcel) : this(
            imagem = parcel.readString(),
            local = parcel.readString(),
            dias = parcel.readInt(),
            preco = parcel.readDouble())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(imagem)
        parcel.writeString(local)
        parcel.writeInt(dias)
        parcel.writeDouble(preco)
    }

    override fun describeContents() = 0

    companion object CREATOR : Parcelable.Creator<Pacote> {
        override fun createFromParcel(parcel: Parcel): Pacote {
            return Pacote(parcel)
        }

        override fun newArray(size: Int): Array<Pacote?> {
            return arrayOfNulls(size)
        }
    }
}