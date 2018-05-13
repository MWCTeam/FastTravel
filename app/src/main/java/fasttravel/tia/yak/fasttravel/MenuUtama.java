package fasttravel.tia.yak.fasttravel;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import fasttravel.tia.yak.fasttravel.account.ProfileFragment;
import fasttravel.tia.yak.fasttravel.help.HelpFragment;
import fasttravel.tia.yak.fasttravel.home.HomeFragment;
import fasttravel.tia.yak.fasttravel.order.OrderFragment;

public class MenuUtama extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    showFragment("Home");
                    return true;
                case R.id.navigation_order:
                    showFragment("Order");
                    return true;
                case R.id.navigation_profile:
                    showFragment("Profile");
                    return true;
                case R.id.navigation_help:
                    showFragment("Help");
                    return true;
            }


            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.utama_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void showFragment(String fragmentTag) {
        Fragment fragment = getSupportFragmentManager().findFragmentByTag(fragmentTag);
        if (fragment == null) {
            switch (fragmentTag) {
                case "Home":
                    fragment = new HomeFragment();
                    break;
                case "Order":
                    fragment = new OrderFragment();
                    break;
                case "Help":
                    fragment = new HelpFragment();
                    break;
                case "Profile":
                    fragment = new ProfileFragment();
                    break;
            }
        }

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.utama_content, fragment, fragmentTag).commit();
    }
}
