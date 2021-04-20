package org.richit.advancedrecyclerview.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class App implements Parcelable {
    String title;
    String description;

    public App(String title, String description) {
        this.title = title;
        this.description = description;
    }

    protected App(Parcel in) {
        title = in.readString();
        description = in.readString();
    }

    public static final Creator<App> CREATOR = new Creator<App>() {
        @Override
        public App createFromParcel(Parcel in) {
            return new App( in );
        }

        @Override
        public App[] newArray(int size) {
            return new App[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString( title );
        parcel.writeString( description );
    }
}
