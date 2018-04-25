package com.azhar.footballplayer;

import android.os.Parcel;
import android.os.Parcelable;


public class PlayerItem implements Parcelable{
    private String no, name, Position, birth_date, Poster;

    public PlayerItem(String no, String name, String Position, String birth_date, String Poster ) {
        this.no = no;
        this.name = name;
        this.Position = Position;
        this.birth_date = birth_date;
        this.Poster = Poster;
    }


    public String getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return Position;
    }

    public String getBirth_date(){
        return birth_date;
    }

    public String getPoster() {
        return Poster;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public void setPoster(String poster) {
        Poster = poster;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.no);
        parcel.writeString(this.name);
        parcel.writeString(this.Position);
        parcel.writeString(this.birth_date);
        parcel.writeString(this.Poster);
    }

    public PlayerItem(){
    }

    protected PlayerItem(Parcel in ){
        this.no = in.readString();
        this.name = in.readString();
        this.Position = in.readString();
        this.birth_date = in.readString();
        this.Poster = in.readString();
    }

    public static final Parcelable.Creator<PlayerItem> CREATOR = new Parcelable.Creator<PlayerItem>(){

        @Override
        public PlayerItem createFromParcel(Parcel source) {
            return new PlayerItem(source);
        }

        @Override
        public PlayerItem[] newArray(int size) {
            return new PlayerItem[size];
        }
    };
}