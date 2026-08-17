package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1971g extends C1973i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f20088d = new a(null);

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.g$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1971g(W2.x memoryCache, W2.k cacheKeyFactory, d0 inputProducer) {
        super(memoryCache, cacheKeyFactory, inputProducer);
        AbstractC2855l.g(memoryCache, "memoryCache");
        AbstractC2855l.g(cacheKeyFactory, "cacheKeyFactory");
        AbstractC2855l.g(inputProducer, "inputProducer");
    }

    @Override // com.facebook.imagepipeline.producers.C1973i
    protected String d() {
        return "pipe_ui";
    }

    @Override // com.facebook.imagepipeline.producers.C1973i
    protected String e() {
        return "BitmapMemoryCacheGetProducer";
    }

    @Override // com.facebook.imagepipeline.producers.C1973i
    protected InterfaceC1978n g(InterfaceC1978n consumer, W1.d cacheKey, boolean z10) {
        AbstractC2855l.g(consumer, "consumer");
        AbstractC2855l.g(cacheKey, "cacheKey");
        return consumer;
    }
}
