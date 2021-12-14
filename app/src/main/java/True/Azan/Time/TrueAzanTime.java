package True.Azan.Time;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.azanapitime.R;
import com.example.azanapitime.databinding.ActivityMainBinding;

import java.util.List;

import True.Azan.Time.classadopter.PostAdapter;
import True.Azan.Time.jsonObject.MyObject;
import True.Azan.Time.jsonObject.Times;
import True.Azan.Time.model.PostModel;
import True.Azan.Time.model.PostViewModel;

public class TrueAzanTime extends AppCompatActivity {

    PostViewModel postViewModel;
    ActivityMainBinding binding ;

    //"https://jsonplaceholder.typicode.com/";         //  https://api.pray.zone/v2/times/day.json
    //    private static Interface iinterface;  // https://awkat-salat.org/api/docs/day?fbclid=IwAR1dY1-5WOhgcv2lEtTl67oe1iHKUemhS8NIR69UnBSqwwxG-zEiwuFtsP4
    //    private static PostClintData INSTANS;   // https://jsonplaceholder.typicode.com/
    // // https://api.pray.zone/v2/times/day.json?city=mecca&date=2020-10-01

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        binding = DataBindingUtil.setContentView( this,R.layout.activity_main );

// https://www.youtube.com/watch?v=pEDVdSUuWXE
       // https://www.youtube.com/watch?v=y2xtLqP8dSQ&t=33s
        // https://www.youtube.com/watch?v=HZnLbJ3nvMc&list=PLXjbGq0ERjFoCtb7aH910dtddLePNI6w7&index=8

        postViewModel = ViewModelProviders.of( this ).get( PostViewModel.class );
        postViewModel.getPosts();
//        RecyclerView recyclerView = findViewById( R.id.recycler );
//       final PostAdapter adapter = new PostAdapter();
//        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
//        recyclerView.setAdapter( adapter );

    postViewModel.postsMutableLiveData.observe( this, new Observer<MyObject>() {
            @Override
            public void onChanged(MyObject postModels) {
//                adapter.setList( postModels );
                Log.e( "","" );
                Times result  = postModels.getResults().getDatetime().get( 0 ).getTimes();
                binding.txt1.setText( " الفجر : " + result.getFajr());
                binding.txt2.setText( " الظهر : " + result.getDhuhr());
                binding.txt3.setText( " العصر : " + result.getAsr());
                binding.txt4.setText( " المغرب : " + result.getMaghrib());
                binding.txt5.setText( " العشاء : " + result.getIsha());
            }
        } );
    }
}