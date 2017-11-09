package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.runner.RunWith;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by Deniz Kalem on 08.11.17.
 */
@RunWith(AndroidJUnit4.class)
public class FunctionalTest
{

  public void retrievesNonEmptyString()
  {
    String result = null;
    EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
    endpointsAsyncTask.execute();

    try
    {
      result = endpointsAsyncTask.get();
      Log.d("TEST", "Retrieved a non-empty string successfully: " + result);
    } catch(Exception e)
    {
      e.printStackTrace();
    }

    assertNotNull(result);
  }
}
