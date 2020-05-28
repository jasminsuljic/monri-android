package com.monri.android.model;

import android.os.Parcelable;

/**
 * Created by jasminsuljic on 2019-12-12.
 * MonriAndroid
 */
//@JsonDeserialize(using = SavedPaymentMethodDeserializer.class)
public abstract class SavedPaymentMethod implements Parcelable {
    public abstract String getType();

    public abstract Parcelable getData();
}
