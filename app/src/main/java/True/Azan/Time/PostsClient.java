package True.Azan.Time;

import java.util.List;

import True.Azan.Time.interfacess.PostInterface;
import True.Azan.Time.jsonObject.MyObject;
import True.Azan.Time.model.PostModel;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostsClient {   // https://api.pray.zone/v2/times/day.json?city=mecca&date=2020-10-01/
   private static final String BASE_URL = "https://api.pray.zone/v2/times/";                            //  REST APIs     Retrofit
   private PostInterface postInterface;
   private static PostsClient INSTANCE;

    public PostsClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl( BASE_URL )
                .addConverterFactory( GsonConverterFactory.create() )
                .build();
        postInterface = retrofit.create( PostInterface.class );
    }

    public static PostsClient getINSTANCE() {
        if (null == INSTANCE){
            INSTANCE = new PostsClient();
        }
        return INSTANCE;
    }
    public Call<MyObject> getPosts(){
        return postInterface.getPosts();
    }
}
