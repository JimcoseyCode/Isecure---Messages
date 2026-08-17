.class public final Lexpo/modules/kotlin/devtools/OkHttpExtensionsKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001c\u0010\t\u001a\u00020\u0008*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0086H\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Le9/t;",
        "",
        "",
        "toSingleMap",
        "(Le9/t;)Ljava/util/Map;",
        "Le9/B;",
        "Le9/z;",
        "okHttpClient",
        "Le9/D;",
        "await",
        "(Le9/B;Le9/z;Ln7/f;)Ljava/lang/Object;",
        "expo-modules-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final await(Le9/B;Le9/z;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le9/B;",
            "Le9/z;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, LR8/o;

    .line 2
    .line 3
    invoke-static {p2}, Lo7/b;->c(Ln7/f;)Ln7/f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LR8/o;-><init>(Ln7/f;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LR8/o;->F()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lexpo/modules/kotlin/devtools/OkHttpExtensionsKt$await$2$responseCallback$1;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lexpo/modules/kotlin/devtools/OkHttpExtensionsKt$await$2$responseCallback$1;-><init>(LR8/m;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p0}, Le9/z;->a(Le9/B;)Le9/e;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p0, v1}, Le9/e;->t0(Le9/f;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, LR8/o;->z()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-ne p0, p1, :cond_0

    .line 35
    .line 36
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Ln7/f;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-object p0
.end method

.method private static final await$$forInline(Le9/B;Le9/z;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le9/B;",
            "Le9/z;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lkotlin/jvm/internal/k;->c(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, LR8/o;

    .line 6
    .line 7
    invoke-static {p2}, Lo7/b;->c(Ln7/f;)Ln7/f;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v0, v1, v2}, LR8/o;-><init>(Ln7/f;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, LR8/o;->F()V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lexpo/modules/kotlin/devtools/OkHttpExtensionsKt$await$2$responseCallback$1;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lexpo/modules/kotlin/devtools/OkHttpExtensionsKt$await$2$responseCallback$1;-><init>(LR8/m;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p0}, Le9/z;->a(Le9/B;)Le9/e;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0, v1}, Le9/e;->t0(Le9/f;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Li7/B;->a:Li7/B;

    .line 31
    .line 32
    invoke-virtual {v0}, LR8/o;->z()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-ne p0, p1, :cond_0

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Ln7/f;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->c(I)V

    .line 46
    .line 47
    .line 48
    return-object p0
.end method

.method public static final toSingleMap(Le9/t;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le9/t;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm0/a;

    .line 7
    .line 8
    invoke-direct {v0}, Lm0/a;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Le9/t;->q()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0, v2}, Le9/t;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-object v0
.end method
