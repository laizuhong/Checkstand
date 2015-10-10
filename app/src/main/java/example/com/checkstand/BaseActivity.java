package example.com.checkstand;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.WindowCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by laizuhong on 2015/10/10.
 */
public class BaseActivity extends AppCompatActivity implements View.OnClickListener{


    String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
    TextView time;
    int year,month,day,week,hous,minute,second;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 设置窗口风格为顶部显示Actionbar
        supportRequestWindowFeature(WindowCompat.FEATURE_ACTION_BAR);

        ActionBar actionBar = getSupportActionBar();

        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        View mCustomView = getLayoutInflater().inflate(
                R.layout.layout_actionbar, null);
        time= (TextView) mCustomView.findViewById(R.id.time);
        actionBar.setCustomView(mCustomView, new ActionBar.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        ActionBar.LayoutParams mP = (ActionBar.LayoutParams) mCustomView
                .getLayoutParams();
        mP.gravity = mP.gravity & ~Gravity.HORIZONTAL_GRAVITY_MASK
                | Gravity.CENTER_HORIZONTAL;
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_back);
        actionBar.setCustomView(mCustomView, mP);
        timer=new Timer();
        timer.schedule(task, 1000, 1000);
    }


   Handler handler=new Handler(){
       @Override
       public void handleMessage(Message msg) {
           super.handleMessage(msg);
           time.setText(year + "-" + month + "-" + day + " " + weekDays[week] + " " + hous + ":" + minute+":"+second);
       }
   };


    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            showtime();
        }
    };


    private void showtime(){
        Date date=new Date();
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);

         year=calendar.get(Calendar.YEAR);
         month=calendar.get(Calendar.MONTH);
         day=calendar.get(Calendar.DAY_OF_MONTH);
         week=calendar.get(Calendar.DAY_OF_WEEK)-1;
         hous=calendar.get(Calendar.HOUR);
         minute=calendar.get(Calendar.MINUTE);
        second=calendar.get(Calendar.SECOND);
        handler.sendEmptyMessage(1);

    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:// 点击返回图标事件
                this.finish();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.myinfo:
                break;
        }
    }
}
