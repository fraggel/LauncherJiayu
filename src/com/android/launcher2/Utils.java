package com.android.launcher2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.util.TypedValue;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utils
{
    public static String convertStreamToString(InputStream paramInputStream)
            throws Exception
    {
        BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream));
        StringBuilder localStringBuilder = new StringBuilder();
        while (true)
        {
            String str = localBufferedReader.readLine();
            if (str == null)
                return localStringBuilder.toString();
            localStringBuilder.append(str).append("\n");
        }
    }

    public static void deleteAllSharedPreferences(Context paramContext)
    {
        PreferenceManager.getDefaultSharedPreferences(paramContext).edit().clear().commit();
    }

    public static void deleteSharedPreferences(Context paramContext, String paramString)
    {
        PreferenceManager.getDefaultSharedPreferences(paramContext).edit().remove(paramString).commit();
    }

    public static int dpToPx(Resources paramResources, int paramInt)
    {
        return (int)TypedValue.applyDimension(1, paramInt, paramResources.getDisplayMetrics());
    }

    public static String getSharedPreferences(Context paramContext, String paramString1, String paramString2)
    {
        if ((paramString2 == null) || (paramString2.equalsIgnoreCase("")))
            paramString2 = "";
        return PreferenceManager.getDefaultSharedPreferences(paramContext).getString(paramString1, paramString2);
    }

    public static boolean getSharedPreferencesBoolean(Context paramContext, String paramString, boolean paramBoolean)
    {
        return PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean(paramString, paramBoolean);
    }

    public static float getSharedPreferencesFloat(Context paramContext, String paramString, float paramFloat)
    {
        return PreferenceManager.getDefaultSharedPreferences(paramContext).getFloat(paramString, paramFloat);
    }

    public static int getSharedPreferencesInt(Context paramContext, String paramString, int paramInt)
    {
        return PreferenceManager.getDefaultSharedPreferences(paramContext).getInt(paramString, paramInt);
    }

    public static void setSharedPreferences(Context paramContext, String paramString1, String paramString2)
    {
        SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(paramContext).edit();
        localEditor.putString(paramString1, paramString2);
        localEditor.commit();
    }

    public static void setSharedPreferencesBoolean(Context paramContext, String paramString, boolean paramBoolean)
    {
        SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(paramContext).edit();
        localEditor.putBoolean(paramString, paramBoolean);
        localEditor.commit();
    }

    public static void setSharedPreferencesFloat(Context paramContext, String paramString, float paramFloat)
    {
        SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(paramContext).edit();
        localEditor.putFloat(paramString, paramFloat);
        localEditor.commit();
    }

    public static void setSharedPreferencesInt(Context paramContext, String paramString, int paramInt)
    {
        SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(paramContext).edit();
        localEditor.putInt(paramString, paramInt);
        localEditor.commit();
    }
}
