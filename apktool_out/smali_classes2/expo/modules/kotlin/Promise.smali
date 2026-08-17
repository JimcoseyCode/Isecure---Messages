.class public interface abstract Lexpo/modules/kotlin/Promise;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/kotlin/Promise$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u0006J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\tJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\rJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u000fJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u0011J\u001f\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u0013J%\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u0015J+\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00102\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lexpo/modules/kotlin/Promise;",
        "",
        "value",
        "Li7/B;",
        "resolve",
        "(Ljava/lang/Object;)V",
        "()V",
        "",
        "result",
        "(I)V",
        "",
        "(Z)V",
        "",
        "(D)V",
        "",
        "(F)V",
        "",
        "(Ljava/lang/String;)V",
        "",
        "(Ljava/util/Collection;)V",
        "",
        "(Ljava/util/Map;)V",
        "code",
        "message",
        "",
        "cause",
        "reject",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V",
        "Lexpo/modules/kotlin/exception/CodedException;",
        "exception",
        "(Lexpo/modules/kotlin/exception/CodedException;)V",
        "expo-modules-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract reject(Lexpo/modules/kotlin/exception/CodedException;)V
.end method

.method public abstract reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract resolve()V
.end method

.method public abstract resolve(D)V
.end method

.method public abstract resolve(F)V
.end method

.method public abstract resolve(I)V
.end method

.method public abstract resolve(Ljava/lang/Object;)V
.end method

.method public abstract resolve(Ljava/lang/String;)V
.end method

.method public abstract resolve(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract resolve(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract resolve(Z)V
.end method
