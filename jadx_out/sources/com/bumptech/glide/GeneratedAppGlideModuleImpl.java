package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.integration.avif.AvifGlideModule;
import com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.github.penfeizhou.animation.glide.GlideAnimationModule;
import expo.modules.image.ExpoImageAppGlideModule;
import expo.modules.image.blurhash.BlurhashModule;
import expo.modules.image.dataurls.Base64Module;
import expo.modules.image.decodedsource.DecodedModule;
import expo.modules.image.okhttp.ExpoImageOkHttpClientGlideModule;
import expo.modules.image.svg.SVGModule;
import expo.modules.image.thumbhash.ThumbhashModule;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;", "Lcom/bumptech/glide/GeneratedAppGlideModule;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/bumptech/glide/b;", "glide", "Lcom/bumptech/glide/h;", "registry", "Li7/B;", "registerComponents", "(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V", "Lcom/bumptech/glide/c;", "builder", "applyOptions", "(Landroid/content/Context;Lcom/bumptech/glide/c;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isManifestParsingEnabled", "()Z", "Lexpo/modules/image/ExpoImageAppGlideModule;", "a", "Lexpo/modules/image/ExpoImageAppGlideModule;", "appGlideModule", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ExpoImageAppGlideModule appGlideModule;

    public GeneratedAppGlideModuleImpl(Context context) {
        AbstractC2855l.g(context, "context");
        this.appGlideModule = new ExpoImageAppGlideModule();
    }

    @Override // com.bumptech.glide.module.AppGlideModule
    public void applyOptions(Context context, c builder) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(builder, "builder");
        this.appGlideModule.applyOptions(context, builder);
    }

    @Override // com.bumptech.glide.module.AppGlideModule
    public boolean isManifestParsingEnabled() {
        return false;
    }

    @Override // K1.b
    public void registerComponents(Context context, b glide, h registry) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(glide, "glide");
        AbstractC2855l.g(registry, "registry");
        new GlideAnimationModule().registerComponents(context, glide, registry);
        new AvifGlideModule().registerComponents(context, glide, registry);
        new OkHttpLibraryGlideModule().registerComponents(context, glide, registry);
        new SVGModule().registerComponents(context, glide, registry);
        new BlurhashModule().registerComponents(context, glide, registry);
        new Base64Module().registerComponents(context, glide, registry);
        new DecodedModule().registerComponents(context, glide, registry);
        new ThumbhashModule().registerComponents(context, glide, registry);
        new ExpoImageOkHttpClientGlideModule().registerComponents(context, glide, registry);
        this.appGlideModule.registerComponents(context, glide, registry);
    }
}
