package app.lixiasn.listviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/**
 * Created by leeee
 *
 */

public  class ToolBarActivity extends AppCompatActivity {
    private ToolBarHelper mToolBarHelper;
    public Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * @param layoutResID  组件rootView_
     */
    @Override
    public void setContentView(int layoutResID) {
        mToolBarHelper = new ToolBarHelper(this, layoutResID);
        toolbar = mToolBarHelper.getToolBar();
        setContentView(mToolBarHelper.getContentView());
        setSupportActionBar(toolbar);
    }

    /**
     * /自定义的布局
     * @param toolbar
     * @param layoutid
     */
    public void onCreateCustomToolBar(Toolbar toolbar,int layoutid) {
        toolbar.setContentInsetsRelative(0, 0);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * 获取toolbarHelper
     * @return
     */
    public ToolBarHelper getToolBarHelper(){
        if(mToolBarHelper!=null){
            return mToolBarHelper;
        }
        return null;
    }

}
