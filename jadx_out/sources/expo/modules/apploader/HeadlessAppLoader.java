package expo.modules.apploader;

import android.content.Context;
import expo.modules.core.interfaces.Consumer;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface HeadlessAppLoader {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class Params {
        private final String appScopeKey;
        private final String appUrl;

        public Params(String str, String str2) {
            this.appScopeKey = str;
            this.appUrl = str2;
        }

        public String getAppScopeKey() {
            return this.appScopeKey;
        }

        public String getAppUrl() {
            return this.appUrl;
        }
    }

    boolean invalidateApp(String str);

    boolean isRunning(String str);

    void loadApp(Context context, Params params, Runnable runnable, Consumer<Boolean> consumer);
}
