.class public final LJ2/b$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LJ2/b$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LJ2/b$a;LC2/a;)LL2/b;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LJ2/b$a;->b(LC2/a;)LL2/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final b(LC2/a;)LL2/b;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance v0, LL2/a;

    .line 6
    .line 7
    invoke-direct {v0, p1}, LL2/a;-><init>(LC2/d;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
