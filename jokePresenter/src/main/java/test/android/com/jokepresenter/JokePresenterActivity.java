package test.android.com.jokepresenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokePresenterActivity extends AppCompatActivity
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_joke_presenter);

    String jokeResult = getIntent().getStringExtra("result");
    TextView result = (TextView) findViewById(R.id.tv_result);
    result.setText(jokeResult);
  }
}
