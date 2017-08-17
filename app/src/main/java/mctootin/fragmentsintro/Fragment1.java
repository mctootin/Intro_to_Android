package mctootin.fragmentsintro;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by dingn on 8/15/2017.
 */

public class Fragment1 extends Fragment{

    private Button btnNavFrag1;
    private Button btnNavFrag2;
    private Button btnNavFrag3;
    private Button btnNavSecondActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState){
        // difference between fragment and activity is onCreateView vs onCreate
        // fragments have to create a view and return it
        View view = inflater.inflate(R.layout.fragment1_layout,container,false);
        Toast.makeText(getActivity(),"Going to Fragment 1",Toast.LENGTH_SHORT).show();

       /**
        btnNavFrag1 = (Button) view.findViewById(R.id.btnNavFrag1);
        btnNavFrag2 = (Button) view.findViewById(R.id.btnNavFrag2);
        btnNavFrag3 = (Button) view.findViewById(R.id.btnNavFrag3);
        //btnNavSecondActivity = (Button) view.findViewById(R.id.btnNavSecondActivity);

        btnNavFrag1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getActivity(),"Going to Fragment 1",Toast.LENGTH_SHORT).show();
                // navigate to fragment method
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });

        btnNavFrag2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getActivity(),"Going to Fragment 2",Toast.LENGTH_SHORT).show();
                // navigate to fragment

                //give us access to any methods within MainActivity
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });

        btnNavFrag3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getActivity(),"Going to Fragment 3",Toast.LENGTH_SHORT).show();
                // navigate to fragment method
                ((MainActivity)getActivity()).setViewPager(2);
            }
        });
        */

        /**

        btnNavSecondActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getActivity(),"Going to SecondActivity",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(),SecondActivity.class);
                startActivity(intent);
            }
        });
         */
        return view;
    }
}
