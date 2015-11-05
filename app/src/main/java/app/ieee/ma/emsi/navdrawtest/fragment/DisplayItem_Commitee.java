package app.ieee.ma.emsi.navdrawtest.fragment;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import app.ieee.ma.emsi.navdrawtest.R;
import app.ieee.ma.emsi.navdrawtest.classes.Commitee;
import app.ieee.ma.emsi.navdrawtest.viewHolder_class.ListCommitee;
import jp.wasabeef.recyclerview.animators.FlipInRightYAnimator;

/**
 * Created by idriss on 04/11/2015.
 */
public class DisplayItem_Commitee extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.committee_list);

       // initToolbar();
        ListCommittee();

    }

    public void initToolbar()
    {
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_white);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }

    public void ListCommittee()
    {


        // 1. get a reference to recyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_committee);

        Commitee commitee[] =
                {
                        new Commitee("General Co-chairs",
                                " * Mohamad Sawan, Polytechnique Montréal Canada\n" +
                                " * Kamal Daissaoui, EMSI Morocco"),
                        new Commitee("General Co-chairs",
                                "Mohamad Sawan, Polytechnique Montréal Canada\n" +
                                        "Kamal Daissaoui, EMSI Morocco"),
                        new Commitee("General Co-chairs",
                                "Mohamad Sawan, Polytechnique Montréal Canada\n" +
                                        "Kamal Daissaoui, EMSI Morocco"),
                        new Commitee("General Co-chairs",
                                "Mohamad Sawan, Polytechnique Montréal Canada\n" +
                                        "Kamal Daissaoui, EMSI Morocco"),
                        new Commitee("General Co-chairs",
                                "Mohamad Sawan, Polytechnique Montréal Canada\n" +
                                        "Kamal Daissaoui, EMSI Morocco")

                };


        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // 3. create an adapter
        ListCommitee mAdapter = new ListCommitee(commitee);
        // 4. set adapter
        recyclerView.setAdapter(mAdapter);
        // 5. set item animator
        recyclerView.setItemAnimator(new FlipInRightYAnimator());

    }


}
