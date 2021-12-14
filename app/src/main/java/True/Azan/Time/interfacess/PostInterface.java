package True.Azan.Time.interfacess;

import java.util.List;

import True.Azan.Time.jsonObject.MyObject;
import True.Azan.Time.model.PostModel;
import retrofit2.Call;
import retrofit2.http.GET;     //  https://api.pray.zone/v2/times/day.json?city=mecca&date=2020-10-01

public interface PostInterface {

    @GET("day.json?city=mecca&date=2020-10-01")
    public Call<MyObject> getPosts();

}



// https://awkat-salat.org/api/docs/day?fbclid=IwAR1dY1-5WOhgcv2lEtTl67oe1iHKUemhS8NIR69UnBSqwwxG-zEiwuFtsP4#
// https://awkat-salat.org/api/docs/day?fbclid=IwAR0og6vF9v2rih6EX3DXEZ3BKhLutZmWLcv8e_At347Zw3jG3TVK6NWET7E

// https://stackoverflow.com/questions/47707564/how-to-use-robopojogenerator-to-automatically-generate-model-class-from-json-in?fbclid=IwAR2aUWfuWoMeZa6DNxeviD0ch_xiy5MImTS1U4nxtd8UmArJT4zC_b0MkNM
// https://www.youtube.com/watch?v=XuqmMcTJzkU&list=PLXjbGq0ERjFqhIXvkiOsaoTUXdetg82J1&index=2


// https://www.youtube.com/watch?v=HZnLbJ3nvMc&list=PLXjbGq0ERjFoCtb7aH910dtddLePNI6w7&index=8