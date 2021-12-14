package True.Azan.Time.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import True.Azan.Time.PostsClient;
import True.Azan.Time.jsonObject.MyObject;
import True.Azan.Time.model.PostModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostViewModel extends ViewModel {
    public MutableLiveData<MyObject> postsMutableLiveData = new MutableLiveData<>(  );
    MutableLiveData<String> posts = new MutableLiveData<>();
    public void getPosts(){
        PostsClient.getINSTANCE().getPosts().enqueue( new Callback<MyObject>() {
            @Override
            public void onResponse(Call<MyObject> call, Response<MyObject> response) {
                postsMutableLiveData.setValue( response.body() );
            }

            @Override
            public void onFailure(Call<MyObject> call, Throwable t) {
                posts.setValue("errr");
            }
        } );
    }
}
