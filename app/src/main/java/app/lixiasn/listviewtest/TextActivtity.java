package app.lixiasn.listviewtest;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by leeee
 *
 * 测试Toobar
 */

public class TextActivtity extends ToolBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        onCreateCustomToolBar(getToolBarHelper().getToolBar(),R.layout.toobar_button);
    }

    @Override
    public void onCreateCustomToolBar(Toolbar toolbar,int layout) {
        super.onCreateCustomToolBar(toolbar,layout);
        toolbar.showOverflowMenu() ;
        getLayoutInflater().inflate(layout, toolbar) ;
//        TextView btn = (TextView) toolbar.findViewById(R.id.id_txt_btn);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(v.getContext(),"test",Toast.LENGTH_SHORT).show();
//            }
//        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        MenuItem itemCompat = menu.findItem(R.id.action_search) ;
//        SearchView mSearchView = (SearchView) MenuItemCompat.getActionView(itemCompat);
//        mSearchView.setIconified(false);
//        mSearchView.setIconifiedByDefault(false);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Snackbar.make(toolbar,"Click Shake",Snackbar.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


