package at.markushi.circlebutton.example;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	public static class PlaceholderFragment extends Fragment implements View.OnClickListener {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			final View rootView = inflater.inflate(R.layout.fragment_main, container, false);

			rootView.findViewById(R.id.button0).setOnClickListener(this);
			rootView.findViewById(R.id.button1).setOnClickListener(this);
			rootView.findViewById(R.id.button2).setOnClickListener(this);

			return rootView;
		}

		@Override
		public void onClick(View view) {
			Toast.makeText(getActivity(), "Button clicked", Toast.LENGTH_SHORT).show();
		}
	}

}
