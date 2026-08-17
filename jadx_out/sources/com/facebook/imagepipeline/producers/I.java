package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class I extends L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f19964d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f19965e = {"_id", "_data"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f19966c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Executor executor, f2.i pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        AbstractC2855l.g(executor, "executor");
        AbstractC2855l.g(pooledByteBufferFactory, "pooledByteBufferFactory");
        AbstractC2855l.g(contentResolver, "contentResolver");
        this.f19966c = contentResolver;
    }

    private final d3.k g(Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f19966c.openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            d3.k kVarE = e(new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), (int) parcelFileDescriptorOpenFileDescriptor.getStatSize());
            AbstractC2855l.f(kVarE, "getEncodedImage(...)");
            parcelFileDescriptorOpenFileDescriptor.close();
            return kVarE;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected d3.k d(com.facebook.imagepipeline.request.b imageRequest) throws IOException {
        d3.k kVarG;
        InputStream inputStreamCreateInputStream;
        AbstractC2855l.g(imageRequest, "imageRequest");
        Uri sourceUri = imageRequest.getSourceUri();
        AbstractC2855l.f(sourceUri, "getSourceUri(...)");
        if (!k2.f.k(sourceUri)) {
            if (k2.f.j(sourceUri) && (kVarG = g(sourceUri)) != null) {
                return kVarG;
            }
            InputStream inputStreamOpenInputStream = this.f19966c.openInputStream(sourceUri);
            if (inputStreamOpenInputStream != null) {
                return e(inputStreamOpenInputStream, -1);
            }
            throw new IllegalStateException("Required value was null.");
        }
        String string = sourceUri.toString();
        AbstractC2855l.f(string, "toString(...)");
        if (P8.q.w(string, "/photo", false, 2, null)) {
            inputStreamCreateInputStream = this.f19966c.openInputStream(sourceUri);
        } else {
            String string2 = sourceUri.toString();
            AbstractC2855l.f(string2, "toString(...)");
            if (P8.q.w(string2, "/display_photo", false, 2, null)) {
                try {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f19966c.openAssetFileDescriptor(sourceUri, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                } catch (IOException unused) {
                    throw new IOException("Contact photo does not exist: " + sourceUri);
                }
            } else {
                InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f19966c, sourceUri);
                if (inputStreamOpenContactPhotoInputStream == null) {
                    throw new IOException("Contact photo does not exist: " + sourceUri);
                }
                inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
            }
        }
        if (inputStreamCreateInputStream != null) {
            return e(inputStreamCreateInputStream, -1);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalContentUriFetchProducer";
    }
}
