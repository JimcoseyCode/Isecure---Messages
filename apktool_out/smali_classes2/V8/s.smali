.class public final LV8/s;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LU8/c;


# instance fields
.field private final g:LT8/w;


# direct methods
.method public constructor <init>(LT8/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV8/s;->g:LT8/w;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public l(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LV8/s;->g:LT8/w;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LT8/w;->b(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object p1, Li7/B;->a:Li7/B;

    .line 15
    .line 16
    return-object p1
.end method
