package com.bernd.tierkreiszeichen;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class MeinTierkreiszeichenActivity extends ListActivity implements OnItemClickListener {
	
	private TierkreiszeichenAdapter adapter;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // hier werden die Tierkreiszeichen gespeichert
        adapter = new TierkreiszeichenAdapter(this);
//        setContentView(R.layout.main);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }
    
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
    		long id) {
    	Tierkreiszeichen zeichen = (Tierkreiszeichen) adapter.getItem(position);
    	String url = getString(R.string.wikipedia_url, zeichen.getName(this));
    	Intent viewIntent = new Intent("android.intent.action.VIEW",
    			Uri.parse(url));
		startActivity(viewIntent);
    }
}