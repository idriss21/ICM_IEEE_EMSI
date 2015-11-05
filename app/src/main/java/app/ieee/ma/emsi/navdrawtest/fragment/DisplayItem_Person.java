package app.ieee.ma.emsi.navdrawtest.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.OvershootInterpolator;

import app.ieee.ma.emsi.navdrawtest.R;
import app.ieee.ma.emsi.navdrawtest.classes.Person;
import app.ieee.ma.emsi.navdrawtest.viewHolder_class.ListPerson_ViewHolder;
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator;

/**
 * Created by idriss on 01/11/2015.
 */
public class DisplayItem_Person extends ActionBarActivity implements ListPerson_ViewHolder.ClickListner {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.list_person);
        //initToolbar();

        ListPerson();
    }
    public void initToolbar()
    {
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_white);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_action_ieee);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }

    public void ListPerson()
    {


        // 1. get a reference to recyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv);

        //ADD NEW PERSON ITEM IN MY RECYCLEVIEW
        Person person[] =   {
                new Person("Plusieurs variations de Lorem Ipsum peuvent etre trouvees ici ou , mais la majeure partie d entre elles a par l addition d humour ou de mots aleatoires qui ne ressemblent pas une seconde à du texte standard.","00/00/0000",R.drawable.profile),
                new Person("Plusieurs variations de Lorem Ipsum peuvent etre trouvees ici ou , mais la majeure partie d entre elles a par l addition d humour ou de mots aleatoires qui ne ressemblent pas une seconde à du texte standard.","00/00/0000",R.drawable.profile),
                new Person("Plusieurs variations de Lorem Ipsum peuvent etre trouvees ici ou , mais la majeure partie d entre elles a par l addition d humour ou de mots aleatoires qui ne ressemblent pas une seconde à du texte standard.","00/00/0000",R.drawable.profile),
                new Person("Plusieurs variations de Lorem Ipsum peuvent etre trouvees ici ou , mais la majeure partie d entre elles a par l addition d humour ou de mots aleatoires qui ne ressemblent pas une seconde à du texte standard.","00/00/0000",R.drawable.profile),
                new Person("Plusieurs variations de Lorem Ipsum peuvent etre trouvees ici ou , mais la majeure partie d entre elles a par l addition d humour ou de mots aleatoires qui ne ressemblent pas une seconde à du texte standard.","00/00/0000",R.drawable.profile),
                new Person("Plusieurs variations de Lorem Ipsum peuvent etre trouvees ici ou , mais la majeure partie d entre elles a par l addition d humour ou de mots aleatoires qui ne ressemblent pas une seconde à du texte standard.","00/00/0000",R.drawable.profile)
        };

        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // 3. create an adapter
        ListPerson_ViewHolder mAdapter = new ListPerson_ViewHolder(person);
        mAdapter.setClickListner(this);
        // 4. set adapter
        recyclerView.setAdapter(mAdapter);
        // 5. set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new SlideInUpAnimator(new OvershootInterpolator(1f)));

    }

    @Override
    public void itemClicked(View v, int Position) {

        startActivity(new Intent(getApplicationContext(), Keynotes_frame.class));
    }


}
