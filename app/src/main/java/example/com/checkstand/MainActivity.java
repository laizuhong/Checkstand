package example.com.checkstand;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    GridView gridView;
    String[] menu;
    int[] res={R.drawable.cashier,
            R.drawable.order,
            R.drawable.goods,
            R.drawable.synchronous,
            R.drawable.returngoods,
            R.drawable.stores,
            R.drawable.user,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
       init();
    }

    private void init(){
        menu=getResources().getStringArray(R.array.main_menu);
        gridView= (GridView) findViewById(R.id.menu_gridview);
        gridView.setAdapter(new GridViewAdapter());
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent();
                switch (position){
                    case 0:
                        break;
                    case 1:
                        intent.setClass(MainActivity.this, OrderActivity.class);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }
                startActivity(intent);
            }
        });
    }



    class GridViewAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return menu.length;
        }

        @Override
        public Object getItem(int position) {
            return menu[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView=getLayoutInflater().inflate(R.layout.item_grid,null);
            TextView textView= (TextView) convertView.findViewById(R.id.text);
            ImageView imageView= (ImageView) convertView.findViewById(R.id.image);
            textView.setText(menu[position]);
            imageView.setBackgroundResource(res[position]);
            return convertView;
        }
    }
}
