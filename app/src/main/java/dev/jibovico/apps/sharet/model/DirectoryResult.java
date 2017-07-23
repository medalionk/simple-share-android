package dev.jibovico.apps.sharet.model;

import android.content.ContentProviderClient;
import android.database.Cursor;

import java.io.Closeable;

import dev.jibovico.apps.sharet.libcore.io.IoUtils;
import dev.jibovico.apps.sharet.misc.ContentProviderClientCompat;

import static dev.jibovico.apps.sharet.BaseActivity.State.MODE_UNKNOWN;
import static dev.jibovico.apps.sharet.BaseActivity.State.SORT_ORDER_UNKNOWN;

public class DirectoryResult implements Closeable {
	public ContentProviderClient client;
    public Cursor cursor;
    public Exception exception;

    public int mode = MODE_UNKNOWN;
    public int sortOrder = SORT_ORDER_UNKNOWN;

    @Override
    public void close() {
        IoUtils.closeQuietly(cursor);
        ContentProviderClientCompat.releaseQuietly(client);
        cursor = null;
        client = null;
    }
}