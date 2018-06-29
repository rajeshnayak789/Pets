package com.example.android.pets.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.logging.Handler;

/**
 * {@link ContentProvider} for Pets app.
 */
public class PetProvider extends ContentProvider
{
    /** Tag for the log messages */
    public static  final String LOG_TAG=PetProvider.class.getSimpleName();

    /**
     * Initialize the provider and the database helper object.
     */
    private PetDbHelper mDbHelper;
    @Override
    public boolean onCreate()
    {
        // TODO: Create and initialize a PetDbHelper object to gain access to the pets database.
        // Make sure the variable is a global variable, so it can be referenced from other
        // ContentProvider methods.
        mDbHelper = new PetDbHelper(getContext());
        return false;
    }
    /**
     * Perform the query for the given URI. Use the given projection, selection, selection arguments, and sort order.
     */
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection,
                        @Nullable String[] selectionArgs, @Nullable String sortOrder)
    {

        return null;
    }
    /**
     * Returns the MIME type of data for the content URI.
     */
    @Override
    public String getType(@NonNull Uri uri)
    {
        return null;
    }
    /**
     * Insert new data into the provider with the given ContentValues.
     */
    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values)
    {
        return null;
    }
    /**
     * Delete the data at the given selection and selection arguments.
     */
    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs)
    {
        return 0;
    }
    /**
     * Updates the data at the given selection and selection arguments, with the new ContentValues.
     */

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs)
    {
        return 0;
    }
}
