package example.com.checkstand;

import android.os.Bundle;

import java.util.List;

import example.com.checkstand.bean.OrderDetail;

/**
 * Created by laizuhong on 2015/10/10.
 */
public class OrderActivity extends BaseActivity{

    List<OrderDetail> orderDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        initDate();
    }

    private void initDate(){


        //orderDetails.add(new OrderDetail(0,20151010,120,120,2010-10-10,"laizuhong",123456,"待处理","送货","发货"));
    }
}
