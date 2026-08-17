.class public final LX5/n;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LX5/m;


# instance fields
.field private final a:LX5/l;

.field private final b:LX5/f;


# direct methods
.method public constructor <init>(LX5/l;LT5/b;LW5/b;)V
    .locals 2

    .line 4
    new-instance v0, LX5/a;

    .line 5
    invoke-static {}, LX5/e;->c()LX5/e;

    move-result-object v1

    invoke-direct {v0, p2, p3, v1}, LX5/a;-><init>(LT5/b;LW5/b;LX5/g;)V

    .line 6
    invoke-direct {p0, p1, v0}, LX5/n;-><init>(LX5/l;LX5/f;)V

    return-void
.end method

.method public constructor <init>(LX5/l;LX5/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LX5/n;->a:LX5/l;

    .line 3
    iput-object p2, p0, LX5/n;->b:LX5/f;

    return-void
.end method
