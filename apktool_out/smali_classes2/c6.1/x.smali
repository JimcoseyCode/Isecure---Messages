.class public final synthetic Lc6/x;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lc6/k;

.field public final synthetic h:LP4/m;


# direct methods
.method public synthetic constructor <init>(Lc6/k;LP4/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc6/x;->g:Lc6/k;

    .line 5
    .line 6
    iput-object p2, p0, Lc6/x;->h:LP4/m;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc6/x;->g:Lc6/k;

    .line 2
    .line 3
    iget-object v1, p0, Lc6/x;->h:LP4/m;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lc6/k;->h(LP4/m;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
