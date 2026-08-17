package com.reactnativecommunity.asyncstorage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import d2.AbstractC2325a;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@ReactModule(name = "RNCAsyncStorage")
public final class AsyncStorageModule extends NativeAsyncStorageModuleSpec {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "RNCAsyncStorage";
    private final l executor;
    private k mReactDatabaseSupplier;
    private boolean mShuttingDown;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f24839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f24840b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f24839a = callback;
            this.f24840b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f24839a.invoke(com.reactnativecommunity.asyncstorage.b.a(null), null);
                return;
            }
            String[] strArr = {"key", "value"};
            HashSet<String> hashSet = new HashSet();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (int i10 = 0; i10 < this.f24840b.size(); i10 += AsyncStorageModule.MAX_SQL_KEYS) {
                int iMin = Math.min(this.f24840b.size() - i10, AsyncStorageModule.MAX_SQL_KEYS);
                Cursor cursorQuery = AsyncStorageModule.this.mReactDatabaseSupplier.r().query("catalystLocalStorage", strArr, com.reactnativecommunity.asyncstorage.a.a(iMin), com.reactnativecommunity.asyncstorage.a.b(this.f24840b, i10, iMin), null, null, null);
                hashSet.clear();
                try {
                    try {
                        if (cursorQuery.getCount() != this.f24840b.size()) {
                            for (int i11 = i10; i11 < i10 + iMin; i11++) {
                                hashSet.add(this.f24840b.getString(i11));
                            }
                        }
                        if (cursorQuery.moveToFirst()) {
                            do {
                                WritableArray writableArrayCreateArray2 = Arguments.createArray();
                                writableArrayCreateArray2.pushString(cursorQuery.getString(0));
                                writableArrayCreateArray2.pushString(cursorQuery.getString(1));
                                writableArrayCreateArray.pushArray(writableArrayCreateArray2);
                                hashSet.remove(cursorQuery.getString(0));
                            } while (cursorQuery.moveToNext());
                        }
                        cursorQuery.close();
                        for (String str : hashSet) {
                            WritableArray writableArrayCreateArray3 = Arguments.createArray();
                            writableArrayCreateArray3.pushString(str);
                            writableArrayCreateArray3.pushNull();
                            writableArrayCreateArray.pushArray(writableArrayCreateArray3);
                        }
                        hashSet.clear();
                    } catch (Exception e10) {
                        AbstractC2325a.J(ReactConstants.TAG, e10.getMessage(), e10);
                        this.f24839a.invoke(com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage()), null);
                        cursorQuery.close();
                        return;
                    }
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            this.f24839a.invoke(null, writableArrayCreateArray);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f24842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f24843b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f24842a = callback;
            this.f24843b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:55:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0158  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void doInBackgroundGuarded(Void... voidArr) {
            String str = null;
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f24842a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            SQLiteStatement sQLiteStatementCompileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.r().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.r().beginTransaction();
                    for (int i10 = 0; i10 < this.f24843b.size(); i10++) {
                        if (this.f24843b.getArray(i10).size() != 2) {
                            WritableMap writableMapD = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.r().endTransaction();
                                return;
                            } catch (Exception e10) {
                                e = e10;
                                AbstractC2325a.J(ReactConstants.TAG, e.getMessage(), e);
                                if (writableMapD != null) {
                                    return;
                                }
                            }
                        } else if (this.f24843b.getArray(i10).getString(0) == null) {
                            WritableMap writableMapC = com.reactnativecommunity.asyncstorage.b.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.r().endTransaction();
                                return;
                            } catch (Exception e11) {
                                e = e11;
                                AbstractC2325a.J(ReactConstants.TAG, e.getMessage(), e);
                                if (writableMapC != null) {
                                    return;
                                }
                            }
                        } else if (this.f24843b.getArray(i10).getString(1) == null) {
                            WritableMap writableMapD2 = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.r().endTransaction();
                                return;
                            } catch (Exception e12) {
                                e = e12;
                                AbstractC2325a.J(ReactConstants.TAG, e.getMessage(), e);
                                if (writableMapD2 != null) {
                                    return;
                                }
                            }
                        } else {
                            sQLiteStatementCompileStatement.clearBindings();
                            sQLiteStatementCompileStatement.bindString(1, this.f24843b.getArray(i10).getString(0));
                            sQLiteStatementCompileStatement.bindString(2, this.f24843b.getArray(i10).getString(1));
                            sQLiteStatementCompileStatement.execute();
                        }
                        com.reactnativecommunity.asyncstorage.b.b(null, e.getMessage());
                        return;
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.r().setTransactionSuccessful();
                } finally {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.r().endTransaction();
                    } catch (Exception e13) {
                        AbstractC2325a.J(ReactConstants.TAG, e13.getMessage(), e13);
                        com.reactnativecommunity.asyncstorage.b.b(null, e13.getMessage());
                    }
                }
            } catch (Exception e14) {
                AbstractC2325a.J(ReactConstants.TAG, e14.getMessage(), e14);
                WritableMap writableMapB2 = com.reactnativecommunity.asyncstorage.b.b(null, e14.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.r().endTransaction();
                } catch (Exception e15) {
                    AbstractC2325a.J(ReactConstants.TAG, e15.getMessage(), e15);
                    if (writableMapB2 == null) {
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e15.getMessage());
                    }
                    if (writableMapB == null) {
                    }
                }
                writableMapB = writableMapB2;
            }
            if (writableMapB == null) {
                this.f24842a.invoke(writableMapB);
            } else {
                this.f24842a.invoke(new Object[0]);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f24845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f24846b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f24845a = callback;
            this.f24846b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f24845a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.r().beginTransaction();
                    for (int i10 = 0; i10 < this.f24846b.size(); i10 += AsyncStorageModule.MAX_SQL_KEYS) {
                        int iMin = Math.min(this.f24846b.size() - i10, AsyncStorageModule.MAX_SQL_KEYS);
                        AsyncStorageModule.this.mReactDatabaseSupplier.r().delete("catalystLocalStorage", com.reactnativecommunity.asyncstorage.a.a(iMin), com.reactnativecommunity.asyncstorage.a.b(this.f24846b, i10, iMin));
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.r().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.r().endTransaction();
                    } catch (Exception e10) {
                        AbstractC2325a.J(ReactConstants.TAG, e10.getMessage(), e10);
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage());
                    }
                } catch (Exception e11) {
                    AbstractC2325a.J(ReactConstants.TAG, e11.getMessage(), e11);
                    WritableMap writableMapB2 = com.reactnativecommunity.asyncstorage.b.b(null, e11.getMessage());
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.r().endTransaction();
                    } catch (Exception e12) {
                        AbstractC2325a.J(ReactConstants.TAG, e12.getMessage(), e12);
                        if (writableMapB2 == null) {
                            writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e12.getMessage());
                        }
                        if (writableMapB == null) {
                        }
                    }
                    writableMapB = writableMapB2;
                }
                if (writableMapB == null) {
                    this.f24845a.invoke(writableMapB);
                } else {
                    this.f24845a.invoke(new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.r().endTransaction();
                } catch (Exception e13) {
                    AbstractC2325a.J(ReactConstants.TAG, e13.getMessage(), e13);
                    com.reactnativecommunity.asyncstorage.b.b(null, e13.getMessage());
                }
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f24848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f24849b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f24848a = callback;
            this.f24849b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void doInBackgroundGuarded(Void... voidArr) {
            String str = null;
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f24848a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.r().beginTransaction();
                    for (int i10 = 0; i10 < this.f24849b.size(); i10++) {
                        if (this.f24849b.getArray(i10).size() != 2) {
                            WritableMap writableMapD = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.r().endTransaction();
                                return;
                            } catch (Exception e10) {
                                e = e10;
                                AbstractC2325a.J(ReactConstants.TAG, e.getMessage(), e);
                                if (writableMapD != null) {
                                    return;
                                }
                            }
                        } else if (this.f24849b.getArray(i10).getString(0) == null) {
                            WritableMap writableMapC = com.reactnativecommunity.asyncstorage.b.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.r().endTransaction();
                                return;
                            } catch (Exception e11) {
                                e = e11;
                                AbstractC2325a.J(ReactConstants.TAG, e.getMessage(), e);
                                if (writableMapC != null) {
                                    return;
                                }
                            }
                        } else if (this.f24849b.getArray(i10).getString(1) == null) {
                            WritableMap writableMapD2 = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.r().endTransaction();
                                return;
                            } catch (Exception e12) {
                                e = e12;
                                AbstractC2325a.J(ReactConstants.TAG, e.getMessage(), e);
                                if (writableMapD2 != null) {
                                    return;
                                }
                            }
                        } else if (!com.reactnativecommunity.asyncstorage.a.e(AsyncStorageModule.this.mReactDatabaseSupplier.r(), this.f24849b.getArray(i10).getString(0), this.f24849b.getArray(i10).getString(1))) {
                            WritableMap writableMapA = com.reactnativecommunity.asyncstorage.b.a(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.r().endTransaction();
                                return;
                            } catch (Exception e13) {
                                e = e13;
                                AbstractC2325a.J(ReactConstants.TAG, e.getMessage(), e);
                                if (writableMapA != null) {
                                    return;
                                }
                            }
                        }
                        com.reactnativecommunity.asyncstorage.b.b(null, e.getMessage());
                        return;
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.r().setTransactionSuccessful();
                } finally {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.r().endTransaction();
                    } catch (Exception e14) {
                        AbstractC2325a.J(ReactConstants.TAG, e14.getMessage(), e14);
                        com.reactnativecommunity.asyncstorage.b.b(null, e14.getMessage());
                    }
                }
            } catch (Exception e15) {
                AbstractC2325a.J(ReactConstants.TAG, e15.getMessage(), e15);
                WritableMap writableMapB2 = com.reactnativecommunity.asyncstorage.b.b(null, e15.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.r().endTransaction();
                } catch (Exception e16) {
                    AbstractC2325a.J(ReactConstants.TAG, e16.getMessage(), e16);
                    if (writableMapB2 == null) {
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e16.getMessage());
                    }
                    if (writableMapB == null) {
                    }
                }
                writableMapB = writableMapB2;
            }
            if (writableMapB == null) {
                this.f24848a.invoke(writableMapB);
            } else {
                this.f24848a.invoke(new Object[0]);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f24851a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f24851a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.mReactDatabaseSupplier.m()) {
                this.f24851a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.d();
                this.f24851a.invoke(new Object[0]);
            } catch (Exception e10) {
                AbstractC2325a.J(ReactConstants.TAG, e10.getMessage(), e10);
                this.f24851a.invoke(com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage()));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class f extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f24853a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f24853a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Finally extract failed */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f24853a.invoke(com.reactnativecommunity.asyncstorage.b.a(null), null);
                return;
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Cursor cursorQuery = AsyncStorageModule.this.mReactDatabaseSupplier.r().query("catalystLocalStorage", new String[]{"key"}, null, null, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        do {
                            writableArrayCreateArray.pushString(cursorQuery.getString(0));
                        } while (cursorQuery.moveToNext());
                    }
                    cursorQuery.close();
                    this.f24853a.invoke(null, writableArrayCreateArray);
                } catch (Exception e10) {
                    AbstractC2325a.J(ReactConstants.TAG, e10.getMessage(), e10);
                    this.f24853a.invoke(com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage()), null);
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.m();
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void clear(Callback callback) {
        new e(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void getAllKeys(Callback callback) {
        new f(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCAsyncStorage";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.mShuttingDown = true;
        this.mReactDatabaseSupplier.e();
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(com.reactnativecommunity.asyncstorage.b.c(null), null);
        } else {
            new a(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new d(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new b(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @VisibleForTesting
    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) throws Throwable {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        h.g(reactApplicationContext);
        this.executor = new l(executor);
        this.mReactDatabaseSupplier = k.s(reactApplicationContext);
    }
}
