.class public abstract Lf0/p;
.super Lf0/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf0/p$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf0/l;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static c(Ljava/lang/String;)Lf0/p$a;
    .locals 1

    .line 1
    new-instance v0, Lf0/i$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lf0/i$b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lf0/i$b;->d(Ljava/lang/String;)Lf0/p$a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, -0x1

    .line 11
    invoke-virtual {p0, v0}, Lf0/l$a;->a(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lf0/p$a;

    .line 16
    .line 17
    return-object p0
.end method


# virtual methods
.method public abstract d()LF/w0$c;
.end method
