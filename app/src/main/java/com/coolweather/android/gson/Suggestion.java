package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/5/13.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("uv")
    public Ultraviole ultraviole;

    public Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;
    }

    public class Ultraviole{

        @SerializedName("txt")
        public String info;
    }

    public class Sport{

        @SerializedName("txt")
        public String info;
    }
}
