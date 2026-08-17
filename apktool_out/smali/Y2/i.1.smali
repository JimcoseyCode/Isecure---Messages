.class public final synthetic LY2/i;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# instance fields
.field public final synthetic g:LY2/k;

.field public final synthetic h:LY2/k$a;


# direct methods
.method public synthetic constructor <init>(LY2/k;LY2/k$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY2/i;->g:LY2/k;

    .line 5
    .line 6
    iput-object p2, p0, LY2/i;->h:LY2/k$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LY2/i;->g:LY2/k;

    .line 2
    .line 3
    iget-object v1, p0, LY2/i;->h:LY2/k$a;

    .line 4
    .line 5
    invoke-static {v0, v1}, LY2/k$a;->i(LY2/k;LY2/k$a;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
