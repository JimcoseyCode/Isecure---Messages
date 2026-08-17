.class public final synthetic LT8/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/o;


# instance fields
.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:LT8/e;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;LT8/e;LZ8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT8/c;->g:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, LT8/c;->h:LT8/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, LT8/c;->g:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, LT8/c;->h:LT8/e;

    .line 4
    .line 5
    move-object v3, p1

    .line 6
    check-cast v3, Ljava/lang/Throwable;

    .line 7
    .line 8
    move-object v5, p3

    .line 9
    check-cast v5, Ln7/j;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    move-object v4, p2

    .line 13
    invoke-static/range {v0 .. v5}, LT8/e;->d(Ljava/lang/Object;LT8/e;LZ8/a;Ljava/lang/Throwable;Ljava/lang/Object;Ln7/j;)Li7/B;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
